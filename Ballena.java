public class Ballena extends AnimalAcuatico
{
  private int largo;


  public Ballena(){}

  public Ballena(String nombre, String lugarOrigen, String color, int aletas, int largo)
  {
    super(nombre, lugarOrigen, color, aletas);
    this.largo = largo;
  }


  public void setLargo(int largo)
  {
    this.largo = largo;
  }

  public int getLargo()
  {
    return largo;
  }


  public void pelearConPinocho()
  {
    System.out.println("Estoy peleando con pinocho");
  }


  @Override
  public String toString()
  {
    return super.toString()+"Ballena{largo:"+largo+"}";
  }
}