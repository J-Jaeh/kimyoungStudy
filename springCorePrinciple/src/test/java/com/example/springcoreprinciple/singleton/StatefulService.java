package com.example.springcoreprinciple.singleton;

public class StatefulService {

   /* private int price; // 상태를 유지하는 필드*/

    public int order(String name,int price){
        System.out.println("name = " + name + "// price = " + price);
       /* this.price = price;*/// 여기가 문제가 됨 .. 싱글톤에서 ?
        return price;
    }

 /*   public int getPrice() {
        return price;
    }*/
}
