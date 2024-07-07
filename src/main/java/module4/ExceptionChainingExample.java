package module4;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExceptionChainingExample {

    public static void main(String[] args) {

        try {

            method1();

        } catch (Exception e) {

            e.printStackTrace();

        }

    }


    public static void method1() throws Exception {

        try {

            method2();

        } catch (Exception e) {

            throw new Exception("Exception in method1", e);

        }

    }


    public static void method2() throws Exception {

        throw new Exception("Exception in method2");

    }


    public static void method3() throws Exception {

        try {

            method4();

        } catch (Exception e) {

            throw new Exception("Exception in method3", e);

        }

    }


    public static void method4() throws Exception {

        throw new Exception("Exception in method4");

    }
    
    public void sortListJava7(List<String> list) {
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.compareTo(s2);
            }
        });
    }

}

