package com.avaya.weblogic.jms.listener;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

public class InvoiceMDB implements MessageListener {
	public void onMessage(Message message) {
	 try {
	   System.out.println(((TextMessage) message).getText());
	   System.out.println("Hello");
	 } catch (JMSException ex) {
	   throw new RuntimeException(ex);
	 }
	}
}