
package segundo;

public class Paciente {
 
    public String CI;
    public String apellidos;
    public String nombres;
    public String alergias;
    public enum TIPO {AP,BP,ABP,OP,AN,BN,ABN,ON};   
    public TIPO tipoSangre;

    public String getCI() {
        return CI;
    }
    //getter trae valores de fuera
    //set:establece un valor
    public void setCI(String CI) {
        this.CI = CI;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public TIPO getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(TIPO tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    
    public Paciente(String CI, String apellidos, String nombres, String alergias, TIPO tipoSangre) {
        this.CI = CI;
        this.apellidos = apellidos;
        this.nombres = nombres;
        this.alergias = alergias;
        this.tipoSangre = tipoSangre;
    }

    public void imprimir(){
        System.out.println("----------------------------");
        System.out.println("Numero de cedula: "+ CI);
        System.out.println("Apelldos: " + apellidos);
        System.out.println("Nombres: " + nombres);
        System.out.println("Alergias: " + alergias);
        System.out.println("Tipo de sangre: " + tipoSangre);
        System.out.println("----------------------------");
    }    
    
    
    public static void main(String[] args) {
        
        Paciente p1 = new Paciente("12345", "Perez Sanches","Jose Antonio","Penicilina", Paciente.TIPO.AN);
        Paciente p2 = new Paciente("9875", "Lopez Morales", "Juan Jose","Polen", TIPO.AP);
        Paciente p3 = new Paciente("45678", "Rodrigez Saenz", "Luis Antonio","Ibuprofeno", TIPO.OP);
        System.out.println("----------------------------");
        System.out.println("Paciente 1");
        p1.imprimir();
        System.out.println("Paciente 2");
        p2.imprimir();
        System.out.println("Paciente 3");
        p3.imprimir();
                
    }
}    
