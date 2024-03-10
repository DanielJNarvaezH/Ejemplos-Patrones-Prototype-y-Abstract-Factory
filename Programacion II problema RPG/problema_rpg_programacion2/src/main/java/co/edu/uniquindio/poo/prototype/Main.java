package co.edu.uniquindio.poo.prototype;

public class Main {
    public static void main (String [] args) {
 
        Carro car1 = new Carro();
        car1.setKilometraje(0);
        car1.setModelo("2014");
        car1.setTipoVehiculo("Deportivo");

        Carro car2 = (Carro) car1.clone();

        car2.setKilometraje(2220);

        System.out.println(car1);        
        System.out.println(car2);

        //Se creó una clase Carro para el ejemplo, en esta se usó la interfaz Cloneable propia de JAVA, se sobreescribió el método y se realizó la siguiente prueba, en donde se clona el primer objeto y el segundo toma sus valores, sin embargo como ocupan espacios diferentes en memoria, si se cambia un valor en el clon, este no afectará el prototipo

    }
}
