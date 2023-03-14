package Java_Basico.Operadores;

import javax.print.DocFlavor.STRING;

public class Op_Relacionais {
    
    public static void main(String[] args) {

        /* COMPARANDO OBJETOS */
        
        int a = 23;
        int b = 12;

        boolean SimNao = a == b;

        System.out.println(SimNao);

        SimNao = a != b;

        System.out.println(SimNao);

        SimNao = a >= b;

        System.out.println(SimNao);

        SimNao = a < b;

        System.out.println(SimNao);

        /* COMPARANDO OBJETOS - uso do método ".equals()" */

        String nome1 = "JAVA";
        String nome2 = "JAVA";
        String nome3 = new String("JAVA");
        String nome4 = "java";

        System.out.println(nome1 == nome2); /* é possível realizar comparação com os operadores relacinais */

        System.out.println("objetos diferentes 'nome2 com nome3' com mesmo valor usando operador '==' " + (" = ") + (nome2 == nome3));
        
        System.out.println("objetos diferentes 'nome2 com nome3' com mesmo valor usando o 'método .equals()' " + (nome2.equals(nome3)));

        System.out.println("nome1 com nome4 " + (" = ") + (nome1.equals(nome4)));



    }

}
