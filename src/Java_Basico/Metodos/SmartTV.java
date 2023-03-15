package Java_Basico.Metodos;

public class SmartTV {
    
    boolean ligada = false;
    int canal = 1;
    int volume = 12;

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

    public void AumentarVolume() {
        volume++;
        System.out.println("Aumentando o volume para: " + volume);
    }

    public void DiminuirVolume() {
        volume--;
        System.out.println("Diminuindo o volume para: " + volume);
    }

    public void AumentarCanal() {
        canal++;
        System.out.println("Canal atual: " + canal);
    }

    public void DiminuirCanal() {
        canal--;
        System.out.println("Canal atual: " + canal);
    }

    public void EscolherCanal(int novoCanal) {
        canal = novoCanal;
        System.out.println("Canal atual: " + canal);
    }

}
