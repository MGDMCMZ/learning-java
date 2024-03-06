package classroom;

public class ConditionalStatements {
    public static void main(String[] args) {

        //Conditional statements in Java

        // 'if' statement

        if (true) {
            System.out.println("This code is executed!");

        }
        int x = 10;
        if (x > 5) {
            System.out.println("x is greater then 5");
        }

        if (x > 12) {
            System.out.println("x is greater then 12");
        }

        boolean isSpring = true;
        if (isSpring) {
            System.out.println("It is Spring");
        }

        //What returns true or false
        //Comparison: >, <, ==, <=, >=, !=

        //IF-ELSE

        //Child : <= 12 age;
        //Teenager: => 13 & <=19;
        //Adult => 20 & <= 59
        //Else: Senior

        int age = 60;

        if (age <=12) {
            System.out.println("This is child!");
        } else {
            System.out.println("Something else!");
        }

        //if-else-if-else
        if (age <=12) {
            System.out.println("This is child!");
        } else if (age >= 13 && age <= 19) {
            System.out.println("This is teenager!");
        } else if (age >= 20 && age <= 59) {
            System.out.println("This is adult!");
        } else {
            System.out.println("This is senior!");
        }

        //Exercise
        int number = 10;
        if (number <= 0) {
            System.out.println("This is negative!");
        } else if (number >= 0) {
            System.out.println("This is positive!");
        } else if (number == 0) {
            System.out.println("This is zero!");
        }

        //Exercise
        int hour = 12;
                if (hour >= 0 && hour <= 11) {
                    System.out.println("Good Morning!");
                } else if (hour >= 12 && hour <= 17) {
                    System.out.println("Good Afternoon!");
                } else if (hour >= 18 && hour <= 23) {
                    System.out.println("Good Evening!");
                }else System.out.println("Invalid hour provided");


    }
    }

