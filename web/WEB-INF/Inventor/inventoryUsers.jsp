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
        <title>Fur Real Pet Supplies - Users Inventory</title>

        <!-- Tab Icon  -->
        <link rel="icon" href="${pageContext.request.contextPath}/img/core-img/iconlight.png">
        <link rel='stylesheet' href='https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.1.2/css/bootstrap.min.css'>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.2/css/all.min.css" integrity="sha512-SnH5WK+bZxgPHs44uWIX+LLJAJ9/2PkPKZ5QiAj6Ta86w+fsb2TkcmfRyVX3pBnMFcV7oQPJkl9QevSCWr3W6A==" crossorigin="anonymous" referrerpolicy="no-referrer"/>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.3.0/css/all.min.css">
        <!-- Core Style CSS -->
        <link defer rel="stylesheet" href="https://cdn.datatables.net/2.0.5/css/dataTables.dataTables.css" />
        <link defer rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/5.3.0/css/bootstrap.min.css"/>
        <link defer rel="stylesheet" href="https://cdn.datatables.net/2.0.5/css/dataTables.bootstrap5.css"/>
        <script src="https://code.jquery.com/jquery-3.7.1.js"></script>
        <script  src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/5.3.0/js/bootstrap.bundle.min.js"></script>
        <script defer src="https://cdn.datatables.net/2.0.5/js/dataTables.js"></script>
        <script defer src="https://cdn.datatables.net/2.0.5/js/dataTables.bootstrap5.js"></script>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/core-style.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/style.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/Custom11Css.css">     

        <style>

        </style>

    </head>

    <body>

        <%-- Debugging statement to check the value of 'success' --%>
        <c:if test="${editUser == true}">
            <div class=" bounce-in-right toast-container position-fixed top-0 end-0 p-3" id="toastContainer">
                <div id="liveToast" class="toast show"
                     role="status" aria-live="assertive"  aria-atomic="true">
                    <div class="toast-header bg-success">
                        <i class="fas fa-check-circle me-2"></i>
                        <strong class="me-auto">STATUS</strong>
                        <a href="${editUser = false}" class="btn-close " data-bs-dismiss="toast" aria-label="Close"></a>
                    </div>
                    <div class="toast-body">
                        USER "<c:out value="${userName}" />" WAS SUCCESSFULLY EDITED
                    </div>
                </div>
            </div>
        </c:if>
        <c:if test="${deleteUser == true}">
            <div class="bounce-in-right toast-container position-fixed top-0 end-0 p-3">
                <div id="liveToast" class="toast show"
                     role="status" aria-live="assertive" aria-atomic="true"
                     data-bs-config='{"animation": true, "autohide": true, "delay": 5000}'>
                    <div class="toast-header bg-danger">
                        <i class="fas fa-trash-alt me-2"></i> <!-- Changed to trash icon -->
                        <strong class="me-auto">STATUS</strong>
                        <a href="${deleteUser = false}" class="btn-close" data-bs-dismiss="toast" aria-label="Close""></a>
                    </div>
                    <div class="toast-body toastDanger">
                        USER "<c:out value="${userName}" />" WAS SUCCESSFULLY DELETED
                    </div>
                </div>
            </div>
        </c:if>




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
            </header>
            <!-- Header Area End -->

            <div class="container m-auto m-1 m-5 mb-auto ">
                <div class="cart-btn w-10 mt-1 mb-4">
                    <a href="${pageContext.request.contextPath}/inventory/add/form/user" class="btn amado-bt">Add User</a>
                </div>
                <div class="cart-btn w-10 mt-1 mb-4" >
                    <a href="${pageContext.request.contextPath}/inventory/products" id="toggleTables" class="btn amado-bt" style="color: white;">Show Products</a>
                </div>

                <div class="table-wrapper">

                    <div class="registration-form-wrapper pt-auto" id="table1">
                        <div class="table-responsive">
                            <table id="myTable" class="table row-border order-column table-hover">
                                <thead>
                                    <tr>
                                        <th>Username</th>
                                        <th>Name</th>
                                        <th>Address</th>
                                        <th>Birthday</th>
                                        <th>Mobile #</th>
                                        <th>Account</th>
                                        <th>Status</th>
                                        <th>Edit</th>
                                        <th>Del</th>
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
                                            <td> 
                                                <a href="${pageContext.request.contextPath}/inventory/update/form/user?userName=<c:out value='${show.userName}'/>" class="editBtn">
                                                    <svg height="1em" viewBox="0 0 512 512">
                                                    <path
                                                        d="M410.3 231l11.3-11.3-33.9-33.9-62.1-62.1L291.7 89.8l-11.3 11.3-22.6 22.6L58.6 322.9c-10.4 10.4-18 23.3-22.2 37.4L1 480.7c-2.5 8.4-.2 17.5 6.1 23.7s15.3 8.5 23.7 6.1l120.3-35.4c14.1-4.2 27-11.8 37.4-22.2L387.7 253.7 410.3 231zM160 399.4l-9.1 22.7c-4 3.1-8.5 5.4-13.3 6.9L59.4 452l23-78.1c1.4-4.9 3.8-9.4 6.9-13.3l22.7-9.1v32c0 8.8 7.2 16 16 16h32zM362.7 18.7L348.3 33.2 325.7 55.8 314.3 67.1l33.9 33.9 62.1 62.1 33.9 33.9 11.3-11.3 22.6-22.6 14.5-14.5c25-25 25-65.5 0-90.5L453.3 18.7c-25-25-65.5-25-90.5 0zm-47.4 168l-144 144c-6.2 6.2-16.4 6.2-22.6 0s-6.2-16.4 0-22.6l144-144c6.2-6.2 16.4-6.2 22.6 0s6.2 16.4 0 22.6z"
                                                        ></path>
                                                    </svg>
                                                </a>
                                            </td> 
                                            <td> 
                                                <a href="${pageContext.request.contextPath}/inventory/delete/user?userName=<c:out value='${show.userName}' />" class="bin-button">
                                                    <svg
                                                        xmlns="http://www.w3.org/2000/svg"
                                                        fill="none"
                                                        viewBox="0 0 39 7"
                                                        class="bin-top"
                                                        >
                                                    <line stroke-width="4" stroke="white" y2="5" x2="39" y1="5"></line>
                                                    <line
                                                        stroke-width="3"
                                                        stroke="white"
                                                        y2="1.5"
                                                        x2="26.0357"
                                                        y1="1.5"
                                                        x1="12"
                                                        ></line>
                                                    </svg>
                                                    <svg
                                                        xmlns="http://www.w3.org/2000/svg"
                                                        fill="none"
                                                        viewBox="0 0 33 39"
                                                        class="bin-bottom"
                                                        >
                                                    <mask fill="white" id="path-1-inside-1_8_19">
                                                        <path
                                                            d="M0 0H33V35C33 37.2091 31.2091 39 29 39H4C1.79086 39 0 37.2091 0 35V0Z"
                                                            ></path>
                                                    </mask>
                                                    <path
                                                        mask="url(#path-1-inside-1_8_19)"
                                                        fill="white"
                                                        d="M0 0H33H0ZM37 35C37 39.4183 33.4183 43 29 43H4C-0.418278 43 -4 39.4183 -4 35H4H29H37ZM4 43C-0.418278 43 -4 39.4183 -4 35V0H4V35V43ZM37 0V35C37 39.4183 33.4183 43 29 43V35V0H37Z"
                                                        ></path>
                                                    <path stroke-width="4" stroke="white" d="M12 6L12 29"></path>
                                                    <path stroke-width="4" stroke="white" d="M21 6V29"></path>
                                                    </svg>
                                                    <svg
                                                        xmlns="http://www.w3.org/2000/svg"
                                                        fill="none"
                                                        viewBox="0 0 89 80"
                                                        class="garbage"
                                                        >
                                                    <path
                                                        fill="white"
                                                        d="M20.5 10.5L37.5 15.5L42.5 11.5L51.5 12.5L68.75 0L72 11.5L79.5 12.5H88.5L87 22L68.75 31.5L75.5066 25L86 26L87 35.5L77.5 48L70.5 49.5L80 50L77.5 71.5L63.5 58.5L53.5 68.5L65.5 70.5L45.5 73L35.5 79.5L28 67L16 63L12 51.5L0 48L16 25L22.5 17L20.5 10.5Z"
                                                        ></path>
                                                    </svg>
                                                </a>

                                            </td> 



                                        </tr>
                                    </c:forEach>
                                </tbody>
                                <tfoot>
                                    <tr>
                                        <th>Username</th>
                                        <th>Name</th>
                                        <th>Address</th>
                                        <th>Birthday</th>
                                        <th>Mobile #</th>
                                        <th>Account</th>
                                        <th>Status</th>
                                        <th>Edit</th>
                                        <th>Del</th>
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
                                        
                                        
                                    });


        </script>
    </body>

</html>
