/**
* @autor Equipo B
*/
public class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    Gerente ger=new Gerente();
    System.out.println(ger);
    ger.setNombre("Romina Perez");
    ger.setNumEmpleado(8888);
    ger.setSueldo(35_000);
    System.out.println(ger);
    System.out.println(ger.getNombre());
    ger.setPresupuesto(90_000);
    System.out.println(ger);

    Gerente ger2=new Gerente("Samuel Torres ",58451,98_588,25_000);
    System.out.println(ger2);

    Ballena ballena1=new Ballena();
    ballena1.setNombre("movidick");
    System.out.println(ballena1.getNombre());

    System.out.println("#########ACTIVIDAD EXTRA#########");

    Ballena ballena2 = new Ballena("Eugenio", "El mar", "Azul", 2, 100);
    System.out.println(ballena2);

    Perro perro1 = new Perro("Firulais", "Casa", "Cafe", 4, "Rojo");
    System.out.println(perro1);

    Pajaro pajaro1 = new Pajaro("Poncho", "Montaña", "Amarillo", 2, "Generalista");
    System.out.println(pajaro1);

  }
}