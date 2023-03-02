import java.util.Scanner;

public class Excecao {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        Glass copo = new Glass(300);
        CopoTermico copoTermico = new CopoTermico(500, 20);
        ;
        try{
            copo.encher(300);
            copoTermico.encher(600);
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("Execução terminad");
    }
}

class Glass {

    protected int tamanho; // em ml
    protected int liquido; // em ml

    public Glass(int tamanho){
        this.tamanho = tamanho;
        this.liquido = 0;
    }

    public void encher(int quantidade) throws IllegalArgumentException{
        if(quantidade < 0){
            IllegalArgumentException erro = new IllegalArgumentException("não existe quantidade negativa.");
            throw erro;
        
        }
        int total;
        
        if(quantidade + this.liquido > tamanho){
            total = tamanho;
        }else{
            total = quantidade + this.liquido;
        }

        this.liquido = total;

        System.out.println("encher executado");
    }

}
class CopoTermico extends Glass implements utilidade{

    protected int temperatura;

    public CopoTermico(int tamanho, int temperatura){
        super(tamanho);
        this.temperatura = temperatura;
    }
    @Override
    public String descricao(){
        return (
            "é um copo termico com " + this.tamanho +
            " ml de capacidade e nele contem " + this.liquido +
            " ml de liquido, em que ele guarda a " + this.temperatura +
            " graus celcius"
        );
    }
}

interface utilidade{
    public String descricao();
}

