package com.ambow.dao;

import java.util.List;

import com.ambow.pojo.Backmatter;

public interface BackmatterDao {
	public void newBackmatter(Backmatter backmatter);
	public void updateBackmatter(Backmatter backmatter);
	public void deleteBackmatterById(int backmatterId);
	public Backmatter getBackmatterById(int backmatterId);
	public List<Backmatter> getAllBackmatter();
}
