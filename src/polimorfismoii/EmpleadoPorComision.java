/*
 * by themaoc
 */
package polimorfismoii;

/**
 *
 * @author Mauricio Oliveros C
 */
public class EmpleadoPorComision extends Empleado {
    // Private
    private double VentasBrutas;
    private double TarifaComision;
    
    // Public - Constructor
    public EmpleadoPorComision(String FN, String LN, String NSS, double VB, double TC){
        super(FN,LN,NSS);
        this.setVentasBrutas(VB);
        this.setTarifaComision(TC);
    }

    public double getVentasBrutas() {
        return VentasBrutas;
    }

    public void setVentasBrutas(double VentasBrutas) {
        if (VentasBrutas >= 0.0)
            this.VentasBrutas = VentasBrutas;
        else
            throw new IllegalArgumentException("Ventas > 0.0");
    }

    public double getTarifaComision() {
        return TarifaComision;
    }

    public void setTarifaComision(double TarifaComision) {
        if (TarifaComision > 0.0 && TarifaComision < 1.0)
            this.TarifaComision = TarifaComision;
        else
            throw new IllegalArgumentException("Tarifa > 0.0 & < 1.0");
    }
    
    // Calculo de Ingresos.
    @Override
    public double ingresos(){
        return this.getTarifaComision()*this.getVentasBrutas();
        //return TarifaComision*VentasBrutas;
    }
    
    @Override
    public String toString(){
        return String.format("%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f",
                "Empleado por comision", super.toString(),
                "Ventas Brutas", this.getVentasBrutas(),
                "Tarifa Comision", this.getTarifaComision() );
    }
}

// end class
