package com.fc.model;

import java.util.ArrayList;
import java.util.List;

//T 泛型 传进来 什么 ， 返回什么
public class PageBean<T> {

	private int allPage;
	private int curPage;

	private List<T> list = new ArrayList<T>();

	public PageBean() {
	}

	public PageBean(int allPage, int curPage) {
		this.allPage = allPage;
		this.curPage = curPage;
	}

	public int getAllPage() {
		return allPage;
	}

	public void setAllPage(int allPage) {
		this.allPage = allPage;
	}

	public int getCurPage() {
		return curPage;
	}

	public void setCurPage(int curPage) {
		this.curPage = curPage;
	}

	public List<T> getList() {
		return list;
	}

	public void setList(List<T> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "PageBean{" + "allPage=" + allPage + ", curPage=" + curPage + ", list=" + list + '}';
	}
}
