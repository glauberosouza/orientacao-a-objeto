package br.com.glauber.exerc26;

import java.util.ArrayList;
import java.util.List;

public class MatrixSimulation {

    private boolean on;

    List<Ator> atores;
    List<Pessoas> qtdPessoasNaMatrix = new ArrayList<>(){{add(professor);
            add(recruta);}
    };
    MulherDeVermelho mulherDeVermelho;
    Professor professor;
    Recruta recruta;

    public MatrixSimulation(int qtdDeAtores) {
        this.recruta = new Recruta();
        this.professor = new Professor();
        this.atores = new ArrayList<>();
        this.mulherDeVermelho = new MulherDeVermelho();

        for (int i = 0; i < qtdDeAtores; i++) {
            this.atores.add(new Ator());
        }
    }

    public boolean ligarASimulacao(boolean simulacaoOn) {
        System.out.print("Simulação online = ");
        return this.on = simulacaoOn;
    }

    public void movimentarAtores() {
        System.out.println("Atores se movimentando ao redor do recruta");
    }

    public boolean insirirMulherNaMatrix() {

        return mulherDeVermelho.acessarAMatrixOn();
    }

    public void executarTesteComRecruta() {
        boolean testeAprovado = true;
        mulherDeVermelho.ativarCapturaDeAtencao();
        if (testeAprovado == true)
            System.out.println("o recruta olhou para a mulher, um dos atores se transforma em agente e ameaçou matar o recruta.");
    }
    public List<Ator> qtsDeAtoresCongelados() {
        return this.atores;
    }

    public int totalPessoasNaMatrix() {
        return qtdPessoasNaMatrix.size();
    }

}