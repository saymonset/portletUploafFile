package com.autentia.springmvcpruebaportlet.controllers;

 
import java.io.Serializable;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
/**
 *
 * @author Hamidul Islam
 *
 */
 
public class Customer implements Serializable{
 
    private static final long serialVersionUID = 1L;
    private String firstName;
    private String middleName;
    private String lastName;
    private int age;
    private String address;
    private CommonsMultipartFile file;
    
 
    public String getFirstName() {
        return firstName;
    }
 
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
 
    public String getMiddleName() {
        return middleName;
    }
 
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }
 
    public String getLastName() {
        return lastName;
    }
 
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
 
    public int getAge() {
        return age;
    }
 
    public void setAge(int age) {
        this.age = age;
    }
 
    public String getAddress() {
        return address;
    }
 
    public void setAddress(String address) {
        this.address = address;
    }
    
    public CommonsMultipartFile getFile() {
    	return file;
    }
    public void setFile(CommonsMultipartFile file) {
    	this.file = file;
    }
    
}