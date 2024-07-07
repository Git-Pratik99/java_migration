package main;


import module1.LoggingExample;

import module2.AssertionsExample;

import module3.RegexExample;

import module4.ExceptionChainingExample;

//import module5.NIOExample;

import module6.ImageIOExample;

import module7.PreferencesExample;

import module8.XMLProcessingExample;


public class MainRunner {

    public static void main(String[] args) {

        System.out.println("Running LoggingExample...");

        LoggingExample.main(args);


        System.out.println("\nRunning AssertionsExample...");

        AssertionsExample.main(args);


        System.out.println("\nRunning RegexExample...");

        RegexExample.main(args);


        System.out.println("\nRunning ExceptionChainingExample...");

        ExceptionChainingExample.main(args);


        System.out.println("\nRunning NIOExample...");

//        NIOExample example5 = new NIOExample("src/main/resources/example.txt");

//        example5.writeFile("This is a test content.");

//        example5.readFile();


        System.out.println("\nRunning ImageIOExample...");

        ImageIOExample example6 = new ImageIOExample("src/main/resources/input.jpg", "src/main/resources/output.png");

        example6.readImage();

        example6.writeImage();


        System.out.println("\nRunning PreferencesExample...");

        PreferencesExample example7 = new PreferencesExample();

        example7.setPreference("username", "user1");

        System.out.println("Username: " + example7.getPreference("username"));

        example7.removePreference("username");

        System.out.println("Username after removal: " + example7.getPreference("username"));


        System.out.println("\nRunning XMLProcessingExample...");

        XMLProcessingExample example8 = new XMLProcessingExample("src/main/resources/example.xml");

        example8.parseXML();

    }

}


