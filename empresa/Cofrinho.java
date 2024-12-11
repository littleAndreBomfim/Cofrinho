package empresa;

import java.util.ArrayList;

//classe cofrinho sendo o nosso "Estoque" com o ArrayList mantendo um array de todas as nossas moedas já coletadas
public class Cofrinho {
    protected ArrayList<Moeda> listaMoedas =new ArrayList<>() ;

    //adiciona uma moeda no cofrinho
    public void adiconar(Moeda m){
        this.listaMoedas.add(m);
    }

    //remove uma moeda no cofrinho
    public void remover(Moeda m){
       this.listaMoedas.remove(m);
    }
    //lista todas as moedas que o usuário adicionou
    public void listarMoedas(){
        if (listaMoedas.isEmpty()){
            System.out.println("O seu cofrinho está vazio!!!!!!");
        } else{
            for (Moeda moeda : listaMoedas){
                moeda.info(); //Chama o info de cada uma das moedas
            }
        }
    }

    //converte o total de moedas que o usuário quis colocar no cofrinho
    public double totalMoedasConvertidas(){
        double totalMoedasConvertidas = 0;
        for (Moeda moeda : listaMoedas){
            totalMoedasConvertidas += moeda.converterParaReal();
        }
        return totalMoedasConvertidas;
    }

}

