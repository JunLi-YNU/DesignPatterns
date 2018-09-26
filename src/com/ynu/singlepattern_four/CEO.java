package com.ynu.singlepattern_four;

/**
 * CEO,��̬�ڲ�ģʽ
 * @author 12068
 *
 */
public class CEO extends Staff{


	
	//���캯��˽��,�ڴ��������ʱ���ֱ�ӵ��á�
	private CEO() {
		System.out.println("CEO˽�й��캯����");
	}
	
	//���еľ�̬���������Ⱪ¶��ȡ��������Ľӿ�
	public static  CEO getmCeo() {
		return CEOHolder.S_CEO;
	}
	/**
	 * ��̬�ڲ���
	 */
	private static class CEOHolder{
		private static final CEO S_CEO = new CEO();
	}
}
