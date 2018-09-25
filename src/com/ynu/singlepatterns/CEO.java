package com.ynu.singlepatterns;

/**
 * CEO,��������ģʽ
 * @author 12068
 *
 */
public class CEO extends Staff{

	private static final CEO mCeo =  new CEO();
	
	
	//���캯��˽��,�ڴ��������ʱ���ֱ�ӵ��á�
	private CEO() {
		System.out.println("CEO˽�й��캯����");
	}
	
//	public CEO(String string) {
//		System.out.println("CEO���й��캯����");
//	}
	
	
	//���еľ�̬���������Ⱪ¶��ȡ��������Ľӿ�
	public static CEO getCeo() {
		return mCeo;
	}
	public void work() {
		//����vp
	}
}
