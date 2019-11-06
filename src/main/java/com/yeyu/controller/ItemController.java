package com.yeyu.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yeyu.pojo.EsayUIDataGridResult;
import com.yeyu.service.ItemService;

@Controller
public class ItemController {
	
	@Autowired
	private ItemService itemService;
	
	@RequestMapping("/item/list")
	@ResponseBody
	public EsayUIDataGridResult getItemList(Integer page , Integer rows) {
		System.out.println("######page:"+page+"/n\n#######rows:"+rows);
		EsayUIDataGridResult gridResult = itemService.getItemList(page, rows);
		 return gridResult;
	}
	
	/**
	 * 根据ID删除商品
	 * @param ids id
	 * @return 删除反馈状态
	 */
	@RequestMapping("/rest/item/delete")
	@ResponseBody
	public Map<String, Object> deleteItemById(long ids) {
		Map<String, Object> map = new HashMap<>();
		
		try {
			System.out.println("#####id:"+ids);
			itemService.deleteItemById(ids);
			map.put("status", 200);
			return map;
		} catch (Exception e) {
			map.put("status", 0);
			return map;
		}
	}
	
	/**
	 *  下架商品
	 * @param ids 商品ID
	 * @return 状态，下架成功：200  否！=200
	 */
	@RequestMapping("/rest/item/instock")
	@ResponseBody
	public Map<String, Object> lastItemById(long ids) {
		Map<String, Object> map = new HashMap<>();
		
		try {
			System.out.println("#####id:"+ids);
			itemService.deleteItemById(ids);
			map.put("status", 200);
			return map;
		} catch (Exception e) {
			map.put("status", 0);
			return map;
		}
		
		
	}

}
