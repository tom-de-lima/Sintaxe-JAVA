package Java_Basico.Anatomia_de_Classes;

public class AnatomiaClasses {
    
    public static void main(String[] args) { /*método único que tem a função de inicializar o programa */
        
        System.out.println("Olá Mundo!");

        System.out.println(" ");

        /* DECLARAÇÃO DE VARIÁVEIS: */

        String meuNome = "Neto1";

        int idade = 38;

        boolean verdadeira = false;

        idade = 39; /*manipulação de variável existente */

        /*DECLARANDO MÉTODOS: */

        String primeiroNome = "Lima";
        String segundoNome = "Neto";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);

    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) { /*Declarado fora da main() */

        return "Resultado do método: " + primeiroNome.concat(" ").concat(segundoNome); /*Observe as formas de concatenação ".concat() ou "+" */
        
    }

}
