import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        
        Random random = new Random();

        int numUsuarios = random.nextInt(10) + 1;

        ImpHolaMundo();

        fechaHoraActual();

        Usuario[] usuarios = crearArrayUsuarios(numUsuarios);
        mostrarUsuarios(usuarios, numUsuarios);
    }

    //Metodo para mostrar por pantalla Hola Mundo
    public static void ImpHolaMundo() {
        System.out.println("\"Hola mundo\"");
    }

    //Metodo para mostrar fecha y hora actuales
    public static void fechaHoraActual() {
        LocalDateTime fechaHoraActual = LocalDateTime.now();
        DateTimeFormatter formateado = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String fechaHora = fechaHoraActual.format(formateado);
        System.out.println("Fecha y hora actual: " + fechaHora);
    }

    //Metodo para crear un array aleatorio con random y pedirle al usuario que introduzca los datos
    public static Usuario[] crearArrayUsuarios(int numUsuarios) {

        Scanner keyboard = new Scanner(System.in);
        Usuario[] usuario = new Usuario[numUsuarios];

        System.out.println("Se van a crear " + numUsuarios + " nuevos usuarios");

        for (int i = 0; i < numUsuarios; i++) {

            usuario[i] = new Usuario();

            System.out.println("\nIntroduce los datos del usuario " + (i + 1) + ":");
            System.out.print("Nombre: ");
            usuario[i].nombre = keyboard.nextLine();

            System.out.print("Apellidos: ");
            usuario[i].apellidos = keyboard.nextLine();
            
            System.out.print("Email: ");
            usuario[i].email = keyboard.nextLine();
        }
        keyboard.close();

        return usuario;
    }

    //Metodo para mostrar los usuarios creados
    public static void mostrarUsuarios(Usuario[] usuario,int numUsuarios) {

        System.out.println("\nUsuarios registrados: " + numUsuarios + "\n");

        for (int i = 0;i < usuario.length;i++) {
            System.out.println("-------- Usuario " + (i+1) + " --------");
            System.out.println("Nombre: " + usuario[i].nombre);
            System.out.println("Apellidos: " + usuario[i].apellidos);
            System.out.println("Email: " + usuario[i].email + "\n");
        }
    }
}