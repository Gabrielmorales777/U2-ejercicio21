
public abstract class DispositivoAlmacenamiento {

    protected String nombre;
    protected int capacidadMaxima;
    protected String datosAlmacenados;

    public DispositivoAlmacenamiento(String nombre, int capacidadMaxima) {
        this.nombre = nombre;
        this.capacidadMaxima = capacidadMaxima;
        this.datosAlmacenados = "";
    }

    public abstract void escribirDatos(String datos);

    public abstract String leerDatos();

    public void mostrarInformacion() {
        System.out.println("Dispositivo: " + nombre);
        System.out.println("Capacidad máxima: " + capacidadMaxima + " caracteres");
        System.out.println("Espacio utilizado: " + datosAlmacenados.length());
    }
}
