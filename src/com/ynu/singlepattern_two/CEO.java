package com.ynu.singlepattern_two;

/**
 * CEO,����ʽ
 * @author 12068
 *
 */
public class CEO extends Staff{

	private static CEO mCeo;
	
	
	//���캯��˽��,�ڴ��������ʱ���ֱ�ӵ��á�
	private CEO() {
		System.out.println("CEO˽�й��캯����");
	}
	
//	public CEO(String string) {
//		System.out.println("CEO���й��캯����");
//	}
	
	
	//���еľ�̬���������Ⱪ¶��ȡ��������Ľӿ�
	public static synchronized CEO getmCeo() {
		
		if(mCeo == null) {
			mCeo = new CEO();
		}
		return mCeo;
	}
	public void work() {
		//����vp
	}
}
