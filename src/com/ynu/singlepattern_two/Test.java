package com.ynu.singlepattern_two;

public class Test {

	public static void main(String[] args) {
		
		Company company = new Company();
		
		//CEO对象是饿汉式创建了所以只能通过getCeo函数获取
		
		//CEO类已将构造函数私有所以不能通过new的方式获取CEO对象（会报错）
//		CEO ceo = new CEO();
		
		Staff ceo1 = CEO.getmCeo();
		Staff ceo2 = CEO.getmCeo();
		company.addStaff(ceo1);
		company.addStaff(ceo2);
		
		//通过new创建VP对象
		Staff vp1 = new VP();
		Staff vp2 = new VP();
		
		//通过new创建Staff对象
		Staff staff1 = new Staff();
		Staff staff2 = new Staff();
		Staff staff3 = new Staff();
		
		company.addStaff(vp1);
		company.addStaff(vp2);
		
		company.addStaff(staff1);
		company.addStaff(staff2);
		company.addStaff(staff3);
		
		company.showAllStaffs();
		
		
	}

}
