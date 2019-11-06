package com.yeyu.pojo;

public class EasyUITreeNode {

	private long id;
	private String state;
	private String text;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public EasyUITreeNode(long id, String state, String text) {
		super();
		this.id = id;
		this.state = state;
		this.text = text;
	}
	public EasyUITreeNode() {
		super();
	}
	
}
