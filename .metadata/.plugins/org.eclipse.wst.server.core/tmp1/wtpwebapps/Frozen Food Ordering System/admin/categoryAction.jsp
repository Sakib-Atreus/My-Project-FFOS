<%@page import ="project.ConnectionProvider"%>
<%@page import ="java.sql.*"%>
<%
//String id=request.getParameter("id");
//String name=request.getParameter("name");
String category=request.getParameter("categoryName");
//String price=request.getParameter("price");
//String active=request.getParameter("active");
try{
	Connection con=ConnectionProvider.getCon();
	PreparedStatement ps=con.prepareStatement("insert into product values(?,?,?,?,?)");
	//ps.setString(1, id);
	ps.setString(1, categoryName);
	//ps.setString(3, category);
	//ps.setString(4, price);
	//ps.setString(5, active);
	ps.executeUpdate();
	response.sendRedirect("category.jsp?msg=done");
}
catch(Exception e)
{
	response.sendRedirect("category.jsp?msg=wrong");
}
%>