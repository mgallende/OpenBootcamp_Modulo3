public class Main {

    public static void main(String[] args) {
        var txt = "el resultado de la suma es: "; // Texto pàra concantenar con el resultado numérico

        int num1 = 3;
        int num2 = 6;
        int num3 = 7;
        var sum = suma (num1, num2, num3); //paso por valor

        System.out.println((txt) + sum);

        var txtpuertas = "El número de puertas de mi Coche es :";
        coche miCoche = new coche();
        miCoche.incrementarPuertas();
        System.out.println((txtpuertas) + miCoche.puertas);
    }



    public static int suma(int a, int b, int c) {
       return a + b + c ;
    }
}


class coche {
    public int puertas = 4;

    public void incrementarPuertas(){
        this.puertas++;
    }
}
