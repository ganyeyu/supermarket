package com.yeyu.service;

import java.util.List;

import com.yeyu.pojo.EasyUITreeNode;

public interface ItemCatService {
	
	List<EasyUITreeNode> getItemCatList(long parentId);

}
