package Java_Basico.Operadores;

import javax.swing.text.html.BlockView;

public class Op_Logicos {
    
    public static void main(String[] args) {
        
        boolean caso1 = true;
        boolean caso2 = false;

        Boolean resultado = caso1 && caso2 ? true : false;

        /* A L12 equivale a:
         * 
         * if(caso1 && caso) {
         * 
         *      System.out.println(resultado)  // true
         * 
         * else {
         * 
         *      System.out.println(resultado) // false 
        * 
         * }
         * 
         * }
         */

        System.out.println(resultado);

        boolean resultado2 = caso1 || caso2 ? true : false;

        System.out.println(resultado2);

    }

}
