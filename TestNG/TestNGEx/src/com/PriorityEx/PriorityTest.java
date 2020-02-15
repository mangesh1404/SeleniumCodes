package com.PriorityEx;

import org.testng.annotations.Test;

public class PriorityTest {

	@Test(priority = 1, groups = {"smoke"})
	public void test1() {
		System.out.println("i am in Prioritytest with priority=1");
	}
	
	@Test(groups = {"noPriority"})
	public void aaa() {
		System.out.println("i am in Prioritytest as aaa with no priority");
	}
	
	@Test(priority = 2, groups = {"smoke"})
	public void test2() {
		System.out.println("i am in Prioritytest as test2 with priority=2");
	}
	
	@Test(priority = 3, groups = {"smoke"})
	public void test3() {
		System.out.println("i am in Prioritytest as test3 with priority=3");
	}
	
	@Test(groups = {"noPriority"})
	public void bbb() {
		System.out.println("i am in Prioritytest as bbb with  no priority");
	}
	
	
}
