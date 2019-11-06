package com.yeyu.pojo;

public class User {

	private Integer id;
	private String bookname;
	private String zuozhe;
	private String chubanshang;
	private Integer kucun;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public String getZuozhe() {
		return zuozhe;
	}

	public void setZuozhe(String zuozhe) {
		this.zuozhe = zuozhe;
	}

	public String getChubanshang() {
		return chubanshang;
	}

	public void setChubanshang(String chubanshang) {
		this.chubanshang = chubanshang;
	}

	public Integer getKucun() {
		return kucun;
	}

	public void setKucun(Integer kucun) {
		this.kucun = kucun;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(Integer id, String bookname, String zuozhe, String chubanshang, Integer kucun) {
		super();
		this.id = id;
		this.bookname = bookname;
		this.zuozhe = zuozhe;
		this.chubanshang = chubanshang;
		this.kucun = kucun;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", bookname=" + bookname + ", zuozhe=" + zuozhe + ", chubanshang=" + chubanshang
				+ ", kucun=" + kucun + "]";
	}

}
