package Java_Basico.Operadores;

public class Op_Unarios {
    
public static void main(String[] args) {
    
    int numero = 5;

    System.out.println(numero);

    numero = - numero; /*Negando valor aritmético */

    System.out.println(numero);

    numero = numero * -1; /*Transformando numero negativo em positivo */

    System.out.println(numero);

    /* INCREMENTO E DECREMENTO */

    int numero1 = 6;

    System.out.println(numero1);

    numero1++; /* incremento de +1 (pode ser: numero = numero +1) */

    System.out.println(numero1);

    numero1 = numero1 + 2;

    System.out.println(numero1);

    System.out.println(++ numero1); /* incrementando na impressão - sinal antes - **este tipo de alteração ocorre apenas na memória temporária*/

    System.out.println(numero1 ++); /* número será impresso e incrementado. A incrementação só aparecerá em uma próxima impressão. */ 

    System.out.println(numero1);

    boolean variable = true;

    System.out.println(variable);

    System.out.println(!variable); /*Negando temporariamente o valor da variável */

    variable = !variable; /* Forma de inverter o valor permanentemente da variavel */

    System.out.println(variable);

}

}
