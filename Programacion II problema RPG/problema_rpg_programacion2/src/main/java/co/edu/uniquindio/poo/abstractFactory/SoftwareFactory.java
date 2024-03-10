package co.edu.uniquindio.poo.abstractFactory;

public class SoftwareFactory implements ServicioFactory {

    @Override
    public ServicioInformatico creaServicio() {
        return new ServicioSoftwareEducacional();
    }

    //Esta es una factory concreta
    
}
