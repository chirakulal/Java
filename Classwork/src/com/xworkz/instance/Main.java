package com.xworkz.instance;

import com.xworkz.access.Access;

public class Main {

     public static void main(String[] args) {
         Department department = new Department();
         department.work();


         Access access = new Access();
         access.display();
    }


}
