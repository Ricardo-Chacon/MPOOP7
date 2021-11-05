public class AnimalAereo extends Animal{
  private int numAlas;

  
  public AnimalAereo(){}

  public AnimalAereo(String nombre, String lugarOrigen, String color, int numAlas)
  {
    super(nombre, lugarOrigen, color);
    this.numAlas = numAlas;
  }


  public void setNumAlas(int numAlas)
  {
    this.numAlas = numAlas;
  }

  public int getNumAlas()
  {
    return numAlas;
  }


  public void correr()
  {
    System.out.println("Estoy volando");
  }

  @Override
  public void comer()
  {
    System.out.println("Comí alpiste");
  }


  @Override
  public String toString()
  {
    return super.toString()+"AnimalAereo{Número de alas:"+numAlas+"}";
  }
  
}