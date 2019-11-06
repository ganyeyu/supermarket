package com.yeyu.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yeyu.pojo.TbItemDesc;

/**
 * 请求页面
 * @author Administrator
 *
 */
@Controller
public class PageController {
	
	@RequestMapping("/")
	public String showIndex() {
		return "index";
	}
	
//	@RequestMapping("/{page}")
//	public String showPage(String page) {
//		System.out.println(page);
//		return page;
//	}
	
	@RequestMapping("/content-add")
	public String contentadd() {
		return "content-add";
	}
	
	@RequestMapping("/content-category")
	public String contentcategory() {
		return "content-category";
	}
	
	@RequestMapping("/content-edit")
	public String contentedit() {
		return "content-edit";
	}
	
	
	@RequestMapping("/content")
	public String content() {
		return "content";
	}
	
	@RequestMapping("/file-upload")
	public String fileupload() {
		return "file-upload";
	}
	
	@RequestMapping("/import-index")
	public String importindex() {
		return "import-index";
	}
	
	@RequestMapping("/item-add")
	public String itemadd() {
		return "item-add";
	}
	
	@RequestMapping("/item-edit")
	public String itemedit() {
		return "item-edit";
	}
	
	@RequestMapping("/item-list")
	public String itemlist() {
		return "item-list";
	}
	
	@RequestMapping("/item-param-add")
	public String itemparamadd() {
		return "item-param-add";
	}
	
	@RequestMapping("/item-param-list")
	public String itemparamlist() {
		return "item-param-list";
	}
	
	@RequestMapping("/login")
	public String login() {
		return "login";
	}
	
	
	@RequestMapping("/tests")
	@ResponseBody
	public Map test() {
		TbItemDesc tbItemDesc = new TbItemDesc();
		tbItemDesc.setItemId((long) 123123);
		tbItemDesc.setItemDesc("!@#!@#122222222222222333333333");
		tbItemDesc.setCreated(new Date());
		Map map = new HashMap<>();
		map.put("a", "aaa");
		map.put("b", tbItemDesc );
		map.put("c", "cccccc");
		return map;
	}

}
