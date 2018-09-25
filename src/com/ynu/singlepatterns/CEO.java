package com.ynu.singlepatterns;

/**
 * CEO,饿汉单例模式
 * @author 12068
 *
 */
public class CEO extends Staff{

	private static final CEO mCeo =  new CEO();
	
	
	//构造函数私有,在创建对象的时候就直接调用。
	private CEO() {
		System.out.println("CEO私有构造函数！");
	}
	
//	public CEO(String string) {
//		System.out.println("CEO公有构造函数！");
//	}
	
	
	//公有的静态函数，对外暴露获取单例对象的接口
	public static CEO getCeo() {
		return mCeo;
	}
	public void work() {
		//管理vp
	}
}
