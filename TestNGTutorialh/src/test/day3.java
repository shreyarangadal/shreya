package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day3 {

	@Test	
	 public void test3(){
		System.out.println("test3");
	}
	@AfterTest	
	public void test4(){
		System.out.println("aftertest");
	}

}
