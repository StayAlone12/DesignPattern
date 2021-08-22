package com.designpattern.create.singleton;

/**
 * 懒汉式
 * 
 * 不考虑线程安全，这是最简单的做法
 * getInstance的时候进行初始化
 * 
 * @author LJ
 *
 */
public class Singleton_02 {
	private static Singleton_02 INSTANCE;
	private Singleton_02() {
		
	}
	
	public static Singleton_02 getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new Singleton_02();
		}
		return INSTANCE;
	}
}
