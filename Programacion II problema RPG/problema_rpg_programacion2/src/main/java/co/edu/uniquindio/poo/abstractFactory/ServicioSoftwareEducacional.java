package co.edu.uniquindio.poo.abstractFactory;

public class ServicioSoftwareEducacional implements ServicioInformatico {

    @Override
    public void asignarTrabajo() {
        System.out.println("El equipo de programadores estará a cargo de este proyecto");
    }

    @Override
    public void indicarFechaEntrega() {
        System.out.println("Los directivos han declarado la fecha límite de entrega: 11/11/2024");
    }

    @Override
    public void informarSobrePago() {
        System.out.println("El recurso monetario obtenido final tendrá directa relación con la cantidad de descargas");
    }

    // Este es un producto concreto 

}
