package com.ynu.singlepattern_four;

/**
 * CEO,静态内部模式
 * @author 12068
 *
 */
public class CEO extends Staff{


	
	//构造函数私有,在创建对象的时候就直接调用。
	private CEO() {
		System.out.println("CEO私有构造函数！");
	}
	
	//公有的静态函数，对外暴露获取单例对象的接口
	public static  CEO getmCeo() {
		return CEOHolder.S_CEO;
	}
	/**
	 * 静态内部类
	 */
	private static class CEOHolder{
		private static final CEO S_CEO = new CEO();
	}
}
