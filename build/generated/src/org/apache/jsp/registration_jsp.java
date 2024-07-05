package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class registration_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta name=\"description\" content=\"\">\r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        <!-- The above 4 meta tags must come first in the head -->\r\n");
      out.write("\r\n");
      out.write("        <!-- Title  -->\r\n");
      out.write("        <title>Registration Page</title>\r\n");
      out.write("\r\n");
      out.write("        <!-- Tab Icon  -->\r\n");
      out.write("        <link rel=\"icon\" href=\"img/core-img/iconlight.png\">\r\n");
      out.write("        <link rel='stylesheet' href='https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.1.2/css/bootstrap.min.css'>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.2/css/all.min.css\" integrity=\"sha512-SnH5WK+bZxgPHs44uWIX+LLJAJ9/2PkPKZ5QiAj6Ta86w+fsb2TkcmfRyVX3pBnMFcV7oQPJkl9QevSCWr3W6A==\" crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\"/>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!-- Core Style CSS -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/core-style.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"style.css\">\r\n");
      out.write("        <script src=\"https://kit.fontawesome.com/3f5c7d2f43.js\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("        <input type=\"hidden\" id=\"status\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${regUser}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("\r\n");
      out.write("            <div class=\"regis-table-area section-padding-100 \">\r\n");
      out.write("                <div class=\"container-fluid \">\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-12\">\r\n");
      out.write("                            <div class=\"checkout_details_area clearfix\">\r\n");
      out.write("\r\n");
      out.write("                                <div class=\"cart-title\">\r\n");
      out.write("                                    <center><h1><b style=\"color: steelblue;\">REGISTRATION FORM</b></h1></center>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"registration-form-wrapper\">\r\n");
      out.write("                                    <form method=\"POST\" action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/registration/add\" class=\"py-3 needs-validation\" id=\"regform\" novalidate>\r\n");
      out.write("\r\n");
      out.write("                                        <div class=\"row\">\r\n");
      out.write("                                            <div class=\"col-12 col-md-6 mt-3\">\r\n");
      out.write("                                                <div class=\"form-group \">\r\n");
      out.write("                                                    <label for=\"username\">Username</label>\r\n");
      out.write("                                                    <input type=\"text\" class=\"form-control\" id=\"username\" name=\"userName\" placeholder=\"Enter your username\" required>\r\n");
      out.write("                                                    <small id=\"usernameHelp\"  class=\"form-text \">Alphanumeric, must be between 4 - 12 characters. Special characters are not allowed.</small>\r\n");
      out.write("                                                    <div class=\"invalid-feedback\">\r\n");
      out.write("                                                        Please enter a username.</div>\r\n");
      out.write("                                                </div> \r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("\r\n");
      out.write("                                        <div class=\"row \">\r\n");
      out.write("                                            <div class=\"col-12 col-md-6 mt-5\">\r\n");
      out.write("                                                <div class=\"form-group form-pass\">\r\n");
      out.write("                                                    <label for=\"password\">Password</label>\r\n");
      out.write("                                                    <i class=\"fa fa-eye-slash showPass \" ></i>\r\n");
      out.write("                                                    <input type=\"password\" class=\"form-control\" id=\"password\" name=\"password\" placeholder=\"Enter your password\" required >\r\n");
      out.write("                                                    <small id=\"passwordHelp\" class=\"form-text\">Password must be alphanumeric, 8 - 16 characters,\r\n");
      out.write("                                                        must contain at least 1: capital letter , small letter, number, and special character(!@#$&* are allowed).</small>\r\n");
      out.write("                                                    <div class=\"invalid-feedback\">\r\n");
      out.write("                                                        Please enter your password.\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>   \r\n");
      out.write("\r\n");
      out.write("                                            <div class=\"col-12 col-md-6 mt-5\">\r\n");
      out.write("                                                <div class=\"form-group form-confirm\">\r\n");
      out.write("                                                    <label for=\"confirmpassword\">Confirm Password</label>\r\n");
      out.write("                                                    <i class=\"fa fa-eye-slash confirmPass\" style='top: calc(74% - 0px); left: calc(90% - 2px);'></i>\r\n");
      out.write("                                                    <input type=\"password\" class=\"form-control\" id=\"confirmpassword\" placeholder=\"Confirm your password\" required>\r\n");
      out.write("                                                    <small id=\"confirmpasswordHelp\" class=\"form-text\">Passwords must match.</small>\r\n");
      out.write("                                                    <div class=\"invalid-feedback\">\r\n");
      out.write("                                                        Please confirm your password.\r\n");
      out.write("                                                    </div>\r\n");
      out.write("\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>   \r\n");
      out.write("\r\n");
      out.write("                                        </div> \r\n");
      out.write("\r\n");
      out.write("                                        <div class=\"row \">\r\n");
      out.write("                                            <div class=\"col-12 col-md-4  mt-5\">\r\n");
      out.write("                                                <div class=\"form-group\">\r\n");
      out.write("                                                    <label for=\"firstname\">First Name</label>\r\n");
      out.write("                                                    <input type=\"text\" class=\"form-control\" id=\"firstname\" name=\"firstName\" placeholder=\"Enter your First Name\" required>\r\n");
      out.write("                                                    <small id=\"firstnameHelp\" class=\"form-text\">First name must be characters only, minimum of 1 character.</small>\r\n");
      out.write("                                                    <div class=\"invalid-feedback\">\r\n");
      out.write("                                                        Please enter your First Name.\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("\r\n");
      out.write("                                            <div class=\"col-12 col-md-4  mt-5 \">\r\n");
      out.write("                                                <div class=\"form-group\">\r\n");
      out.write("                                                    <label for=\"middlename\">Middle Name</label>\r\n");
      out.write("                                                    <input type=\"text\" class=\"form-control\" id=\"middlename\" name=\"middleName\" placeholder=\"Enter your Middle Name\" >\r\n");
      out.write("                                                    <small id=\"middlenameHelp\" class=\"form-text\">Middle name must be characters only or leave it empty if not applicable.</small>\r\n");
      out.write("                                                    <div class=\"invalid-feedback\">\r\n");
      out.write("                                                        Not Required.\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("\r\n");
      out.write("                                            <div class=\"col-12 col-md-4 me-auto mt-5 \">\r\n");
      out.write("                                                <div class=\"form-group\">\r\n");
      out.write("                                                    <label for=\"lastname\">Last Name</label>\r\n");
      out.write("                                                    <input type=\"text\" class=\"form-control\" id=\"lastname\"  name=\"lastName\" placeholder=\"Enter your Last Name\"  required>\r\n");
      out.write("                                                    <small id=\"lastnameHelp\" class=\"form-text\">Last name must be characters only, minimum of 2 characters.</small>\r\n");
      out.write("                                                    <div class=\"invalid-feedback\">\r\n");
      out.write("                                                        Please enter your Last Name.\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div> \r\n");
      out.write("\r\n");
      out.write("                                        <div class=\"row \">\r\n");
      out.write("                                            <div class=\"col-12 col-md-4 me-auto mt-5\">\r\n");
      out.write("                                                <div class=\"form-group\">\r\n");
      out.write("                                                    <label for=\"address\">Complete Address</label>\r\n");
      out.write("                                                    <input type=\"text\" class=\"form-control\" id=\"address\" name=\"address\" placeholder=\"Enter your Address\"  required>\r\n");
      out.write("                                                    <small id=\"addressHelp\" class=\"form-text\">Address must be alphanumeric, does not contain special characters.</small>\r\n");
      out.write("                                                    <div class=\"invalid-feedback\">\r\n");
      out.write("                                                        Please enter your Address.\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                            <div class=\"col-12 col-md-4 me-auto mt-5 \">\r\n");
      out.write("                                                <div class=\"form-group\">\r\n");
      out.write("                                                    <label for=\"birthday\">Birthday</label>\r\n");
      out.write("                                                    <input type=\"text\" class=\"form-control bday\" id=\"birthday\" name=\"birthday\" placeholder=\"Enter your Birthday MM-DD-YYYY (< 2005)\"   required>\r\n");
      out.write("                                                    <small id=\"birthdayHelp\" class=\"form-text\">Birthday format must be MM-DD-YYYY. Make sure you are at legal age (2005 below).</small>\r\n");
      out.write("                                                    <div class=\"invalid-feedback\">\r\n");
      out.write("                                                        Please pick your Birthday.\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"col-12 col-md-4 me-auto mt-5 \">\r\n");
      out.write("                                                <div class=\"form-group\">\r\n");
      out.write("                                                    <label for=\"number\">Mobile Number</label>\r\n");
      out.write("                                                    <input type=\"text\" class=\"form-control\" id=\"number\" name=\"mobileNumber\" placeholder=\"09 - Enter your Mobile Number\"   required>\r\n");
      out.write("                                                    <small id=\"numberHelp\" class=\"form-text\">Mobile Number must be numeric, starts with 09, and should be 11 digits.</small>\r\n");
      out.write("                                                    <div class=\"invalid-feedback\">\r\n");
      out.write("                                                        Please enter your Mobile Number.\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"col-12 col-md-4 me-auto mt-5 \">\r\n");
      out.write("                                                <div class=\"signup-section\">Already have an account? <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/login\" class=\"text-info\">Login here</a>.</div>\r\n");
      out.write("                                                <div class=\"signup-section\">Already logged in? <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/home\" class=\"text-success\">Go to Homepage</a>.</div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div> \r\n");
      out.write("                                    </form>\r\n");
      out.write("                                    <button type='submit' form=\"regform\" name=\"RegisterItem\" class=\" d-block mx-auto mt-5 buttonfx angleindouble \">Submit</button>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- ##### Main Content Wrapper End ##### -->\r\n");
      out.write("\r\n");
      out.write("        <!-- ##### jQuery (Necessary for All JavaScript Plugins) ##### -->\r\n");
      out.write("        <script src=\"js/jquery/jQuery v3.7.1.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("        <!-- Popper js -->\r\n");
      out.write("        <script src=\"js/popper.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("        <!-- Bootstrap js -->\r\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("        <!-- Plugins js -->\r\n");
      out.write("        <script src=\"js/plugins.js\"></script>\r\n");
      out.write("\r\n");
      out.write("        <!-- Active js -->\r\n");
      out.write("        <script src=\"js/active.js\"></script>\r\n");
      out.write("        <script src=\"js/CustomJs.js\"></script>\r\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/sweetalert2@11\"></script>\r\n");
      out.write("    </body> \r\n");
      out.write("\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
