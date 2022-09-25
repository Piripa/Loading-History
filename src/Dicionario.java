import java.util.HashMap;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Dicionario
{
  /*  
  Método de ler o personagem do arquivo de texto criado por um
  hashmap(dicionario) com o parâmetro de colocar o caminho para chegar no
  arquivo txt 
  */
  public HashMap<String, Personagem> LeitorPersonagem(String caminhoArquivoPersonangem)
  {
    /*Objeto personagens criado para guardar personagem */
    HashMap<String, Personagem> personagens = new HashMap<String, Personagem>();
    /*Leitor de arquivo criado, adicionado um tratamento de exceções. */
    File arquivoPersonagem = new File(caminhoArquivoPersonangem);

    try {
      /*Scanner criado que recebe o arquivo txt para ser lido */
      Scanner escaneadorDeArquivos = new Scanner(arquivoPersonagem, "UTF-8");
      /*Variaveis declaradas */
      String linhaLida = "";
      String linhaNamePerso = "";
      int linhaEnergia = 0;
      /* While utilizado para rodar enquanto houver linha no arquivo. */
      while (escaneadorDeArquivos.hasNextLine())
      {
        /*
        While utilizado para quando ele encontrar o nome PERSONAGEM no arquivo txt,
        sair do segundo while e executar o primeir while ( o que realiza a captura dedados dos personagem) 
        */
        while (!linhaLida.equals("PERSONAGEM"))
        {
          linhaLida = escaneadorDeArquivos.nextLine();

        }
        linhaLida = escaneadorDeArquivos.nextLine(); // Nome:
        linhaNamePerso = escaneadorDeArquivos.nextLine();
        linhaLida = escaneadorDeArquivos.nextLine();// Energia:
        linhaEnergia = Integer.parseInt(escaneadorDeArquivos.nextLine());
        personagens.put(linhaNamePerso, new Personagem(linhaNamePerso, linhaEnergia));
      }

      escaneadorDeArquivos.close();
    } catch (FileNotFoundException exception)
    {
      exception.printStackTrace();
    }

    return personagens;
  }

  /*
  Recebe o caminho para ler, o dicionario de personagens e o scanner para saber
   qual escolha ele irá direcionar 
   */
  public HashMap<String, Capitulos> LeitorCapitulos(String caminhoArquivoCapitulo,
      HashMap<String, Personagem> personagens, Scanner scannerCap)
      {
    /*dicionario de quantos capitulos entrará */
    HashMap<String, Capitulos> caps = new HashMap<String, Capitulos>();
    File arquivoCapitulo = new File(caminhoArquivoCapitulo);

    try
    {
      Scanner escaneadorCapitulos = new Scanner(arquivoCapitulo, "UTF-8");
      while (escaneadorCapitulos.hasNextLine()) {
        String linhaLidaCap = "";

        while (!linhaLidaCap.equals("CAPITULO") && !linhaLidaCap.equals("CAPITULO_COM_IMAGEM") &&!linhaLidaCap.equals("ESCOLHA"))
        {
          linhaLidaCap = escaneadorCapitulos.nextLine();

        }
        if (linhaLidaCap.equals("CAPITULO_COM_IMAGEM"))
        {
          CapituloImagem capitulo = new CapituloImagem(personagens,scannerCap,escaneadorCapitulos);
          caps.put(capitulo.getNome(),capitulo);
          linhaLidaCap = "";

        }
        else if (linhaLidaCap.equals("CAPITULO"))
        {
          Capitulos capitulo = new Capitulos(personagens,scannerCap,escaneadorCapitulos);
          caps.put(capitulo.getNome(),capitulo);

          linhaLidaCap = "";
        }
        else if (linhaLidaCap.equals("ESCOLHA"))
        {
          lerEscolhas(caps, escaneadorCapitulos);
          linhaLidaCap = "";
        }
      }

      escaneadorCapitulos.close();
    }
    catch (FileNotFoundException exception)
    {
      exception.printStackTrace();
    }

    return caps;
  }



  /*metodo de ler escolhar que recebe como parametro o dcionario de capitulos e o scanneador de capitulos */
  private void lerEscolhas(HashMap<String, Capitulos> caps, Scanner escaneadorCapitulos)
  {

    String linhaOrigem = "";
    String linhaName = "";
    String linhaDestino = "";
    String linhaLidaEscolhas = "";

    linhaLidaEscolhas = escaneadorCapitulos.nextLine(); // Escolha Origem
    linhaOrigem = escaneadorCapitulos.nextLine();
    linhaLidaEscolhas = escaneadorCapitulos.nextLine(); // Qual será a escolha
    linhaName = escaneadorCapitulos.nextLine();
    linhaLidaEscolhas = escaneadorCapitulos.nextLine(); // Destino
    linhaDestino = escaneadorCapitulos.nextLine();
    /* variavel que recebe uma a escolha e para qual capitulo vai. */
    Escolha opcao = new Escolha(linhaName, caps.get(linhaDestino));
    /*
    o capitulo que que está e apartir da opção escolhida vai para o capitulo
    referenciado pela escolha.
    */
    caps.get(linhaOrigem).addEscolhas(opcao);
  }
}