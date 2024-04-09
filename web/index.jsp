<%-- 
    Document   : newjsp
    Created on : Mar 23, 2024, 7:14:36 PM
    Author     : John
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html data-bs-theme="dark">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Testing Page</title>
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/bootstrap.min.css">

        <script type="text/javascript" src="${pageContext.request.contextPath}/js/jQuery-v3.7.1.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/js/bootstrap.bundle.min.js"></script>

    </head>
    <body>
        <%--<jsp:include page="navbar.jsp">--%>

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
                                Please Choose a Username
                            </div>
                        </div>
                    </div>
                </div>

                <div class="col-md-4 ">
                    <label for="validationFirstname" class="form-label">First name</label>
                    <input type="text" class="form-control" id="validationFirstname" value="" placeholder="Type your First name here" required>
                    <div class="invalid-feedback">
                        Please Enter your First Name
                    </div>
                </div>
                <div class="col-md-4">
                    <label for="validationMiddlename" class="form-label">Middle name</label>
                    <input type="text" class="form-control" id="validationMiddlename" value="" placeholder="Type your middle name here(not required)" notrequired>
                    <div class="valid-feedback">
                        hmmm.. nothing wrong here..
                    </div>
                </div>
                <div class="col-md-4">
                    <label for="validationLastname" class="form-label">Last name</label>
                    <input type="text" class="form-control" id="validationLastname" value="" placeholder="Type your Last name here" required>
                    <div class="invalid-feedback">
                        Please Enter your Last Name
                    </div>
                </div>

                <div class="col-md-6">
                    <label for="validationAddress" class="form-label">Complete Address</label>
                    <input type="text" class="form-control" id="validationAddress" required>
                    <div class="invalid-feedback">
                        Please provide your Complete Address
                    </div>
                </div>

                <div class="col-md-3">
                    <label for="validationBirthday" class="form-label">Birthday</label>
                    <input type="text" class="form-control" id="validationBirthday" required>
                    <div class="invalid-feedback">
                        Please provide your Birthday
                    </div>
                </div>

                <div class="col-md-3">
                    <label for="validationNumber" class="form-label">Mobile Number</label>
                    <input type="text" class="form-control" id="validationNumber" required>
                    <div class="invalid-feedback">
                        Please provide your Mobile Number
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
                        var usern = $("#validationCustomUsername");
                        var firstname = $("#validationFirstname");
                        var middlename = $("#validationMiddlename");
                        var lastname = $("#validationLastname");
                        var address = $("#validationAddress");
                        var birthday = $("#validationBirthday");
                        var mobile = $("#validationNumber");
                        const regex_user = /^[a-zA-Z0-9]{4,12}$/g;
                        const regex_firstn = /^[a-zA-Z]{1,}$/g;
                        const regex_middlen = /^[a-zA-Z]{0,}$/g;
                        const regex_lastn = /^[a-zA-Z]{2,}$/g;
                        const regex_address = /^[a-zA-Z0-9]+$/g;
                        const regex_birthday = /^\d\d-\d\d-\d\d\d\d$/g;
                        const regex_mobile = /^[0-9]{11}$/g;


                        if (!regex_user.test(usern.val())) {
                            alert("invalid")
                            event.preventDefault();
                            form.classList.add("was-validated");
                            return;
                        } else if (!regex_firstn.test(firstname.val())) {
                            alert("invalid")
                            event.preventDefault();
                            form.classList.add("was-validated");
                            return;
                        } else if (!regex_middlen.test(middlename.val())) {
                            alert("invalid")
                            event.preventDefault();
                            form.classList.add("was-validated");
                            return;
                        } else if (!regex_lastn.test(lastname.val())) {
                            alert("invalid")
                            event.preventDefault();
                            form.classList.add("was-validated");
                            return; 
                        } else if (!regex_address.test(address.val())) {
                            alert("invalid")
                            event.preventDefault();
                            form.classList.add("was-validated");
                            return;
                        } else if (!regex_birthday.test(birthday.val())) {
                            alert("invalid")
                            event.preventDefault();
                            form.classList.add("was-validated");
                            return;
                        } else if (!regex_mobile.test(mobile.val())) {
                            alert("invalid")
                            event.preventDefault();
                            form.classList.add("was-validated");
                            return; 
                        }
                        


                        alert("Success")
                        event.preventDefault();
                        return;
                    }

                    form.classList.add("was-validated");

                });
            });


        </script>
    </body>
</html>
