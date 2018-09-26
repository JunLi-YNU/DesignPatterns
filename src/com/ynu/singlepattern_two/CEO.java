package com.ynu.singlepattern_two;

/**
 * CEO,懒汉式
 * @author 12068
 *
 */
public class CEO extends Staff{

	private static CEO mCeo;
	
	
	//构造函数私有,在创建对象的时候就直接调用。
	private CEO() {
		System.out.println("CEO私有构造函数！");
	}
	
//	public CEO(String string) {
//		System.out.println("CEO公有构造函数！");
//	}
	
	
	//公有的静态函数，对外暴露获取单例对象的接口
	public static synchronized CEO getmCeo() {
		
		if(mCeo == null) {
			mCeo = new CEO();
		}
		return mCeo;
	}
	public void work() {
		//管理vp
	}
}
