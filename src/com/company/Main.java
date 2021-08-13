package com.company;

import java.util.Scanner;
class Shape{
    double length,breadth;
    Shape(double l,double b){
        this.length=l;
        this.breadth=b;
    }
    Shape(double len){
        this.length=len;
        this.breadth=len;
    }
    double calculate(){
        return length*breadth;
    }
}
public class Main extends Shape{
    double height;
    Main(double l,double h){
        super(l);
        this.length=l;
        this.height=h;
    }
    Main(double l,double b,double h){
        super(l,b);
        this.length=l;
        this.breadth=b;
        this.height=h;
    }

    @Override
    double calculate() {
        return length*breadth*height;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Length: ");
        double l=sc.nextDouble();
        System.out.println("Enter Breadth: ");
        double b=sc.nextDouble();
        System.out.println("Enter Height: ");
        double h=sc.nextDouble();
        Main shape1=new Main(l,h);
        Main shape2=new Main(l,b,h);
        double volume1,volume2;
        volume1=shape1.calculate();
        volume2=shape2.calculate();
        System.out.printf("Volume of Shape1 is: %f",volume1);
        System.out.println();
        System.out.printf("Volume of Shape2 is: %f",volume2);
    }
}