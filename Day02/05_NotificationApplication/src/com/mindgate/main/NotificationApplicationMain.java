package com.mindgate.main;

import java.util.Scanner;

import com.mindgate.pojo.EmailNotification;
import com.mindgate.pojo.SMSNotification;
import com.mindgate.service.Notification;
import com.mindgate.service.NotificationFactory;

public class NotificationApplicationMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String to;
		String message;
		Notification notification = null;
		int choice;
		
		System.out.println("1. SMS Notification");
		System.out.println("2. Email Notification");
		System.out.println("3. WhatsApp Notification");
		System.out.println("Enter your choice");
		choice = scanner.nextInt();
		
		System.out.println("Enter contact :: ");
		to = scanner.next();
		scanner.nextLine();
		System.out.println("Enter message :: ");
		message = scanner.nextLine();
		
		Notification notification2 = NotificationFactory.getNotification(choice);
		
		notification = new SMSNotification();
		notification = new EmailNotification();
		notification2.sendNotification(to, message);
	}
}
