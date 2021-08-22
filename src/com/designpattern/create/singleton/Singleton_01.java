package com.designpattern.create.singleton;

/**
 * 饿汉式
 * 类加载时创建好对象，用的时候直接使用接口
 * 
 * 优点:没有线程安全问题，使用的时候比较方便
 * 缺点：类加载的时候创建，没有按需加载，影响启动时间且占用内存
 * 
 * @author LJ
 *
 */
public class Singleton_01 {
	private static final Singleton_01 INSTANCE = new Singleton_01();
	private Singleton_01() {
		
	}

	public Singleton_01 getIntance() {
		return INSTANCE;
	}
}
