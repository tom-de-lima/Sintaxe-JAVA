package Java_Basico.Escopo;

public class Escopo { /*Criação de uma classe com atributos e métodos */

    /* Ambas as variáveis abaixo são de escopo de classe (classe "Escopo") portanto, podem ser acessadas em qualquer parte da classe. */
    int algumValor = 100; 
    String algumTexto = "Oh my God!";

    public int somar(int num1, int num2) {
        int resultado = num1 + num2 + algumValor; /*Esta variável é apenas local. Seu escopo permite que seja acessada apenas dentro do método. */
        System.out.println("Resultado = " + resultado);
        return resultado;
    }

    public int umaSubtracaoQualquer(int num) {
        int resultado1 = algumValor - num; 
        System.out.println("Resultado de uma subtração qualquer = " + resultado1);
        return resultado1;
    }
    
    public static void main(String[] args) { /*Método que inicia o programa e será usado para testar o escopo de variáveis */

       Escopo valor = new Escopo(); /*Criação de um objeto do tipo "Escopo" com o nome de "valor" */

       valor.somar(1, 2); /*Cahamada de um método da classe "Escopo" no objeto "valor" que herda todos os atributos e métodos da classe "Escopo" */

       
       valor.umaSubtracaoQualquer(99);


    


       
        
        }


}
