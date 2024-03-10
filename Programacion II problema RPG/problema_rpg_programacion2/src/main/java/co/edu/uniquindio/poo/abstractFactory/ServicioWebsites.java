package co.edu.uniquindio.poo.abstractFactory;

public class ServicioWebsites implements ServicioInformatico {

    @Override
    public void asignarTrabajo() {
        System.out.println("El trabajo se ha asignado al equipo desarrollador de sitios web");
    }

    @Override
    public void indicarFechaEntrega() {
        System.out.println("Plazo máximo de entrega: 19/09/2024");
    }

    @Override
    public void informarSobrePago() {
        System.out.println("El pago por el servicio sera aparte de los pagos del dominio y la ciberseguridad");
    }

}
