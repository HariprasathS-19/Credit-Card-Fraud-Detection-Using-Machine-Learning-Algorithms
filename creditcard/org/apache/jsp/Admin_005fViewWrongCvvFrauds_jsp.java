/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.69
 * Generated at: 2023-03-18 07:04:57 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.util.*;

public final class Admin_005fViewWrongCvvFrauds_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/connect.jsp", Long.valueOf(1540290754000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("java.sql");
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("java.util");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
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
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
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

      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<title></title>\r\n");
      out.write("\r\n");
      out.write("\r\n");

	Connection connection = null;
 	try {
     

	  	Class.forName("com.mysql.jdbc.Driver");	
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/cc_fraud","root","root");
      	String sql="";

	}
	catch(Exception e)
	{
		System.out.println(e);
	}

      out.write("\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<title>All Financial Frauds Wrong CVV</title>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/coin-slider.css\" />\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/cufon-yui.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/cufon-quicksand.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery-1.4.2.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/script.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/coin-slider.min.js\"></script>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("<!--\r\n");
      out.write(".style1 {\r\n");
      out.write("	font-size: 24px;\r\n");
      out.write("	color: #FF0000;\r\n");
      out.write("}\r\n");
      out.write(".style4 {color: #CC6600}\r\n");
      out.write(".style5 {color: #660000}\r\n");
      out.write(".style7 {color: #000000;\r\n");
      out.write("		 font-size: 14px}\r\n");
      out.write(".style8 {font-weight: bold}\r\n");
      out.write(".style9 {color:#FF3300;\r\n");
      out.write("		font-size: 14px}\r\n");
      out.write(".style10 {color:#2C83B0;\r\n");
      out.write("		font-size: 14px}\r\n");
      out.write(".style11 {font-size: 12px}\r\n");
      out.write(".style12 {font-size: 22px;\r\n");
      out.write("			color:#006666}\r\n");
      out.write(".style14 {color:#663366}\r\n");
      out.write(".style16 {color:#FF0000;\r\n");
      out.write("		font-size:18px;\r\n");
      out.write("		}\r\n");
      out.write("-->\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"main\">\r\n");
      out.write("  <div class=\"header\">\r\n");
      out.write("    <div class=\"header_resize\">\r\n");
      out.write("      <div class=\"logo\">\r\n");
      out.write("        <h1 align=\"center\"><a href=\"index.html\" class=\"style1\">Credit card fraud detection using AdaBoost and majority voting</a></h1>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"menu_nav\">\r\n");
      out.write("        <ul>\r\n");
      out.write("          <li class=\"active\"><a href=\"index.html\"><span>Home Page</span></a></li>\r\n");
      out.write("          <li><a href=\"AdminLogin.jsp\"><span>Bank Admin</span></a></li>\r\n");
      out.write("          <li><a href=\"EcommerceLogin.jsp\"><span>Ecommerce</span></a></li>\r\n");
      out.write("          <li><a href=\"UserLogin.jsp\"><span>User</span></a></li>\r\n");
      out.write("          <li><a href=\"#\"><span>Contact Us</span></a></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"clr\"></div>\r\n");
      out.write("      <div class=\"slider\">\r\n");
      out.write("        <div id=\"coin-slider\"> <a href=\"#\"><img src=\"images/slide1.jpg\" width=\"935\" height=\"285\" alt=\"\" /> </a> <a href=\"#\"><img src=\"images/slide2.jpg\" width=\"935\" height=\"285\" alt=\"\" /> </a> <a href=\"#\"><img src=\"images/slide3.jpg\" width=\"935\" height=\"285\" alt=\"\" /> </a> </div>\r\n");
      out.write("        <div class=\"clr\"></div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"clr\"></div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"content\">\r\n");
      out.write("    <div class=\"content_resize\">\r\n");
      out.write("      <div class=\"mainbar\">\r\n");
      out.write("        <div class=\"article\"> \r\n");
      out.write("          <h2 class=\"style4\" style=\"color:#CC6600\">All Financial Frauds with Wrong Credit Card CVV..</h2>\r\n");
      out.write("          <div class=\"clr\"></div>          \r\n");
      out.write("          <div class=\"post_content\">\r\n");
      out.write("            <p>&nbsp;</p>\r\n");
      out.write("					\r\n");
      out.write("					<p>\r\n");
      out.write("                    \r\n");
      out.write("                  ");

				  
	String bank=(String)application.getAttribute("adbank");

    int num=1,count=0;
try 
{
	String str= "select distinct(user) from financial_fraud where fraud_type='"+"Wrong CVV"+"' and bank='"+bank+"'";
	Statement st = connection.createStatement();
	ResultSet rs= st.executeQuery(str);
	
	while(rs.next())
	{	
		String usr=rs.getString(1);
		
		
      out.write("<p class=\"style14 style12\"><span class=\"style5\">");
      out.print(num);
      out.write(' ');
      out.write('.');
      out.write(' ');
      out.print("  "+"Wrong Credit Card CVV User");
      out.write("</span> <br />\r\n");
      out.write("                  <br />");

		
		String str1= "select id,site from financial_fraud where user='"+usr+"' and fraud_type='"+"Wrong CVV"+"' ";
		Statement st1 = connection.createStatement();
		ResultSet rs1 = st1.executeQuery(str1);
		while(rs1.next())
		{	
			
			int i=rs1.getInt(1);
			String site=rs1.getString(2);
			
			
			
				count++;
			
			out.print("<input type=\"radio\" name=\"t_task\" ");
			
			
      out.write("\r\n");
      out.write("                  <p class=\"style16\"><span class=\"style16\"><a href=\"Admin_ViewWrongCvvFraudsDetails.jsp?id=");
      out.print(i);
      out.write("&user=");
      out.print(usr);
      out.write("&site=");
      out.print(site);
      out.write('"');
      out.write('>');
      out.print(""+usr);
      out.write(' ');
      out.write('[');
      out.print(" "+site);
      out.write("]</a></span></p><p>");

		}
		num++;
	    }    
	connection.close();
}
catch(Exception e)
{
out.println(e.getMessage());
}

	if(count==0){out.print("No Fraud details Found");}

     
      out.write("\r\n");
      out.write("			  </table>\r\n");
      out.write("			</p>\r\n");
      out.write("        	\r\n");
      out.write("		<p align=\"left\"><a href=\"AdminMain.jsp\" class=\"style95\">Back</a></p>\r\n");
      out.write("		  \r\n");
      out.write("		  \r\n");
      out.write("		  \r\n");
      out.write("		  \r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"clr\"></div>\r\n");
      out.write("        </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      <div class=\"sidebar\">\r\n");
      out.write("        <div class=\"searchform\">\r\n");
      out.write("          <form id=\"formsearch\" name=\"formsearch\" method=\"post\" action=\"#\">\r\n");
      out.write("            <span>\r\n");
      out.write("            <input name=\"editbox_search\" class=\"editbox_search\" id=\"editbox_search\" maxlength=\"80\" value=\"Search our ste:\" type=\"text\" />\r\n");
      out.write("            </span>\r\n");
      out.write("            <input name=\"button_search\" src=\"images/search.gif\" class=\"button_search\" type=\"image\" />\r\n");
      out.write("          </form>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"clr\"></div>\r\n");
      out.write("        <div class=\"gadget\">\r\n");
      out.write("          <h2 class=\"star\"><span>Sidebar</span> Menu</h2>\r\n");
      out.write("          <div class=\"clr\"></div>\r\n");
      out.write("          <ul class=\"sb_menu\">\r\n");
      out.write("            <li><a href=\"AdminMain.jsp\">Home</a></li>\r\n");
      out.write("			<li><a href=\"AdminLogin.jsp\">Logout</a></li>\r\n");
      out.write("            \r\n");
      out.write("          </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"clr\"></div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"footer\"></div>\r\n");
      out.write("</div>\r\n");
      out.write("<div align=center></div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
