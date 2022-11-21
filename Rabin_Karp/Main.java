package ua.lviv.iot;
import ua.lviv.iot.RabinKarp;

public class Main {
    public static void main(String[] args) {
        RabinKarp algo = new RabinKarp();
        RabinKarpTest rabinKarpTest = new RabinKarpTest();
        rabinKarpTest.testRabinCarp();
        System.out.println(" ");
        System.out.println("Number of matches:");
        String text = "ABCDRABDH";
        String pattern = "AB";
        System.out.println(algo.matchWithPattern(text, pattern));
        System.out.println(" ");
        rabinKarpTest.testRabinCarp();


    }
}