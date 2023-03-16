package superClase;
import java.util.Random;
abstract class Persona {
    private String nombre;
    private boolean estudio;
    private boolean ine;
    private boolean mayorDe18;
    private boolean voto;
    Random aleatorio=new Random();
    public void setNombre(String nombre) {
        this.nombre=nombre;
    }
    public String getNombre() {
        return nombre;
    }
    public void setEstudio() {
        int choice=aleatorio.nextInt(2);
        estudio= choice == 1;
    }
    public boolean getEstudio() {
        return estudio;
    }
    public void setIne() {
        int choice=aleatorio.nextInt(2);
        ine= choice == 1;
    }
    public boolean getIne() {
        return ine;
    }
    public void setMayorDe18() {
        int choice=aleatorio.nextInt(2);
        mayorDe18= choice == 1;
    }
    public boolean getMayorDe18() {
        return mayorDe18;
    }
    public void setVoto() {
        if(estudio && ine && mayorDe18){
            voto = false;
        }else if (!estudio && !ine && !mayorDe18){
            voto = true;
        }
    }
    public boolean getVoto() {
        return voto;
    }

}