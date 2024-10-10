public class Perro {
    private String nombre;
    private String raza;
    private int edad;


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }



    public void comer(String tipo, double gramos){
        System.out.println("Estoy comiendo " + gramos + " gramos de " + tipo);
    }

    public String ladrar(){
        return "Guau Guau";
    }
}
