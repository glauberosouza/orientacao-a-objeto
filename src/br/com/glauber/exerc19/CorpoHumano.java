package br.com.glauber.exerc19;
public class CorpoHumano {

    Cabeca cabeca;
    Tronco tronco;
    MembroSuperior membroSuperior;
    MembroInferior membroInferior;
    Boca boca;

    public CorpoHumano() {
    }
    public void caminhar() {
        System.out.println("ESTOU CAMINHANDO!");
    }

    public void cumprimentar() {
        System.out.println("BOM DIA! ");
    }
    public void composicaoDoCorpo(){
        System.out.println("AS COMPOSIÇÕES DO CORPO SÃO: " +
                "CABEÇA, \n TRONCO,MEMBROS SUPERIORES, \n MEMBROS INFERIORES E BOCA. ");
    }
}



