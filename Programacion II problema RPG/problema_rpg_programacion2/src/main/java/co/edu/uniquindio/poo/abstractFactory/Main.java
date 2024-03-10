package co.edu.uniquindio.poo.abstractFactory;

public class Main {
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
                    System.out.println("Seleccione una opci");
                    
            }
        }
    }
}
