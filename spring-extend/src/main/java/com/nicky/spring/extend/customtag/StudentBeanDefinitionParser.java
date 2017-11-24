package com.nicky.spring.extend.customtag;

import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractBeanDefinitionParser;
import org.springframework.beans.factory.xml.ParserContext;
import org.springframework.util.StringUtils;
import org.w3c.dom.Element;

/**
 * StudentBeanDefinitionParser
 *
 * @author gaoxi
 * @Time 2017/11/24
 */
public class StudentBeanDefinitionParser extends AbstractBeanDefinitionParser {

    @Override
    protected AbstractBeanDefinition parseInternal(Element element, ParserContext parserContext) {

        BeanDefinitionBuilder definition = BeanDefinitionBuilder.genericBeanDefinition(StudentBean.class);

        String name = element.getAttribute("name");

        String age = element.getAttribute("age");

        if (StringUtils.hasText(name)) {
            definition.addPropertyValue("name", name);
        }
        if (StringUtils.hasText(age)) {
            definition.addPropertyValue("age", Integer.parseInt(age));
        }
        return definition.getBeanDefinition();
    }
}
