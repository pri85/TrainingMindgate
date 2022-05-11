package com.mindgate.service;

import com.mindgate.pojo.EmailNotification;
import com.mindgate.pojo.SMSNotification;
import com.mindgate.pojo.WhatsAppNotification;

public class NotificationFactory {

	public static Notification getNotification(int choice) {
		Notification notification= null;
		switch (choice) {
		case 1:
			notification = new SMSNotification();
			break;
		case 2:
			notification = new EmailNotification();
			break;
		case 3:
			notification = new WhatsAppNotification();
			break;
		
		}
		return notification;
	}
}
