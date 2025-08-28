public class Recursion {
        /**
        * Funcion factorial de manera recursiva.
        * @param n valor a obtener factorial
        * @return factorial de n
        */

        public static long factorial(long n){
        long result=1; //Contador
        if (n <= 1){ //Caso de salida
            result = 1;
        }else {
            //caso recursivo
            result = n * factorial(n-1); 
        }
        return result;
    }
      

      /**
     
     * Función de Fibonacci de manera recursiva.      
     * @param n la posición de número fibonacci a buscar
     * @return       
     */ 
    public static long fibonacci(long n){
        long result=1; //Contador
        if (n <= 1){ //Caso de salida
     
            result = 1;
      
        }else {
     
            //caso recursivo
      
            result = fibonacci(n-1) + fibonacci(n-2); 
      
        }
     
        return result;
     
    }

    public static long sumaDigitos(long n){
         if (n == 0){ //Caso de salida
     
            return 0;
      
        }else {

            return(n % 10) + sumaDigitos(n / 10);
        

        }

    }

      
    

      
}


