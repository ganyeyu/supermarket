package com.yeyu.service;

import com.yeyu.pojo.EsayUIDataGridResult;
import com.yeyu.pojo.TbItem;

public interface ItemService {
	
	/**
	 * 
	    * @Title: getItemById  
	    * @Description: 通过iD查询商品信息
	    * @param @param itemId 商品ID
	    * @param @return    商品信息  
	    * @return TbItem    商品类实体  
	    * @throws
	 */
	TbItem getItemById(long itemId);
	
	/**
	 * 
	    * @Title: getItemList  
	    * @Description: 分页查询所有商品信息
	    * @param @param 当前页
	    * @param @param 每页显示数
	    * @param @return    json格式商品信息  
	    * @return EsayUIDataGridResult    json  
	    * @throws
	 */
	EsayUIDataGridResult getItemList(Integer page , Integer rows);

	/**
	 * 
	    * @Title: deleteItemById  
	    * @Description: 通过ID删除商品
	    * @param @param id    商品ID  
	    * @return void      
	    * @throws
	 */
	void deleteItemById(long id);
}

