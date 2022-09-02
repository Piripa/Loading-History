import java.util.HashMap;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Dicionario {
    HashMap<String,Personagem> LeitorPersonagem(String caminhoArquivoPersonangem ){
        
        HashMap<String,Personagem> personagens = new HashMap<String,Personagem>();
        File arquivoPersonagem = new File(caminhoArquivoPersonangem);

        try {
            Scanner escaneadorDeArquivos = new Scanner(arquivoPersonagem, "UTF-8");
            String linhaLida = "";
            String linhaNamePerso = "";
            int linhaEnergia=0;
            while(escaneadorDeArquivos.hasNextLine()){

                while(!linhaLida.equals("PERSONAGEM"))
                {
                    linhaLida = escaneadorDeArquivos.nextLine();
                    
                }
                    linhaLida = escaneadorDeArquivos.nextLine(); //Nome:
                    linhaNamePerso = escaneadorDeArquivos.nextLine();
                    linhaLida = escaneadorDeArquivos.nextLine();//Energia:
                    linhaEnergia = Integer.parseInt(escaneadorDeArquivos.nextLine());
                    personagens.put(linhaNamePerso, new Personagem(linhaNamePerso, linhaEnergia));
            }

            escaneadorDeArquivos.close();
        } 
        catch (FileNotFoundException exception) {
            exception.printStackTrace();
        }
        
        return personagens;
     }
HashMap<String,Capitulos> LeitorCapitulos(String caminhoArquivoCapitulo,HashMap<String,Personagem>personagens,Scanner scannerCap ){
        
    HashMap<String,Capitulos> caps = new HashMap<String,Capitulos>();
    File arquivoCapitulo = new File(caminhoArquivoCapitulo);

    try {
        Scanner escaneadorCapitulos = new Scanner(arquivoCapitulo, "UTF-8");
        String linhaLidaCap = "";
        String linhaNameCap = "";
        String linhaTextoCap = "";
        String linhaPersoCap = "";
        int linhaVariaEner = 0;
        while(escaneadorCapitulos.hasNextLine()){

            while(!linhaLidaCap.equals("CAPITULO"))
            {
                linhaLidaCap = escaneadorCapitulos.nextLine();
                
            }
            linhaLidaCap = escaneadorCapitulos.nextLine(); // Nome do Capitulo
            linhaNameCap = escaneadorCapitulos.nextLine();
            linhaLidaCap = escaneadorCapitulos.nextLine(); // Conteúdo ou Texto
            linhaTextoCap = escaneadorCapitulos.nextLine();
            linhaLidaCap = escaneadorCapitulos.nextLine(); //Personagem
            linhaPersoCap = escaneadorCapitulos.nextLine();
            linhaLidaCap = escaneadorCapitulos.nextLine();//Variação de energia
            linhaVariaEner = Integer.parseInt(escaneadorCapitulos.nextLine());
            caps.put(linhaNameCap, new Capitulos(linhaNameCap, linhaTextoCap, personagens.get(linhaPersoCap), linhaVariaEner,scannerCap));
        }

        escaneadorCapitulos.close();
    } 
    catch (FileNotFoundException exception) {
        exception.printStackTrace();
    }
    
    return caps;
 } 
}