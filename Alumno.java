public class Alumno {

    int id;
    String nombre;
    String apellido;

    public Alumno() {
    }  //CONSTRUCTOR VACIO

    public Alumno(int id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    } //CONSTRUCTOR SOBRECARGADO


    //GETTERS ANS SETTERS
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }   //GETTERS AND SETTERS

    public void mostrarNombre(){
        System.out.println("Hola soy un alumno y se decir mi nombre");

    }


}
