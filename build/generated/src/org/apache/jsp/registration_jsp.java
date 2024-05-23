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
      response.setContentType("text/html");
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
      out.write("        <!-- The above 4 meta tags must come first in the head -->\r\n");
      out.write("\r\n");
      out.write("        <!-- Title  -->\r\n");
      out.write("        <title>Fur Real Pet Supplies - Registration</title>\r\n");
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
      out.write("        <link rel=\"stylesheet\" href=\"Custom11Css.css\">\r\n");
      out.write("        <script src=\"https://kit.fontawesome.com/3f5c7d2f43.js\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("        <div id=\"myModal\" class=\"modal fade pt-5\">\r\n");
      out.write("            <div class=\"modal-dialog modal-confirm\">\r\n");
      out.write("                <div class=\"modal-content\">\r\n");
      out.write("                    <div class=\"modal-header justify-content-center\">\r\n");
      out.write("                        <div class=\"icon-box\"> \r\n");
      out.write("                            <i class=\"material-icon fa-solid fa-check\"></i>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"modal-body text-center\">\r\n");
      out.write("                        <h4>Great!</h4>\t\r\n");
      out.write("                        <p>Your account has been created successfully.</p>\r\n");
      out.write("                        <button  class=\"btn btn-success\" data-dismiss=\"modal\"><span>Start Exploring</span></button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>     \r\n");
      out.write("\r\n");
      out.write("        <!-- Search Start -->\r\n");
      out.write("        <div class=\"search-section section-padding-100\">\r\n");
      out.write("            <div class=\"search-close\">\r\n");
      out.write("                <i class=\"fa fa-close\" aria-hidden=\"true\"></i>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-12\">\r\n");
      out.write("                        <div class=\"search-content\">\r\n");
      out.write("                            <form action=\"#\" method=\"get\">\r\n");
      out.write("                                <input type=\"search\" name=\"search\" id=\"search\" placeholder=\"Type your keyword...\">\r\n");
      out.write("                                <button type=\"submit\"><img src=\"img/core-img/searchicon.png\" alt=\"error\"></button>\r\n");
      out.write("                            </form>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- Search End -->\r\n");
      out.write("\r\n");
      out.write("        <!-- ##### Main Content Wrapper Start ##### -->\r\n");
      out.write("        <div class=\"main-content-wrapper d-flex clearfix\" >\r\n");
      out.write("\r\n");
      out.write("            <!-- Mobile Nav -->\r\n");
      out.write("            <div class=\"mobile-nav\">\r\n");
      out.write("                <!-- Navbar Brand -->\r\n");
      out.write("                <div class=\"navbar-brand\">\r\n");
      out.write("                    <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/index\"><img src=\"img/core-img/logolight.png\" alt=\"error\"></a>\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- Navbar Toggler -->\r\n");
      out.write("                <div class=\"navbar-toggler\">\r\n");
      out.write("                    <span></span><span></span><span></span>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <!-- Topbar Start -->\r\n");
      out.write("                <div class=\"container-fluid\">\r\n");
      out.write("                    <div class=\"row upbar\">\r\n");
      out.write("                        <div class=\"col-lg-6 d-none d-lg-block\">\r\n");
      out.write("                            <div class=\"d-inline-flex align-items-center\">\r\n");
      out.write("                                <a class=\"text-light\"><i class=\"fa-solid fa-phone\"></i> Call Us: 0960-542-2186</a>\r\n");
      out.write("                                <span class=\"text-light px-2\">|</span>\r\n");
      out.write("                                <a class=\"text-light\"><i class=\"fa-solid fa-envelope\"></i> Our Email: furrealpetsupplies@gmail.com</a>\r\n");
      out.write("                                <span class=\"text-light px-2\">|</span>\r\n");
      out.write("                                <a style=\"color: #FBFF4B;\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/physicalshop\">Visit our physical shop. <i class=\"fa-solid fa-location-dot\"></i></a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            <!-- Topbar End -->\r\n");
      out.write("\r\n");
      out.write("            <!-- Header Area Start -->\r\n");
      out.write("            <header class=\"header-area clearfix \">\r\n");
      out.write("\r\n");
      out.write("                <!-- Close Icon -->\r\n");
      out.write("                <div class=\"nav-close\">\r\n");
      out.write("                    <i class=\"fa fa-close\" aria-hidden=\"true\"></i>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <!-- Logo -->\r\n");
      out.write("                <div class=\"logo\">\r\n");
      out.write("                    <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/index\"><img src=\"img/core-img/logolight.png\" alt=\"error\"></a>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <!-- Cart Menu -->\r\n");
      out.write("                <div class=\"sticky-top pt-1\">\r\n");
      out.write("                    <div> </div>\r\n");
      out.write("                    <div class=\"cart-fav-search mb-100  \">\r\n");
      out.write("                        <a href=\"#\" class=\"search-nav\"><img src=\"img/core-img/searchicon.png\" alt=\"error\">Search</a>\r\n");
      out.write("                        <a class=\"fav-nav\" data-toggle=\"modal\" data-target=\"#myLogin\"><img src=\"img/core-img/loginicon.png\" alt=\"error\">Login</a>\r\n");
      out.write("                        <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/registration\" class=\"fav-nav\"><img src=\"img/core-img/createicon.png\" alt=\"error\">Register Now</a>\r\n");
      out.write("                        <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/inventory\" class=\"fav-nav\"><img src=\"img/core-img/inventoryicon.png\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/inventory\" alt=\"error\">Inventory</a>\r\n");
      out.write("                        <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/cart\" class=\"cart-nav\"><img class=\"pb-1\" src=\"img/core-img/carticon.png\" alt=\"error\">Cart<span>(3)</span></a>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <!-- Main Nav -->\r\n");
      out.write("                    <nav class=\"main-nav \">\r\n");
      out.write("                        <ul>\r\n");
      out.write("                            <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/index\">Home</a></li>\r\n");
      out.write("                            <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/shop\">Shop</a></li>\r\n");
      out.write("                            <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/product\">Product</a></li>\r\n");
      out.write("                            <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/cart\">Cart</a></li>\r\n");
      out.write("                            <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/checkout\">Checkout</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </nav>\r\n");
      out.write("                    <br><br><br><br><br>\r\n");
      out.write("\r\n");
      out.write("                    <!-- Social Button -->\r\n");
      out.write("                    <div class=\"social-info d-flex justify-content-between\">\r\n");
      out.write("                        <a href=\"https://www.facebook.com/profile.php?id=61558747046846\" target=\"_blank\"><i class=\"fa-brands fa-facebook\" aria-hidden=\"true\"></i></a>\r\n");
      out.write("                        <a href=\"https://www.instagram.com/furrealpetsupplies/\" target=\"_blank\"><i class=\"fa-brands fa-instagram\" aria-hidden=\"true\"></i></a>\r\n");
      out.write("                        <a href=\"https://x.com/suppliesfurreal\" target=\"_blank\"><i class=\"fa-brands fa-x-twitter\" aria-hidden=\"true\"></i></a>\r\n");
      out.write("                        <a href=\"https://www.pinterest.ph/furrealthopetssupplies/\" target=\"_blank\"><i class=\"fa-brands fa-pinterest\" aria-hidden=\"true\"></i></a>        \r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </header>\r\n");
      out.write("            <!-- Header Area End -->\r\n");
      out.write("\r\n");
      out.write("            <div class=\"cart-table-area section-padding-100 \">\r\n");
      out.write("                <div class=\"container-fluid \">\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-12\">\r\n");
      out.write("                            <div class=\"checkout_details_area clearfix\">\r\n");
      out.write("\r\n");
      out.write("                                <div class=\"cart-title\">\r\n");
      out.write("                                    <h2>REGISTRATION</h2>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"registration-form-wrapper\">\r\n");
      out.write("                                    <form class=\"py-3 needs-validation\" id=\"regform\" novalidate>\r\n");
      out.write("                                        <div class=\"row\">\r\n");
      out.write("                                            <div class=\"col-12 col-md-6 mt-3\">\r\n");
      out.write("                                                <div class=\"form-group \">\r\n");
      out.write("                                                    <label for=\"username\">Username</label>\r\n");
      out.write("                                                    <input type=\"text\" class=\"form-control\" id=\"username\" placeholder=\"Enter your username\" required>\r\n");
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
      out.write("                                                    <i class=\"fa fa-eye-slash showPass \" ></i><!-- sopas??-->\r\n");
      out.write("                                                    <input type=\"password\" class=\"form-control\" id=\"password\" placeholder=\"Enter your password\" required >\r\n");
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
      out.write("                                                    <label for=\"First Name\">First Name</label>\r\n");
      out.write("                                                    <input type=\"text\" class=\"form-control\" id=\"firstname\" placeholder=\"Enter your First Name\" required>\r\n");
      out.write("                                                    <small id=\"firstnameHelp\" class=\"form-text\">First name must be characters only, minimum of 1 character.</small>\r\n");
      out.write("                                                    <div class=\"invalid-feedback\">\r\n");
      out.write("                                                        Please enter your First Name.\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("\r\n");
      out.write("                                            <div class=\"col-12 col-md-4  mt-5 \">\r\n");
      out.write("                                                <div class=\"form-group\">\r\n");
      out.write("                                                    <label for=\"Middle Name\">Middle Name</label>\r\n");
      out.write("                                                    <input type=\"text\" class=\"form-control\" id=\"middlename\" placeholder=\"Enter your Middle Name\" >\r\n");
      out.write("                                                    <small id=\"middlenameHelp\" class=\"form-text\">Middle name must be characters only or leave it empty if not applicable.</small>\r\n");
      out.write("                                                    <div class=\"invalid-feedback\">\r\n");
      out.write("                                                        Not Required.\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("\r\n");
      out.write("                                            <div class=\"col-12 col-md-4 me-auto mt-5 \">\r\n");
      out.write("                                                <div class=\"form-group\">\r\n");
      out.write("                                                    <label for=\"Last Name\">Last Name</label>\r\n");
      out.write("                                                    <input type=\"text\" class=\"form-control\" id=\"lastname\" placeholder=\"Enter your Last Name\"  required>\r\n");
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
      out.write("                                                    <input type=\"text\" class=\"form-control\" id=\"address\" placeholder=\"Enter your Address\"  required>\r\n");
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
      out.write("                                                    <label for=\"Birthday\">Birthday</label>\r\n");
      out.write("                                                    <input type=\"text\" class=\"form-control bday\" id=\"birthday\"  placeholder=\"Enter your Birthday MM-DD-YYYY (2005)\"   required>\r\n");
      out.write("                                                    <small id=\"birthdayHelp\" class=\"form-text\">Birthday format must be MM-DD-YYYY. Make sure you are at legal age. 2005 below.</small>\r\n");
      out.write("                                                    <div class=\"invalid-feedback\">\r\n");
      out.write("                                                        Please pick your Birthday.\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"col-12 col-md-4 me-auto mt-5 \">\r\n");
      out.write("                                                <div class=\"form-group\">\r\n");
      out.write("                                                    <label for=\"Mobile Number\">Mobile Number</label>\r\n");
      out.write("                                                    <input type=\"text\" class=\"form-control\" id=\"number\" placeholder=\"09 - Enter your Mobile Number\"   required>\r\n");
      out.write("                                                    <small id=\"numberHelp\" class=\"form-text\">Mobile Number must be numeric, starts with 09, and should be 11 digits.</small>\r\n");
      out.write("                                                    <div class=\"invalid-feedback\">\r\n");
      out.write("                                                        Please enter your Mobile Number.\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div> \r\n");
      out.write("                                    </form>\r\n");
      out.write("                                    <button type='submit' form=\"regform\" class=\" d-block mx-auto mt-5 buttonfx angleindouble \">Submit</button>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- ##### Main Content Wrapper End ##### -->\r\n");
      out.write("\r\n");
      out.write("        <!-- ##### Footer Area Start ##### -->\r\n");
      out.write("        <footer class=\"footer_area clearfix\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"row align-items-center\">\r\n");
      out.write("                    <!-- Single Widget Area -->\r\n");
      out.write("                    <div class=\"col-12 col-lg-4\">\r\n");
      out.write("                        <div class=\"single_widget_area\">\r\n");
      out.write("                            <!-- Logo -->\r\n");
      out.write("                            <div class=\"footer-logo mr-50\">\r\n");
      out.write("                                <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/index\"><img src=\"img/core-img/logodark.png\" alt=\"error\"></a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <!-- Text -->\r\n");
      out.write("                            <p class=\"footerdescription\">\"Animals are such agreeable friends - they ask no questions; they pass no criticisms.\" - George Eliot\r\n");
      out.write("                                <br>\r\n");
      out.write("                                <b>Fur Real Pet Supplies | <script>document.write(new Date().getFullYear());</script></b>\r\n");
      out.write("                            </p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <!-- Single Widget Area -->\r\n");
      out.write("                    <div class=\"col-12 col-lg-8\">\r\n");
      out.write("                        <div class=\"single_widget_area\">\r\n");
      out.write("                            <!-- Footer Menu -->\r\n");
      out.write("                            <div class=\"footer_menu\">\r\n");
      out.write("                                <nav class=\"navbar navbar-expand-lg justify-content-end\">\r\n");
      out.write("                                    <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#footerNavContent\" aria-controls=\"footerNavContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\"><i class=\"fa fa-bars\"></i></button>\r\n");
      out.write("                                    <div class=\"collapse navbar-collapse\" id=\"footerNavContent\">\r\n");
      out.write("                                        <ul class=\"navbar-nav ml-auto\">\r\n");
      out.write("                                            <li class=\"nav-item\">\r\n");
      out.write("                                                <a class=\"nav-link\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/index\">Home</a>\r\n");
      out.write("                                            </li>\r\n");
      out.write("                                            <li class=\"nav-item\">\r\n");
      out.write("                                                <a class=\"nav-link\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/shop\">Shop</a>\r\n");
      out.write("                                            </li>\r\n");
      out.write("                                            <li class=\"nav-item\">\r\n");
      out.write("                                                <a class=\"nav-link\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/product\">Product</a>\r\n");
      out.write("                                            </li>\r\n");
      out.write("                                            <li class=\"nav-item\">\r\n");
      out.write("                                                <a class=\"nav-link\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/cart\">Cart</a>\r\n");
      out.write("                                            </li>\r\n");
      out.write("                                            <li class=\"nav-item\">\r\n");
      out.write("                                                <a class=\"nav-link\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/checkout\">Checkout</a>\r\n");
      out.write("                                        </ul>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </nav>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </footer>\r\n");
      out.write("\r\n");
      out.write("        <!-- ##### Login Area Start ##### -->\r\n");
      out.write("        <div class=\"modal fade\" id=\"myLogin\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\r\n");
      out.write("            <div class=\"modal-dialog modal-dialog-centered\" role=\"document\">\r\n");
      out.write("                <div class=\"modal-content\">\r\n");
      out.write("                    <div class=\"modal-header border-bottom-0\">\r\n");
      out.write("                        <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\r\n");
      out.write("                            <span aria-hidden=\"true\">x</span>\r\n");
      out.write("                        </button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"modal-body\">\r\n");
      out.write("                        <div class=\"form-title text-center\">\r\n");
      out.write("                            <h4>LOGIN</h4>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"d-flex flex-column text-center\">\r\n");
      out.write("                            <form>\r\n");
      out.write("                                <div class=\"form-group\">\r\n");
      out.write("                                    <div class=\"form-group \">\r\n");
      out.write("\r\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" id=\"username\" placeholder=\"Enter your username\" required>\r\n");
      out.write("                                        <small id=\"usernameHelp\"  class=\"form-text\">Alphanumeric, must be between 4 - 12 characters.</small>\r\n");
      out.write("                                        <div class=\"invalid-feedback\">\r\n");
      out.write("                                            Please enter a username.\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div> \r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-group\">\r\n");
      out.write("                                    <div class=\"form-group \">\r\n");
      out.write("\r\n");
      out.write("                                        <input type=\"password\" class=\"form-control\" id=\"password\" placeholder=\"Enter your password\" required>\r\n");
      out.write("                                        <small id=\"passwordHelp\" class=\"form-text\">Password must be alphanumeric, 8 - 16 characters.</small>\r\n");
      out.write("                                        <div class=\"invalid-feedback\">\r\n");
      out.write("                                            Please enter your password.\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div> \r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("                                <button type='submit' form=\"Loginform\" class=\"btn btn-info btn-block btn-round d-block  buttonfx angleindouble\">Log In</button>\r\n");
      out.write("\r\n");
      out.write("                            </form>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"modal-footer d-flex justify-content-center\">\r\n");
      out.write("                        <div class=\"signup-section\">Not a member yet? <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/registration\" class=\"text-info\">Sign Up</a>.</div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!-- ##### Login Area End ##### -->\r\n");
      out.write("        <!-- ##### Footer Area End ##### -->\r\n");
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
      out.write("    </body>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
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
