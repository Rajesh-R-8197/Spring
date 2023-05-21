package com.sdi.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.sdi.beans.Remote;

public class Test {
	
	public static void main(String[] args) {
		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("com/sdi/common/application-context.xml") );
		Remote remote = beanFactory.getBean("remote",Remote.class);
		remote.powerOn();
	}
}