import java.util.Scanner;
public class App {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            Personagem perso = new Personagem("Enzo",50);
            Personagem perso2 = new Personagem("Zara",50);
                
                        
            System.out.println("------------------------------------------------ " );
            System.out.println("O ano era 2094... era aniversário de Enzo, que acabara de chegar da escola,"+
                                " quando dá de encontro com seu novo video game o Playstation XV o qual vem junto com um óculos de realidade virtual."+
                                "O Playstation XV junto com a nova tecnologia 10D faz o usuário viver intessamente o game, como estivesse dentro dele. "+
                                "Enzo ao se conectar com seu vídeo game não percebe que estava chovendo muito forte, e com isso continua a jogar, "+
                                "porém um raio atinge sua casa e consequentemente acontece uma pane no aparelho que o suga para dentro do jogo."+
                                " Ele, ao perceber que está dentro do jogo, avista duas opções em sua frente PLAY ou EXIT. ");
            System.out.println("Enzo pensa e irá escolher a opção..?");
            System.out.println("----------------------------------------");
            System.out.println("Digite a opção que Enzo irá escolher.");
            String first = input.nextLine();
            if(first.equalsIgnoreCase("Play")){
                System.out.println("Enzo escolhe a opção de dar Play... Lá ele encontra um só uma porta que ao ser aberta o leva para um labirinto."+
                                    "Então, ele decide abrir a porta e dá de cara com dois caminhos distintos."+
                                    "Enzo percebe que está com uma barra de energia de 50% e não sabe o que vai acontecer com ela."+
                                    "Com isso, ele tem que dar o destino de escolher uma das portas, a da DIREITA ou da ESQUERDA");
                System.out.println("Digite a porta que Enzo irá escolher.");
                String firstTwo = input.nextLine();
                if(firstTwo.equalsIgnoreCase("Direita")){
                    System.out.println("------------------------------------");
                    perso.energy(+25);
                    System.out.println("------------------------------------");
                    System.out.println("Enzo escolhe a porta da direita que ao abrir-lá encontra uma reta com uma luz no fim... "+
                                        "Ao chegar nessa Luz, ele dá de encontro com Zara");
                                        System.out.println();
                                        System.out.println("Zara é uma NPC do jogo que o acompanhará durante toda sua jornada no Labirinto ");
                                        System.out.println();
                                        System.out.println("Ao iniciar o papo com Zara, ela lhe informa que o labirinto é cheio de armadilhas e que ele deveria ter cuidado "+
                                        "e, também, que o próximo obstáculo será a escolha de duas escadas que o levará para pontos diferentes."+
                                        "Ao andar mais um pouco, Enzo e Zara dão de cara com duas escadas, uma que sobe e outra que desce,"+
                                        "e então Zara o pergunta, você vai subir ou vai descer?");
                    System.out.println("Diga se Enzo irá SUBIR ou DESCER");
                    String firstThree = input.nextLine();
                    if(firstThree.equalsIgnoreCase("Subir")){
                        System.out.println("----------------------------------");
                        perso.energy(+25);
                        System.out.println("------------------------------------");
                        System.out.println("Enzo escolhe subir, e ao subir toda a escadaria percebe que chegou á cima das nuvens...");
                    }                 
                    else if(firstThree.equalsIgnoreCase("Descer")){
                        System.out.println("-------------------------------------");
                        perso2.energy(+25);
                        System.out.println("---------------------------------------");
                        perso.energy(-50);
                        System.out.println("--------------------------------------- ");
                        System.out.println("Enzo escolhe descer, e ao descer toda a escadaria percebe que chegou ao centro da terra,"+
                                            "o qual é supreendido por larva e perde toda a sua energia, ou seja, ele perdeu o jogo."+
                                            "Mas,mal sabe ele que Zara continua viva, pois próxima da larva ela ganha energia");
                }       System.out.println("Enzo,curioso fica assistindo o desenrolar do jogo com Zara Sozinha");
             }
             
                else if(firstTwo.equalsIgnoreCase("Esquerda")){
                    System.out.println("----------------------------");
                    perso.energy(-50);
                    System.out.println("----------------------------");
                    System.out.println("Enzo escolhe a porta da esquerda, que o faz cair em um buraco bem profundo..."+
                                        "Depois de alguns segundos caindo, sua tela fica preta e mostra que ele zerou sua energia e,consequentemente,"+
                                        "ele perdeu o jogo. Então, Enzo consegue sair de dentro do game e irritado quebra o Playstation XV,"+
                                        "joga-o pela janela e vai dormir não querendo relembrar o que viveu no game.");            
          }
        }
            else{
                System.out.println("Enzo selecionou a opção Exit e com isso conseguiu sair do jogo, consequentemente,"+ 
                                    "saiu de dentro do game e quando voltou já era tarde da noite e sua família já estava dormindo. "+
                                    "Enzo então decidiu desligar completamente seu Playstation XV e foi para o quarto dormir. "+
                                     "Em sua cabeça só havia pensamentos de como teria acontecido isso, mas é algo que nunca saberás...");
                                     
            }
                 input.close();  
        }             
     } 
 
    
      
    
       