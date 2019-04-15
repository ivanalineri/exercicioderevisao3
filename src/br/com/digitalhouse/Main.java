package br.com.digitalhouse;

public class Main {

    public static void main(String[] args) {
        Estoque estoque = new Estoque("Algodão", 10, 2);
        estoque.mudarNome("Algodão Verde");
        estoque.darBaixa(5);
        estoque.mdrQtdMinima(3);
        System.out.println("precisa repor o estoque? " + estoque.precisaRepor());
        System.out.println(estoque.mostra());



    }
}
