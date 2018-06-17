package com.autentia.springmvcpruebaportlet.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;
import java.io.File;
import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
 
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.bind.annotation.ActionMapping;
import org.springframework.web.portlet.bind.annotation.RenderMapping;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import java.io.IOException;
import java.io.OutputStream;
 
import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;
 
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.portlet.bind.annotation.ActionMapping;
import org.springframework.web.portlet.bind.annotation.RenderMapping;
import org.springframework.web.portlet.bind.annotation.ResourceMapping;

@Controller
@RequestMapping("VIEW")
public class SpringMVCPruebaPortletViewController {

	public SpringMVCPruebaPortletViewController() {
	}

	@RequestMapping
	protected String defaultView() {
		return "view";
	}
	
	@RenderMapping(params = "action=showForm")
	public String viewByParameter(Map<String, Object> map) {
	   
	 
	    Customer customer = new Customer();
	 
	    /**
	     * Keep the object customer in the map this object will be used in the
	     * JSP as modelAttribute
	     */
	    map.put("customer", customer);
	 
	    /**
	     * Returning a String "form"
	     *  This means that form.jsp is the view
	     */
	    return "form";
	 
	}
	@ActionMapping(value = "handleCustomer")
    public void getCustomerData(
            @ModelAttribute("customer") Customer customer,
            ActionRequest actionRequest, ActionResponse actionResponse,
            Model model) {
 
		 System.out.println("File Name :"+customer.getAddress());
		 System.out.println("File Name :"+customer.getFile().getOriginalFilename());
	        System.out.println("customer.getFile() is null :"+(customer.getFile()== null));
	        
        actionResponse.setRenderParameter("action", "success");
        
        CommonsMultipartFile file = customer.getFile();
        customer.setFirstName(file.getOriginalFilename());
        model.addAttribute("successModel", customer);
    }
	
	@RenderMapping(params = "action=success")
	public String viewSuccess() {
	 
	 
	    /**
	     * Display success.jsp
	     */
	    return "success";
	 
	}
	 
}