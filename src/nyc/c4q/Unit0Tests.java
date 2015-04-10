package nyc.c4q;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Unit0Tests {

    /*
     * Name of the method implies what the method should do.
     * Some of these methods require that the method return signature change.
     * For example, `returnPrimitiveBooleanTrue()` should return `boolean`, not `Object`.
     */
    public static void main (String args[]) {
      // Use main to test your methods
        printHelloWorld();

        System.out.println(returnPrimitiveBooleanTrue());

        System.out.println(returnPrimitiveInt1729());

        System.out.println(returnPrimitiveDoubleThreePointOneFour());

        System.out.println(returnPrimitiveCharZ());

       printSumOf1Upto10UsingForLoop();

        printSumOf1Upto10000UsingForLoop();

        System.out.println(isOdd(4));

        System.out.println(isMultipleOfThree(9));

        System.out.println(isOddAndIsMultipleOfThree(4));

//        Person person = new Person("Alan Turing");
//
//        System.out.println(declareAndReturnPersonNamedAda());
//
//        System.out.println(isFromLondon(person));




    }

    public static void printHelloWorld() {
      System.out.println("Hello World");
    }

    public static Boolean returnPrimitiveBooleanTrue() {

      return true;
    }

    public static int returnPrimitiveInt1729() {
      int x = 1729;
        return x;
    }

    public static double returnPrimitiveDoubleThreePointOneFour() {
      double pi = 3.14;
        return pi;
    }

    public static char returnPrimitiveCharZ() {

        char z = 'z';
        return z;
    }

    //fixme
    public static void printSumOf1Upto10UsingForLoop() {
        int sum = 0;

        for(int i= 1;i <= 10;i++){

            sum+=i;

        }
        System.out.println(sum);
    }
    //fixme
    public static void printSumOf1Upto10000UsingForLoop() {
        int sum=0;

        for(int i= 1;i <= 10000;i++){

            sum+=i;
        }
        System.out.println(sum);
    }


    public static boolean isOdd(int n)
    {
        boolean isODD = false;

        if(n % 2 == 0)
        {
            return  isODD;
        }
        else
        {
            return true;
        }
    }
    public static boolean isMultipleOfThree(int n) {

      //  a is a multiple of b if a % b == 0 is true

        if(n % 3==0)
            return true;
        else
         return false;

    }

    public static boolean isOddAndIsMultipleOfThree(int n) {

        if(isOdd(n)==true &&isMultipleOfThree(n)==true)
            return true;
        else
            return false;
    }
    //fixme
    public static String repeatStringXTimes(String input, int times) {
        // Given string "input" and a positive integer "times",
        // return a string that is equal to the input string repeated X times.
        // If "times" is 0 negative, return a blank string.
        // For example, repeatStringXTimes("potato", 5) should return "potatopotatopotatopotatopotato".

        String xTimes="";

        for(int i=0;i<=times;i++){


        }

        return "";
    }

    public static String returnStringUntilQ(String input) {
        // Given string "input", return a string that stops at the first occurrence of the character 'q'.
        // For example, given the string "ubiquitous", return "ubi".
        // If the string does not contain a q, then return the empty string "".
        return "";
    }

    public static Person declareAndReturnPersonNamedAda() {
        Person Ada = new Person();

        Ada.setName("Ada");


      return Ada;
    }

    public static Person declareAndReturnPersonNamedAlanTuringFromLondon() {
      Person person = new Person("Alan Turing");

        person.setCity("London");

        return person;
    }

    public static boolean isFromLondon(Person person) {
       person = new Person();
         if (person.getCity().equalsIgnoreCase("London")){
             return true;
         }
        else
             return false;
    }

    public static ArrayList<Place> declareAndReturnArrayListOfThreePlaces() {
       ArrayList<Place> places = new ArrayList<Place>();

        Place place = new Place();
        //places.add();


        return null;
    }

    public static HashMap<String, Person> declareAndReturnHashmapOfAlanTuringAndGraceHopper() {
      // The HashMap should have key-value pairs of:
      // - key: `Alan Turing`, value: instance of Person with name `Alan Turing`
      // - key: `Grace Hopper`, value: instance of Person with name `Grace Hopper`

        HashMap<String,Person> people= new HashMap<String, Person>();

        Person person = new Person();

       // people.add("Alan Turing",person.setCity("London"));


        return people;

    }

    public static void changeTuringsCityToPrinceton(HashMap<String, Person> people) {




    }

    // Bonus Problems
    public static void bonusPrintOutSumOfFirstTenFibonacciNumbers() {

    }

    public static void bonusPrintOutSumOfFirstFortyFibonacciNumbers() {

    }
}
