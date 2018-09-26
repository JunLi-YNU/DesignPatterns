package com.ynu.singlepattern_three;

/**
 * CEO,双重检测锁定单例模式
 * @author 12068
 *
 */
public class CEO extends Staff{

	private static  CEO mCeo =  null;
	
	
	//构造函数私有,在创建对象的时候就直接调用。
	private CEO() {
		System.out.println("CEO私有构造函数！");
	}
	
//	public CEO(String string) {
//		System.out.println("CEO公有构造函数！");
//	}
	
	
	//公有的静态函数，对外暴露获取单例对象的接口
	public static CEO getmCeo() {
		//1.第一次判断是为了避免不必要的同步。
		if(mCeo == null) {
			synchronized (CEO.class) {
				//2.第二次判断是了在单例对象在没有创建的时候创建。
				if(mCeo == null)
				{
					mCeo = new CEO();
				}
				
			}
		}
		return mCeo;
	}
	public void work() {
		//管理vp
	}
}
