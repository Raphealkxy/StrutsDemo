<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8"%>
<%@taglib   uri="/struts-tags"        prefix="s" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'form.jsp' starting page</title>
    
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
  <s:form>
  <s:textfield name="username" label="username"></s:textfield>
    <s:password name="password" label="password"></s:password>
    <s:radio list="{'女','男'}" name="sex" label="性别"></s:radio>
        <s:radio list="#{'nv':'女','nan':'男'}" name="sex1" label="性别"></s:radio>
    <s:checkboxlist list="{'吃饭','睡觉','敲代码'}" name="love" label="爱好"></s:checkboxlist>
    <s:file name="上传文件"></s:file>
    <s:hidden name="hid" value="ddddd"></s:hidden>
    <s:submit value="提交"></s:submit>
    <s:reset value="重置"></s:reset>
  
  </s:form>
  </body>
</html>
