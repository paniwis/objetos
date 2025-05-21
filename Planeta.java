package segundo;

public class Planeta {

    //atributos
    String nombre = null;
    int cantidaddeSatelites = 1;
    double masa = 0;
    double volumen = 0;
    int diametro = 0;
    int distanciaMedia = 0;
    enum tipoPlaneta {GASEOSO, TERRESTRE, ENANO};
    tipoPlaneta tipo;
    boolean observable = false;
    double pOrbital = 0;
    double periodoRotacion = 0;

    //porque no me deja poner los contructores
    public Planeta(String nombre, int cantidaddeSatelites, double masa, double volumen, int diametro, int distanciaMedia, tipoPlaneta tipo, boolean observable, double pOrbital, double periodoRotacion) {
        this.nombre = nombre;
        this.cantidaddeSatelites = cantidaddeSatelites;
        this.masa = masa;
        this.volumen = volumen;
        this.diametro = diametro;
        this.distanciaMedia = distanciaMedia;
        this.tipo = tipo;
        this.observable = observable;
        this.pOrbital = pOrbital;
        this.periodoRotacion = periodoRotacion;
    }
    //void es vacio:programas que no devuelven nada
    //funciones programas chiquitos
    //
    void imprimir() {
        System.out.println("Nombre del planeta: " + nombre);
        System.out.println("Cantidad de Satelites: " + cantidaddeSatelites);
        System.out.println("Masa del planeta: " + masa);
        System.out.println("Volumen del planeta: " + volumen);
        System.out.println("Diametro del planeta:" + diametro);
        System.out.println("Distancia media:" + distanciaMedia);
        System.out.println("Tipo de planeta:" + tipo);
        System.out.println("Es observable:" + observable);
        System.out.println("Periodo orbital:" + pOrbital + " años");
        System.out.println("Periodo de rotacion:" + periodoRotacion + " dias");
    }

    //metodo que calcule la densidad
    //getter retorna en base al tipode dato
    //
    double densidad() {
        double densidad;
        return densidad = masa / volumen;
    }

    //metodo para determinar si un planeta es exterior
    boolean exterior() {
        if (nombre.equalsIgnoreCase("Marte")||nombre.equalsIgnoreCase("Jupiter")||nombre.equalsIgnoreCase("Saturno")
                ||nombre.equalsIgnoreCase("Urano")||nombre.equalsIgnoreCase("Neptuno")) {
            return true;
        } else {
        }
        return false;
    }

    public static void main(String[] args) {
        Planeta p1 = new Planeta("Tierra", 1, 5.9736E24, 1.08321E12, 12742, 150000000, Planeta.tipoPlaneta.TERRESTRE, true, 1, 1);
        Planeta p2 = new Planeta("Jupiter", 1, 1.899E27, 1.4313E15, 139820, 750000000, Planeta.tipoPlaneta.GASEOSO, true, 11.86, 0.41);

        p1.imprimir();
        System.out.println("Densidad del planeta" + p1.densidad());
        System.out.println("El planeta es exterior;" + p1.exterior());
    }
}
