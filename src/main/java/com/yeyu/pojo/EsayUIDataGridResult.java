package com.yeyu.pojo;


import java.io.Serializable;
import java.util.List;

public class EsayUIDataGridResult implements Serializable{
	
	private long total;
	
	private List rows;

	public EsayUIDataGridResult(long total, List rows) {
		super();
		this.total = total;
		this.rows = rows;
	}

	public EsayUIDataGridResult() {
		super();
	}

	public long getTotal() {
		return total;
	}

	public void setTotal(long total) {
		this.total = total;
	}

	public List getRows() {
		return rows;
	}

	public void setRows(List rows) {
		this.rows = rows;
	}

}
