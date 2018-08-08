package com.ambow.dao;

import java.util.List;

import com.ambow.pojo.Status;

public interface StatusDao {
	
	public int newStatus(Status status);

	public int updateStatus(Status status);
	
	public List<Status> getStatusByEbbId(int ebbId);
	
	public Status getStatusById(int id);
}
