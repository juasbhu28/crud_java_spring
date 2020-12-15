<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <title>Add Customer</title>
 <link href="../../webjars/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" />
 <script src="../../webjars/bootstrap/4.0.0/js/bootstrap.min.js"></script>
 <script src="../../webjars/jquery/3.0.0/js/jquery.min.js"></script>
</head>
<body>
 <div class="container">
  <spring:url value="/customer/addCustomer" var="addURL" />
  <h2>Add Customer</h2>
  <form:form modelAttribute="customerForm" method="post" action="${addURL}" cssClass="form" >
   <form:hidden path="id"/>
   <div class="form-group">
    <label>Identificacion</label>
    <form:input path="identificacion" cssClass="form-control" id="identificacion" />
   </div>
   <div class="form-group">
    <label>Tipo Identificacion</label>
    <form:input path="tipoIdentificacion" cssClass="form-control" id="tipoIdentificacion" />
   </div>
   <div class="form-group">
   <label>Correo</label>
   <form:input path="correo" cssClass="form-control" id="correo" />
  </div>
  <div class="form-group">
   <label>Telefono</label>
   <form:input path="telefono" cssClass="form-control" id="telefono" />
  </div>
   <button type="submit" class="btn btn-success">Add Customer</button>
  </form:form>

 </div>
</body>
</html>