/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.36
 * Generated at: 2022-10-30 07:36:57 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import project.ConnectionProvider;
import java.sql.*;

public final class addressPaymentForOrder_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/footer.jsp", Long.valueOf(1658172325417L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("java.sql");
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("project.ConnectionProvider");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write(" <div class=\"footer\">\r\n");
      out.write("          <p>All Right Reserved @ Frozen Food Ordering System</p>\r\n");
      out.write("      </div>");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http//www.w3.org./TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<link rel=\"stylesheet\"href=\"css/addressPaymentForOrder-style.css\">\r\n");
      out.write("<script src='https://kit.fontawesome.com/a076d05399.js'></script>\r\n");
      out.write("<title>Home</title>\r\n");
      out.write("<script>\r\n");
      out.write("if(window.history.forward(1) !=null)\r\n");
      out.write("    window.history.forward(1);</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<br>\r\n");
      out.write("<table>\r\n");
      out.write("<thead>\r\n");

        String email=session.getAttribute("email").toString();
        int total= 0;
        int sno= 0;
        try
        {
        Connection con=ConnectionProvider.getCon();
        Statement st=con.createStatement();
        ResultSet rs1=st.executeQuery("select sum(total) from cart where email='"+email+"' and address is NULL");
        while(rs1.next())
        {
        total=rs1.getInt(1);
        }
        
      out.write("\r\n");
      out.write("    <tr>\r\n");
      out.write("    <th scope=\"col\"><a href=\"myCart.jsp\"><i class =\"fas fa-arrow-circle-left\"></i></a></th>\r\n");
      out.write("    <th scope=\"col\" style=\"background color: yellow;\">Total: <i class =\"fa fa-inr\"></i>");
out.println(total);
      out.write("</th>\r\n");
      out.write("    </tr>\r\n");
      out.write("    </thead>\r\n");
      out.write("    <thead>\r\n");
      out.write("    <tr>\r\n");
      out.write("    <th scope=\"col\">S.No</th>\r\n");
      out.write("    <th scope=\"col\">Product Name</th>\r\n");
      out.write("    <th scope=\"col\">Category</th>\r\n");
      out.write("    <th scope=\"col\"><i class =\"fa fa -inr\"></i>price</th>\r\n");
      out.write("    <th scope=\"col\">Quantity</th>\r\n");
      out.write("    <th scope=\"col\">Sub Total</th>\r\n");
      out.write("    </tr>\r\n");
      out.write("    </thead>\r\n");
      out.write("<tbody>\r\n");

        ResultSet rs=st.executeQuery("select * from product inner join cart on product.id=cart.product_id and cart.email='"+email+"' and cart.address is null");
        while(rs.next())
        {
        
      out.write("\r\n");
      out.write("<tr>\r\n");
sno=sno+1;
      out.write("\r\n");
      out.write("<td>");
out.println(sno);
      out.write("</td>\r\n");
      out.write("<td>");
      out.print(rs.getString(2));
      out.write("</td>\r\n");
      out.write("<td>");
      out.print(rs.getString(3));
      out.write("</td>\r\n");
      out.write("<td><i class =\"fa fa-inr\"></i>");
      out.print(rs.getString(4));
      out.write("</td>\r\n");
      out.write("<td>");
      out.print(rs.getString(8));
      out.write("</td>\r\n");
      out.write("<td><i class =\"fa fa-inr\"></i>");
      out.print(rs.getString(10));
      out.write("</td>\r\n");
      out.write("</tr>\r\n");

        }
        ResultSet rs2=st.executeQuery("select * from users where email='"+email+"'");
        while(rs2.next())
        {
        
      out.write("\r\n");
      out.write("</thead>\r\n");
      out.write("<tbody>\r\n");
      out.write("\r\n");
      out.write("<hr style=\"width: 100%\">\r\n");
      out.write("<form action=\"addressPaymentForOrderAction.jsp\"method=\"post\">\r\n");
      out.write("<div class=\"left-div\">\r\n");
      out.write("<h3>Enter Address</h3>\r\n");
      out.write("<input class=\"input-style\" type=\"text\" name=\"address\" value=\"");
      out.print(rs2.getString(7));
      out.write("\"placeholder=\"Enter address\" required>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"right-div\">\r\n");
      out.write("<h3>Enter city</h3>\r\n");
      out.write("<input class=\"input-style\" type=\"text\" name=\"city\" value=\"");
      out.print(rs2.getString(8));
      out.write("\"placeholder=\"Enter city\" required>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"left-div\">\r\n");
      out.write("<h3>Enter State</h3>\r\n");
      out.write("<input class=\"input-style\" type=\"text\" name=\"state\" value=\"");
      out.print(rs2.getString(9));
      out.write("\"placeholder=\"Enter state\" required>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"right-div\">\r\n");
      out.write("<h3>Enter country</h3>\r\n");
      out.write("<input class=\"input-style\" type=\"text\" name=\"country\" value=\"");
      out.print(rs2.getString(10));
      out.write("\"placeholder=\"Enter country\" required>\r\n");
      out.write("</div>\r\n");
      out.write("<h3 style=\"color: red\">*If there is no address its mean that you did not set you address!</h3>\r\n");
      out.write("<h3 style=\"color: red\">*This address will also updated to your profile</h3>\r\n");
      out.write("<hr style=\"width: 100%\">\r\n");
      out.write("<div class=\"left-div\">\r\n");
      out.write("<h3>Select way of Payment</h3>\r\n");
      out.write("<select class=\"input-style\" name=\"paymentMethod\">\r\n");
      out.write("<option value=\"Cash on delivery(COD)\">Cash on delivery(COD)</option>\r\n");
      out.write("<option value=\"Online Payment\">Online Payment</option>\r\n");
      out.write("</select>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"right-div\">\r\n");
      out.write("<h3>Pay online on this frozenfoodorderingsystem@pay.com</h3>\r\n");
      out.write("<input class=\"input-style\" type=\"text\" name=\"transactionID\" placeholder=\"Enter Transaction ID\">\r\n");
      out.write("<h3 style=\"color: red\">*If you select online Payment then enter you transaction ID here otherwise leave this blank</h3>\r\n");
      out.write("</div>\r\n");
      out.write("<hr style=\"width: 100%\">\r\n");
      out.write("\r\n");
      out.write("<div class=\"left-div\">\r\n");
      out.write("<h3>Mobile Number</h3>\r\n");
      out.write("<input class=\"input-style\" type=\"text\" name=\"mobileNumber\" value=\"");
      out.print(rs2.getString(3));
      out.write("\"placeholder=\"Enter Mobile Number\" required>\r\n");
      out.write("<h3 style=\"color: red\">*This mobile number will also updated to your profile</h3>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"right-div\">\r\n");
      out.write("<h3 style=\"color: red\">*If you enter wrong transaction id then your order will we can cancel!</h3>\r\n");
      out.write("<button class=\"button\" type=\"submit\">Procced to Generate Bill & Save <i class='far fa-arrow-alt-circle-right'></i></button>\r\n");
      out.write("<h3 style=\"color: red\">*Fill form correctly</h3>\r\n");
      out.write("</div>\r\n");
      out.write("</form>\r\n");

        }
        }
        catch(Exception e)
        {
        System.out.println(e);
        }
      out.write("\r\n");
      out.write("\r\n");
      out.write("<br>\r\n");
      out.write("<br>\r\n");
      out.write("<br>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
