<%-- 
    Document   : newjsp
    Created on : Mar 23, 2024, 7:14:36 PM
    Author     : John
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Testing Page</title>
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/bootstrap.min.css">

        <script type="text/javascript" src="${pageContext.request.contextPath}/js/jQuery-v3.7.1.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/js/bootstrap.bundle.min.js"></script>

    </head>
    <body>
        <%--<jsp:include page="navbar.jsp">--%>
        <script type="text/javascript">

        </script>
        <div class=""style="margin: 200px;">
            <form class="row g-3 needs-validation" novalidate>
                <!--                username div-->
                <div>
                    <div class="col-md-3  ">
                        <label for="validationCustomUsername" class="form-label">Username</label>
                        <div class="input-group has-validation">
                            <span class="input-group-text " id="inputGroupPrepend">*</span>
                            <input type="text" class="form-control" id="validationCustomUsername" aria-describedby="inputGroupPrepend" required>
                            <div class="invalid-feedback">
                                Please choose a username.
                            </div>
                        </div>
                    </div>
                </div>

                <div class="col-md-4 ">
                    <label for="validationCustom01" class="form-label">First name</label>
                    <input type="text" class="form-control" id="validationCustom01" value="" placeholder="Type your First name here" required>
                    <div class="valid-feedback">
                        Looks good!
                    </div>
                </div>
                <div class="col-md-4">
                    <label for="validationCustom02" class="form-label">Middle name</label>
                    <input type="text" class="form-control" id="validationCustom02" value="" placeholder="Type your middle name here" notrequired>
                    <div class="valid-feedback">
                        hmmm.. nothing wrong here..
                    </div>
                </div>
                <div class="col-md-4">
                    <label for="validationCustom02" class="form-label">Last name</label>
                    <input type="text" class="form-control" id="validationCustom02" value="" placeholder="Type your Last name here" required>
                    <div class="valid-feedback">
                        Looks good!
                    </div>
                </div>

                <div class="col-md-6">
                    <label for="validationCustom03" class="form-label">Complete Address</label>
                    <input type="text" class="form-control" id="validationCustom03" required>
                    <div class="invalid-feedback">
                        Please provide a valid city.
                    </div>
                </div>

                <div class="col-md-3">
                    <label for="validationCustom05" class="form-label">Birthday</label>
                    <input type="text" class="form-control" id="validationCustom05" required>
                    <div class="invalid-feedback">
                        Please provide a valid zip.
                    </div>
                </div>

                <div class="col-md-3">
                    <label for="validationCustom05" class="form-label">Mobile Number</label>
                    <input type="text" class="form-control" id="validationCustom05" required>
                    <div class="invalid-feedback">
                        Please provide a valid zip.
                    </div>
                </div>
                <div class="col-12">
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" value="" id="invalidCheck" required>
                        <label class="form-check-label" for="invalidCheck">
                            Check box if all are in correct format
                        </label>
                        <div class="invalid-feedback">
                            You must agree before submitting.
                        </div>
                    </div>
                </div>
                <div class="col-12">
                    <button class="btn btn-primary" type="submit" >Submit</button>
                </div>
            </form>
        </div>
        <script>


            var forms = document.querySelectorAll(".needs-validation");


            Array.prototype.slice.call(forms).forEach(function (form)
            {
                form.addEventListener("submit", function (event)
                {
                    if (!form.checkValidity())
                    {

                        event.preventDefault();
                        event.stopPropagation();
                       

                    } else {
                        alert("Success")
                    }

                    form.classList.add("was-validated");

                });
            });


        </script>
    </body>
</html>
