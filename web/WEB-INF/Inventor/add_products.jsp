<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta name="description" content="">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <!-- The above 4 meta tags must come first in the head -->

        <!-- Title  -->
        <title>Fur Real Pet Supplies - Add Products</title>

        <!-- Tab Icon  -->
        <link rel="icon" href="<%=request.getContextPath()%>/img/core-img/iconlight.png">
        <link rel='stylesheet' href='https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.1.2/css/bootstrap.min.css'>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.2/css/all.min.css" integrity="sha512-SnH5WK+bZxgPHs44uWIX+LLJAJ9/2PkPKZ5QiAj6Ta86w+fsb2TkcmfRyVX3pBnMFcV7oQPJkl9QevSCWr3W6A==" crossorigin="anonymous" referrerpolicy="no-referrer"/>

        <!-- Core Style CSS -->
        <link rel="stylesheet" href="<%=request.getContextPath()%>/css/core-style.css">
        <link rel="stylesheet" href="<%=request.getContextPath()%>/style.css">
        <link rel="stylesheet" href="<%=request.getContextPath()%>/Custom11Css.css">
    </head>

    <body>
        <div class="modal fade " style="z-index: 1060;" id="staticBackdrop" data-bs-backdrop="static" data-bs-keyboard="false" tabindex="-1" aria-labelledby="staticBackdropLabel" aria-hidden="true">
            <div class="modal-dialog modal-sm modal-dialog-centered">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                    </div>
                    <div class="modal-body d-flex justify-content-evenly">
                        SUCCESS!!
                    </div>
                    <div class="modal-footer ">
                        <button type="button" class="btn btn-primary" data-bs-dismiss="modal">Back to Home</button>
                    </div>
                </div>
            </div>
        </div>

        <!-- ##### Main Content Wrapper Start ##### -->
        <div class="main-content-wrapper d-flex clearfix">

            <!-- Mobile Nav -->
            <div class="mobile-nav">
                <!-- Navbar Brand -->
                <div class="navbar-brand">
                    <a href="${pageContext.request.contextPath}/home"><img src="<%=request.getContextPath()%>/img/core-img/logolight.png" alt="error"></a>
                </div>
                <!-- Navbar Toggler -->
                <div class="navbar-toggler">
                    <span></span><span></span><span></span>
                </div>
            </div>

            <!-- Topbar Start -->
            <div class="container-fluid">
                <div class="row upbar">
                    <div class="col-lg-6 d-none d-lg-block">
                        <div class="d-inline-flex align-items-center">
                            <a class="text-light"><i class="fa-solid fa-phone"></i> Call Us: 0960-542-2186</a>
                            <span class="text-light px-2">|</span>
                            <a class="text-light"><i class="fa-solid fa-envelope"></i> Our Email: furrealpetsupplies@gmail.com</a>
                            <span class="text-light px-2">|</span>
                            <a style="color: #FBFF4B;" href="${pageContext.request.contextPath}/physicalshop">Visit our physical shop. <i class="fa-solid fa-location-dot"></i></a>
                        </div>
                    </div>
                </div>
            </div>
            <!-- Topbar End -->

            <!-- Header Area Start -->
            <header class="header-area clearfix">

                <!-- Close Icon -->
                <div class="nav-close">
                    <i class="fa fa-close" aria-hidden="true"></i>
                </div>

                <!-- Logo -->
                <div class="logo">
                    <a href="${pageContext.request.contextPath}/home"><img src="<%=request.getContextPath()%>/img/core-img/logolight.png" alt="error"></a>
                </div>

                <!-- Main Nav -->
                <div class="sticky-top" >

                    <div class="cart-fav-search mb-100">
                        <a href="#" class="search-nav"><img src="${pageContext.request.contextPath}/img/core-img/searchicon.png" alt="error"> Search</a>
<!--                   hide for now     <a data-toggle="modal" data-target="#myModal" class="fav-nav"><img src="${pageContext.request.contextPath}/img/core-img/loginicon.png" alt="error"> Log In</a>-->
                        <a href="${pageContext.request.contextPath}/registration" class="fav-nav"><img src="${pageContext.request.contextPath}/img/core-img/createicon.png" alt="error"> Register Now</a>
                        <a href="${pageContext.request.contextPath}/inventory/users" class="fav-nav"><img src="${pageContext.request.contextPath}/img/core-img/inventoryicon.png" href="${pageContext.request.contextPath}/inventory" alt="error"> Inventory</a>
                        <a href="${pageContext.request.contextPath}/home" class="fav-nav"><img src="${pageContext.request.contextPath}/img/core-img/homeicon.png" alt="error">Home</a>
                        <a href="${pageContext.request.contextPath}/cages" class="fav-nav"><img src="${pageContext.request.contextPath}/img/core-img/shopicon.png" alt="error">Shop</a>
                        <a href="${pageContext.request.contextPath}/cart" class="cart-nav"><img class="pb-1" src="${pageContext.request.contextPath}/img/core-img/carticon.png" alt="error"> Cart <span>(3)</span>
                        </a>
                    </div>
                    <br><br><br><br><br>

                    <!-- Social Button -->
                    <div class="social-info d-flex justify-content-between">
                        <a href="https://www.facebook.com/profile.php?id=61558747046846" target="_blank"><i class="fa-brands fa-facebook" aria-hidden="true"></i></a>
                        <a href="https://www.instagram.com/furrealpetsupplies/" target="_blank"><i class="fa-brands fa-instagram" aria-hidden="true"></i></a>
                        <a href="https://x.com/suppliesfurreal" target="_blank"><i class="fa-brands fa-x-twitter" aria-hidden="true"></i></a>
                        <a href="https://www.pinterest.ph/furrealthopetssupplies/" target="_blank"><i class="fa-brands fa-pinterest" aria-hidden="true"></i></a>        
                    </div>
                </div>
            </header>
            <!-- Header Area End -->

            <div class="cart-table-area section-padding-100">
                <br><br><br><br>
                <div class="container-fluid">
                    <div class="row justify-content-center">
                        <div class="col-12 col-md-8">
                            <div class="checkout_details_area mt-50 clearfix position-relative">
                                
                                <div class="cart-title">
                                    <h2>ADD PRODUCT</h2>
                                </div>
                                <div class="registration-form-wrapper">
                                    <form method="POST" action="${pageContext.request.contextPath}/inventory/add/product" class="py-3" id="regform">
                                        <div class="row">
                                            <div class="col-12 col-md-6 mt-3">
                                                <div class="form-group">
                                                    <label for="productID">Product ID</label>
                                                    <input type="text" class="form-control" id="productID" name="productID" placeholder="Enter the Product ID">
                                                    <small id="productIDHelp" class="form-text">Product ID must be alphanumeric.</small>
                                                </div>
                                            </div>
                                            <div class="col-12 col-md-6 mt-3">
                                                <div class="form-group">
                                                    <label for="productName">Product Name</label>
                                                    <input type="text" class="form-control" id="productName" name="productName" placeholder="Enter the Product Name">
                                                    <small id="productNameHelp" class="form-text">Product name must be alphanumeric.</small>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="row">
                                            <div class="col-12 col-md-6 mt-3">
                                                <div class="form-group">
                                                    <label for="description">Description</label>
                                                    <input type="text" class="form-control" id="description" name="description" placeholder="Enter the Description">
                                                    <small id="descriptionHelp" class="form-text">Description must be alphanumeric.</small>
                                                </div>
                                            </div>
                                            <div class="col-12 col-md-6 mt-3">
                                                <div class="form-group">
                                                    <label for="size">Size</label>
                                                    <input type="text" class="form-control" id="size" name="size" placeholder="Enter the Size">
                                                    <small id="sizeHelp" class="form-text">Size must be alphanumeric.</small>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="row">
                                            <div class="col-12 col-md-6 mt-3">
                                                <div class="form-group">
                                                    <label for="price">Price</label>
                                                    <input type="text" class="form-control" id="price" name="price" placeholder="Enter the Price">
                                                    <small id="priceHelp" class="form-text">Price must be in decimal format.</small>
                                                </div>
                                            </div>
                                            <div class="col-12 col-md-6 mt-3">
                                                <div class="form-group">
                                                    <label for="quantity">Quantity</label>
                                                    <input type="number" class="form-control" id="quantity" name="quantity" placeholder="Enter the Quantity">
                                                    <small id="quantityHelp" class="form-text">Quantity must be an integer.</small>
                                                </div>
                                            </div>
                                        </div>
                                    </form>
                                    <button type="submit" form="regform" name="addItem" class="d-block mx-auto mt-5 buttonfx angleindouble">Add</button>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <!-- ##### Main Content Wrapper End ##### -->

            <!-- ##### Footer Area Start ##### -->
            <footer class="footer_area clearfix w-100">
                <div class="container">
                    <div class="row align-items-center">
                        <!-- Single Widget Area -->
                        <div class="col-6 col-lg-4">
                            <div class="single_widget_area">
                                <!-- Logo -->
                                <div class="footer-logo mr-50">
                                    <a href="${pageContext.request.contextPath}/home"><img src="${pageContext.request.contextPath}/img/core-img/logodark.png" alt="error"></a>
                                </div>
                                <!-- Text -->
                                <p class="footerdescription">"Animals are such agreeable friends - they ask no questions; they pass no criticisms."<br>
                                    - George Eliot
                                    <br>
                                    <b>Fur Real Pet Supplies | <script>document.write(new Date().getFullYear());</script></b>
                                </p>
                            </div>
                        </div>
                        <br><br>
                        <!-- Single Widget Area -->
                        <div class="col-6 col-lg-8 ">
                            <div class="single_widget_area">
                                <!-- Footer Menu -->
                                <div class="footer_menu">
                                    <nav class="navbar navbar-expand-lg justify-content-end">
                                        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#footerNavContent" aria-controls="footerNavContent" aria-expanded="false" aria-label="Toggle navigation"><i class="fa fa-bars"></i></button>
                                        <div class="collapse navbar-collapse" id="footerNavContent">
                                            <ul class="navbar-nav ml-auto  ms-auto">
                                                <li class="nav-item">
                                                    <a class="nav-link" href="${pageContext.request.contextPath}/home">Home</a>
                                                </li>
                                                <li class="nav-item">
                                                    <a class="nav-link" href="${pageContext.request.contextPath}/cages">Shop</a>
                                                </li>
                                                <li class="nav-item">
                                                    <a class="nav-link" href="${pageContext.request.contextPath}/cart">Cart</a>
                                                </li>
                                                <li class="nav-item">
                                                    <a class="nav-link" href="${pageContext.request.contextPath}/physicalshop">Physical Shop</a>
                                                </li>
                                                <li class="nav-item">
                                                    <a class="nav-link" href="${pageContext.request.contextPath}/registration">Register Now</a>
                                                </li>
                                            </ul>
                                        </div>
                                    </nav>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </footer>
            <!-- ##### Footer Area End ##### -->

            <!-- ##### jQuery (Necessary for All JavaScript Plugins) ##### -->
            <script src="<%=request.getContextPath()%>/js/jquery/jQuery v3.7.1.min.js"></script>

            <!-- Popper js -->
            <script src="<%=request.getContextPath()%>/js/popper.min.js"></script>

            <!-- Bootstrap js -->
            <script src="<%=request.getContextPath()%>/js/bootstrap.min.js"></script>

            <!-- Plugins js -->
            <script src="<%=request.getContextPath()%>/js/plugins.js"></script>

            <!-- Active js -->
            <script src="<%=request.getContextPath()%>/js/active.js"></script>
            <!--<script src="<%=request.getContextPath()%>/js/CustomJs.js"></script>-->
    </body>

</html>