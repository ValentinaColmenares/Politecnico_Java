package Semana_03.Clase;

public class Main {

    public static void main(String[] args) {

        // Objeto de la Clase Taxi
        Taxi taxiAmarillo = new Taxi();

        // Uso de los atributos de la Clase Vehiculo
        taxiAmarillo.setMatricula("USR 192");
        taxiAmarillo.setModelo("1995");
        taxiAmarillo.setPotencia(800);

        // Uso del atributo de la Clase Taxi
        taxiAmarillo.setLicencia("12987894");

        // Uso de los métodos de la Clase Vehiculo
        taxiAmarillo.encenderVehiculo();
        taxiAmarillo.apagarVehiculo();

        // Objeto de la Clase AutoBus
        AutoBus autoCol = new AutoBus();

        // Uso de los atributos de la Clase Vehiculo
        autoCol.setMatricula("AHC 359");
        autoCol.setModelo("2004");
        autoCol.setPotencia(2000);

        // Uso del atributo de la Clase Taxi
        autoCol.setPuestos(34);

        // Uso de los métodos de la Clase Vehiculo
        autoCol.encenderVehiculo();
        autoCol.apagarVehiculo();


    }

}
