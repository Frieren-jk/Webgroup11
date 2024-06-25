<!DOCTYPE html>


<html lang="en">

    <head>

        <meta charset="UTF-8">
        <meta name="description" content="">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <%@ page contentType="text/html;charset=UTF-8" language="java" %>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
        <!-- The above 4 meta tags must come first in the head -->

        <!-- Title  -->
        <title>Fur Real Pet Supplies - Products Inventory</title>

        <!-- Tab Icon  -->
        <link rel="icon" href="${pageContext.request.contextPath}/img/core-img/iconlight.png">
        <link rel='stylesheet' href='https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.1.2/css/bootstrap.min.css'>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.2/css/all.min.css" integrity="sha512-SnH5WK+bZxgPHs44uWIX+LLJAJ9/2PkPKZ5QiAj6Ta86w+fsb2TkcmfRyVX3pBnMFcV7oQPJkl9QevSCWr3W6A==" crossorigin="anonymous" referrerpolicy="no-referrer"/>

        <!-- Core Style CSS -->
        <link defer rel="stylesheet" href="https://cdn.datatables.net/2.0.5/css/dataTables.dataTables.css" />
        <link defer rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/5.3.0/css/bootstrap.min.css"/>
        <link defer rel="stylesheet" href="https://cdn.datatables.net/2.0.5/css/dataTables.bootstrap5.css"/>
        <script src="https://code.jquery.com/jquery-3.7.1.js"></script>
        <script defer src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/5.3.0/js/bootstrap.bundle.min.js"></script>
        <script defer src="https://cdn.datatables.net/2.0.5/js/dataTables.js"></script>
        <script defer src="https://cdn.datatables.net/2.0.5/js/dataTables.bootstrap5.js"></script>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/core-style.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/style.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/Custom11Css.css">     

    </head>

    <body>
        <div class="notification">
            <c:if test="${not empty sessionScope.registrationMessage}">
                <p>${sessionScope.registrationMessage}</p>
            </c:if>
        </div>
        <div class="main-content-wrapper d-flex clearfix">

            <!-- Search Start -->
            <div class="search-section section-padding-100">
                <div class="search-close">
                    <i class="fa fa-close" aria-hidden="true"></i>
                </div>
                <div class="container">
                    <div class="row">
                        <div class="col-12">
                            <div class="search-content">
                                <form action="#" method="get">
                                    <input type="search" name="search" id="search" placeholder="Type your keyword...">
                                    <button type="submit"><img src="<%=request.getContextPath()%>/img/core-img/searchicon.png" alt="error"></button>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <!-- Search End -->

            <!-- Mobile Nav -->
            <div class="mobile-nav">
                <!-- Navbar Brand -->
                <div class="navbar-brand">
                    <a href="${pageContext.request.contextPath}/home"><img src="${pageContext.request.contextPath}/img/core-img/logolight.png" alt="error"></a>
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
                    <a href="${pageContext.request.contextPath}/home"><img src="${pageContext.request.contextPath}/img/core-img/logolight.png" alt="error"></a>
                </div>

                <!-- Cart Menu -->
                <div class="cart-fav-search mb-100">
                    <a href="#" class="search-nav"><img src="${pageContext.request.contextPath}/img/core-img/searchicon.png" alt="error"> Search</a>
<!--              hide for now      <a class="fav-nav" data-toggle="modal" data-target="#myModal"><img src="${pageContext.request.contextPath}/img/core-img/loginicon.png" alt="error"> Log In</a>-->
                    <a href="${pageContext.request.contextPath}/registration" class="fav-nav"><img src="${pageContext.request.contextPath}/img/core-img/createicon.png" alt="error"> Register Now</a>
                    <a href="${pageContext.request.contextPath}/inventory" class="fav-nav"><img src="${pageContext.request.contextPath}/img/core-img/inventoryicon.png" alt="error"> Inventory</a>
                    <a href="${pageContext.request.contextPath}/cart" class="cart-nav"><img class="pb-1" src="${pageContext.request.contextPath}/img/core-img/carticon.png" alt="error"> Cart <span>(3)</span></a>
                </div>

                <!-- Main Nav -->
                <nav class="main-nav">
                    <ul>
                        <li><a href="${pageContext.request.contextPath}/home">Home</a></li>
                        <li><a href="${pageContext.request.contextPath}/cages">Shop</a></li>
                        <li><a href="${pageContext.request.contextPath}/product">Product</a></li>
                        <li><a href="${pageContext.request.contextPath}/cart">Cart</a></li>
                        <li><a href="${pageContext.request.contextPath}/checkout">Checkout</a></li>
                    </ul>
                </nav>

                <br><br><br><br><br>

                <!-- Social Button -->
                <div class="social-info d-flex justify-content-between">
                    <a href="https://www.facebook.com/profile.php?id=61558747046846" target="_blank"><i class="fa-brands fa-facebook" aria-hidden="true"></i></a>
                    <a href="https://www.instagram.com/furrealpetsupplies/" target="_blank"><i class="fa-brands fa-instagram" aria-hidden="true"></i></a>
                    <a href="https://x.com/suppliesfurreal" target="_blank"><i class="fa-brands fa-x-twitter" aria-hidden="true"></i></a>
                    <a href="https://www.pinterest.ph/furrealthopetssupplies/" target="_blank"><i class="fa-brands fa-pinterest" aria-hidden="true"></i></a>        
                </div>
            </header>
            <!-- Header Area End -->

            <div class="container m-auto m-1 m-5 mb-auto ">
                <div class="cart-btn w-10 mt-1 mb-4">
                    <a href="${pageContext.request.contextPath}/inventory/add/form" class="btn amado-bt">Add Inventory</a>
                </div>
                <div class="cart-btn w-10 mt-1 mb-4" >
                    <a id="toggleTables" class="btn amado-bt" style="color: white;">Show Product</a>
                </div>

                <div class="table-wrapper">

                    <div class="registration-form-wrapper pt-auto" id="table1">
                        <div class="table-responsive">
                            <table id="myTable1" class="table table-striped table-hover">
                                <thead>
                                    <tr>
                                        <th>Username</th>
                                        <th>Name</th>
                                        <th>Address</th>
                                        <th>Birthday</th>
                                        <th>Mobile Number</th>
                                        <th>Account Status</th>
                                        <th>Log In Status</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <c:forEach var="show" items="${AllUser}">
                                        <tr>

                                            <td><c:out value="${show.userName}" /></td>
                                            <td><c:out value="${show.firstName} ${show.middleName} ${show.lastName}" /></td>
                                            <td><c:out value="${show.address}" /></td>
                                            <td><c:out value="${show.birthday}" /></td>
                                            <td><c:out value="${show.mobileNumber}" /></td>
                                            <td><c:out value="${show.accountStatus}" /></td>
                                            <td><c:out value="${show.loginStatus}" /></td>




                                        </tr>
                                    </c:forEach>
                                </tbody>
                                <tfoot>
                                    <tr>
                                        <th>Username</th>
                                        <th>Name</th>
                                        <th>Address</th>
                                        <th>Birthday</th>
                                        <th>Mobile Number</th>
                                        <th>Account Status</th>
                                        <th>Log In Status</th>
                                    </tr>
                                </tfoot>
                            </table>
                        </div>
                    </div>


                    <div class="registration-form-wrapper pt-auto" id="table2" >
                        <div class="table-responsive">
                            <table id="myTable2" class="table table-striped table-hover">
                                <thead>
                                    <tr>
                                        <th>Product ID</th>
                                        <th>Product Name</th>
                                        <th>Category</th>
                                        <th>Size</th>
                                        <th>Price</th>
                                        <th>Stock</th>
                                        <th>Action</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <c:forEach var="product" items="${AllProducts}">
                                        <tr>
                                            <td><c:out value="${product.productID}" /></td>
                                            <td><c:out value="${product.productName}" /></td>
                                            <td><c:out value="${product.description}" /></td>
                                            <td><c:out value="${product.size}" /></td>
                                            <td><c:out value="${product.price}" /></td>
                                            <td><c:out value="${product.quantity}" /></td>
                                            <td>
                                                <a href="${pageContext.request.contextPath}/inventory/update/form/product?productID=<c:out value='${product.productID}'/>" type="button" class="btn btn-primary btn-sm"> EDIT</a>
                                                <a href="${pageContext.request.contextPath}/inventory/delete/product?productID=<c:out value='${product.productID}' />" type="button" class="btn btn-danger btn-sm"> DELETE</a>
                                            </td> 
                                        </tr>
                                    </c:forEach>
                                </tbody>
                                <tfoot>
                                    <tr>
                                        <th>Product ID</th>
                                        <th>Product Name</th>
                                        <th>Category</th>
                                        <th>Size</th>
                                        <th>Price</th>
                                        <th>Stock</th>
                                        <th>Action</th>
                                    </tr>
                                </tfoot>
                            </table>
                        </div>
                    </div>

                </div>


            </div>
        </div>



        <!-- ##### Footer Area End ##### -->
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
                                                <a class="nav-link" href="${pageContext.request.contextPath}/product">Product</a>
                                            </li>
                                            <li class="nav-item">
                                                <a class="nav-link" href="${pageContext.request.contextPath}/cart">Cart</a>
                                            </li>
                                            <li class="nav-item">
                                                <a class="nav-link" href="${pageContext.request.contextPath}/checkout">Checkout</a>
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
        <!-- ##### Login Area Start ##### -->
        <div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
            <div class="modal-dialog modal-dialog-centered" role="document">
                <div class="modal-content">
                    <div class="modal-header border-bottom-0">
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">x</span>
                        </button>
                    </div>
                    <div class="modal-body">
                        <div class="form-title text-center">
                            <h4>LOGIN</h4>
                        </div>
                        <div class="d-flex flex-column text-center">
                            <form>
                                <div class="form-group">
                                    <div class="form-group ">

                                        <input type="text" class="form-control" id="username" placeholder="Enter your username" required>
                                        <small id="usernameHelp"  class="form-text">Alphanumeric, must be between 4 - 12 characters.</small>
                                        <div class="invalid-feedback">
                                            Please enter a username.
                                        </div>
                                    </div> 
                                </div>
                                <div class="form-group">
                                    <div class="form-group ">

                                        <input type="password" class="form-control" id="password" placeholder="Enter your password" required>
                                        <small id="passwordHelp" class="form-text">Password must be alphanumeric, 8 - 16 characters.</small>
                                        <div class="invalid-feedback">
                                            Please enter your password.
                                        </div>
                                    </div> 
                                </div>

                                <button type='submit' form="regform" class="btn btn-info btn-block btn-round">Log In</button>

                            </form>
                        </div>
                    </div>
                    <div class="modal-footer d-flex justify-content-center">
                        <div class="signup-section">Not a member yet? <a href="${pageContext.request.contextPath}/registration" class="text-info">Sign Up</a>.</div>
                    </div>
                </div>
            </div>
        </div>
        <!-- ##### Login Area End ##### -->

        <!-- ##### jQuery (Necessary for All JavaScript Plugins) ##### -->
        <script src="js/jquery/jQuery v3.7.1.min.js"></script>

        <!-- Popper js -->
        <script src="${pageContext.request.contextPath}/js/popper.min.js"></script>

        <!-- Bootstrap js -->
        <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>

        <!-- Plugins js -->
        <script src="${pageContext.request.contextPath}/js/plugins.js"></script>

        <!-- Active js -->
        <script src="${pageContext.request.contextPath}/js/active.js"></script>
        <script src="${pageContext.request.contextPath}/js/CustomJs.js"></script>
        <script>
                                    $(document).ready(function () {
                                        $('#myTable').DataTable();
                                        $('#myTable1').DataTable();
                                        $('#myTable2').DataTable();

                                        // Initially hide the second table
                                        $('#table2').hide();

                                        $('#toggleTables').on('click', function () {
                                            if ($('#table1').is(':hidden')) {
                                                $('#table1').show();
                                                $('#table2').hide();
                                                $(this).text('Show Products');
                                            } else {
                                                $('#table1').hide();
                                                $('#table2').show();
                                                $(this).text('Show Users');
                                            }
                                        });

                                    });
        </script>
    </body>

</html>
