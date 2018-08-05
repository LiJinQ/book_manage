package com.ambow.dao;

import java.util.List;

import com.ambow.pojo.Purchase;

public interface PurchaseDao {
	
	public List<Purchase> getAllPurchase();
	public Purchase getPurchaseById(int id);
	public int newPurchase(Purchase purchase);
	public int deletePurchase(int id);
	public int updatePurchase(Purchase purchase);
	
}
