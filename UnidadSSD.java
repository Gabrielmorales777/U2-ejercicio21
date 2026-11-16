
public class UnidadSSD extends DispositivoAlmacenamiento {

    private int velocidadTransferencia;

    public UnidadSSD(String nombre, int capacidadMaxima, int velocidadTransferencia) {
        super(nombre, capacidadMaxima);
        this.velocidadTransferencia = velocidadTransferencia;
    }

    @Override
    public void escribirDatos(String datos) {
        if (datosAlmacenados.length() + datos.length() <= capacidadMaxima) {
            datosAlmacenados += datos;
            System.out.println("Datos escritos correctamente en la unidad SSD.");
        } else {
            System.out.println("Error: capacidad de la unidad SSD superada.");
        }
    }

    @Override
    public String leerDatos() {
        return datosAlmacenados;
    }

    public void mostrarVelocidad() {
        System.out.println("Velocidad de transferencia: " + velocidadTransferencia + " MB/s");
    }
}
