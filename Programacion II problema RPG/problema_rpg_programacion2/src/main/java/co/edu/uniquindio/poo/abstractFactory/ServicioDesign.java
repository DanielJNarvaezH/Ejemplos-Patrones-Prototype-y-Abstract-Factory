package co.edu.uniquindio.poo.abstractFactory;

public class ServicioDesign implements ServicioInformatico {

    @Override
    public void asignarTrabajo() {
        System.out.println("EL trabajo ha sido asignado a diseñadores gráficos disponibles");
    }

    @Override
    public void indicarFechaEntrega() {
        System.out.println("La fecha máxima de entrega de trabajo determinada es la siguiente: 21/03/2024 ");
    }

    @Override
    public void informarSobrePago() {
        System.out.println("Pago en efectivo al momento de terminado y entregado el trabajo");
    }

}
