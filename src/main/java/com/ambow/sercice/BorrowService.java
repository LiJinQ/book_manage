package com.ambow.sercice;

import com.ambow.pojo.Borrow;

public interface BorrowService {
	/**
	 * 图书借阅
	 * 实质上是新增borrow，默认isback状态码设置为0，代表借出，返回true
	 * 若借阅成功，需要将该图书的图书数量-1
	 * 若进行图书数量-1后，图书数量为0，需要将该图书的isborrow改为0，代表不可借阅状态
	 * 若有未还清的账户信息不能插入，并返回false
	 * 若图书数量-1<0 或isborrow==0，不能插入，并返回false
	 * @param borrow
	 * @return
	 */
	public boolean borrowBook(Borrow borrow);
	/**
	 * 工具类：通过读者id获取读者所有的借阅信息，并计算返回欠款总额
	 * @param readerId
	 * @return
	 */
	public float getReaderPriceByReaderId(int readerId);
	/**
	 * 工具类：获取borrow信息，并计算罚款
	 * 1、isdamaged==1 返回单价
	 * 2、exceedData>0 返回（单价*exceedData*0.01）
	 * @param borrow
	 * @return
	 */
	public float getReaderPrice(Borrow borrow);
	/**
	 * 根据借书主键获取借书信息
	 * 调用该方法时需以当前时间-backData获得exceedData,并计算出罚款金额，并将该信息添加到数据库中（修改）
	 * @param borrowId
	 * @return
	 */
	public Borrow getBorrowByBorrowId(int borrowId);
	/**
	 * 通过borrowId获得实体，将isBack改为1，将backData改为当前服务器日期
	 * @param borrowId
	 * @return
	 */
	public Borrow backBookByBorrowId(int borrowId);
}
