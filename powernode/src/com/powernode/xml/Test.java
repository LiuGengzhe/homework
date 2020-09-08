package com.powernode.xml;


import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.util.List;

/**
 * @user:asus
 * @date:2020年09月07 16:42
 */
public class Test {
    public static void main(String[] args) throws Exception{
        SAXReader saxReader = new SAXReader();
        //
        Document document = saxReader.read("powernode/src/family.xml");
        Element rootElement = document.getRootElement();

        List<Element> member = rootElement.elements("member");
        for (Element element : member) {
            String name = element.elementText("name");
            System.out.println(name);
        }
    }
}
