package com.ynu.singlepattern_two;

public class Test {

	public static void main(String[] args) {
		
		Company company = new Company();
		
		//CEO�����Ƕ���ʽ����������ֻ��ͨ��getCeo������ȡ
		
		//CEO���ѽ����캯��˽�����Բ���ͨ��new�ķ�ʽ��ȡCEO���󣨻ᱨ��
//		CEO ceo = new CEO();
		
		Staff ceo1 = CEO.getmCeo();
		Staff ceo2 = CEO.getmCeo();
		company.addStaff(ceo1);
		company.addStaff(ceo2);
		
		//ͨ��new����VP����
		Staff vp1 = new VP();
		Staff vp2 = new VP();
		
		//ͨ��new����Staff����
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
