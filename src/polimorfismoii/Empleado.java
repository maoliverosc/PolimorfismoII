/*
 * Empleado.java
 * Abstract Superclass
 */
package polimorfismoii;

/**
 *
 * @author mauricio.oliveros
 */
public abstract class Empleado {
    // Privates
    private String FirstName;
    private String LastName;
    private String NumSegSoc;
    
    // Publics
    public Empleado(String FN, String LN, String NSS){
        FirstName = FN;
        LastName = LN;
        NumSegSoc = NSS;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getNumSegSoc() {
        return NumSegSoc;
    }

    public void setNumSegSoc(String NumSegSoc) {
        this.NumSegSoc = NumSegSoc;
    }
    
    // Others
    @Override
    public String toString(){
        return String.format("%s %s\nNumero de seguro social es: %s", this.getFirstName(), this.getLastName(), this.getNumSegSoc());
    }
    
    // abstract method will be override by others suclass
    public abstract double ingresos();
    
}

// end class