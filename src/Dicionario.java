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
}
