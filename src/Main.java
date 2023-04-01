import com.trabajo.clases.operaciones.Operacionesdiagnostico;
import com.trabajo.clases.operaciones.OperacionesCliente;


import java.time.LocalDate;

public class Main {

    static Operacionesdiagnostico operacionesdiagnostico = new Operacionesdiagnostico();
    static OperacionesCliente operacionesCliente = new OperacionesCliente();

    public static void main(String[] args) {
        OperacionesCliente();
    }

    public static void obtenerFecha() {
        LocalDate localTime = LocalDate.now();

        System.out.println(localTime);

    }


    public static void OperacionesCliente() {
        operacionesCliente.menu();

    }
}