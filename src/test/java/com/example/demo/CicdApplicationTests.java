package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CicdApplicationTests {

    @Test
    void contextLoads() {
        calculator cal1 = new calculator(1,2);
        System.out.println(cal1.cal());

        calculator cal2 = new calculator(5,5);
        System.out.println(cal2.cal());

        calculator cal3 = new calculator(1,0);
        System.out.println(cal3.cal());

    }

}
