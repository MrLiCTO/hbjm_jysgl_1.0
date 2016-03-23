package com.shilong.jysgl.action.base;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.shilong.jysgl.process.context.Config;
import com.shilong.jysgl.utils.MyUtil;
@Controller
public class FirstAction {
	
	
	@RequestMapping("/first")
	public String first(Model model)throws Exception{
		
		model.addAttribute(Config.VERSION_NUMBER_KEY,"2016-bysj-mr-li");
		model.addAttribute(Config.VERSION_DATE_KEY,MyUtil.getDate());
		
		return "/base/first";
	}
	@RequestMapping("/backfirst")
	public String backfirst(Model model)throws Exception{
		
		model.addAttribute(Config.VERSION_NUMBER_KEY,"2016-bysj-mr-li");
		model.addAttribute(Config.VERSION_DATE_KEY,MyUtil.getDate());
		
		return "/base/backfirst";
	}
	
	@RequestMapping("/welcome")
	public String welcome(Model model)throws Exception{
		

		
		return "/base/welcome";
	}
}
