package com.driver;
/*

Task 1:
create a class Product inside Main class
Task 2:
create object of Product in Main function called p
Task 3:
create a method of following defination
public int product(int x, int y) {}
call this method from Main using Product class object p
Task 4:
create a Overloaded method product of following defination
public int product(int x, int y, int z) {}
call this method also from Main using Product class object p
Task 5:
create a Overloaded method product of following defination
public double product(double x, double y) {}
call this method also from Main using Product class object p
Observations:
This class contains 3 classes with same name, but it complie & run successfully
*/
public class Main {
    public static void main(String[] args) {
        Product p = new Product();

        p.product(1,2);
        p.product(1,2,3);
        p.product(1,2);

    }
    public static  class  Product{
        public static  int product(int x, int y){
            return  x*y;
        }
        public static  int product(int x, int y, int z) {
            return  x*y*z;
        }
        public static double product(double x, double y) {
            return x*y;
        }


    }
}
