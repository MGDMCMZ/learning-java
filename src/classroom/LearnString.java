package classroom;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.util.SplittableRandom;

public class LearnString {
    public static void main(String[] args) {
        //String
        String name = "Daniels";
        String lastName = "Miskins";

        System.out.println(name);
        System.out.println(lastName);

        //Exercise

        String fullName = name + " " + lastName;
        System.out.println(fullName);

        System.out.println(name + " " + lastName);

        String.format("%s %s", name, lastName);

        System.out.println(String.format("%s %s", name, lastName));

        //Can save into variable
        String myFullName = String.format("%s %s", name, lastName);
        System.out.println(myFullName);

        //Hello, world!
        String hello = "Hello, ";
        String world = "world!";

        String helloWorld = hello.concat(world);
        System.out.println(helloWorld);

        //Exercise

        String myName = "My name is Daniel, ";
        String java = "I love coding in Java";

        String iLoveJava = String.format("%s %s", myName, java);
        System.out.println(iLoveJava);

        String randomString = "some text";
        randomString.toUpperCase();
        System.out.println(randomString.toUpperCase());





    }
}
