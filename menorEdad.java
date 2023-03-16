package superClase;

public class menorEdad extends Persona{
    public menorEdad(){
        super.setIne();
        super.setMayorDe18();
        super.setVoto();
        super.setEstudio();
    }
    void setter() {
        super.setIne();
        super.setEstudio();
        super.setVoto();
        super.setMayorDe18();
    }
    void getters() {
        System.out.println(super.getNombre());
        System.out.println(super.getEstudio());
        System.out.println(super.getIne());
        System.out.println(super.getVoto());
        System.out.println(super.getMayorDe18());
        System.out.println();
    }

}