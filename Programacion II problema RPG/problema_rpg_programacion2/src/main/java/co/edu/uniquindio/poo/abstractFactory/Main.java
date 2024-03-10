package co.edu.uniquindio.poo.abstractFactory;

import java.util.Scanner;

//El código implementado como ejemplo de Abstract Factory se tomo de: 

public class Main {
    
    public static Scanner S = new Scanner(System.in);
    public static void main(String[] args) {
        int eleccion;
        do{
            eleccion = preguntarServicio();
            switch (eleccion) {
                case 1:
                    usarServicio(new DesignFactory());
                    break;
                case 2:
                    usarServicio (new SoftwareFactory());
                    break;
                case 3: 
                    usarServicio (new WebsiteFactory());
                    break;
                case 4:
                    System.out.println("Cerrando programa.");
                    break;
                default:
                    System.out.println("Seleccione una opción valida.");        
            }
            System.out.println("\n");        
        }while (eleccion != 4);
    }

    public static void usarServicio(ServicioFactory factory){
        ServicioInformatico servicio = factory.creaServicio();
        servicio.asignarTrabajo();
        servicio.indicarFechaEntrega();
        servicio.informarSobrePago();
    }

    public static int preguntarServicio(){
        System.out.println(
            "Menú opciones\n"

            + "1.Solicitar Servicio de diseño\n"
            + "2.Solicitar Servicio de desarrollo de Software\n"
            + "3. Solicitar Servicio de sitio web\n"
            + "4.Cerrar programa\n"
            + "Seleccione opcion: "
        );
        return  Integer.parseInt(S.nextLine());
    }
}
