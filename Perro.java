public class Perro extends AnimalTerrestre
{
  private String colorCollar;

  public Perro (){}

  public Perro(String nombre, String lugarOrigen, String color, int numPatas, String colorCollar)
  {
    super(nombre, lugarOrigen, color, numPatas);
    this.colorCollar = colorCollar;
  }


  public void setColorCollar(String coloCollar)
  {
    this.colorCollar = coloCollar;
  }

  public String getColorCollar()
  {
    return colorCollar;
  }


  public void hacerTrucos ()
  {
    System.out.println("Me estoy haciendo el muertito");
  }


  @Override
  public String toString()
  {
    return super.toString()+"Perro{Color de Collar:"+colorCollar+"}";
  }
  
}