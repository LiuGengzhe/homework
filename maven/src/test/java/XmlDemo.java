import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.Test;

import java.io.FileInputStream;
import java.math.BigDecimal;
import java.util.List;

public class XmlDemo {
    @Test
    public void test() throws Exception {
        SAXReader saxReader = new SAXReader();
        FileInputStream fis = new FileInputStream("src/main/resources/books.xml");
        System.out.println(fis);
        Document document = saxReader.read("src/main/resources/books.xml");
//        Document document = saxReader.read(Thread.currentThread().getContextClassLoader().getResource("books.xml").getPath());
//        System.out.println(document);
        Element rootElement = document.getRootElement();
        List<Element> books = rootElement.elements("book");
        for(Element e :books){
            //asXML()转化为字符串  <name>java编程思想</name> <name>葵花宝典</name>
//            System.out.println(e.     asXML());
            Element name = e.element("name");
//            System.out.println(name.asXML());
            String author = e.elementText("author");
            String price = e.elementText("price");
            //attributeValue()通过属性名来获取标签上的属性
            String id = e.attributeValue("id");
            //getText()转化为字符串  java编程思想  葵花宝典
            System.out.println(new MyBook(id,name.getText(),author,BigDecimal.valueOf(Double.parseDouble(price))));


        }


    }

    public static void main(String[] args) throws Exception {
        SAXReader saxReader = new SAXReader();
        FileInputStream fis = new FileInputStream("maven/src/main/resources/books.xml");
        System.out.println(fis);
//        Document document = saxReader.read(Thread.currentThread().getContextClassLoader().getResource("books.xml").getPath());
        Document document = saxReader.read(Thread.currentThread().getContextClassLoader().getResource("src/main/test.xml").getPath());

        System.out.println(document);
    }
}
