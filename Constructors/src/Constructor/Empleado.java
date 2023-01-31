package Constructor;

public class Empleado {
    private int num1;
    private int num2;
    private int suma;

    public Empleado(int num1,int num2) {
        this.num1 = num1;
        this.num2 = num2;
        suma = num1 +num2;
    }

    public int sumar(){
        return suma;
    }

}

