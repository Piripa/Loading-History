import java.util.ArrayList;
import java.util.Scanner;
public class Capitulos {
    String nome,texto;
    ArrayList<Escolha> escolhas;
    Personagem personagem;
    int quantidade;
    Scanner input;
        Capitulos(String nome,String texto,Personagem personagem,int quantidade, Scanner input){  
        this.nome = nome;
        this.texto = texto;
        this.escolhas = new ArrayList<>();
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
            for(Escolha escolha : escolhas){
                System.out.println("-"  +  escolha.texto);                
            }
        if (this.escolhas.size()>0){
           int Id= escolher();
           this.escolhas.get(Id).proximo.mostrar(); 
        }
            
        }
    }
    int escolher(){
        int opcao = -1;
        //while(opcao == -1){
                if(this.escolhas != null){
                    String desejo = input.nextLine();
                    for(int i = 0; i < escolhas.size();i++){
                        if (desejo.equalsIgnoreCase(escolhas.get(i).texto)){
                            opcao = i;
                        }
                    }                   
                    //System.out.println("Digite a opção correta:");
                }
           // }
            return opcao;
        }
    }

