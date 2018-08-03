package com.ambow.sercice;

import java.util.List;

import com.ambow.pojo.Readerinfo;
import com.ambow.vo.BorrowHistory;

public interface ReaderinfoService {
	/**
	 * ע����߻�����Ϣ
	 * @param readerinfo
	 */
	public void newReaderinfo(Readerinfo readerinfo);
	/**
	 * �޸Ķ�����Ϣ
	 * @param readerinfo
	 */
	public void updateReaderinfo(Readerinfo readerinfo);
	/**
	 * ���ݶ�������ɾ��������Ϣ
	 * @param readerId
	 */
	public void deleteReaderinfoById(int readerId);
	/**
	 * ���ݶ����������ض����б�
	 * @param readerName
	 * @return
	 */
	public List<Readerinfo> getReaderinfoByReaderName(String readerName);
	/**
	 * ���ݶ��ߵ绰���ض�����Ϣ�б�
	 * @param readerTel
	 * @return
	 */
	public List<Readerinfo> getReaderinfoByReaderTel(String readerTel);
	/**
	 * ͨ��readerId��ö��߽�����ʷ
	 * @param readerId
	 * @return
	 */
	public List<BorrowHistory> getBorrowHistoryByReaderId(int readerId);
}
