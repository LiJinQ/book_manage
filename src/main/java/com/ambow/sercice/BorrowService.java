package com.ambow.sercice;

import com.ambow.pojo.Borrow;

public interface BorrowService {
	/**
	 * ͼ�����
	 * ʵ����������borrow��Ĭ��isback״̬������Ϊ0��������������true
	 * �����ĳɹ�����Ҫ����ͼ���ͼ������-1
	 * ������ͼ������-1��ͼ������Ϊ0����Ҫ����ͼ���isborrow��Ϊ0�������ɽ���״̬
	 * ����δ������˻���Ϣ���ܲ��룬������false
	 * ��ͼ������-1<0 ��isborrow==0�����ܲ��룬������false
	 * @param borrow
	 * @return
	 */
	public boolean borrowBook(Borrow borrow);
	/**
	 * �����ࣺͨ������id��ȡ�������еĽ�����Ϣ�������㷵��Ƿ���ܶ�
	 * @param readerId
	 * @return
	 */
	public float getReaderPriceByReaderId(int readerId);
	/**
	 * �����ࣺ��ȡborrow��Ϣ�������㷣��
	 * 1��isdamaged==1 ���ص���
	 * 2��exceedData>0 ���أ�����*exceedData*0.01��
	 * @param borrow
	 * @return
	 */
	public float getReaderPrice(Borrow borrow);
	/**
	 * ���ݽ���������ȡ������Ϣ
	 * ���ø÷���ʱ���Ե�ǰʱ��-backData���exceedData,��������������������Ϣ��ӵ����ݿ��У��޸ģ�
	 * @param borrowId
	 * @return
	 */
	public Borrow getBorrowByBorrowId(int borrowId);
	/**
	 * ͨ��borrowId���ʵ�壬��isBack��Ϊ1����backData��Ϊ��ǰ����������
	 * @param borrowId
	 * @return
	 */
	public Borrow backBookByBorrowId(int borrowId);
}
