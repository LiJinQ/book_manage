package com.ambow.sercice;


import com.ambow.pojo.Booktype;

public interface BooktypeService {
	/**
	 * 添加图书类型
	 * @param booktype
	 */
	public void newBooktype(Booktype booktype);
	/**
	 * 修改图书类型信息
	 * @param booktype
	 */
	public void updateBooktype(Booktype booktype);
	/**
	 * 通过图书类型主键删除该类型信息
	 * 注意：若删除该类型则需要将该类型下所有图书的bookTypeId更改为0
	 * @param bookTypeId
	 */
	public void deleteBooktypeById(int bookTypeId);
	/**
	 * 通过图书类型名称查询图书类型信息
	 * @param bookTypeName
	 * @return
	 */
	public Booktype getBooktypeByBookTypeName(String bookTypeName);
}
