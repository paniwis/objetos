package practicmetodos;

public class Ciudad {

    public static void main(String[] args) {

        Ciudad c1 = new Ciudad("Ambato", 500000, false, Region.SIERRA);
        c1.imprimir();
        double promedio = c1.calcularPormedioTemperatura();
        System.out.println("Promedio:" + promedio);
        c1.mostrarMesesCalurosos();
        c1.esDensamentePoblada(100);
        
    }
    //atributos
    String nombre;
    int poblacion;
    double[] temperaturaMediaAnual = {22.5, 25.6, 20.1, 12.3, 23.4, 27.5, 27.3, 28.5, 29.1, 11.9, 24, 19};
    boolean esCapital;
    enum Region {COSTA, SIERRA, AMAZONIA, GALAPAGOS};
    Region region;

    //constructores
    public Ciudad(String nombre, int poblacion, boolean esCapital, Region region) {
        this.nombre = nombre;
        this.poblacion = poblacion;
        this.esCapital = esCapital;
        this.region = region;
    }
    //metodos 
    //metodo de impresion: Este método no es static porque depende del objeto

    void imprimir() {
        System.out.println("Nombre de la ciudad:" + nombre);
        System.out.println("Poblacion en total: " + poblacion);
        System.out.println("es Capital: " + esCapital);
        System.out.println("Region: " + region);
    }

    //metodo para calcular la temperatura
    double calcularPormedioTemperatura() {
        double suma = 0;
        for (int i = 0; i < temperaturaMediaAnual.length; i++) {
            suma += temperaturaMediaAnual[i];
        }
        double promedio = suma / temperaturaMediaAnual.length;
        return promedio;
    }

    //metodo para mostrar meses calurosos
    void mostrarMesesCalurosos() {
        for (int i = 0; i < temperaturaMediaAnual.length; i++) {
            if (temperaturaMediaAnual[i] > 25) {
                System.out.println("El mes " + (i + 1) + " fue caluroso con una temperatura de:" + temperaturaMediaAnual[i]);
            }
        }
    }

    //metodo para saber si la zona es densamente poblada
    void esDensamentePoblada(double area) {
        double densidad = poblacion / area;
        if (densidad > 1000) {
            System.out.println("La ciudad es densamente poblada");
        } else {
            System.out.println("La ciudad no es densamente poblada");
        }
        System.out.println("Densidad;" + densidad);
    }
}
