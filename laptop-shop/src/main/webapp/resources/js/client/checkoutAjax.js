calculateOrder();
function calculateOrder() {
	var element = document.getElementsByClassName("total");
	var res = 0;
	for (i = 0; i < element.length; i++) {
		res = res + parseInt(element[i].textContent);
	}
	var element2 = document.getElementById("ordertotal");

	resConvert = accounting.formatMoney(res);
	element2.innerHTML = resConvert + " VND";
	var element3 = document.getElementById("tongGiaTri");
	element3.setAttribute("value", res);
	if (res == 0) {
		document.getElementById("submit").disabled = true;
	}
}
function validate(){
	const telephone = document.getElementById("telephone")
	 const vnf_regex = /((09|03|07|08|05)+([0-9]{8})\b)/g;
	    if(vnf_regex.test(telephone.value)) {
	        telephone.setCustomValidity("");
	    } else {
	        telephone.setCustomValidity("so dien thoai khong dung dinh dang");
	        isValid = false;
	    }
}
var btnSubmit = document.getElementById("submit");
btnSubmit.innerHTML = "Thanh Toán";
submit.onclick = function() {
    if(validate()){
       alert('dang ky thanh cong');
    }
}
