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

      raiz.mostrar();

      input.close();
   }
}
