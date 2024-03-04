public class DataTypes {
    public static void main(String[] args) {
        // First comment

        /* Hello World
        I am working on this file!
         */

        //Variables: int
        int numberOfStudents = 30;
        int maxScore = 100;
        System.out.println(numberOfStudents);
        System.out.println(maxScore);

        //Variables: double

        double temprature = 3.4;
        double price = 999.999;
        System.out.println(temprature);
        System.out.println(price);

        //Variables: float
        float pi = 3.14f;
        float radius = 5.5f;
        float area = pi * radius * radius;
        System.out.println(area);

        //Casting
        int areaInteger = (int) area;
        System.out.println(Math.round(area));

        //Char
        char symbol = '$';
        System.out.println(symbol);

        // Exercise:
        char d = 68;
        System.out.println(d);
        char a = 65;
        System.out.println(a);
        char n = 78;
        System.out.println(n);
        char i = 73;
        System.out.println(i);
        char e = 69;
        System.out.println(e);
        char l = 108;
        System.out.println(l);

        //Boolean is/has
        boolean isRaining = false;
        System.out.println(isRaining);
        boolean hasPassedExercise = true;
        System.out.println(hasPassedExercise);
        boolean isSummer = false;
        System.out.println(isSummer);
    }
}
