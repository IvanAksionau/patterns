package com.ivan.practice.logicaltask;

public class LuckyTicket {

    @Init(name = "is")
    public static boolean isLucky(int n) {
        int sum1 = 0;
        int sum2 =0;
        String s = String.valueOf(n);
        System.out.println("After Conversion in String= " + s);
        for (int i = 0; i < (s.length()) / 2; i++) {
            System.out.println("half string === " + s.charAt(i));
            sum1 = sum1 + Character.getNumericValue(s.charAt(i));
        }
        System.out.println("half sum === " + sum1);
        for(int j=(s.length()) / 2 ; j< s.length();j++){
            System.out.println("half string === " + s.charAt(j));
            sum2 = sum2 + Character.getNumericValue(s.charAt(j));
        }
        System.out.println("another half sum === " + sum2);
        return sum1 == sum2;
    }
}
