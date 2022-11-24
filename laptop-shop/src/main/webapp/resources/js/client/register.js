function validate(){
					const fname = document.getElementById("passwords")
					const telephone = document.getElementById("telephone")
					let isValid = true;
					const fnames=/^(?=.*[A-Za-z])(?=.*\d)(?=.*[@$!%*#?&])[A-Za-z\d@$!%*#?&]{8,}$/;
					 if(fnames.test(fname.value)) {
					        fname.setCustomValidity("");
					    } else {
					        fname.setCustomValidity("phải nhập Tối thiểu tám ký tự, ít nhất một chữ cái, một số và một ký tự đặc biệt");
					        isValid = false;
}
					 const vnf_regex = /((09|03|07|08|05)+([0-9]{8})\b)/g;
					    if(vnf_regex.test(telephone.value)) {
					        telephone.setCustomValidity("");
					    } else {
					        telephone.setCustomValidity("so dien thoai khong dung dinh dang");
					        isValid = false;
					    }
}
var btnSubmit = document.getElementById("submit");
btnSubmit.innerHTML = "submit";
submit.onclick = function() {
    if(validate()){
       alert('dang ky thanh cong');
    }
}