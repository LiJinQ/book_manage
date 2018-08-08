package com.ambow.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ambow.pojo.Status;
import com.ambow.vo.Pager;

public interface StatusDao {
	
	public int newStatus(Status status);

	public int updateStatus(Status status);
	
	public List<Status> getStatusByEbbId(int ebbId);
	
	public Status getStatusById(int id);
	
	public int getTotalRecord(@Param("empLevel")int empLevel,@Param("status")int status);
	
	public List<Status> getStatusPager(@Param("pager")Pager<Status> pager,@Param("empLevel")int empLevel,@Param("status")int status);
}
