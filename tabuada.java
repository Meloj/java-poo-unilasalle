/**
 * 0050014919 - João Paulo Barreto de Melo
*/

public class Tabuada{
   public static void main(String[] args){

      int x = 10;
      int aux = 0;
      System.out.println("Tabuada de " + x);

      for (int i = 0; i <= 10; i++){
         aux = x * i;
         System.out.print( x + " x " + i + " " + "=");
         System.out.println(" "+aux);
      }

   }
   
}

