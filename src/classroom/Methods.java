package classroom;

public class Methods {
    public static void main(String[] args) {

        calculateSum(44, 20);
        System.out.println(calculateSum(44, 20));

        //Print Hello World! 10 times;
        printTextMultipleTimes("Hello World!", 10);

        String[] shoppingList = {"Potatoes, Ham, Apples, Coconut"};

        printAllValuesFromStringArray(shoppingList);

        printAllValuesFromStringArray(new String[]{"Salmon, Beef"});

        System.out.println(isEven(10));

        int[] numbers = {2, 4, 7, 8, 10};
        int arraySum = printSumOfArrayNumbers(numbers);
        System.out.println(arraySum);




    }

    public static int calculateSum(int x, int y){
        int z = x + y;
        return z;
    }

    public static void printTextMultipleTimes(String text, int repeatCount) {
        for (int i = 0; i < repeatCount; i++) {
            System.out.println(text);
        }
    }

    //Task

    public static void printAllValuesFromStringArray(String[] stringArray) {
        for (int i = 0; i < stringArray.length; i++) {
            System.out.println(stringArray[i]);
        }
    }

    //Task

    public static boolean isEven(int number) {
        boolean result = number % 2 == 0;
        return result;
    }

    private static int printSumOfArrayNumbers(int[] numbers) {
        int summa = 0;
        for (int i = 0; i < numbers.length; i++) {
            summa = summa + numbers[i];
        }
        return summa;
    }



    public static void printAllValuesFromStringArray(String[] stringArray) {
        for (int i = 0; i < stringArray.length; i++) {
            System.out.println(stringArray[i]);
        }





}
