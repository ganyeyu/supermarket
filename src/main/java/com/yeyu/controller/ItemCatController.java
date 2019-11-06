package com.yeyu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yeyu.pojo.EasyUITreeNode;
import com.yeyu.service.ItemCatService;

/**
 * 商品分类管理
 * @author Administrator
 *
 */

@Controller
public class ItemCatController {

	@Autowired
	private ItemCatService itemCatService;
	
	@ResponseBody
	@RequestMapping("/item/cat/list")
	public List<EasyUITreeNode> getItemCatList(@RequestParam(name="id",defaultValue="0")long parentId){
		System.err.println("#########parentId:"+parentId);
		return itemCatService.getItemCatList(parentId);
	}
}
