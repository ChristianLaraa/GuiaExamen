public class Main {
    public static void main(String[] args) {

      Alumno alum1  = new Alumno();
      Alumno alum2 = new Alumno(320084225, "Christian", "Lara");

      /*int id = alum2.getId();*/
        System.out.println("La id del alumno 2 es: " + alum2.getId());
        System.out.println("El nombre es: " + alum2.getNombre());
        System.out.println("El apellido es: " + alum2.getApellido());

        System.out.println("---------------------------------");

        alum1.setId(32002531);
        alum1.setNombre("Pablo");
        alum1.setApellido("kiko");
        System.out.println("La id del alumno 1 es: " + alum1.getId());
        System.out.println("El nombre del alumno 1 es: " + alum1.getNombre());
        System.out.println("El apellido del alumno 1 es: " + alum1.getApellido());

        System.out.println("---------------------------------");
        alum2.setId(58662453);
      System.out.println("La id del alumno 2 es: " + alum2.getId());  //CAMBIO DE VALOR
      System.out.println("El nombre es: " + alum2.getNombre());
      System.out.println("El apellido es: " + alum2.getApellido());

      System.out.println("---------------------------------");


    }
}