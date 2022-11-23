import com.Principal.Persona;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Persona Estudiante = new Persona();
        Scanner Est = new Scanner(System.in);
        String Nombre, Apellido, ID, Pais, CorreoElectronico;
        int Edad;
        System.out.print("Ingrese su nombre:");
        Nombre = Est.next();
        Estudiante.setNombre(Nombre);
        System.out.print("Ingrese su apellido:");
        Apellido = Est.next();
        Estudiante.setApellido(Apellido);
        System.out.print("Ingrese si ID:");
        ID = Est.next();
        Estudiante.setID(ID);
        System.out.print("Ingrese su correo:");
        CorreoElectronico=Est.next();
        Estudiante.setCorreoElectronico(CorreoElectronico);
        System.out.print("Ingrese su pais:");
        Pais=Est.next();
        Estudiante.setPais(Pais);
        System.out.print("Ingrese su edad:");
        Edad=Est.nextInt();
        Estudiante.setEdad(Edad);
        System.out.println("\n-------- DATOS DEL ESTUDIANTE-------" +
                "\n Nombre:" + Estudiante.getNombre() +
                "\n Apellido:" + Estudiante.getApellido() +
                "\n ID:"+ Estudiante.getID() +
                "\n Correo:" +Estudiante.getCorreoElectronico() +
                "\n Pais:" + Estudiante.getPais() +
                "\n Edad:" + Estudiante.getEdad());
        Persona Estu= new Persona("Lala","Ponze","54554","lalapon@gmail.com","Uruguay",23);
        System.out.println("\n-------- DATOS DEL ESTUDIANTE-------" +
                "\n Nombre:" + Estu.getNombre() +
                "\n Apellido:" + Estu.getApellido() +
                "\n ID:"+ Estu.getID() +
                "\n Correo:" +Estu.getCorreoElectronico() +
                "\n Pais:" + Estu.getPais() +
                "\n Edad:" + Estu.getEdad());

    }
}