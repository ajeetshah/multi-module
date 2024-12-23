package com.example.mutilmodule;

import com.google.common.collect.Lists;

import java.util.List;

public class Hello {

    public static void main(String[] args) {
        System.out.println("Hello!");
        List<String> names = Lists.newArrayList("John", "Adam", "Jane");
        List<String> reversed = Lists.reverse(names);
        System.out.println(names);
        System.out.println(reversed);
    }
}
