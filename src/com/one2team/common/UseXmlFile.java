package com.one2team.common;

import java.io.File;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

/**
 * la classe permet de lire des données dans un fichier XML.
 * 
 * @author Saidani
 */
public class UseXmlFile {

	/**
     * recherche une jour particulier dans un calendrier.
     * 
     * @param chemin du fichier xml
     * 
     * @param l'element de la liste
     * 
     * @return element.
     */
	public static Element readXMLFile(String filePath,String nodeListe){
		try {

			File fXmlFile = new File(filePath);
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(fXmlFile);
			
			doc.getDocumentElement().normalize();
			
			NodeList nList = doc.getElementsByTagName(nodeListe);
			
			for (int temp = 0; temp < nList.getLength(); temp++) 
			{
				Node nNode = nList.item(temp);				
				if (nNode.getNodeType() == Node.ELEMENT_NODE) 
				{
					Element eElement = (Element) nNode;
					return eElement;
				}
			}
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
		return null;
	}
}

