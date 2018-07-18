package com.offcn;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;

public class Sendmail {

	public static void main(String[] args) {
		//发送简单邮件
		//=======================================
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		//创建JavaMailsenderImpl对象
		JavaMailSenderImpl mail =(JavaMailSenderImpl) context.getBean("mailsend");
		SimpleMailMessage msg =new SimpleMailMessage();
		msg.setFrom("dingguanghui666@sohu.com");
		msg.setTo("dingguanghui666@sohu.com");
		msg.setSubject("spring发送mail测试");
		msg.setText("Java时世界上最好的编程语言");
		mail.send(msg);
		System.out.println("邮件发送成功");
		
	}

}
