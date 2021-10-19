public abstract class Animal {

    //Atributos
    String nome;
    double peso;

    //Construtores
    public Animal(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
        quantidadeDeRacao(this.peso);
    }

    //Comportamento
    String som(String som){

        return som;
    }

    double quantidadeDeRacao(double peso){
        if(peso <= 3){
            return peso * 0.1;
			
        }else if(peso > 3){
            return peso * 0.1;
			
        }else if(peso <= 4){
            return peso * 0.4;
			
        }else if(peso > 4 || peso <= 12){
            return peso * 0.45;
			
        }
        return 0;
    }
}