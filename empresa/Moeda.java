package empresa;

//classe abstrata para a criação das outras moedas
public abstract class Moeda {
    //protected foi usado para não ter problemas com outras classes não implementadas com a classe abstrata Moeda
    protected double valor;
    protected String moeda;

    // Classe para 'forçar' as classes filhas a terem os metodos
    public Moeda(double valor, String moeda){
        this.valor = valor;
        this.moeda = moeda;
    }
    // Classe para exibir nas outras classes implementadas com a infromação da moeda
    public abstract void info();
    public abstract double converterParaReal();
}
