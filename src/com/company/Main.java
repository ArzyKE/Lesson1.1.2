package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(number(23,19));
        System.out.println(number(25,15));
        System.out.println(number(34,-5));
        System.out.println(number(50,-3));
        System.out.println(number(20,6));

    }


    public static String number (int agePerson,int temperature) {

        if (agePerson >=27 && agePerson <= 43 && temperature >= 22 && temperature <= 30) {
            return "можно идти гулять";
        } else if (agePerson< 20 && temperature >= 0 && temperature <= 28) {
            return "можно идти гулять";
        }  else if (agePerson> 45 && temperature >= -10 && temperature <= 25) {
            return "можно идти гулять";
        } else {
            return "оставайтeсь дома ";
        }
    }
}
