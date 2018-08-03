package com.ambow.sercice;

import com.ambow.pojo.Purchase;

/**
 * 采购模块的业务逻辑层
 * @author LJQ
 *
 */
public interface PurchaseService {
	/**
	 * 申请采购
	 * @param purchase
	 */
	public void applyPurchase(Purchase purchase);
	
}
