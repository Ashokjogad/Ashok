package Testscript;

import org.testng.annotations.Test;

import POM2.script1;
import ngscripts.Generic;

public class facebook extends Generic {
	@Test
	public void Test1() throws InterruptedException
	{
		script1 p=new script1(driver);
		Thread.sleep(2000);
		p.create();
		Thread.sleep(2000);
		p.firstname("admin");
		Thread.sleep(2000);
		p.lastname("manger");
		Thread.sleep(2000);
		p.reg_email("ashokjogad29@gmail.com");
		Thread.sleep(2000);
		p.reg_email("9972869181");
		Thread.sleep(2000);
		p.websubmit();
	
	}
}
