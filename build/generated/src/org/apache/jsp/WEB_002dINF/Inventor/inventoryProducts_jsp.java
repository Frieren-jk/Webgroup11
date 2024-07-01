package org.apache.jsp.WEB_002dINF.Inventor;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class inventoryProducts_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_out_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_out_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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

      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("    <head>\r\n");
      out.write("\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta name=\"description\" content=\"\">\r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        <!-- The above 4 meta tags must come first in the head -->\r\n");
      out.write("\r\n");
      out.write("        <!-- Title  -->\r\n");
      out.write("        <title>Fur Real Pet Supplies - Products Inventory</title>\r\n");
      out.write("\r\n");
      out.write("        <!-- Tab Icon  -->\r\n");
      out.write("        <link rel=\"icon\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/img/core-img/iconlight.png\">\r\n");
      out.write("        <link rel='stylesheet' href='https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.1.2/css/bootstrap.min.css'>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.2/css/all.min.css\" integrity=\"sha512-SnH5WK+bZxgPHs44uWIX+LLJAJ9/2PkPKZ5QiAj6Ta86w+fsb2TkcmfRyVX3pBnMFcV7oQPJkl9QevSCWr3W6A==\" crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\"/>\r\n");
      out.write("\r\n");
      out.write("        <!-- Core Style CSS -->\r\n");
      out.write("        <link defer rel=\"stylesheet\" href=\"https://cdn.datatables.net/2.0.5/css/dataTables.dataTables.css\" />\r\n");
      out.write("        <link defer rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/5.3.0/css/bootstrap.min.css\"/>\r\n");
      out.write("        <link defer rel=\"stylesheet\" href=\"https://cdn.datatables.net/2.0.5/css/dataTables.bootstrap5.css\"/>\r\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.7.1.js\"></script>\r\n");
      out.write("        <script defer src=\"https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/5.3.0/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("        <script defer src=\"https://cdn.datatables.net/2.0.5/js/dataTables.js\"></script>\r\n");
      out.write("        <script defer src=\"https://cdn.datatables.net/2.0.5/js/dataTables.bootstrap5.js\"></script>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/css/core-style.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/style.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/css/Custom11Css.css\">     \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("        ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("        \r\n");
      out.write("        ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("\r\n");
      out.write("        ");
      if (_jspx_meth_c_if_2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("        <div class=\"main-content-wrapper d-flex clearfix\">\r\n");
      out.write("\r\n");
      out.write("            <!-- Search Start -->\r\n");
      out.write("            <div class=\"search-section section-padding-100\">\r\n");
      out.write("                <div class=\"search-close\">\r\n");
      out.write("                    <i class=\"fa fa-close\" aria-hidden=\"true\"></i>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"container\">\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-12\">\r\n");
      out.write("                            <div class=\"search-content\">\r\n");
      out.write("                                <form action=\"#\" method=\"get\">\r\n");
      out.write("                                    <input type=\"search\" name=\"search\" id=\"search\" placeholder=\"Type your keyword...\">\r\n");
      out.write("                                    <button type=\"submit\"><img src=\"");
      out.print(request.getContextPath());
      out.write("/img/core-img/searchicon.png\" alt=\"error\"></button>\r\n");
      out.write("                                </form>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- Search End -->\r\n");
      out.write("\r\n");
      out.write("            <!-- Mobile Nav -->\r\n");
      out.write("            <div class=\"mobile-nav\">\r\n");
      out.write("                <!-- Navbar Brand -->\r\n");
      out.write("                <div class=\"navbar-brand\">\r\n");
      out.write("                    <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/home\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/img/core-img/logolight.png\" alt=\"error\"></a>\r\n");
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
      out.write("            <header class=\"header-area clearfix\">\r\n");
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
      out.write("/home\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/img/core-img/logolight.png\" alt=\"error\"></a>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <!-- Main Nav -->\r\n");
      out.write("                <div class=\"sticky-top\" >\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"cart-fav-search mb-100\">\r\n");
      out.write("                        <a href=\"#\" class=\"search-nav\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/img/core-img/searchicon.png\" alt=\"error\"> Search</a>\r\n");
      out.write("<!--                   hide for now     <a data-toggle=\"modal\" data-target=\"#myModal\" class=\"fav-nav\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/img/core-img/loginicon.png\" alt=\"error\"> Log In</a>-->\r\n");
      out.write("                        <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/registration\" class=\"fav-nav\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/img/core-img/createicon.png\" alt=\"error\"> Register Now</a>\r\n");
      out.write("                        <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/inventory/users\" class=\"fav-nav\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/img/core-img/inventoryicon.png\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/inventory\" alt=\"error\"> Inventory</a>\r\n");
      out.write("                        <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/home\" class=\"fav-nav\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/img/core-img/homeicon.png\" alt=\"error\">Home</a>\r\n");
      out.write("                        <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/cages\" class=\"fav-nav\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/img/core-img/shopicon.png\" alt=\"error\">Shop</a>\r\n");
      out.write("                        <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/cart\" class=\"cart-nav\"><img class=\"pb-1\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/img/core-img/carticon.png\" alt=\"error\"> Cart <span>(3)</span>\r\n");
      out.write("                        </a>\r\n");
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
      out.write("            </header>\r\n");
      out.write("            <!-- Header Area End -->\r\n");
      out.write("\r\n");
      out.write("            <div class=\"container m-auto m-1 m-5 mb-auto \">\r\n");
      out.write("                <div class=\"cart-btn w-10 mt-1 mb-4\">\r\n");
      out.write("                    <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/inventory/add/form/product\" class=\"btn amado-bt\">Add Product</a>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"cart-btn w-10 mt-1 mb-4\" >\r\n");
      out.write("                    <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/inventory/users\" class=\"btn amado-bt\" style=\"color: white;\">Show Users</a>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"table-wrapper\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"registration-form-wrapper pt-auto\" id=\"table2\" >\r\n");
      out.write("                        <div class=\"table-responsive\">\r\n");
      out.write("                            <table id=\"myTable\" class=\"table row-border order-column table-hover\">\r\n");
      out.write("                                <thead>\r\n");
      out.write("                                    <tr>\r\n");
      out.write("                                        <th>Product ID</th>\r\n");
      out.write("                                        <th>Product Name</th>\r\n");
      out.write("                                        <th>Description</th>\r\n");
      out.write("                                        <th>Size</th>\r\n");
      out.write("                                        <th>Price</th>\r\n");
      out.write("                                        <th>Stock</th>\r\n");
      out.write("                                        <th>Edit</th>\r\n");
      out.write("                                        <th>Del</th>\r\n");
      out.write("                                    </tr>\r\n");
      out.write("                                </thead>\r\n");
      out.write("                                <tbody>\r\n");
      out.write("                                    ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                </tbody>\r\n");
      out.write("                                <tfoot>\r\n");
      out.write("                                    <tr>\r\n");
      out.write("                                        <th>Product ID</th>\r\n");
      out.write("                                        <th>Product Name</th>\r\n");
      out.write("                                        <th>Description</th>\r\n");
      out.write("                                        <th>Size</th>\r\n");
      out.write("                                        <th>Price</th>\r\n");
      out.write("                                        <th>Stock</th>\r\n");
      out.write("                                        <th>Edit</th>\r\n");
      out.write("                                        <th>Del</th>\r\n");
      out.write("                                    </tr>\r\n");
      out.write("                                </tfoot>\r\n");
      out.write("                            </table>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!-- ##### Footer Area End ##### -->\r\n");
      out.write("        <footer class=\"footer_area clearfix w-100\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"row align-items-center\">\r\n");
      out.write("                    <!-- Single Widget Area -->\r\n");
      out.write("                    <div class=\"col-6 col-lg-4\">\r\n");
      out.write("                        <div class=\"single_widget_area\">\r\n");
      out.write("                            <!-- Logo -->\r\n");
      out.write("                            <div class=\"footer-logo mr-50\">\r\n");
      out.write("                                <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/home\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/img/core-img/logodark.png\" alt=\"error\"></a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <!-- Text -->\r\n");
      out.write("                            <p class=\"footerdescription\">\"Animals are such agreeable friends - they ask no questions; they pass no criticisms.\"<br>\r\n");
      out.write("                                - George Eliot\r\n");
      out.write("                                <br>\r\n");
      out.write("                                <b>Fur Real Pet Supplies | <script>document.write(new Date().getFullYear());</script></b>\r\n");
      out.write("                            </p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <br><br>\r\n");
      out.write("                    <!-- Single Widget Area -->\r\n");
      out.write("                    <div class=\"col-6 col-lg-8 \">\r\n");
      out.write("                        <div class=\"single_widget_area\">\r\n");
      out.write("                            <!-- Footer Menu -->\r\n");
      out.write("                            <div class=\"footer_menu\">\r\n");
      out.write("                                <nav class=\"navbar navbar-expand-lg justify-content-end\">\r\n");
      out.write("                                    <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#footerNavContent\" aria-controls=\"footerNavContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\"><i class=\"fa fa-bars\"></i></button>\r\n");
      out.write("                                    <div class=\"collapse navbar-collapse\" id=\"footerNavContent\">\r\n");
      out.write("                                        <ul class=\"navbar-nav ml-auto  ms-auto\">\r\n");
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
      out.write("        <!-- ##### Login Area Start ##### -->\r\n");
      out.write("        <div class=\"modal fade\" id=\"myModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\r\n");
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
      out.write("                                <button type='submit' form=\"regform\" class=\"btn btn-info btn-block btn-round\">Log In</button>\r\n");
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
      out.write("        <!-- ##### Login Area End ##### -->\r\n");
      out.write("\r\n");
      out.write("        <!-- ##### jQuery (Necessary for All JavaScript Plugins) ##### -->\r\n");
      out.write("        <script src=\"js/jquery/jQuery v3.7.1.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("        <!-- Popper js -->\r\n");
      out.write("        <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/js/popper.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("        <!-- Bootstrap js -->\r\n");
      out.write("        <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/js/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("        <!-- Plugins js -->\r\n");
      out.write("        <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/js/plugins.js\"></script>\r\n");
      out.write("\r\n");
      out.write("        <!-- Active js -->\r\n");
      out.write("        <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/js/active.js\"></script>\r\n");
      out.write("        <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/js/CustomJs.js\"></script>\r\n");
      out.write("        <script>\r\n");
      out.write("\r\n");
      out.write("                                    $(document).ready(function () {\r\n");
      out.write("                                        $('#myTable').DataTable();\r\n");
      out.write("\r\n");
      out.write("                                    });\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        </script>\r\n");
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

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${editProduct == true}", boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("            <div class=\"bounce-in-right toast-container position-fixed top-0 end-0 p-3\">\r\n");
        out.write("                <div id=\"liveToastEdit\" class=\"toast show\"\r\n");
        out.write("                     role=\"status\" aria-live=\"assertive\" aria-atomic=\"true\"\r\n");
        out.write("                     data-bs-config='{\"animation\": true, \"autohide\": true, \"delay\": 5000}'>\r\n");
        out.write("                    <div class=\"toast-header bg-success\">\r\n");
        out.write("                        <i class=\"fas fa-check-circle me-2\"></i>\r\n");
        out.write("                        <strong class=\"me-auto\">STATUS</strong>\r\n");
        out.write("                        <a href=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${editProduct = false}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" class=\"btn-close\" data-bs-dismiss=\"toast\" aria-label=\"Close\"\"></a>\r\n");
        out.write("                    </div>\r\n");
        out.write("                    <div class=\"toast-body toastSuccess\">\r\n");
        out.write("                        Product \"");
        if (_jspx_meth_c_out_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("\" WAS SUCCESSFULLY EDITED\r\n");
        out.write("                    </div>\r\n");
        out.write("                </div>\r\n");
        out.write("            </div>\r\n");
        out.write("        ");
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

  private boolean _jspx_meth_c_out_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_0.setPageContext(_jspx_page_context);
    _jspx_th_c_out_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_out_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${productName}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_0 = _jspx_th_c_out_0.doStartTag();
    if (_jspx_th_c_out_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
    return false;
  }

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${addProduct == true}", boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("            <div class=\"bounce-in-right toast-container position-fixed top-0 end-0 p-3\">\r\n");
        out.write("                <div id=\"liveToastEdit\" class=\"toast show\"\r\n");
        out.write("                     role=\"status\" aria-live=\"assertive\" aria-atomic=\"true\"\r\n");
        out.write("                     data-bs-config='{\"animation\": true, \"autohide\": true, \"delay\": 5000}'>\r\n");
        out.write("                    <div class=\"toast-header bg-success\">\r\n");
        out.write("                        <i class=\"fas fa-check-circle me-2\"></i>\r\n");
        out.write("                        <strong class=\"me-auto\">STATUS</strong>\r\n");
        out.write("                        <a href=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${addProduct = false}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" class=\"btn-close\" data-bs-dismiss=\"toast\" aria-label=\"Close\"\"></a>\r\n");
        out.write("                    </div>\r\n");
        out.write("                    <div class=\"toast-body toastSuccess\">\r\n");
        out.write("                        Product \"");
        if (_jspx_meth_c_out_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_1, _jspx_page_context))
          return true;
        out.write("\" WAS SUCCESSFULLY ADDED\r\n");
        out.write("                    </div>\r\n");
        out.write("                </div>\r\n");
        out.write("            </div>\r\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }

  private boolean _jspx_meth_c_out_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_1 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_1.setPageContext(_jspx_page_context);
    _jspx_th_c_out_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_1);
    _jspx_th_c_out_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${productName}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_1 = _jspx_th_c_out_1.doStartTag();
    if (_jspx_th_c_out_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
    return false;
  }

  private boolean _jspx_meth_c_if_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent(null);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${deleteProduct == true}", boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("            <div class=\"bounce-in-right toast-container position-fixed top-0 end-0 p-3\">\r\n");
        out.write("                <div id=\"liveToastDelete\" class=\"toast show\"\r\n");
        out.write("                     role=\"status\" aria-live=\"assertive\" aria-atomic=\"true\"\r\n");
        out.write("                     data-bs-config='{\"animation\": true, \"autohide\": true, \"delay\": 5000}'>\r\n");
        out.write("                    <div class=\"toast-header bg-danger\">\r\n");
        out.write("                        <i class=\"fas fa-trash-alt me-2\"></i>\r\n");
        out.write("                        <strong class=\"me-auto\">STATUS</strong>\r\n");
        out.write("                       <a href=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${deleteProduct = false}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" class=\"btn-close\" data-bs-dismiss=\"toast\" aria-label=\"Close\"\"></a>\r\n");
        out.write("                    </div>\r\n");
        out.write("                    <div class=\"toast-body toastDanger\">\r\n");
        out.write("                        Product ID: \"");
        if (_jspx_meth_c_out_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_2, _jspx_page_context))
          return true;
        out.write("\" WAS SUCCESSFULLY DELETED\r\n");
        out.write("                    </div>\r\n");
        out.write("                </div>\r\n");
        out.write("            </div>\r\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_c_if_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
    return false;
  }

  private boolean _jspx_meth_c_out_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_2 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_2.setPageContext(_jspx_page_context);
    _jspx_th_c_out_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_2);
    _jspx_th_c_out_2.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${productID}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_2 = _jspx_th_c_out_2.doStartTag();
    if (_jspx_th_c_out_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_2);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_2);
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
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${AllProducts}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                        <tr>\r\n");
          out.write("                                            <td>");
          if (_jspx_meth_c_out_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("</td>\r\n");
          out.write("                                            <td>");
          if (_jspx_meth_c_out_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("</td>\r\n");
          out.write("                                            <td>");
          if (_jspx_meth_c_out_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("</td>\r\n");
          out.write("                                            <td>");
          if (_jspx_meth_c_out_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("</td>\r\n");
          out.write("                                            <td>");
          if (_jspx_meth_c_out_7((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("</td>\r\n");
          out.write("                                            <td>");
          if (_jspx_meth_c_out_8((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("</td>\r\n");
          out.write("                                            <td> \r\n");
          out.write("                                                <a href=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("/inventory/update/form/product?productID=");
          if (_jspx_meth_c_out_9((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\" class=\"editBtn\">\r\n");
          out.write("                                                    <svg height=\"1em\" viewBox=\"0 0 512 512\">\r\n");
          out.write("                                                    <path\r\n");
          out.write("                                                        d=\"M410.3 231l11.3-11.3-33.9-33.9-62.1-62.1L291.7 89.8l-11.3 11.3-22.6 22.6L58.6 322.9c-10.4 10.4-18 23.3-22.2 37.4L1 480.7c-2.5 8.4-.2 17.5 6.1 23.7s15.3 8.5 23.7 6.1l120.3-35.4c14.1-4.2 27-11.8 37.4-22.2L387.7 253.7 410.3 231zM160 399.4l-9.1 22.7c-4 3.1-8.5 5.4-13.3 6.9L59.4 452l23-78.1c1.4-4.9 3.8-9.4 6.9-13.3l22.7-9.1v32c0 8.8 7.2 16 16 16h32zM362.7 18.7L348.3 33.2 325.7 55.8 314.3 67.1l33.9 33.9 62.1 62.1 33.9 33.9 11.3-11.3 22.6-22.6 14.5-14.5c25-25 25-65.5 0-90.5L453.3 18.7c-25-25-65.5-25-90.5 0zm-47.4 168l-144 144c-6.2 6.2-16.4 6.2-22.6 0s-6.2-16.4 0-22.6l144-144c6.2-6.2 16.4-6.2 22.6 0s6.2 16.4 0 22.6z\"\r\n");
          out.write("                                                        ></path>\r\n");
          out.write("                                                    </svg>\r\n");
          out.write("                                                </a>\r\n");
          out.write("                                            </td> \r\n");
          out.write("                                            <td> \r\n");
          out.write("                                                <a href=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("/inventory/delete/product?productID=");
          if (_jspx_meth_c_out_10((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\" class=\"bin-button\">\r\n");
          out.write("                                                    <svg\r\n");
          out.write("                                                        xmlns=\"http://www.w3.org/2000/svg\"\r\n");
          out.write("                                                        fill=\"none\"\r\n");
          out.write("                                                        viewBox=\"0 0 39 7\"\r\n");
          out.write("                                                        class=\"bin-top\"\r\n");
          out.write("                                                        >\r\n");
          out.write("                                                    <line stroke-width=\"4\" stroke=\"white\" y2=\"5\" x2=\"39\" y1=\"5\"></line>\r\n");
          out.write("                                                    <line\r\n");
          out.write("                                                        stroke-width=\"3\"\r\n");
          out.write("                                                        stroke=\"white\"\r\n");
          out.write("                                                        y2=\"1.5\"\r\n");
          out.write("                                                        x2=\"26.0357\"\r\n");
          out.write("                                                        y1=\"1.5\"\r\n");
          out.write("                                                        x1=\"12\"\r\n");
          out.write("                                                        ></line>\r\n");
          out.write("                                                    </svg>\r\n");
          out.write("                                                    <svg\r\n");
          out.write("                                                        xmlns=\"http://www.w3.org/2000/svg\"\r\n");
          out.write("                                                        fill=\"none\"\r\n");
          out.write("                                                        viewBox=\"0 0 33 39\"\r\n");
          out.write("                                                        class=\"bin-bottom\"\r\n");
          out.write("                                                        >\r\n");
          out.write("                                                    <mask fill=\"white\" id=\"path-1-inside-1_8_19\">\r\n");
          out.write("                                                        <path\r\n");
          out.write("                                                            d=\"M0 0H33V35C33 37.2091 31.2091 39 29 39H4C1.79086 39 0 37.2091 0 35V0Z\"\r\n");
          out.write("                                                            ></path>\r\n");
          out.write("                                                    </mask>\r\n");
          out.write("                                                    <path\r\n");
          out.write("                                                        mask=\"url(#path-1-inside-1_8_19)\"\r\n");
          out.write("                                                        fill=\"white\"\r\n");
          out.write("                                                        d=\"M0 0H33H0ZM37 35C37 39.4183 33.4183 43 29 43H4C-0.418278 43 -4 39.4183 -4 35H4H29H37ZM4 43C-0.418278 43 -4 39.4183 -4 35V0H4V35V43ZM37 0V35C37 39.4183 33.4183 43 29 43V35V0H37Z\"\r\n");
          out.write("                                                        ></path>\r\n");
          out.write("                                                    <path stroke-width=\"4\" stroke=\"white\" d=\"M12 6L12 29\"></path>\r\n");
          out.write("                                                    <path stroke-width=\"4\" stroke=\"white\" d=\"M21 6V29\"></path>\r\n");
          out.write("                                                    </svg>\r\n");
          out.write("                                                    <svg\r\n");
          out.write("                                                        xmlns=\"http://www.w3.org/2000/svg\"\r\n");
          out.write("                                                        fill=\"none\"\r\n");
          out.write("                                                        viewBox=\"0 0 89 80\"\r\n");
          out.write("                                                        class=\"garbage\"\r\n");
          out.write("                                                        >\r\n");
          out.write("                                                    <path\r\n");
          out.write("                                                        fill=\"white\"\r\n");
          out.write("                                                        d=\"M20.5 10.5L37.5 15.5L42.5 11.5L51.5 12.5L68.75 0L72 11.5L79.5 12.5H88.5L87 22L68.75 31.5L75.5066 25L86 26L87 35.5L77.5 48L70.5 49.5L80 50L77.5 71.5L63.5 58.5L53.5 68.5L65.5 70.5L45.5 73L35.5 79.5L28 67L16 63L12 51.5L0 48L16 25L22.5 17L20.5 10.5Z\"\r\n");
          out.write("                                                        ></path>\r\n");
          out.write("                                                    </svg>\r\n");
          out.write("                                                </a>\r\n");
          out.write("\r\n");
          out.write("                                            </td> \r\n");
          out.write("                                        </tr>\r\n");
          out.write("                                    ");
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

  private boolean _jspx_meth_c_out_4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_4 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_4.setPageContext(_jspx_page_context);
    _jspx_th_c_out_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_4.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.productName}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_4 = _jspx_th_c_out_4.doStartTag();
    if (_jspx_th_c_out_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_4);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_4);
    return false;
  }

  private boolean _jspx_meth_c_out_5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_5 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_5.setPageContext(_jspx_page_context);
    _jspx_th_c_out_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_5.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.description}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_5 = _jspx_th_c_out_5.doStartTag();
    if (_jspx_th_c_out_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_5);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_5);
    return false;
  }

  private boolean _jspx_meth_c_out_6(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_6 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_6.setPageContext(_jspx_page_context);
    _jspx_th_c_out_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_6.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.size}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_6 = _jspx_th_c_out_6.doStartTag();
    if (_jspx_th_c_out_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_6);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_6);
    return false;
  }

  private boolean _jspx_meth_c_out_7(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_7 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_7.setPageContext(_jspx_page_context);
    _jspx_th_c_out_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_7.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.price}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_7 = _jspx_th_c_out_7.doStartTag();
    if (_jspx_th_c_out_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_7);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_7);
    return false;
  }

  private boolean _jspx_meth_c_out_8(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_8 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_8.setPageContext(_jspx_page_context);
    _jspx_th_c_out_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_8.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.quantity}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_8 = _jspx_th_c_out_8.doStartTag();
    if (_jspx_th_c_out_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_8);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_8);
    return false;
  }

  private boolean _jspx_meth_c_out_9(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_9 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_9.setPageContext(_jspx_page_context);
    _jspx_th_c_out_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_9.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.productID}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_9 = _jspx_th_c_out_9.doStartTag();
    if (_jspx_th_c_out_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_9);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_9);
    return false;
  }

  private boolean _jspx_meth_c_out_10(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_10 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_10.setPageContext(_jspx_page_context);
    _jspx_th_c_out_10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_10.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.productID}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_10 = _jspx_th_c_out_10.doStartTag();
    if (_jspx_th_c_out_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_10);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_10);
    return false;
  }
}
