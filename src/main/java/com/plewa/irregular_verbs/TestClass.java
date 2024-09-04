package com.plewa.irregular_verbs;

import java.util.ArrayList;
import java.util.List;

public class TestClass {
    public static void main(String[] args) {
        List<String> integerList = new ArrayList<>();
        String abc1 = "abc";
        String abc2 = "abccc";

        integerList.add(abc1);
        integerList.remove(abc1);

        System.out.println(integerList.size() == 0);
    }
}
