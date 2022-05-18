package com.mindgate.main;

import com.mindgate.pojo.GoodMornigGreeter;
import com.mindgate.pojo.Greetings;

public class GreetingsMain {
public static void main(String[] args) {
	Greetings greetings = new GoodMornigGreeter();
	greetings.greet();
	Greetings greetings2 = ()-> System.out.println("Good AfterNoon");
	greetings2.greet();
}
}
