package classWork20;

/** Напишите программу, которая будет разбирать xml файл 
 * с помощью DOM, SAX и StAX, и выводить его на экран в 
 * текстовом виде. Каждая точка должна выводиться на отдельной 
 * строке в виде двух чисел, разделенных запятой, при этом 
 * должна выводиться единица измерения. Например: 
 pointList
 point: 10px, 30px
 point: 17cm, 75cm  */

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class Runner {

	public static void main(String[] args) {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = null;
		Document doc = null;
		try {
			builder = factory.newDocumentBuilder();

		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		}
		File file = new File("src/classWork20/xmlFile.xml");

		try {
			doc = builder.parse(file);

		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		Element root = doc.getDocumentElement();
		System.out.println(root.getTagName());

		NodeList nList = root.getChildNodes();

		for (int i = 0; i < nList.getLength(); i++) {
			if (nList.item(i) instanceof Element) {
				System.out.println(nList.item(i).getNodeName() + ": ");
		
				
				DomParser dp = new DomParser();
				dp.parse(doc);
				
				
				
				/*
				 * for (int k = 0; k <
				 * nList.item(i).getChildNodes().getLength(); k++){ try{ if
				 * (nList.item(k).getChildNodes().item(k) != null) {
				 * System.out.println(nList.item(k).getChildNodes().item(k).
				 * getNodeName() + ":"); } }catch(NullPointerException e){
				 * System.out.println("fff"); } }
				 */

				/*
				 * NamedNodeMap attributes = ((Element)
				 * nList.item(i)).getChildNodes();
				 * 
				 * for (int k = 0; k < attributes.getLength(); k++) {
				 * System.out.println(attributes.item(k).getNodeName());
				 * System.out.println(attributes.item(k).getNodeValue()); }
				 */
			}

		}

	}
}