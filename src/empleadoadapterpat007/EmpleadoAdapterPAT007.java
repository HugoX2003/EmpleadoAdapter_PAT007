package empleadoadapterpat007;

public class EmpleadoAdapterPAT007 {

    public static void main(String[] args) {
        // Creación de un empleado
        Empleado empleado = new Empleado("Jose Tandaypan", 3000.00f);
        System.out.println("Empleado: " + empleado.obtenerNombre() + " - Sueldo: " + empleado.obtenerSueldo());

        // Creación de un estudiante
        Estudiante estudiante = new Estudiante("Edu Márquez", 500.00f);
        System.out.println("Estudiante: " + estudiante.obtenerNombre() + " - Subsidio: " + estudiante.obtenerSubsidio());

        // Uso del adaptador para tratar al estudiante como si fuera un empleado en términos de sueldo
        Salario estudianteAdaptado = new EmpleadoAdapter(estudiante);
        System.out.println("Estudiante Adaptado: " + estudianteAdaptado.obtenerNombre() + " - Sueldo Adaptado: " + estudianteAdaptado.obtenerSueldo());
    }
}
