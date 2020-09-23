import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner triangle = new Scanner (System.in);
        double b,h;
        System.out.print("Valor Base: ");
        b=triangle.nextDouble();
        System.out.print("Valor Altura: ");
        h=triangle.nextDouble();
        double area;
        area=b*h/2;
        System.out.print(area);
    }
}
