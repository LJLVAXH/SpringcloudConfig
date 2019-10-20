package com.algorithm;

import java.util.*;
import java.util.stream.Collectors;

public class Algorithm {
    /*private static class Inner{
        private static Algorithm algorithm = new Algorithm();
    }
    private static Algorithm newInstance(){
        return Inner.algorithm;
    }*/

    public static void main(String[] args) {
        /*
           冒泡算法
         */
        /*int[] arr = new int[6];
        arr[0] = 2;
        arr[1] = 4;
        arr[2] = 10;
        arr[3] = 3;
        arr[4] = 1;
        arr[5] = 2;
        int temp = 0;
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < i; j++){
                if (arr[j] > arr[i]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));*/

        /*
            去除相同字符
         */
        /*String s = "absdbawqerqeq";
        StringBuilder sb = new StringBuilder();
        boolean flag;
        char[] carray = s.toCharArray();
        sb.append(carray[0]);
        for (int i = 1; i < carray.length; i++) {
            flag = true;
            for (int j = 0; j < sb.length(); j++){
                if (sb.charAt(j) == carray[i]){
                    flag = false;
                }
            }
            if (flag){
                sb.append(carray[i]);
            }
        }
        System.out.println(sb.toString());*/

        /*System.out.println(fibonacci(10));*/

        /*List<Integer> array = new ArrayList<>();
        array.add(-1);
        array.add(2);
        array.add(3);
        array.add(0);
        array.add(-10);
        System.out.println(array.stream().filter(i->i>0).collect(Collectors.summarizingInt(v->v)).getSum());*/

        try {
            int i = 1;
            return;
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            System.out.println("qqq");
        }

        countWords("Today, the world is learning mandarin. According to the report, there are over one hundred million foreign people learning Chinese.");
        List<Integer> list = new ArrayList<>();
        Map<String,String> map = new HashMap<>();
        list.stream().filter(i->i.equals("1"));
    }

    static int fibonacci( int N)
    {
        if(N<=2)
            return N;
        else
            return fibonacci(N-1)+fibonacci(N-2)+fibonacci(N-3);
    }

    static int countWords(String text){
        int count = 0;
        String[] split = (text.replace(",","").replace(".","")).split(" ");
        for (String s : split){
            if (s.equals(text)){
                count++;
            }
        }
        System.out.println("aaa");
        return count;
    }
}
