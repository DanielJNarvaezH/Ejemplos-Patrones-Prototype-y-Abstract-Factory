package co.edu.uniquindio.poo.prototype;

public class Carro implements Cloneable {
    private String modelo;
    private String tipoVehiculo;
    public int kilometraje;
    
    @Override
    protected Object clone() {
        Carro carroClone = new Carro();
        carroClone.setModelo(this.getModelo());
        carroClone.setTipoVehiculo(this.getTipoVehiculo());
        carroClone.setKilometraje(this.getKilometraje());
        return carroClone;
        //Aquí se implementa la interfaz de cloneable y se define la estructura en que se clona el objeto
    }
    // Getters, Setters y toString...

    public String getModelo() {
        return modelo;
    }


    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }


    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }


    public int getKilometraje() {
        return kilometraje;
    }


    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }


    @Override
    public String toString() {
        return "Carro [modelo=" + modelo + ", tipoVehiculo=" + tipoVehiculo + ", kilometraje=" + kilometraje + "]";
    }
    
}
