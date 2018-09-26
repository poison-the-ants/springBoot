package com.java.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.java.pojo.QQ;

@Controller
public class testController {
	
	@RequestMapping("/test1.action")
	public void test1(){
		System.out.println("hello springboot!");
	}
	
	@RequestMapping("/test2.action")
	@ResponseBody
	public String test2(){
		return "hello springboot!!!";
	}
	
	@RequestMapping("/demo.action")
	public String toDemo(){
		return "demo.html";
	}
	@RequestMapping("/qq.action")
	@ResponseBody
	public boolean regQQ(QQ qqinfo){
		System.out.println("qqinfo...."+qqinfo);
		return true;
	}
}
