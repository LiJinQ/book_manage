package com.ambow.sercice;


import com.ambow.pojo.Booktype;

public interface BooktypeService {
	/**
	 * ���ͼ������
	 * @param booktype
	 */
	public void newBooktype(Booktype booktype);
	/**
	 * �޸�ͼ��������Ϣ
	 * @param booktype
	 */
	public void updateBooktype(Booktype booktype);
	/**
	 * ͨ��ͼ����������ɾ����������Ϣ
	 * ע�⣺��ɾ������������Ҫ��������������ͼ���bookTypeId����Ϊ0
	 * @param bookTypeId
	 */
	public void deleteBooktypeById(int bookTypeId);
	/**
	 * ͨ��ͼ���������Ʋ�ѯͼ��������Ϣ
	 * @param bookTypeName
	 * @return
	 */
	public Booktype getBooktypeByBookTypeName(String bookTypeName);
}
