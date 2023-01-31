package Constructor;

import java.util.Scanner;

public class PrincipalEmpleado {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese el numero 1.");
        int n1 = lector.nextInt();
        System.out.println("Ingrese el numero 2.");
        int n2 = lector.nextInt();
        Empleado empleado = new Empleado(n1,n2);
        System.out.println("La suma es: "+empleado.sumar());

    }
}
