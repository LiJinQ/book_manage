package com.ambow.sercice;

import java.util.List;

import com.ambow.pojo.Bookinfo;

public interface BookinfoService {
	/**
	 * 新增图书信息
	 * @param bookinfo
	 */
	public void newBookinfo(Bookinfo bookinfo);
	/**
	 * 修改图书信息
	 * @param bookinfo
	 */
	public void updateBookinfo(Bookinfo bookinfo);
	/**
	 * 通过图书主键删除图书信息
	 * @param bookId
	 */
	public void deleteBookinfoByBookId(int bookId);
	/**
	 * 根据图书类型名称返回图书信息列表
	 * @param bookTypeName
	 * @return
	 */
	public List<Bookinfo> getBookinfoByBookTypeName(String bookTypeName);
	/**
	 * 根据图书名称返回图书信息列表
	 * @param bookName
	 * @return
	 */
	public List<Bookinfo> getBookinfoByBookName(String bookName);
}
