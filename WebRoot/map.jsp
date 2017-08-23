<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'map.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
     <form method="post" action="${pageContext.request.contextPath}/EnclosureToMap.action">
   username:<input type="text" name="map['one'].username"/></br>
   password:<input type="password" name="map['one'].password"/></br>
   Email:<input type="text" name="map['one'].Email"/></br>
   
    username:<input type="text" name="map['two'].username"/></br>
   password:<input type="password" name="map['two'].password"/></br>
   Email:<input type="text" name="map['two'].Email"/></br>
        <input type="submit" name="tijiao"/></br>
 </form>
  </body>
</html>
