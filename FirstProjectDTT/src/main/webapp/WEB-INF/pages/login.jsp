<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>

 <div class="container">
 <div class="col-md-3"></div>
 <div class="col-md-6 center-block">
      <form:form class="form-signin" action="login" commandName="customer" >
        <h2 class="form-signin-heading">Please sign in</h2>
        <label for="inputEmail" class="sr-only">Email address</label>
        <form:input type="email" path="username" class="form-control" placeholder="Email address" required="true"/>
        <label for="inputPassword" class="sr-only">Password</label>
        <form:input type="password" path="password" class="form-control" placeholder="Password" required="true"/>
        <div class="checkbox">
          <label>
            <input type="checkbox" value="remember-me"> Remember me
          </label>
        </div>
        <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
      </form:form>
      </div>
     <div class="col-md-3"></div>
    </div> 
</body>
</html>