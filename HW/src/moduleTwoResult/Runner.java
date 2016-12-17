package moduleTwoResult;

import java.io.File;
import java.io.IOException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

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
		File file = new File("src/moduleTwoResult/greenhouse.xml");

		try {
			doc = builder.parse(file);

		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		Element greenhouse = doc.getDocumentElement();
		System.out.println(greenhouse.getTagName());

		NodeList nList = greenhouse.getChildNodes();
		NodeList plantsDif;

		for (int i = 0; i < nList.getLength(); i++) {

			Node plants = nList.item(i);

			if (nList.item(i) instanceof Element) {
				plantsDif = plants.getChildNodes();
				System.out.println(nList.item(i).getNodeName() + ": ");

				for (int k = 0; k < plantsDif.getLength(); k++) {
					
					
					
					
					if (plantsDif.item(k) instanceof Element) {
						System.out.println(plantsDif.item(k).getNodeName() + ": ");
						
					}
					
				}
			}
			
		}
		

	}
}
