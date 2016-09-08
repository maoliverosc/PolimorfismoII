/*
 * EmpleadoPorHoras.java
 */
package polimorfismoii;

/**
 *
 * @author mauricio.oliveros
 */
public class EmpleadoPorHoras extends Empleado {
    // Privates
    private double sueldo;
    private double horas;
    
    // Publics
    public EmpleadoPorHoras(String FN, String LN, String NSS, double S, double H) {
        super(FN, LN, NSS);
        this.setSueldo(S);
        this.setHoras(H);
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        if (sueldo >= 0.0)
            this.sueldo = sueldo;
        else
            throw new IllegalArgumentException("Sueldo debe ser >= 0.0");
    }

    public double getHoras() {
        return horas;
    }

    public void setHoras(double horas) {
        if (horas >= 0.0 && horas <= 168.0)
            this.horas = horas;
        else
            throw new IllegalArgumentException("Horas debe ser >= 0.0 y menor que 168.0");
    }
    
    @Override
    public double ingresos() {
        if (this.getHoras() <= 40)
            return this.getSueldo()*this.getHoras();
        else
            return 40*this.getSueldo() + (this.getHoras() - 40)*this.getSueldo()*1.5;
    }
    
    @Override
    public String toString() {
        return String.format("Empleado por horas: %s\n%s: %,.2f; %s: %,.2f", super.toString(), "Sueldo por horas", this.getSueldo(), "Horas trabajadas", this.getHoras());
    }
}

// end class