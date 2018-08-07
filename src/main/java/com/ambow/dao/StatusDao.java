package com.ambow.dao;

import java.util.List;

import com.ambow.pojo.Status;

public interface StatusDao {
	
	public void newStatus(Status status);

	public void updateStatus(Status status);
	
	public List<Status> getStatusByEbbId(int ebbId);
	
	
}
