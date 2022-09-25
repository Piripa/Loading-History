public class Escolha 
{
  private String texto;
  private Capitulos proximo;

  /*Texto = escolha , Classe Capitulo e próximo que é o capitulo que será referênciado. */
  public Escolha(String texto, Capitulos proximo) 
  {
    this.texto = texto;
    this.proximo = proximo;
  }

  public String getTexto() 
  {
    return this.texto;
  }

  public Capitulos getProximo() 
  {
    return this.proximo;
  }
}
