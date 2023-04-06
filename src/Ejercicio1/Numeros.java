/*
Para este primer ejercicio tendréis que realizar lo siguiente:
Crea un proyecto de Java desde 0
Dentro del proyecto tenéis que crear un paquete. En el paquete tendréis que crear una clase.
Dentro de la clase tenéis que crear el método main e imprimir todos los datos que se han visto en las sesiones.
Recordatorio: Los tipos de datos más comunes son int, long, double, boolean, String.

 */


package Ejercicio1;


import java.util.Scanner;

public class Numeros {

    public static void main(String[] args) {

        Scanner entrada=new Scanner(System.in);


        //datos de tipo enteros
        byte dato1=5;
        short dato2=10;
        int dato3=80;
        long dato4=2000;

        System.out.println("\nLos tipos de datos enteros son : ");
        System.out.println("\nBtyte : "+dato1+ "\nshort : "+dato2+"\nint : "+dato3+"\nlong : "+dato4);

        //datos de tipo decimal
        float dato5=8.5f;
        double dato6=20.5;
        System.out.println("\nlos tipos de datos decimales son: ");
        System.out.println("\nfloat : "+dato5+"\ndouble : "+dato6);



        //datos de tipo booleanos
        boolean dato7=false;
        boolean dato8=true;
        System.out.println("\nlos tipos de datos booleanos son : ");
        System.out.println("\nboolean : "+dato7+"\nboolean: "+dato8);



        //datos de tipo texto
        char dato9='s';
        String dato10="Hola soy un dato de tipo String";
        System.out.println("\nLos datos de tipo texto son : ");
        System.out.println("\nchar : "+dato9+"\nString : "+dato10);








        //


    }
}
