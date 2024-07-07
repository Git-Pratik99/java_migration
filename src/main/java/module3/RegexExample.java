package module3;


import java.util.regex.Matcher;

import java.util.regex.Pattern;


public class RegexExample {

    private String text;

    private String regex;


    public RegexExample(String text, String regex) {

        this.text = text;

        this.regex = regex;

    }


    public void findMatches() {

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(text);


        while (matcher.find()) {

            System.out.println("Found a match: " + matcher.group());

        }

    }


    public static void main(String[] args) {

        RegexExample example = new RegexExample("The quick brown fox jumps over the lazy dog.", "\\b\\w{4}\\b");

        example.findMatches();

    }
    
    public void startThreadJava7() {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread running");
            }
        });
        thread.start();
    }

}

