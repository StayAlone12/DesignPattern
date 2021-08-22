package com.designpattern.create.singleton;

/**
 * 懒汉式
 * 
 * 简单粗暴的方式，整个方法加锁
 * 优点：线程安全
 * 缺点：每次get都加锁，浪费时间
 * @author LJ
 *
 */
public class Singleton_03 {
	private static Singleton_03 INSTANCE;
	private Singleton_03() {
		
	}
	public static synchronized Singleton_03 getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new Singleton_03();
		}
		return INSTANCE;
	}
	
}
