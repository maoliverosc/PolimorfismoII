/*
 * by themaoc
 */
package polimorfismoii;

/**
 *
 * @author Mauricio Oliveros C
 */
public class EmpleadoBaseMasComision extends EmpleadoPorComision {
    //
    private double SalarioBase;
    //
    public EmpleadoBaseMasComision(String FN, String LN, String NSS, double VB, double TC, double SB){
        super(FN, LN, NSS, VB, TC);
        this.setSalarioBase(SB);
    }
    //

    public double getSalarioBase() {
        return SalarioBase;
    }

    public void setSalarioBase(double SalarioBase) {
        if (SalarioBase > 0.0 )
            this.SalarioBase = SalarioBase;
        else
            throw new IllegalArgumentException("Salario > 0.0");
    }
    //

    @Override
    public double ingresos() {
        return (super.ingresos() + this.getSalarioBase()); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return String.format(
                "%s %s\n%s: %.2f", "Con sueldo base",super.toString(), "sueldo base", this.getSalarioBase()); 
    }

}

// end class