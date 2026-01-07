import java.util.ArrayList;
import java.util.List;

public class Paciente extends Persona {
    private List<Consulta> consultas;
    private List<RecetaMedica> recetasMedicas;

    public Paciente(String nombre, int edad, String genero, String direccion, String telefono,
            String correoElectronico) {
        super(nombre, edad, genero, direccion, telefono, correoElectronico);
        this.consultas = new ArrayList<>();
        this.recetasMedicas = new ArrayList<>();
    }

    /*
    añadido - Self Encapsulation
    */
    public boolean esAdultoMayor() {
        return super.getEdad() >= EdadMayor();
    }

    public int EdadMayor(){
        return 65;
    }

    public List<Consulta> getConsultas() {
        return consultas;
    }

    public void setConsultas(List<Consulta> consultas) {
        this.consultas = consultas;
    }

    public List<RecetaMedica> getRecetasMedicas() {
        return recetasMedicas;
    }

    public void setRecetasMedicas(List<RecetaMedica> recetasMedicas) {
        this.recetasMedicas = recetasMedicas;
    }
}