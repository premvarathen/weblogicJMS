package com.avaya.weblogic.jms;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import com.avaya.weblogic.jms.QueueSender.InvoiceQueueSender;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WeblogicJms1ApplicationTests {

	
	@Test
	public void contextLoads() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		InvoiceQueueSender jmsInvoiceSender= (InvoiceQueueSender)applicationContext.getBean(InvoiceQueueSender.class);
		jmsInvoiceSender.sendMesage();
	}

}

