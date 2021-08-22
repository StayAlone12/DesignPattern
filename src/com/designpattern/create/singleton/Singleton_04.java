package com.designpattern.create.singleton;

/**
 * DCL + volatile
 * 优点：线程安全
 * 缺点：代码复杂
 * @author LJ
 *
 */
public class Singleton_04 {
	// 为什么要volatile,禁止指令重排
	// new的时候有三个步骤，分配内存、指针指向分配、初始化,指令重排序后可能错乱
	private static volatile Singleton_04 INSTANCE;
	
	private Singleton_04() {
		
	}
	
	public static Singleton_04 getInstance() {
		if (INSTANCE == null) {
			synchronized(Singleton_04.class) {
				if (INSTANCE == null) {
					INSTANCE = new Singleton_04();
				}
			}
		}
		return INSTANCE;
	}
}
