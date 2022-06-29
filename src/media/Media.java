package media;

public class Media {
    private double total;
    private int qtd;


    public Media adicionar(double valor){
        total += valor;
        qtd ++;
        return this;
    }

    public double getValor(){

    return total / qtd;
    }

    public static Media combinar(Media m1 , Media m2){
        Media resultante = new Media();
        resultante.total = m1.total + m2.total;
        return resultante;
    }

}
