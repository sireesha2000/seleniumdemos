package GroupsDemo;

import org.testng.annotations.Test;

public class TestGroup1 {
	@Test(groups= {"Smoke"})
	public void Test1() {
		System.out.println("First smoke test case");
	}
	@Test(groups= {"Smoke"})
	public void Test2() {
		System.out.println("Second smoke test case");
	}
	@Test(groups= {"Functional"})
	public void Test3() {
		System.out.println("First Functional test case");
	}
	@Test(groups= {"Regression"})
	public void Test4() {
		System.out.println("First Regression test case");
	}

}
