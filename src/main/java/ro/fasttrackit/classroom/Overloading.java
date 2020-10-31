package ro.fasttrackit.classroom;

public class Overloading {

    public static void main(String[] args) {
        int number = 56;
        int number2 = 336;
        byte numberAsByte = 100;
        String someString = "bss";

        printAnything(number);
        printAnything(someString);
        printAnything(4, 6, 32, 101, 542);

    }
    static void printAnything(String textToPrint) {
        System.out.println("String :" + textToPrint);
    }
    static void printAnything(long longNumber){
        System.out.println("long: " + longNumber);
    }
    static void printAnything (Long wrappedLong){
        System.out.println("Long: "+ wrappedLong);
    }
    static void printAnything(int...intArray ){
        System.out.println("int...:"+ intArray);
    }
static void printAnything(Double wrappedDouble){
    System.out.println("Double: "+ wrappedDouble);
}
static void prinAnything(Object Object){
    System.out.println("Object: " + Object );
}
static void printAnything (int[]...Arrays){
    System.out.println("int[] : "+ Arrays);
}
static void printAnything (long[]...Arrays){
    System.out.println("long[]: " +Arrays);
}
}

