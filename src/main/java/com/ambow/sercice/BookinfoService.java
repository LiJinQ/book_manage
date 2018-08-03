package com.ambow.sercice;

import java.util.List;

import com.ambow.pojo.Bookinfo;

public interface BookinfoService {
	/**
	 * ����ͼ����Ϣ
	 * @param bookinfo
	 */
	public void newBookinfo(Bookinfo bookinfo);
	/**
	 * �޸�ͼ����Ϣ
	 * @param bookinfo
	 */
	public void updateBookinfo(Bookinfo bookinfo);
	/**
	 * ͨ��ͼ������ɾ��ͼ����Ϣ
	 * @param bookId
	 */
	public void deleteBookinfoByBookId(int bookId);
	/**
	 * ����ͼ���������Ʒ���ͼ����Ϣ�б�
	 * @param bookTypeName
	 * @return
	 */
	public List<Bookinfo> getBookinfoByBookTypeName(String bookTypeName);
	/**
	 * ����ͼ�����Ʒ���ͼ����Ϣ�б�
	 * @param bookName
	 * @return
	 */
	public List<Bookinfo> getBookinfoByBookName(String bookName);
}
