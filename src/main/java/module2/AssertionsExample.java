package module2;

import java.util.List;

public class AssertionsExample {

    private int value;


    public AssertionsExample(int value) {

        this.value = value;

    }


    public void checkValue() {

        assert value > 0 : "Value must be positive";

    }


    public void printValue() {

        System.out.println("Value is " + value);

    }


    public static void main(String[] args) {

        AssertionsExample example = new AssertionsExample(5);

        example.checkValue();

        example.printValue();

    }
    
    public void printListJava7(List<String> list) {
        for (String item : list) {
            System.out.println(item);
        }
    }

}