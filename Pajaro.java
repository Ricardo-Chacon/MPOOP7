public class Pajaro extends AnimalAereo
{
  private String tipoPico;

  public Pajaro(){}

  public Pajaro(String nombre, String lugarOrigen, String color, int numAlas, String tipoPico)
  {
    super(nombre, lugarOrigen, color, numAlas);
    this.tipoPico = tipoPico;
  }


  public void setTipoPico(String tipoPico)
  {
    this.tipoPico = tipoPico;
  }

  public String getTipoPico()
  {
    return tipoPico;
  }


  public void recolectarRamas()
  {
    System.out.println("Recolecté 50 ramas");
  }


  @Override
  public String toString()
  {
    return super.toString()+"Pajaro{Tipo de pico:"+tipoPico+"}";
  }
  
}