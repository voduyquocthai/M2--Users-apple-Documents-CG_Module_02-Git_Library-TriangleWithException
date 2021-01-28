import sun.tools.jconsole.ProxyClient;

import java.util.Scanner;

public class TriangleWithException {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Triangle triangle = new Triangle();
        boolean done = false;

        System.out.println("Enter three sides: ");
        while (!done){
            try{
                double side1 = input.nextDouble();
                double side2 = input.nextDouble();
                double side3 = input.nextDouble();
                triangle = new Triangle(side1,side2,side3);
                done = true;
            } catch (IllegalTriangleException ite){
                System.out.println(ite.getMessage());
                System.out.println("Enter three sides: ");
            }
        }
        System.out.println(triangle.toString());
    }
}
