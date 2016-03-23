package com.shilong.jysgl.action.base;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.bouncycastle.jce.provider.symmetric.TEA;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.shilong.jysgl.model.user.ActiveUser;
import com.shilong.jysgl.pojo.po.Teacher;
import com.shilong.jysgl.pojo.vo.TeacherCustom;
import com.shilong.jysgl.process.context.Config;
import com.shilong.jysgl.process.result.ResultUtil;
import com.shilong.jysgl.process.result.SubmitResultInfo;
import com.shilong.jysgl.service.TeacherService;
import com.shilong.jysgl.utils.MD5;

@Controller
public class LoginAction {
	
	@Resource
	private TeacherService teacherService;
	
	@RequestMapping("/login")
	public String login(){
		return "/base/login";
	}
	
	@RequestMapping("/login_submit")
	public @ResponseBody SubmitResultInfo login_submit(HttpSession session,String validateCode,String bh,String pwd) throws Exception{
		
		if(session.getAttribute("validateCode").equals(validateCode)){
			if(bh!=null&&pwd!=null){
				TeacherCustom teacher = teacherService.getTeacherBybh(bh);
				
				if(teacher!=null&&teacher.getMm().equals(new MD5().getMD5ofStr(pwd))){
					
					session.setAttribute(Config.ACTIVEUSER_KEY, teacher);
					
					return new SubmitResultInfo(ResultUtil.createSuccess(Config.MESSAGE,906,null));
				}else{
					return new SubmitResultInfo(ResultUtil.createSuccess(Config.MESSAGE,114,null));
				}
			}else{
				return new SubmitResultInfo(ResultUtil.createSuccess(Config.MESSAGE,110,null));
			}
		}else{
			return new SubmitResultInfo(ResultUtil.createSuccess(Config.MESSAGE,113,null));
		}
		
	}
	
	
	
	@RequestMapping("/logout")
	public String logout(HttpSession session){
		session.invalidate();
		return "redirect:/login.action";
	}
}
