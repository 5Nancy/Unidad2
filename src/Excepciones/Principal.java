package Excepciones;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        boolean continuar = true;
        do {
            try {


                Scanner sc = new Scanner(System.in);
                System.out.print("O p e r a c i o n e s: \n");
                System.out.print("Introduzca un número entero: ");
                int x= sc.nextInt();
                System.out.println("Ingresa el valor de y:");
                int y= sc.nextInt();

                int resul=x/y;
                System.out.print("la division es : " + resul);
                continuar = false;
                sc.close();
            } catch (InputMismatchException e) {
                System.out.println("Error:" + e.getMessage());
                System.out.print("Ingrese un número\n");
            }catch (ArithmeticException a){
                System.out.println("Error:" + a.getMessage());
                System.out.print("No puede realizar la operacion entre 0 \n");
            }
            }
            while (continuar) ;
        }
    }
