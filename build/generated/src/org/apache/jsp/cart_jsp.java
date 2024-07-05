package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.http.HttpSession;

public final class cart_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_out_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_out_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_set_var_value_nobody.release();
    _jspx_tagPool_c_out_value_nobody.release();
    _jspx_tagPool_c_if_test.release();
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

      out.write('\r');
      out.write('\n');

    session = request.getSession(false);

    if (session == null || session.getAttribute("userNamelog") == null) {
        // User is not logged in, redirect to the login page
        response.sendRedirect(request.getContextPath() + "/login");
    }

    // Set headers to prevent caching
    response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); // HTTP 1.1
    response.setHeader("Pragma", "no-cache"); // HTTP 1.0
    response.setDateHeader("Expires", 0); // Proxies

      out.write("\r\n");
      out.write("\r\n");
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
      out.write("        <title>Fur Real Pet Supplies - Cart</title>\r\n");
      out.write("\r\n");
      out.write("        <!-- Tab Icon  -->\r\n");
      out.write("        <link rel=\"icon\" href=\"img/core-img/iconlight.png\">\r\n");
      out.write("        <link rel='stylesheet' href='https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.1.2/css/bootstrap.min.css'>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.2/css/all.min.css\" integrity=\"sha512-SnH5WK+bZxgPHs44uWIX+LLJAJ9/2PkPKZ5QiAj6Ta86w+fsb2TkcmfRyVX3pBnMFcV7oQPJkl9QevSCWr3W6A==\" crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\"/>\r\n");
      out.write("\r\n");
      out.write("        <!-- Core Style CSS -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/core-style.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"./style.css\">\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("        <input type=\"hidden\" id=\"logstatus\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${userSuccess}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("        <input type=\"hidden\" id=\"userNameCurrent\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${userNamelog}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("        <input type=\"hidden\" id=\"passwordCurrent\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${latestpass}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("        <input type=\"hidden\" id=\"passwordlogged\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${currentPassword}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("        <input type=\"hidden\" id=\"userRole\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${userRole}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
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
      out.write("/home\"><img src=\"img/core-img/logolight.png\" alt=\"error\"></a>\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- Navbar Toggler -->\r\n");
      out.write("                <div class=\"navbar-toggler\">\r\n");
      out.write("                    <span></span><span></span><span></span>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <!-- Topbar Start -->\r\n");
      out.write("            <div class=\"container-fluid\">\r\n");
      out.write("                <div class=\"row upbar\">\r\n");
      out.write("                    <div class=\"col-lg-6 d-none d-lg-block\">\r\n");
      out.write("                        <div class=\"d-inline-flex align-items-center\">\r\n");
      out.write("                            <a class=\"text-light\"><i class=\"fa-solid fa-phone\"></i> Call Us: 0960-542-2186</a>\r\n");
      out.write("                            <span class=\"text-light px-2\">|</span>\r\n");
      out.write("                            <a class=\"text-light\"><i class=\"fa-solid fa-envelope\"></i> Our Email: furrealpetsupplies@gmail.com</a>\r\n");
      out.write("                            <span class=\"text-light px-2\">|</span>\r\n");
      out.write("                            <a style=\"color: #FBFF4B;\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/physicalshop\">Visit our physical shop. <i class=\"fa-solid fa-location-dot\"></i></a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
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
      out.write("/home\"><img src=\"img/core-img/logolight.png\" alt=\"error\"></a>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <!-- Main Nav -->\r\n");
      out.write("                <div class=\"sticky-top pt-1\">\r\n");
      out.write("                    <div class=\"cart-fav-search mb-100 mt-5 \">\r\n");
      out.write("                        <a style=\"color: steelblue;\" class=\"fav-nav\"><img src=\"img/core-img/usericon.png\" alt=\"error\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${userNamelog}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" <span style=\"padding-left: 29px;\">(");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${userRole}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(")</span></a>\r\n");
      out.write("                        <a href=\"#\" class=\"fav-nav\"><img src=\"img/core-img/changepassicon.png\" alt=\"error\">Change Pass</a>\r\n");
      out.write("                        <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/logout\" class=\"fav-nav\"><img src=\"img/core-img/logouticon.png\" alt=\"error\">Log Out</a>\r\n");
      out.write("                        <br><br><br>\r\n");
      out.write("                        <a href=\"#\" class=\"search-nav\"><img src=\"img/core-img/searchicon.png\" alt=\"error\">Search</a>\r\n");
      out.write("                        <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/registration\" class=\"fav-nav\"><img src=\"img/core-img/createicon.png\" alt=\"error\">Register Now</a>\r\n");
      out.write("                            ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                        <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/home\" class=\"fav-nav\"><img src=\"img/core-img/homeicon.png\" alt=\"error\">Home</a>\r\n");
      out.write("                        <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/cages\" class=\"fav-nav\"><img src=\"img/core-img/shopicon.png\" alt=\"error\">Shop</a>\r\n");
      out.write("                        <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/cart\" class=\"cart-nav\"><img class=\"pb-1\" src=\"img/core-img/carticon.png\" alt=\"error\">Cart<span>(3)</span></a>\r\n");
      out.write("                    </div>\r\n");
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
      out.write("            <div class=\"cart-table-area section-padding-100\">\r\n");
      out.write("                <div class=\"container-fluid\">\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-12 col-lg-8\">\r\n");
      out.write("                            <div class=\"cart-title mt-50\">\r\n");
      out.write("                                <h2>SHOPPING CART</h2>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"cart-wrapper\">\r\n");
      out.write("                                <div class=\"cart-table clearfix\">\r\n");
      out.write("                                    <table class=\"table table-responsive\">\r\n");
      out.write("                                        <thead>\r\n");
      out.write("                                            <tr>\r\n");
      out.write("                                                <th>productID</th>\r\n");
      out.write("                                                <th>Name</th>\r\n");
      out.write("                                                <th>Price</th>\r\n");
      out.write("                                                <th>Remove from cart</th>\r\n");
      out.write("                                            </tr>\r\n");
      out.write("                                        </thead>\r\n");
      out.write("                                        <tbody>\r\n");
      out.write("                                            ");
      if (_jspx_meth_c_set_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                            ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                        </tbody>\r\n");
      out.write("                                    </table>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-12 col-lg-4\">\r\n");
      out.write("                            <div class=\"cart-summary\">\r\n");
      out.write("                                <h5>CART TOTAL</h5>\r\n");
      out.write("                                <ul class=\"summary-table\">\r\n");
      out.write("                                    <li><span>Subtotal:</span> <span>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cartTotal}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span></li>\r\n");
      out.write("                                    <li><span>Delivery:</span> <span>32.00</span></li>\r\n");
      out.write("                                    <li><span>Total:</span> <span>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cartTotal + 32}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span></li>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                                <div class=\"cart-btn mt-100\">\r\n");
      out.write("                                    <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/checkout\" class=\"btn amado-bt w-100\">Checkout</a>\r\n");
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
      out.write("/home\"><img src=\"img/core-img/logodark.png\" alt=\"error\"></a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <!-- Text -->\r\n");
      out.write("                            <p class=\"footerdescription\">\"Animals are such agreeable friends - they ask no questions; they pass no criticisms.\"<br>\r\n");
      out.write("                                - George Eliot\r\n");
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
      out.write("/home\">Home</a>\r\n");
      out.write("                                            </li>\r\n");
      out.write("                                            <li class=\"nav-item\">\r\n");
      out.write("                                                <a class=\"nav-link\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/cages\">Shop</a>\r\n");
      out.write("                                            </li>\r\n");
      out.write("                                            <li class=\"nav-item active\">\r\n");
      out.write("                                                <a class=\"nav-link\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/cart\">Cart</a>\r\n");
      out.write("                                            </li>\r\n");
      out.write("                                            <li class=\"nav-item\">\r\n");
      out.write("                                                <a class=\"nav-link\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/physicalshop\">Physical Shop</a>\r\n");
      out.write("                                            </li>\r\n");
      out.write("                                            <li class=\"nav-item\">\r\n");
      out.write("                                                <a class=\"nav-link\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/registration\">Register Now</a>\r\n");
      out.write("                                            </li>\r\n");
      out.write("                                        </ul>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </nav>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </footer>\r\n");
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

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${userRole == 'Admin' || userRole == 'admin'}", boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                            <a href=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("/inventory/users\" class=\"fav-nav\">\r\n");
        out.write("                                <img src=\"img/core-img/inventoryicon.png\" alt=\"error\">Inventory\r\n");
        out.write("                            </a>\r\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_set_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_0.setPageContext(_jspx_page_context);
    _jspx_th_c_set_0.setParent(null);
    _jspx_th_c_set_0.setVar("cartTotal");
    _jspx_th_c_set_0.setValue(new String("0"));
    int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
    if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("product");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cartProducts}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                                ");
          if (_jspx_meth_c_set_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\r\n");
          out.write("                                                ");
          if (_jspx_meth_c_set_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\r\n");
          out.write("                                                <tr>\r\n");
          out.write("                                                    <td class=\"cart_product_img\">\r\n");
          out.write("                                                        <h5>");
          if (_jspx_meth_c_out_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("</h5>\r\n");
          out.write("                                                    </td>\r\n");
          out.write("                                                    <td class=\"cart_product_desc\">\r\n");
          out.write("                                                        <h5>");
          if (_jspx_meth_c_out_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("</h5>\r\n");
          out.write("                                                    </td>\r\n");
          out.write("                                                    <td class=\"price\">\r\n");
          out.write("                                                        <span>");
          if (_jspx_meth_c_out_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("</span>\r\n");
          out.write("                                                    </td>\r\n");
          out.write("                                                    <td class=\"qty\">\r\n");
          out.write("                                                        <a href=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("/deletecart?productID=");
          if (_jspx_meth_c_out_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\" class=\"btn btn-danger btn-sm\" >Remove</a>\r\n");
          out.write("                                                    </td>\r\n");
          out.write("                                                </tr>\r\n");
          out.write("                                            ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_set_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_1 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_1.setPageContext(_jspx_page_context);
    _jspx_th_c_set_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_set_1.setVar("subtotal");
    _jspx_th_c_set_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.price * 1}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_1 = _jspx_th_c_set_1.doStartTag();
    if (_jspx_th_c_set_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_1);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_1);
    return false;
  }

  private boolean _jspx_meth_c_set_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_2 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_2.setPageContext(_jspx_page_context);
    _jspx_th_c_set_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_set_2.setVar("cartTotal");
    _jspx_th_c_set_2.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cartTotal + subtotal}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_2 = _jspx_th_c_set_2.doStartTag();
    if (_jspx_th_c_set_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_2);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_2);
    return false;
  }

  private boolean _jspx_meth_c_out_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_0.setPageContext(_jspx_page_context);
    _jspx_th_c_out_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.productID}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_0 = _jspx_th_c_out_0.doStartTag();
    if (_jspx_th_c_out_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
    return false;
  }

  private boolean _jspx_meth_c_out_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_1 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_1.setPageContext(_jspx_page_context);
    _jspx_th_c_out_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.productName}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_1 = _jspx_th_c_out_1.doStartTag();
    if (_jspx_th_c_out_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
    return false;
  }

  private boolean _jspx_meth_c_out_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_2 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_2.setPageContext(_jspx_page_context);
    _jspx_th_c_out_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_2.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.price}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_2 = _jspx_th_c_out_2.doStartTag();
    if (_jspx_th_c_out_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_2);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_2);
    return false;
  }

  private boolean _jspx_meth_c_out_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_3 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_3.setPageContext(_jspx_page_context);
    _jspx_th_c_out_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_3.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.productID}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_3 = _jspx_th_c_out_3.doStartTag();
    if (_jspx_th_c_out_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_3);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_3);
    return false;
  }
}
