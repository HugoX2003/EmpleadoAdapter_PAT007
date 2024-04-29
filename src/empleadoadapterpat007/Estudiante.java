package empleadoadapterpat007;

public class Estudiante implements Subsidio {
    private String nombre;
    private float subsidio;

    public Estudiante(String nombre, float subsidio) {
        this.nombre = nombre;
        this.subsidio = subsidio;
    }

    @Override
    public float obtenerSubsidio() {
        return subsidio;
    }

    public String obtenerNombre() {
        return nombre;
    }
}
