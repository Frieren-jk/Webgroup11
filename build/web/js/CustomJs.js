$(document).ready(function () {
    const inputs = document.querySelectorAll('input');
    const patterns = {
        username: /^(?=.*[a-zA-Z])(?=.*\d)[a-zA-Z\d]{4,12}$/i,
        firstname: /^[a-zA-Z" "]{1,}$/i,
        middlename: /^[a-zA-Z" "]{0,}$/i,
        lastname: /^[a-zA-Z" "]{2,}$/i,
        address: /^(?=.*[a-zA-Z])(?=.*\d)[a-zA-Z\d ]+$/i,
//        birthday: /^(0[1-9]|1[0-2])\/(0[1-9]|[12][0-9]|3[01])\/(19|20)\d{2}$/i,
        number: /^09[0-9]{9}$/i,
        password: /^(?=.*[A-Z].*)(?=.*[a-z].*)(?=.*\d)(?=.*[!@#$&*])[A-Za-z\d!@#$&*]{8,16}$/,
        confirmpassword: /^(?=.*[A-Z].*)(?=.*[a-z].*)(?=.*\d)(?=.*[!@#$&*])[A-Za-z\d!@#$&*]{8,16}$/
    };

    inputs.forEach((input) => {
        input.addEventListener('input', (e) => {
            validate(e.target, patterns[e.target.attributes.id.value]);
        });
    });

    function validate(field, regex) {
        const value = field.value.trim();
        const parent = field.parentElement;

        if (!value) {
            field.classList.remove('invalid');
            parent.classList.remove('was-validated', 'valid', 'invalid');
        } else if (!regex.test(value)) {
            field.classList.add('invalid');
            field.classList.remove('valid');
            parent.classList.remove('was-validated', 'valid', 'invalid');
        } else {
            field.classList.remove('invalid');
            field.classList.add('valid');
            parent.classList.remove('was-validated', 'valid', 'invalid');
        }
    }

    $('#regform').submit(function (event) {
        let AllUserInfoValid = true;

        $('#regform input').each(function () {
            if ($(this).attr('id') !== 'birthday' && !$(this).hasClass('valid') && $(this).attr('id') !== 'middlename') {
                AllUserInfoValid = false;
            }
            // if birthdate date picker has no value
            if ($(this).attr('id') === 'birthday' && $(this).val() === '') {
                AllUserInfoValid = false;
            }
        });

        if (!AllUserInfoValid) {
            // Prevent showing the modal if validation fails
            event.preventDefault(); // Prevent form submission
            alert("Please fill in all required fields correctly before submitting.");
        } else {
            // Show modal if all user inputs are valid
            $('#myModal').modal('show');
            event.preventDefault();
        }
    });

    const passwordInput = $('#password');
    const confirmPasswordInput = $('#confirmpassword');

    passwordInput.on('keyup', function () {
        validatePassword();
    });

    confirmPasswordInput.on('keyup', function () {
        validatePassword();
    });

    function validatePassword() {
        const password = passwordInput.val();
        const confirmPassword = confirmPasswordInput.val();

        if (password === confirmPassword) {
            confirmPasswordInput.removeClass('invalid').addClass('valid');
        } else {
            confirmPasswordInput.removeClass('valid').addClass('invalid');
        }
    }

    function passvisibility(password, form) {
        const toggleVisibility = document.querySelector('.' + password);
        const selector = '.' + form + ' input';
        const input = document.querySelector(selector);
        var passwordHidden = true;

        toggleVisibility.addEventListener('click', function () {
            if (passwordHidden) {
                input.setAttribute('type', 'text');
                $('.' + password).removeClass("fa-eye-slash").addClass("fa-eye");
            } else {
                input.setAttribute('type', 'password');
                $('.' + password).removeClass("fa-eye").addClass("fa-eye-slash");
            }
            passwordHidden = !passwordHidden;
        });
    }

    passvisibility('showPass', 'form-pass');
    passvisibility('confirmPass', 'form-confirm');
});

document.addEventListener('DOMContentLoaded', function () {
    const today = new Date();
    const year = today.getFullYear();
    let month = today.getMonth() + 1;
    let day = today.getDate();

    if (month < 10) {
        month = '0' + month;
    }
    if (day < 10) {
        day = '0' + day;
    }

    const maxDate = year + '-' + month + '-' + day;
    document.getElementById('birthday').setAttribute('max', maxDate);
});

(function () {
    'use strict';

    var forms = document.querySelectorAll('.needs-validation');

    Array.prototype.slice.call(forms)
            .forEach(function (form) {
                form.addEventListener('submit', function (event) {
                    if (!form.checkValidity()) {
                        event.preventDefault();
                        event.stopPropagation();
                    }

                    form.classList.add('was-validated');
                }, false);
            });
})();
