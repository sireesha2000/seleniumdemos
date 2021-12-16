package GroupsDemo;

import org.testng.annotations.Test;

public class TestGroup2 {
	@Test(groups= {"Smoke"})
	public void Test5() {
		System.out.println("Third smoke test case");
	}
	@Test(groups= {"Regression"})
	public void Test6() {
		System.out.println("Second Regression test case");
	}
	@Test(groups= {"Functional"})
	public void Test7() {
		System.out.println("Second Functional test case");
	}
	@Test(groups= {"Regression"})
	public void Test8() {
		System.out.println("Third Regression test case");
	}
}
