package org.apache.jsp.product;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.http.HttpSession;

public final class litterbox3_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta name=\"description\" content=\"\">\r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("        <!-- The above 4 meta tags must come first in the head -->\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("\r\n");
      out.write("        <!-- Title  -->\r\n");
      out.write("        <title>Fur Real Pet Supplies - Litter Box 3</title>\r\n");
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
      out.write("        \r\n");
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
      out.write("                        <a href=\"#\" id=\"changePasswordBtn\" class=\"fav-nav\"><img src=\"img/core-img/changepassicon.png\" alt=\"error\">Change Pass</a>\r\n");
      out.write("                        <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/logout\" class=\"fav-nav\"><img src=\"img/core-img/logouticon.png\" alt=\"error\">Log Out</a>\r\n");
      out.write("                        <br><br><br>\r\n");
      out.write("                        <a href=\"#\" class=\"search-nav\"><img src=\"img/core-img/searchicon.png\" alt=\"error\">Search</a>\r\n");
      out.write("                        <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/registration\" class=\"fav-nav\"><img src=\"img/core-img/createicon.png\" alt=\"error\">Register Now</a>\r\n");
      out.write("                        ");
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
      out.write("            <!-- Product Details Area Start -->\r\n");
      out.write("            <div class=\"single-product-area section-padding-100 clearfix\">\r\n");
      out.write("                <div class=\"container-fluid\">\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-12\">\r\n");
      out.write("                            <nav aria-label=\"breadcrumb\">\r\n");
      out.write("                                <ol class=\"breadcrumb mt-50\">\r\n");
      out.write("                                    <li class=\"breadcrumb-item\"><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/home\">Home</a></li>\r\n");
      out.write("                                    <li class=\"breadcrumb-item\"><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/litterboxes\">Litter Boxes</a></li>\r\n");
      out.write("                                    <li class=\"breadcrumb-item active\" aria-current=\"page\">Hooded Cat Litter Box</li>\r\n");
      out.write("                                </ol>\r\n");
      out.write("                            </nav>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"cart-wrapper\">                \r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-12 col-lg-7\">\r\n");
      out.write("                            <div class=\"single_product_thumb\">\r\n");
      out.write("                                <div class=\"carousel-inner\">\r\n");
      out.write("                                    <div class=\"carousel-item active\">\r\n");
      out.write("                                        <a class=\"gallery_img\" href=\"img/product-img/prodetails/litbox 3 shop.png\">\r\n");
      out.write("                                            <img class=\"d-block w-100\" src=\"img/product-img/prodetails/litbox 3 shop.png\" alt=\"First slide\">\r\n");
      out.write("                                        </a>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"col-12 col-lg-5\">\r\n");
      out.write("                            <div class=\"single_product_desc\">\r\n");
      out.write("                                <!-- Product Meta Data -->\r\n");
      out.write("                                <div class=\"product-meta-data\">\r\n");
      out.write("                                    <div class=\"line\"></div>\r\n");
      out.write("                                    <p class=\"product-price\">PHP 1960.00</p>\r\n");
      out.write("                                    <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/litterbox3\">\r\n");
      out.write("                                        <h6>Hooded Cat Litter Box</h6>\r\n");
      out.write("                                    </a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"short_overview my-5\">\r\n");
      out.write("                                    <p>The hooded cat litter box is a specialized enclosure designed for cats to use as a private and contained area for their litter needs. It features a covered design with an entry point for the cat, providing privacy and reducing litter tracking around the home. These litter boxes often come with filters to minimize odors and are available in various sizes and styles to suit different cat breeds and household preferences.</p>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div>\r\n");
      out.write("                                <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/addtocart?productID=1021\"><button type=\"submit\" name=\"addtocart\" value=\"5\" class=\"btn amado-bt\">Add to Cart</button></a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- Product Details Area End -->\r\n");
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
      out.write("                                            <li class=\"nav-item\">\r\n");
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
      out.write("\r\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/sweetalert2@11\"></script>\r\n");
      out.write("        <script>\r\n");
      out.write("                                    $(document).ready(function () {\r\n");
      out.write("                                        var statusreg = $('#logstatus').val();\r\n");
      out.write("                                        var username = $('#userNameCurrent').val();\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                        $('#changePasswordBtn').click(function (event) {\r\n");
      out.write("                                            event.preventDefault(); // Prevent default form submission behavior\r\n");
      out.write("\r\n");
      out.write("                                            Swal.fire({\r\n");
      out.write("                                                title: 'Change Password for ' + username,\r\n");
      out.write("                                                html: `\r\n");
      out.write("                <form id=\"changePasswordForm\">\r\n");
      out.write("                    <input type=\"hidden\" name=\"username\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${userNamelog}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("                            <div class=\"password-field\">\r\n");
      out.write("                            <input type=\"password\" id=\"newPassword\" name=\"newPassword\" class=\"swal2-input\" placeholder=\"New Password\">\r\n");
      out.write("                        <i class=\"fa fa-eye-slash showPass\" onclick=\"togglePasswordVisibility('newPassword')\"></i>\r\n");
      out.write("                    </div>\r\n");
      out.write("                        <div class=\"password-field\">\r\n");
      out.write("                            <input type=\"password\" id=\"confirmNewPassword\" name=\"confirmNewPassword\" class=\"swal2-input\" placeholder=\"Confirm New Password\">\r\n");
      out.write("                        <i class=\"fa fa-eye-slash showPass\" onclick=\"togglePasswordVisibility('confirmNewPassword')\"></i>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </form>\r\n");
      out.write("\r\n");
      out.write("            `,\r\n");
      out.write("                                                confirmButtonText: 'Change',\r\n");
      out.write("                                                focusConfirm: false,\r\n");
      out.write("                                                didOpen: () => {\r\n");
      out.write("                                                    const popup = Swal.getPopup();\r\n");
      out.write("                                                    const newPasswordInput = popup.querySelector('#newPassword');\r\n");
      out.write("                                                    const confirmNewPasswordInput = popup.querySelector('#confirmNewPassword');\r\n");
      out.write("\r\n");
      out.write("                                                    newPasswordInput.onkeyup = (event) => event.key === 'Enter' && Swal.clickConfirm();\r\n");
      out.write("                                                    confirmNewPasswordInput.onkeyup = (event) => event.key === 'Enter' && Swal.clickConfirm();\r\n");
      out.write("                                                },\r\n");
      out.write("                                                preConfirm: () => {\r\n");
      out.write("                                                    const newPassword = document.getElementById('newPassword').value;\r\n");
      out.write("                                                    const confirmNewPassword = document.getElementById('confirmNewPassword').value;\r\n");
      out.write("                                                    var currentPassword = $('#passwordCurrent').val();\r\n");
      out.write("                                                    var logPassword = $('#passwordlogged').val();\r\n");
      out.write("\r\n");
      out.write("                                                    if (currentPassword === \"samepass\" || logPassword == newPassword || currentPassword == newPassword) {\r\n");
      out.write("                                                        Swal.showValidationMessage('New password cannot be the same as the current password');\r\n");
      out.write("                                                        return false;\r\n");
      out.write("                                                    }\r\n");
      out.write("\r\n");
      out.write("                                                    if (!newPassword || !confirmNewPassword) {\r\n");
      out.write("                                                        Swal.showValidationMessage('Please fill out all fields');\r\n");
      out.write("                                                        return false;\r\n");
      out.write("                                                    }\r\n");
      out.write("\r\n");
      out.write("                                                    if (newPassword !== confirmNewPassword) {\r\n");
      out.write("                                                        Swal.showValidationMessage('Passwords do not match');\r\n");
      out.write("                                                        return false;\r\n");
      out.write("                                                    }\r\n");
      out.write("\r\n");
      out.write("                                                    const passwordRegex = /^(?=.*[A-Z].*)(?=.*[a-z].*)(?=.*\\d)(?=.*[!@#$&*])[A-Za-z\\d!@#$&*]{8,16}$/;\r\n");
      out.write("                                                    if (!passwordRegex.test(newPassword)) {\r\n");
      out.write("                                                        Swal.showValidationMessage('8-16 characters long, with at least one lowercase letter, one uppercase letter, and one number');\r\n");
      out.write("                                                        return false;\r\n");
      out.write("                                                    }\r\n");
      out.write("\r\n");
      out.write("                                                    // Submit the form using AJAX to prevent default submission behavior\r\n");
      out.write("                                                    $.ajax({\r\n");
      out.write("                                                        type: 'POST',\r\n");
      out.write("                                                        url: '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/changePassword',\r\n");
      out.write("                                                        data: $('#changePasswordForm').serialize(),\r\n");
      out.write("                                                        success: function () {\r\n");
      out.write("                                                            // Show success alert\r\n");
      out.write("                                                            Swal.fire({\r\n");
      out.write("                                                                icon: 'success',\r\n");
      out.write("                                                                title: 'Password Changed',\r\n");
      out.write("                                                                text: 'Your password has been successfully changed!',\r\n");
      out.write("                                                                showConfirmButton: true,\r\n");
      out.write("                                                                timer: 0\r\n");
      out.write("                                                            }).then((result) => {\r\n");
      out.write("                                                                if (result.isConfirmed) {\r\n");
      out.write("                                                                    // Redirect to home page after success\r\n");
      out.write("                                                                    window.location.href = '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/litbox3';\r\n");
      out.write("                                                                }\r\n");
      out.write("                                                            });\r\n");
      out.write("                                                        },\r\n");
      out.write("                                                        error: function (xhr, status, error) {\r\n");
      out.write("                                                            Swal.showValidationMessage(`Error: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${error}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("`);\r\n");
      out.write("                                                        }\r\n");
      out.write("                                                    });\r\n");
      out.write("                                                }\r\n");
      out.write("                                            });\r\n");
      out.write("                                        });\r\n");
      out.write("                                    });\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                    function togglePasswordVisibility(inputId) {\r\n");
      out.write("                                        const input = document.getElementById(inputId);\r\n");
      out.write("                                        const icon = input.nextElementSibling;\r\n");
      out.write("                                        if (input.type === \"password\") {\r\n");
      out.write("                                            input.type = \"text\";\r\n");
      out.write("                                            icon.classList.remove(\"fa-eye-slash\");\r\n");
      out.write("                                            icon.classList.add(\"fa-eye\");\r\n");
      out.write("                                        } else {\r\n");
      out.write("                                            input.type = \"password\";\r\n");
      out.write("                                            icon.classList.remove(\"fa-eye\");\r\n");
      out.write("                                            icon.classList.add(\"fa-eye-slash\");\r\n");
      out.write("                                        }\r\n");
      out.write("                                    }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        </script>\r\n");
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
}
