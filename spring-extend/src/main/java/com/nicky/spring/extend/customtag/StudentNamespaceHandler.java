package com.nicky.spring.extend.customtag;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * StudentNamespaceHandler
 *
 * @author gaoxi
 * @Time 2017/11/24
 */
public class StudentNamespaceHandler extends NamespaceHandlerSupport {

    @Override
    public void init() {

        //可以注册多个
        registerBeanDefinitionParser("student", new StudentBeanDefinitionParser());
    }
}
