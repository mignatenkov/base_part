package com.korfax.base_part;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
/*
        try {
            Integer i = 2 << 31;
            String s = null;
            if ((i >= 0) && (i.toString() == i.toString()) && s.toString().contains("n")) {
                System.out.println("1");
            } else {
                System.out.println("2");
            }
        } catch (Exception e) {
            System.out.println("3");
        }
*/
/*
        try {
            for (int i = 60 >>> 4 ^ 0b1100 & 23; i > 0xf - 013; i--) {
                System.out.println("Шли из Африки в Саратов " + i + " отчаянных пиратов");
                System.out.println("Не дошли до Душанбе, видят надпись на столбе:");
            }
        } catch (ArithmeticException e) {
            System.out.println("Дошли!");
        } finally{
            System.out.println("Пришли!");
        }
*/

        SpringApplication.run(Application.class, args);
    }

}
