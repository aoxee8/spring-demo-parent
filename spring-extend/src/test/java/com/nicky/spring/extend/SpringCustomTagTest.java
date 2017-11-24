package com.nicky.spring.extend;

import com.nicky.spring.extend.customtag.StudentBean;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * SpringCustomTagTest
 *
 * @author gaoxi
 * @Time 2017/11/24
 */
@RunWith(JUnit4.class)
public class SpringCustomTagTest {

    @Test
    public void testCustomTag() {

        Resource resource = new ClassPathResource("Student.xml");

        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory(null);

        XmlBeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader(beanFactory);

        int count = beanDefinitionReader.loadBeanDefinitions(resource);

        System.out.println(count);

        StudentBean student = beanFactory.getBean("student", StudentBean.class);

        System.out.println(student);
    }
}
