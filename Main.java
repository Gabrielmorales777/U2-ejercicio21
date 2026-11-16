
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<DispositivoAlmacenamiento> dispositivos = new ArrayList<>();

        dispositivos.add(new DiscoDuro("Disco duro HDD", 100, 120));
        dispositivos.add(new UnidadSSD("Unidad SSD", 100, 500));
        dispositivos.add(new MemoriaUSB("Memoria USB", 50, 80));

        for (DispositivoAlmacenamiento dispositivo : dispositivos) {

            System.out.println("\n----------------------------");

            dispositivo.mostrarInformacion();

            dispositivo.escribirDatos("Informacion del sistema");

            System.out.println("Datos almacenados: " + dispositivo.leerDatos());

            dispositivo.mostrarInformacion();
        }
    }
}
