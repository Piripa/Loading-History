import java.util.Scanner;
public class Capitulos {
    String nome,texto;
    String[] escolhas;
    Personagem personagem;
    int quantidade;
    Scanner input;
    //String[] vararray = new String[2];
        Capitulos(String nome,String texto,String[] escolhas,Personagem personagem,int quantidade, Scanner input){  
        this.nome = nome;
        this.texto = texto;
        this.escolhas = escolhas;
        this.personagem = personagem;
        this.quantidade = quantidade;
        this.input = input;
    }
    void mostrar(){
        System.out.println("----------------------------------------");
        System.out.println(this.nome);
        System.out.println();
        this.personagem.energy(this.quantidade);
        System.out.println();
        System.out.println(this.texto);
        if (this.escolhas!= null){
            for(String escolha : escolhas){
                System.out.println("-"+escolha);
            }
        }
    }
    int escolher(){
        int opcao = -1;
        //while(opcao == -1){
                if(this.escolhas != null){
                    String desejo = input.nextLine();
                    for(int i = 0; i < escolhas.length;i++){
                        if (desejo.equalsIgnoreCase(escolhas[i])){
                            opcao = i;
                        }
                    }                   
                    //System.out.println("Digite a opção correta:");
                }
           // }
            return opcao;
        }
    }

