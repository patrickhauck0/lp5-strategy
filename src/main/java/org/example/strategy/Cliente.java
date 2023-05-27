package org.example.strategy;

public class Cliente {
    private float preco;

    public float getPreco() {
        return preco;
    }

    public void somarPreco(float preco1, float preco2) {
        Calculadora calculadora = new Calculadora(preco1, preco2);
        this.preco = calculadora.calcular(new OperacaoSomar());
    }

    public void subtrairPreco(float preco1, float preco2) {
        Calculadora calculadora = new Calculadora(preco1, preco2);
        this.preco = calculadora.calcular(new OperacaoSubtrair());
    }

    public void dividirPreco(float preco1, float preco2) {
        Calculadora calculadora = new Calculadora(preco1, preco2);
        this.preco = calculadora.calcular(new OperacaoDividir());
    }

    public void multiplicarPreco(float preco1, float preco2) {
        Calculadora calculadora = new Calculadora(preco1, preco2);
        this.preco = calculadora.calcular(new OperacaoMultiplicar());
    }

    public void calcularMediaPrecos(float preco1, float preco2) {
        Calculadora calculadora = new Calculadora(preco1, preco2);
        this.preco = calculadora.calcular(new OperacaoMedia());
    }
}
