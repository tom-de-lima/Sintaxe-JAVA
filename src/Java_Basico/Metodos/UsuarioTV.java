package Java_Basico.Metodos;

public class UsuarioTV {
    
    public static void main(String[] args) {
        
        SmartTV SmartTV = new SmartTV(); /* Criando um novo objeto do tipo "SmartTV" */

        System.out.println("TV ligada? " + SmartTV.ligada);
        System.out.println("Canal atual: " + SmartTV.canal);
        System.out.println("Volume atual: " + SmartTV.volume);

        SmartTV.ligar(); /*Chamada do método ligar */

        System.out.println("TV ligada? " + SmartTV.ligada);

        SmartTV.desligar(); /*Chamada do método desligar() alterando o estado do objeto SmartTV */

        System.out.println("TV ligada? " + SmartTV.ligada);

        SmartTV.AumentarVolume();
        SmartTV.AumentarVolume();
        SmartTV.AumentarVolume();
        SmartTV.DiminuirVolume();

        System.out.println("Canal atual: " + SmartTV.canal);

        SmartTV.AumentarCanal();
        SmartTV.AumentarCanal();
        SmartTV.AumentarCanal();
        SmartTV.DiminuirCanal();

        SmartTV.EscolherCanal(34);
        SmartTV.EscolherCanal(15);


    }

}
