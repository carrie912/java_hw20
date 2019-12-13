package com.example.lib;

import java.util.Scanner;

public class MyClass {
    public static void main (String[] args ) {
        Scanner scanner = new Scanner(System.in);
        Phone phone = new Phone(1,"一一","jfdiajd","2080","$10000");
        Phone phone1 = new Phone(2,"二二","aooqvjsd","2071","$20500");
        Phone phone2 = new Phone(3,"三三","omgwka","2022","$24526");
        Phone phone3 = new Phone(4,"四葉","428428","2010","$428428");
        Phone phone4 = new Phone(5,"五月","f45855454","2020","$545126");
        phone.alldetailedprint();
        phone1.alldetailedprint();
        phone2.alldetailedprint();
        phone3.alldetailedprint();
        phone4.alldetailedprint();
    }
}
