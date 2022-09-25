import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class Capitulos {
  private String nome, texto;
  protected ArrayList<Escolha> escolhas; /* ArrayList das minhas escolhas, poderei criar e adicionar quantas escolhas */
  private Personagem personagem;
  private int variacaoEnergy;
  private Scanner input;

  protected Capitulos(){}

  /*  
  Nome capitulo, texto do capitulo, Personagem da classe personagem, quantidade
  de energia que irá ganhar ou perder, Scanner que irá receber junto 
  */
  public Capitulos(String nome, String texto, Personagem personagem, int quantidade, Scanner input) 
  {
    this.nome = nome;
    this.texto = texto;
    this.escolhas = new ArrayList<>(); // Parametrizando as escolhas com o Array de escolhas criado de cada capítulo
    this.personagem = personagem;
    this.variacaoEnergy = quantidade;
    this.input = input;
  }

  
  public void mostrar() 
  {
    System.out.println("----------------------------------------");
    System.out.println(this.nome);
    System.out.println();
    this.personagem.energy(this.variacaoEnergy); 
    // O personagem criado.energy que é o método criado na Classe             
    // Personagem para o valor dele ser alterado.
    System.out.println();
    System.out.println(this.texto);
    if (this.escolhas != null) 
    {
    /*  
    For each escolha da class Escolha vai receber de cada item do
    arraylist(escolhas) e vai printar embaixo.
    .texto para retornar só a parte string do item.
    */
    for (Escolha escolha : escolhas) 
    {
    System.out.println("-" + escolha.getTexto());
    }
    /*  
    this.escolhas recebe o novo array das escolhas do capitulo referenciando e
    verifica seu tamanho pra ver se é maior que zero
    se for maior que zero, ele pega uma varíavel ID = método escolher
    this.escolhas do array do capitulo ver a opção correta para referencia no
    proximo capitulo para printar
    */
    if (this.escolhas.size() > 0) 
    {
      int Id = escolher();
      this.escolhas.get(Id).getProximo().mostrar();
    }
      
    }
  }
  
  /*  Aqui que acontece a mágica das escolhas */
  private int escolher()
  {
    int opcao = -1;
    /*  
    Enquanto as opção forem -1 vai rodar o while, primeiramente os valores do
    array tem que ser diferente de nulo, ou seja, tem que haver conteudo
     */
    while (opcao == -1) 
    {
      if (this.escolhas != null) 
      {
        /*  
        Pergunta a opção que vai vir do scanner que recebeu a resposta do scaner da
        main e adiciona a varíavel desejo.
        */
        System.out.print("Digite a opção correta:");
        String desejo = input.nextLine();
        /*  
        Enquanto i for menor que o tamnho do array de escolhas, o for vai rodar e ele
        vai adicionando 1 a cada vez que roda.
        */
        for (int i = 0; i < escolhas.size(); i++) 
        {
          /*
          Se o valor de desejo for igual ao escolhas que está no array( por isso o
          escolhas.get(i).texto) pois vai pegar a parte string.
          */
          if (desejo.equalsIgnoreCase(escolhas.get(i).getTexto())) 
          {
            opcao = i;
          }
        }
      }
    }
    // Vai retornar o lugar que está no arraylist
    return opcao;
  }

  public Capitulos(HashMap<String, Personagem> personagens, Scanner scannerCap, Scanner escaneadorCapitulos) 
  {
    this.ler(personagens, scannerCap, escaneadorCapitulos);
    this.escolhas = new ArrayList<Escolha>();
  }

  protected void ler(HashMap<String, Personagem> personagens,
                    Scanner scannerCap, 
                    Scanner escaneadorCapitulos) 
  {
    this.input = scannerCap;
    String linhaLidaCap = "";
    linhaLidaCap = escaneadorCapitulos.nextLine(); // Nome do Capitulo
    this.nome = escaneadorCapitulos.nextLine();
    linhaLidaCap = escaneadorCapitulos.nextLine(); // Conteúdo ou Texto
    this.texto = escaneadorCapitulos.nextLine();
    linhaLidaCap = escaneadorCapitulos.nextLine(); // Personagem
    this.personagem = personagens.get(escaneadorCapitulos.nextLine());
    linhaLidaCap = escaneadorCapitulos.nextLine();// Variação de energia
    this.variacaoEnergy = Integer.parseInt(escaneadorCapitulos.nextLine());

  }
  public void addEscolhas(Escolha escolha) 
  {
    this.escolhas.add(escolha);
  }

  public String getNome() 
  {
    return this.nome;
  }

}
