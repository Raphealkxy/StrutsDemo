<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@ taglib  uri="/struts-tags" prefix="s" %>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'valueStack.jsp' starting page</title>
    
	

  </head>
  
  <body>
  <s:debug />

  this is a page
  <s:property value="eidtorName"/></br>
    <s:property value="user.username"/></br>
    <s:property value="user.password"/></br>
    <s:property value="user.Email"/></br>
  <!-- 获取list集合中的数据 第一种方式实现 -->
      <s:property value="list[0].username"/></br>
      <s:property value="list[0].password"/></br>
      <s:property value="list[0].Email"/></br>
      <s:property value="list[1].username"/></br>
      <s:property value="list[1].password"/></br>
      <s:property value="list[1].Email"/></br>
  
    <!-- 获取list集合中的数据 第二种方式实现 -->
    <s:iterator value="list">
          <s:property value="username"/></br>
          <s:property value="password"/></br>
          <s:property value="Email"/></br>
    
    
    </s:iterator>
    <!-- 获取list集合中的数据 第三种方式实现 -->
    <s:iterator value="list" var="user">
          <s:property value="#user.username"/></br>
          <s:property value="#user.password"/></br>
          <s:property value="#user.Email"/></br>
    
    
    </s:iterator>
    
    <s:property value="[0].top"/>
  </body>
</html>
