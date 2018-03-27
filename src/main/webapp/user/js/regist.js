var code;
function createCode()
{
	code="";
	var codeLength=6;
	var selectChar=new Array(0,1,2,3,4,5,6,7,8,9,'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z');
	for(var i=0;i<codeLength;i++)
	{
		var charIndex=Math.floor(Math.random()*36);
		code+=selectChar[charIndex];
	}
	$("#checkCode").val(code);
}
function validate()
{
	var inputCode=$("#code").val();
	if(inputCode.length<=0)
	{
		alert("请输入验证码");
		return false;
	}
	else if(inputCode!=code)
	{
		alert("验证码错误");
		createCode();
		return false;
	}
	else
	{
		return true;
	}
}

function submitAll(){
		//验证参数
		//var state=validate(); //验证码是否正确
		//if(state==false)
		//{
		//	return false;
		//}
		$(".error_span").text("");
		var code=$("#code").val();
		if(code.length<=0)
		{
			//alert('请输入验证码');
			$("#captcha_error").text("请输入验证码");
			$("#code").focus();
			return false;
		}
		var username=$("#username").val();
		if(username.length<=0)
		{
			//alert('请输入用户名');
			$("#username_error").html("请输入用户名");
			$("#username").focus();
			return false;
		}
		//验证邮箱
		var email=$("#email").val();
		//对电子邮件的验证
      	var myreg = /^([a-zA-Z0-9]+[_|\_|\.]?)*[a-zA-Z0-9]+@([a-zA-Z0-9]+[_|\_|\.]?)*[a-zA-Z0-9]+\.[a-zA-Z]{2,3}$/;
     	if(!myreg.test(email))
           {
                //alert('请输入有效的邮箱');
                $("#email_error").html("请输入有效的邮箱");
                $("#email").focus();
                return false;
           }
		//密码是否一致
		var password=$("#password").val();
		if(password.length<6)
		{
			//alert("请输入六位密码");
			$("#pwd_error").html("密码位数至少6位");
			$("#password").focus();
			return false;
		}
		var password2=$("#password2").val();
		if(password!=password2)
		{
			//alert("两次密码不一致");
			$("#pwd2_error").html("两次密码不一致");
			$("#password2").focus();
			return false;
		}
        //对于区号的验证
        var phoneAreaNum=$("#phoneAreaNum").val();
       	myreg = /^\d{3,4}$/;
       	if(!myreg.test(phoneAreaNum))
       	{
       		//alert('请输入有效电话区号');
       		$("#phone_error").html("请输入有效电话区号");
       		$("#phoneAreaNum").focus();
        	return false;
       	}
        //对于电话号码的验证
        var phone=$("#phone").val();
        myreg =/^\d{7,8}$/;
        if(!myreg.test(phone))
        {
        	//alert('请输入有效电话号码');
        	$("#phone_error").html("请输入有效电话区号");
        	$("#phone").focus();
        	return false;
        }
        //对于手机号码的验证
        var tel=$("#tel").val();
      //  myreg=/^((13[0-9]{1})|159|153)+\d{8}$/;
      //	myreg=/^[1][358]\d{9}$/;
      	myreg=/^[1][358]\d{9}|^(147)+\d{8}$/;
        if(!myreg.test(tel))
        {
        	//alert('请输入有效的手机号');
        	$("#tel_error").html("请输入有效的手机号");
        	$("#tel").focus();
        	return false;
        }
        var company=$("#company").val();//公司名称
        var contanct=$("#contanct").val();//联系人
        if(company.length<=0)
        {
        	//alert('请输入公司名称');
        	$("#company_error").html("请输入公司名称");
        	$("#company").focus();
        	return false;
        }
        if(contanct.length<=0)
        {
        	//alert('请输入联系人');
        	$("#contanct_error").html("请输入联系人");
        	$("#contanct").focus();
        	return false;
        }
        // if($("#checkGreen").attr("checked")==false)
        // {
        // 	alert('请先阅读用户注册协议');
        // 	return false;
        // }
        if(!$("#checkGreen").is(":checked"))
        {
        	alert('请先阅读用户注册协议');
         	return false;
        }
        phone=phoneAreaNum+"-"+phone;
        var url="http://my.g.suncloud.cn/api/index.php?r=user/register";
        $.ajax({
        		type:'POST',
        		url:url,
        		data:{"username":username,"password":password,"email":email,"phone":phone,"tel":tel,"company":company,"contanct":contanct,"code":code},
        		dataType:'JSONP',
        		jsonp: "callback",
        		jsonpCallback:"success_jsonpCallback",
        		error:function(){alert('请求错误!');},
        		success:function(result){
					
        		},
        		headers: {
        			"Access-Control-Allow-Origin":"*", 
           			"Access-Control-Allow-Headers":"X-Requested-With"
        		}
        	});
	}
	//更换验证码
	function changeCode()
	{
		$("#captchacode").attr("src","http://my.g.suncloud.cn/api/index.php?r=user/getcaptcha");
	}
	function success_jsonpCallback(data)
	{
		//alert(data);
		//var r="("+data+")";
		//data = eval(r);

		var str_result= data.result;//登陆状态true成功false失败
		if(str_result=="true")
		{
			window.location.href="register-over.html";
		}
		else
		 {
			var msg=data.errormsg;
			if(msg=="")
			{
				msg="注册失败";
			}
			alert(msg);
		}
	}
