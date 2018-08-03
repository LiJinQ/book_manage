package com.ambow.sercice;

import java.util.List;

import com.ambow.pojo.Readerinfo;
import com.ambow.vo.BorrowHistory;

public interface ReaderinfoService {
	/**
	 * 注册读者基本信息
	 * @param readerinfo
	 */
	public void newReaderinfo(Readerinfo readerinfo);
	/**
	 * 修改读者信息
	 * @param readerinfo
	 */
	public void updateReaderinfo(Readerinfo readerinfo);
	/**
	 * 根据读者主键删除读者信息
	 * @param readerId
	 */
	public void deleteReaderinfoById(int readerId);
	/**
	 * 根据读者姓名返回读者列表
	 * @param readerName
	 * @return
	 */
	public List<Readerinfo> getReaderinfoByReaderName(String readerName);
	/**
	 * 根据读者电话返回读者信息列表
	 * @param readerTel
	 * @return
	 */
	public List<Readerinfo> getReaderinfoByReaderTel(String readerTel);
	/**
	 * 通过readerId获得读者借阅历史
	 * @param readerId
	 * @return
	 */
	public List<BorrowHistory> getBorrowHistoryByReaderId(int readerId);
}
