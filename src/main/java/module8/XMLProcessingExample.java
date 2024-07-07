package module8;


import org.w3c.dom.*;

import javax.xml.parsers.*;


public class XMLProcessingExample {

    private String xmlFilePath;


    public XMLProcessingExample(String xmlFilePath) {

        this.xmlFilePath = xmlFilePath;

    }

    public static void main(String[] args) {

        XMLProcessingExample example = new XMLProcessingExample("src/main/resources/example.xml");

        example.parseXML();

    }

    public void parseXML() {

        try {

            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

            DocumentBuilder builder = factory.newDocumentBuilder();

            Document document = builder.parse(xmlFilePath);


            NodeList nodeList = document.getElementsByTagName("element");

            for (int i = 0; i < nodeList.getLength(); i++) {

                Node node = nodeList.item(i);

                System.out.println("Element: " + node.getTextContent());

            }

        } catch (Exception e) {

            e.printStackTrace();

        }

    }

}

