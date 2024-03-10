package co.edu.uniquindio.poo.abstractFactory;

public class WebsiteFactory implements ServicioFactory {

    @Override
    public ServicioInformatico creaServicio() {
        return new ServicioWebsites();
    }

}
