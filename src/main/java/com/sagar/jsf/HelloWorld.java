package com.sagar.jsf;

import javax.faces.bean.ManagedBean;

@ManagedBean(name="helloWorld",eager=true)
public class HelloWorld
{

	public HelloWorld() {
		System.out.println("Hello World");
	}
	
	public String getMessage()
	{
		return "Hello World!";
	}

}
