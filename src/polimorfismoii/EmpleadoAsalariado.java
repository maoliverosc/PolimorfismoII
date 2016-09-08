/*
 * EmpleadoAsalariado.java
 * 
 */
package polimorfismoii;

/**
 *
 * @author mauricio.oliveros
 */
public class EmpleadoAsalariado extends Empleado {
    // Privates
    private double SalarioSemanal;

    // Publics
    public EmpleadoAsalariado(String FN, String LN, String NSS, double S) {
        super(FN, LN, NSS);
        this.setSalarioSemanal(S);
    }

    public double getSalarioSemanal() {
        return SalarioSemanal;
    }

    public void setSalarioSemanal(double SalarioSemanal) {
        if (SalarioSemanal >= 0.0)
            this.SalarioSemanal = SalarioSemanal;
        else
            throw new IllegalArgumentException("Salario debe ser >= 0.0");
    }
    
    @Override
    public double ingresos() {
        return this.getSalarioSemanal();
    }

    @Override
    public String toString() {
        return String.format("Empleado asalariado: %s\n%s: $%,.2f", super.toString(), "Salario semanal", this.getSalarioSemanal() );
    }
    
}

// end class