<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<portlet:defineObjects />
<portlet:actionURL var="submitFormURL" name="handleCustomer"/>
 
      
      

<form:form name="customer" method="post" modelAttribute="customer"
 action="<%=submitFormURL.toString() %>"  enctype="multipart/form-data">
<br/>
    <table style="margin-left:80px">
        <tbody>
        
          
                
            <tr>
                <td><form:label path="file">file</form:label></td>
                <td> <form:input path="file" type="file"/></td>
            </tr>    
                
            <tr>
                <td><form:label path="firstName">First Name</form:label></td>
                <td><form:input path="firstName"></form:input></td>
            </tr>
            <tr>
                <td><form:label path="middleName">Middle Name</form:label></td>
                <td><form:input path="middleName"></form:input></td>
            </tr>
            <tr>
                <td><form:label path="lastName">Last Name</form:label></td>
                <td><form:input path="lastName"></form:input></td>
            </tr>
            <tr>
                <td><form:label path="age">Age</form:label></td>
                <td><form:input path="age"></form:input></td>
            </tr>
            <tr>
                <td><form:label path="address">Address</form:label></td>
                <td><form:input path="address"></form:input></td>
            </tr>
 
            <tr>
                <td colspan="2"><input type="submit" value="Submit Form">
                </td>
            </tr>
        </tbody>
    </table>
</form:form>