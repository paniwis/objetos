package javaapplication39;

public class Smartphone {
    private String marca;
    private String modelo;
    private int almacenamientoGB;
    private int ramGB;
    private int bateriaPorcentaje;

    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("Iphone", "15", 132, 16, 80);
        System.out.println(s1.toString());
        System.out.println("Restando bateria: " + s1.usarBateria(15));
        System.out.println("Cargar bateria: " + s1.cargarBateria(50));
    }

    //constructores
    public Smartphone(String marca, String modelo, int almacenamientoGB, int ramGB, int bateriaPorcentaje) {
        this.marca = marca;
        this.modelo = modelo;
        this.almacenamientoGB = almacenamientoGB;
        this.ramGB = ramGB;
        this.bateriaPorcentaje = bateriaPorcentaje;
    }

    //getters y setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int almacenamientoGB() {
        return almacenamientoGB;
    }

    public void almacenamientoGB(int intalmacenamientoGB) {
        this.almacenamientoGB = almacenamientoGB;
    }

    public int getRamGB() {
        return ramGB;
    }

    public void setRamGB(int ramGB) {
        this.ramGB = ramGB;
    }

    public Smartphone(int bateriaPorcentaje) {
        this.bateriaPorcentaje = bateriaPorcentaje;
    }

    public String toString() {
        return "Marca: " + this.marca + "\tModelo: " + this.modelo
                + " \tRamGB" + this.ramGB + " \tAlmacenamiento: " + this.almacenamientoGB
                + "\tPorcentaje de bateria: " + this.bateriaPorcentaje;
    }

    //usarBateria(double porcentaje): resta ese valor al porcentaje de batería, 
    //pero no permite bajar de 0%
    public int usarBateria(int porcentaje) {
        if (porcentaje > 0) {
        }
        return bateriaPorcentaje -= porcentaje;
    }

    //cargarBateria(double porcentaje): suma el valor al porcentaje actual, sin superar el 100%.
    public int cargarBateria(int porcentaje) {
        if (porcentaje > 0) {
            bateriaPorcentaje += porcentaje;
        }
        if (bateriaPorcentaje > 100) {
            bateriaPorcentaje = 100;
        }
        return bateriaPorcentaje;
    }
}
