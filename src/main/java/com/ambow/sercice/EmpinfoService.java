package com.ambow.sercice;

import com.ambow.pojo.Empinfo;

public interface EmpinfoService {
	/**
	 * ��Controller����һ��empinfoʵ�壬��֤��½���ܡ�
	 * @param empinfo
	 * @return
	 * ��½�ɹ���true
	 * ʧ�ܣ�false
	 */
	public boolean login(Empinfo empinfo);
	/**
	 * ����Ա����Ϣ
	 * @param empinfo
	 */
	public void newEmpinfo(Empinfo empinfo);
	/**
	 * �޸�Ա����Ϣ
	 * @param empinfo
	 */
	public void updateEmpinfo(Empinfo empinfo);
	/**
	 * ͨ��empidɾ��Ա����Ϣ
	 * @param id
	 */
	public void deleteEmpinfoById(int empid);
	/**
	 * ͨ��empid���һ��Ա��ʵ��
	 * @param empid
	 * @return
	 */
	public Empinfo getEmpinfoById(int empid);
}
