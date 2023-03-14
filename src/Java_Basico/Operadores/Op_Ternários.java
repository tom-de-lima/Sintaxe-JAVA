package Java_Basico.Operadores;

import javax.swing.text.StyledEditorKit.BoldAction;

public class Op_Ternários {
    
    public static void main(String[] args) {

        int a = 4;
        int b = 7;
        
        String resultado = a == b ? "verdadeiro" : "falso";

        System.out.println(resultado);

        int resultado1 = a == b ? 1 : 0;

        System.out.println(resultado1);

        Boolean resultado2 = a == b ? true : false;

        System.out.println(resultado2);

    }

}
