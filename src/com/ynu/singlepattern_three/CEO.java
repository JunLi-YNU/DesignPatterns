package com.ynu.singlepattern_three;

/**
 * CEO,˫�ؼ����������ģʽ
 * @author 12068
 *
 */
public class CEO extends Staff{

	private static  CEO mCeo =  null;
	
	
	//���캯��˽��,�ڴ��������ʱ���ֱ�ӵ��á�
	private CEO() {
		System.out.println("CEO˽�й��캯����");
	}
	
//	public CEO(String string) {
//		System.out.println("CEO���й��캯����");
//	}
	
	
	//���еľ�̬���������Ⱪ¶��ȡ��������Ľӿ�
	public static CEO getmCeo() {
		//1.��һ���ж���Ϊ�˱��ⲻ��Ҫ��ͬ����
		if(mCeo == null) {
			synchronized (CEO.class) {
				//2.�ڶ����ж������ڵ���������û�д�����ʱ�򴴽���
				if(mCeo == null)
				{
					mCeo = new CEO();
				}
				
			}
		}
		return mCeo;
	}
	public void work() {
		//����vp
	}
}
