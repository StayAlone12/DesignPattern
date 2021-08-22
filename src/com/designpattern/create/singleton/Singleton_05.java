package com.designpattern.create.singleton;

/**
 * 使用静态内部类实现单例
 * 利用类加载顺序实现懒加载
 * 类加载机制保证线程安全
 * @author LJ
 *
 */
public class Singleton_05 {
	private Singleton_05() {}

	public static Singleton_05 getInstance() {
		return SingleHolder.INSTANCE;
	}
	
	private static class SingleHolder {
		private static Singleton_05 INSTANCE = new Singleton_05();
	}
}
