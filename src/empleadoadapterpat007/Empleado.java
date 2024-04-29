package empleadoadapterpat007;

public class Empleado implements Salario {
    private String nombre;
    private float salario;

    public Empleado(String nombre, float salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    @Override
    public float obtenerSueldo() {
        return salario;
    }

    public String obtenerNombre() {
        return nombre;
    }
}
