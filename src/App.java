import java.util.HashMap;
import java.util.Scanner;

public class App {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      Dicionario leitor = new Dicionario();
      HashMap<String,Personagem> recebePersonagem = leitor.LeitorPersonagem("rsc/DicPersonagem.txt");
      Personagem perso = recebePersonagem.get("Enzo");
      HashMap<String,Capitulos> receberCapitulos = leitor.LeitorCapitulos("rsc/Dicapitulos.txt", recebePersonagem, input);
      Capitulos raiz = receberCapitulos.get("Piloto");

      // Apresentação dos Capítulos//
      // Capitulos raiz = new Capitulos("Piloto",
      //       "O ano era 2094... era aniversário de Enzo, que acabara de chegar da escola," +
      //             " quando dá de encontro com seu novo video game o Playstation XV o qual vem junto com um óculos de realidade virtual."
      //             +
      //             "O Playstation XV junto com a nova tecnologia 10D faz o usuário viver intessamente o game, como estivesse dentro dele. "
      //             +
      //             "Enzo ao se conectar com seu vídeo game não percebe que estava chovendo muito forte, e com isso continua a jogar, "
      //             +
      //             "porém um raio atinge sua casa e consequentemente acontece uma pane no aparelho que o suga para dentro do jogo."
      //             +
      //             "Ele, ao perceber que está dentro do jogo, avista duas opções em sua frente PLAY ou EXIT.\nDigite a opção que enzo irá escolher.",
      //       perso,
      //       50,
      //       input);
      // Capitulos cap3 = new Capitulos("As portas não mentem",
      //       "Enzo escolhe a opção de dar Play... Lá ele encontra um só uma porta que ao ser aberta o leva para um labirinto."
      //             +
      //             "Então, ele decide abrir a porta e dá de cara com dois caminhos distintos." +
      //             "Enzo percebe que está com uma barra de energia de 50% e não sabe o que vai acontecer com ela." +
      //             "Com isso, ele tem que dar o destino de escolher uma das portas, a da DIREITA ou da ESQUERDA\nDigite a porta que Enzo irá escolher",
      //       perso,
      //       25,
      //       input);
      Capitulos cap5 = new Capitulos("Pequena vitória",
            "Enzo escolhe a porta da direita que ao abrir-lá encontra uma reta com uma luz no fim... " +
                  "Ao chegar nessa Luz, ele dá de encontro com Zara\nZara é uma NPC do jogo que o acompanhará durante toda sua jornada no labirinto\n"
                  +
                  "Ao iniciar o papo com Zara, ela lhe informa que o labirinto é cheio de armadilhas e que ele deveria ter cuidado "
                  +
                  "e, também, que o próximo obstáculo será a escolha de duas escadas que o levará para pontos diferentes."
                  +
                  "Ao andar mais um pouco, Enzo e Zara dão de cara com duas escadas, uma que sobe e outra que desce," +
                  "e então Zara o pergunta, você vai subir ou vai descer?\nDigite se Enzo irá subir ou Descer",
            perso,
            25,
            input);
      Capitulos cap6 = new Capitulos("Chegada ao topo",
            "Enzo escolhe subir, e ao subir toda a escadaria percebe que chegou á cima das nuvens...",
            perso,
            25,
            input);
      Capitulos cap7 = new Capitulos("Inferno à diante",
            "Enzo escolhe descer, e ao descer toda a escadaria percebe que chegou ao centro da terra," +
                  "o qual é supreendido por larva e perde quase toda a sua energia" +
                  "mal sabe ele que Zara continua viva, pois próxima da larva ela ganha energia",
            perso,
            -100,
            input);
      Capitulos cap4 = new Capitulos("A primeira escolha errada",
            "Enzo escolhe a porta da esquerda, que o faz cair em um buraco bem profundo..." +
                  "Depois de alguns segundos caindo, sua tela fica preta e mostra que ele zerou sua energia e,consequentemente,"
                  +
                  "ele perdeu o jogo. Então, Enzo consegue sair de dentro do game e irritado quebra o Playstation XV," +
                  "joga-o pela janela e vai dormir não querendo relembrar o que viveu no game.",
            perso,
            -75,
            input);
      Capitulos cap2 = new Capitulos("A decepção",
            "Enzo selecionou a opção Exit e com isso conseguiu sair do jogo, consequentemente," +
                  "saiu de dentro do game e quando voltou já era tarde da noite e sua família já estava dormindo. " +
                  "Enzo então decidiu desligar completamente seu Playstation XV e foi para o quarto dormir. " +
                  "Em sua cabeça só havia pensamentos de como teria acontecido isso, mas é algo que nunca saberás...",
            perso,
            -50,
            input);

      // nomecapitulo.nome arraylist.add(new ClassConstrutor(Parâmetros do Objeto))
      // Referenciando as respostas com os capítulos.
     
      //raiz.escolhas.add(new Escolha("Play", cap3));
      raiz.escolhas.add(new Escolha("Exit", cap2));
      //cap3.escolhas.add(new Escolha("Direita", cap5));
      //cap3.escolhas.add(new Escolha("Esquerda", cap4));
      cap5.escolhas.add(new Escolha("Subir", cap6));
      cap5.escolhas.add(new Escolha("Descer", cap7));
      // Raiz da árvore sendo mostrada.
      raiz.mostrar();

      input.close();
   }
}
