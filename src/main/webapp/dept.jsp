<%@page import="java.util.List"%>
<%@page import="com.hybrid.domain.Dept2"%>
<%@page import="com.hybrid.mapper.DeptMapper2"%>
<%@page import="org.springframework.context.ApplicationContext"%>
<%@page import="org.springframework.web.context.support.WebApplicationContextUtils"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>dept.jsp</title>
</head>
<body>
<h1>Dept 테스트</h1>
<%
	ApplicationContext ctx = WebApplicationContextUtils.getRequiredWebApplicationContext(this.getServletContext());
	DeptMapper2 mapper = ctx.getBean(DeptMapper2.class);
	mapper.delete(65);
	
	mapper.insert(new Dept2(65, "xxx", "yyy"));
	List<Dept2> depts = mapper.selectAll();
	for (Dept2 dept : depts) {
		System.out.println(dept);
		out.println(dept + "<br>");
	}
	out.println("===================");
	out.println("<br>");
	mapper.update(new Dept2(65, "xxx1", "yyy1"));
	depts = mapper.selectAll();
	for (Dept2 dept : depts) {
		System.out.println(dept);
		out.println(dept + "<br>");
	}
	out.println("===================");
	out.println("<br>");
	mapper.delete(65);
	depts = mapper.selectAll();
	for (Dept2 dept : depts) {
		System.out.println(dept);
		out.println(dept + "<br>");
	}
%>
</body>
</html>