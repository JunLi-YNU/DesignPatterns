package com.ynu.singlepattern_four;

import java.util.ArrayList;
import java.util.List;

/**
 * ��˾��
 * @author 12068
 *
 */
public class Company {

	private List<Staff> allStaffs = new ArrayList<Staff>();
	public void addStaff(Staff per) {
		allStaffs.add(per);
	}
	
	public void showAllStaffs() {
		for(Staff per:allStaffs) {
			//���ÿһ������ľ����ϣֵ
			System.out.println("obj: "+ per.toString());
		}
	}
}
