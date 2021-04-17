package ru.com.anton;

public class HelloWorld {

    public static void main(String[] args) {
        int i = 6;
        int j = 7;
        int answer = i * j;
        boolean isMoreThenOne;

        if (answer > 1) {
            isMoreThenOne = true;
        }else {
            isMoreThenOne = false;
        }
        System.out.println(isMoreThenOne);
    }
}
