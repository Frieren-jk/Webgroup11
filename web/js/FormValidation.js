/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/JavaScript.js to edit this template
 */

let forms = document.querySelectorAll (".needs-validation");

Array.prototype.slice.call (forms).forEach (function(form)
{
	form.addEventListener ("submit", function(event)
	{
	if (!form.checkValidity())
		{
		event.preventDefault();
		event.stopPropagation();
		}
		form.classList.add("was-validated");
	});
});