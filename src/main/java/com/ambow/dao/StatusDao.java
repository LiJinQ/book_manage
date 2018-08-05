package com.ambow.dao;

import java.util.List;

import com.ambow.pojo.Status;

public interface StatusDao {
	
	public void newStatus(Status status);

	public void updateStatus(Status status);
	
	/**
	 * Í¨¹ıemp_levelÅÅĞò
	 * @param ebbId
	 * @return
	 */
	public List<Status> getStatusByEbbId(int ebbId);
	
	
}
