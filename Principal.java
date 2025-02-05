import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Principal {
    public static void main(String[] args) {
        FuncionCompletamenteUtilYFuncionalParaImprimirPorPantallaHolaMundo();
        fechaHoraActual();
    }

    public static void FuncionCompletamenteUtilYFuncionalParaImprimirPorPantallaHolaMundo() {
        System.out.println("\"Hola mundo\"");
    }

    public static void fechaHoraActual() {
        LocalDateTime fechaHoraActual = LocalDateTime.now();
        DateTimeFormatter formateado = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String fechaHora = fechaHoraActual.format(formateado);
        System.out.println("Fecha y hora actual: " + fechaHora);
    }
}