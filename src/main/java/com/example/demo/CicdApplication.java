package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class CicdApplication {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a,b;
        SpringApplication.run(CicdApplication.class, args);
        System.out.println("app is running.......");
        System.out.println("enter a: ");
        a = Integer.parseInt(scan.nextLine());
        System.out.println("enter b:");
        b = Integer.parseInt(scan.nextLine());
        System.out.println((new calculator(a,b)).cal());

    }

}
