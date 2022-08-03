import java.util.Scanner;
public class Capitulos {
    String nome,texto,escolha1,escolha2;
    Personagem personagem;
    int quantidade;
    Scanner input;
    Capitulos(String nome,String texto,String escolha1,String escolha2,Personagem personagem,int quantidade, Scanner input){
        this.nome = nome;
        this.texto = texto;
        this.escolha1 = escolha1;
        this.escolha2 = escolha2;
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
    }
    int escolher(){
        int opcao = -1;
        if(this.escolha1 != null || this.escolha2 != null){
            while(opcao == -1){
                String desejo = input.nextLine();
                if (desejo.equalsIgnoreCase(escolha1)){
                    opcao=1;
                }
                else if(desejo.equalsIgnoreCase(escolha2)){
                    opcao=2;
                }
                else{
                    System.out.println("Opção Incorreta!\nDigite a opção correta:");
                }
            }
        }
            
        return opcao;
    }
}
