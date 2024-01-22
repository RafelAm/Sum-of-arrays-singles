

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class SolutionTest{    
    @Test
    public void basicTests(){     
        assertEquals(15,Solution.repeats(new int []{4,5,7,5,4,8}));
        assertEquals(19,Solution.repeats(new int []{9, 10, 19, 13, 19, 13}));
        assertEquals(12,Solution.repeats(new int []{16, 0, 11, 4, 8, 16, 0, 11}));    
    }
}


class Solution{
    public static int repeats(int [] arr){
      // Creamos una variable que suma
      int res = 0;
      // Bucle para recorrer el array 
      for(int i = 0; i < arr.length; i++){
        // Variable que usamos despues para una condición
        boolean S = true;
        // Segundo bucle que recorra el array simultaneamente
        for(int j = 0; j < arr.length; j++){
          // Si el recorrido del primer array es igual al del segundo y i es diferente a j entra
          if(arr[i] == arr[j] && i != j){
            // j es igual a la longitud del array
            j = arr.length;
            // Cambiamos su valor por negativo
            S = false;
          }
        }
        // Si S es true entra
        if(S == true){
          // al ser true sumamos todas las veces que toca los numeros
          res += arr[i];
        }
      }
      // Devolvemos el resultado
    return res;
    }
  
}
