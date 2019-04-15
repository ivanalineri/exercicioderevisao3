package br.com.digitalhouse;

public class Estoque {
    private String nome;
    private int qtdAtual;
    private int qtdMinima;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdAtual() {
        return qtdAtual;
    }

    public void setQtdAtual(int qtdAtual) {
        this.qtdAtual = qtdAtual;
    }

    public int getQtdMinima() {
        return qtdMinima;
    }

    public void setQtdMinima(int qtdMinima) {
        this.qtdMinima = qtdMinima;
    }

    public Estoque(String nome, int qtdAtual, int qtdMinima) {
        this.nome = nome;
        this.qtdAtual = qtdAtual;
        this.qtdMinima = qtdMinima;
    }

    public Estoque(){

    }

    public void mudarNome(String nome){

    }

    public void mdrQtdMinima(int novQtdMinima) {
        qtdMinima = novQtdMinima;
    }

     void repor(int novoQtd){
        qtdAtual += novoQtd;
    }

   void darBaixa(int novoQtd){
        qtdAtual -= novoQtd;
    }

     String mostra(){

         return "Produto: " + this.nome + "Quantidade atual: " + this.qtdAtual + "Quantidade minima: " + this.qtdMinima;

    }

    boolean precisaRepor(){
       return this.qtdAtual <= this.qtdMinima;
    }
}
