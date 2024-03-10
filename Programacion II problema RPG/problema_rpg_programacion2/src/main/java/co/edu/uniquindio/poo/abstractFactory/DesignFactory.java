package co.edu.uniquindio.poo.abstractFactory;

public class DesignFactory implements ServicioFactory {

    @Override
    public ServicioInformatico creaServicio() {
        return new ServicioDesign();
    }

    //Esta es un Factory concreta

}
