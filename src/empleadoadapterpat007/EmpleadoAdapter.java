package empleadoadapterpat007;

public class EmpleadoAdapter implements Salario {
    private Estudiante estudiante;

    public EmpleadoAdapter(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    @Override
    public float obtenerSueldo() {
        // Poder convertir el subsidio a un valor de sueldo si es necesario
        return estudiante.obtenerSubsidio();
    }

    public String obtenerNombre() {
        return estudiante.obtenerNombre();
    }
}
