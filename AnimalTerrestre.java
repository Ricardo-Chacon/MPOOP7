public class AnimalTerrestre extends Animal
{
  private int numPatas;

  
  public AnimalTerrestre(){}

  public AnimalTerrestre(String nombre, String lugarOrigen, String color, int numPatas)
  {
    super(nombre, lugarOrigen, color);
    this.numPatas = numPatas;
  }


  public void setNumPatas(int numPatas)
  {
    this.numPatas = numPatas;
  }

  public int getNumPatas()
  {
    return numPatas;
  }


  public void correr()
  {
    System.out.println("Estoy corriendo");
  }

  @Override
  public void comer()
  {
    System.out.println("Me comí 1 Kg, de croquetas");
  }


  @Override
  public String toString()
  {
    return super.toString()+"AnimalTerrestre{Número de patas:"+numPatas+"}";
  }
  
}