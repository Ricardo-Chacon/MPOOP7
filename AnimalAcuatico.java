public class AnimalAcuatico extends Animal
{
  private int aletas;


  public AnimalAcuatico(){}

  public AnimalAcuatico(String nombre, String lugarOrigen, String color, int aletas){
  
    super(nombre, lugarOrigen, color);
    this.aletas = aletas;}
  


  public void setAletas(int aletas)
  {
    this.aletas = aletas;
  }

  public int getAletas()
  {
    return aletas;
  }


  public void nadar()
  {
    System.out.println("Estoy nadando");
  }

  @Override
  public void comer()
  {
    System.out.println("Me comí 100 peces");
  }


  @Override
  public String toString()
  {
    return super.toString()+"AnimalAcuatico{Número de aletas:"+aletas+"}";
  }
}
