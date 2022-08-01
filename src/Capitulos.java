public class Capitulos {
    String nome,texto,escolha1,escolha2;
    Personagem personagem;
    int quantidade;
    Capitulos(String nome,String texto,String escolha1,String escolha2,Personagem personagem,int quantidade){
        this.nome = nome;
        this.texto = texto;
        this.escolha1 = escolha1;
        this.escolha2 = escolha2;
        this.personagem = personagem;
        this.quantidade = quantidade;
    }
    void mostrar(){
        System.out.println(this.nome);
        System.out.println(this.texto);
    }
}
