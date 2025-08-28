import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    /**
      
     * @param args the command line arguments
     * @throws IOException 
      
     */ 
     
    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        int opcion = -1;
        do {
            try {
                System.out.println("\n-------- Menú Principal --------");
                System.out.println("1. Calcular Factorial ");
                System.out.println("2. Calcular Fibonacci ");
                System.out.println("3. Calcular Suma de digitos ");

                System.out.println("0. Salir");
                System.out.print("Opción: ");

                opcion = Integer.parseInt(entrada.readLine());

                switch (opcion) {

                    case 1:
                        int num = 0;
                        System.out.println("Calcular Factorial de: ");
                        num = Integer.parseInt(entrada.readLine());
                        System.out.println("\nFactorial de"+ num +" :" +Recursion.factorial(num));
                        break;

                    case 2:
                        int numf = 0;
                        System.out.println("Calcular Fibonacci de: ");
                        numf = Integer.parseInt(entrada.readLine());
                        System.out.println("\nFibonacci de"+ numf +" :" +Recursion.fibonacci(numf));
                        break;

                    case 3:
                        int numd = 0;
                        System.out.println("Calcular suma de digitos de: ");
                        numd = Integer.parseInt(entrada.readLine());
                        System.out.println("\nFibonacci de "+ numd +" :" +Recursion.sumaDigitos(numd));
                        break;


                    case 0:
                        System.out.println("Saliendo...");
                        break;
                    default:
                        System.out.println("Opción inválida.( Solo números entre el 0-6 )");

                }

            } catch (NumberFormatException e) {
                System.out.println("Inválido, ingresa un número ");
            }
        } while (opcion != 0);



    }
    

}
     
      
     
    

