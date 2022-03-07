package main;

public class Main {
    public static void main(String[] args) {
        NumberConverter converter = new NumberConverter();
        Palindrome palindrome = new Palindrome();
        System.out.println(converter.toBinary(10));
        System.out.println(converter.toDecimal("000111"));
        System.out.println(palindrome.palindromeSentence("di rumah saya ada kasur rusak"));
        System.out.println(Integer.parseInt("000111", 2));

    }
}
