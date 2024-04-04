package com.example.demo;


import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication

class A{
 public void show(){

     System.out.println("in A");
 }
 public void config(){
     System.out.println("config");
 }

}
class B extends A{
public void show(){
    System.out.println("in B");
}
}
public class DemoApplication {

    public static void main(String[] args) {

    B obj=new B();
    obj.show();
    obj.config();

            // SpringApplication.run(DemoApplication.class, args);

    }
}


