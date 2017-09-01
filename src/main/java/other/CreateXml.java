package other;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

import java.io.FileOutputStream;

/**
 * Created by ZSH
 */
public class CreateXml {
    public static void main (String args[])throws Exception{
        Document docNew = DocumentHelper.createDocument();
        docNew.setXMLEncoding("UTF-8");
        docNew = docNew.addProcessingInstruction("xml-stylesheet", "type=\"text/xsl\" href=\"paintUsedAnalyzeTemplate.xsl\"");
        Element rootNew = docNew.addElement("材料用量成本分析表");
        rootNew.addElement("网点名称").setText("宁波太古");
        rootNew.addElement("核算日期").setText("2017/8/28");
        rootNew.addElement("钣面").setText("10000");
        rootNew.addElement("金额合计").setText("10000");
        Element inventoryElement = rootNew.addElement("盘库用量分析");
        inventoryElement.addElement("色母").setText("11.11");
        inventoryElement.addElement("清漆").setText("11.11");
        inventoryElement.addElement("固化剂").setText("11.11");
        inventoryElement.addElement("稀释剂").setText("11.11");
        inventoryElement.addElement("钣金灰").setText("11.11");
        inventoryElement.addElement("遮蔽纸").setText("11.11");
        inventoryElement.addElement("遮蔽膜").setText("11.11");
        inventoryElement.addElement("砂纸").setText("11.11");
        inventoryElement.addElement("胶带").setText("11.11");
        Element materialElement = rootNew.addElement("领料用量分析");
        materialElement.addElement("色母").setText("11.11");
        materialElement.addElement("清漆").setText("11.11");
        materialElement.addElement("固化剂").setText("11.11");
        materialElement.addElement("稀释剂").setText("11.11");
        materialElement.addElement("钣金灰").setText("11.11");
        materialElement.addElement("遮蔽纸").setText("11.11");
        materialElement.addElement("遮蔽膜").setText("11.11");
        materialElement.addElement("砂纸").setText("11.11");
        materialElement.addElement("胶带").setText("11.11");
        OutputFormat format = new OutputFormat("",true);
        XMLWriter xmlWriter = new XMLWriter(new FileOutputStream("C:\\Users\\Administrator\\Desktop\\createXML.xml"),format);

        xmlWriter.write(docNew);
        xmlWriter.close();
    }
}
