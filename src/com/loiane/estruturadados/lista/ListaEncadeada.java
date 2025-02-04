package com.loiane.estruturadados.lista;

public class ListaEncadeada<T> {

    private No<T> inicio;
    private int tamanho = 0;

    public void adiciona(T elemento) {
        No<T> celula = new No<T>(elemento);
        this.inicio = celula;
        this.tamanho++;
    }

    public int getTamanho() {
        return this.tamanho;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("ListaEncadeada [inicio=").append(inicio).append("]");
        return builder.toString();
    }

}
