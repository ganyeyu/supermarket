package com.yeyu.service;

import java.util.List;

import com.yeyu.pojo.EasyUITreeNode;

public interface ContentCategoryService {

	 List<EasyUITreeNode> getContentCatetoryList(long parentId);
}
