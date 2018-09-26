package com.ynu.singlepattern_four;

import java.util.ArrayList;
import java.util.List;

/**
 * 公司类
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
			//输出每一个对象的具体哈希值
			System.out.println("obj: "+ per.toString());
		}
	}
}
