import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.List;

/**
 * Created by zsh on 2017/5/12 0012.
 */
public class XmlTest {

    public static void main(String[] args){
        SAXReader reader = new SAXReader();
        try{
            File file = new File("src\\resource\\bookcatalog.xml");
            Document document = reader.read(file);
            Element bookstore = document.getRootElement();

            List<Element> books = bookstore.elements("book");
            books.clear();

            Element example1 = bookstore.addElement("book");
            Element e1 = example1.addElement("title");
            e1.setText("催泪励志篇");
            Element e2 = example1.addElement("bookname");
            e2.setText("周先生的自传");
            Element e3 = example1.addElement("artist");
            e3.setText("小周");
            Element e4 = example1.addElement("country");
            e4.setText("中国");
            Element e5 = example1.addElement("company");
            e5.setText("新华社出版");
            Element e6 = example1.addElement("price");
            e6.setText("￥1000/本");
            Element e7 = example1.addElement("year");
            e7.setText("2020年");

            //输出流
//            XMLWriter writer = new XMLWriter(new FileOutputStream(file), OutputFormat.createPrettyPrint());
//            writer.write(document);
            System.out.println(document.asXML());
//            writer.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
