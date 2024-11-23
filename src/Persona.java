public class Persona {

    //Atributos (Caracteristicas)
    private int num;
    private String nombre;
    private int edad;

    //Constructor vacio
    public Persona(){

    }

    //Constructor con todos los parametros
    public Persona(int num, String nombre, int edad){

        this.num = num;
        this.nombre = nombre;
        this.edad = edad;
    }

    //Metodos getters and setters
    public int getNum(){
        return num;
    }
    public void setNum(int num){
        this.num = num;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre =nombre;
    }
    public int getEdad(){
        return edad;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
}
