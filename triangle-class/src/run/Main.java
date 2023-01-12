package run;

import triangle.Triangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("color: ");
        String color = input.nextLine();

        System.out.print(" side 1: ");
        double side1 = input.nextDouble();
        System.out.print("side 2: ");
        double side2 = input.nextDouble();
        System.out.print("side 3: ");
        double side3 = input.nextDouble();
        Triangle triangle = new Triangle(color, side1, side2, side3);

        if (side1 + side2 > side3 && side2 + side3 > side1 && side3 + side1 > side2) {
            System.out.println(triangle);
        } else {
            System.out.println("does not form a triangle ?");
        }
    }
}