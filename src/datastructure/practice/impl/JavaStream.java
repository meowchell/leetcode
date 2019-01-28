package datastructure.practice.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JavaStream {
    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(2,3,4,5);
        List square = new ArrayList();
//        List square = number.stream().map(e->e*e).collect(Collectors.toList()).forEach(e-> System.out.println(e));
        number.stream().forEach(e-> square.add(e*e));
        System.out.println(square);
    }
}
