public class SmartWatch extends SmartDevice {

    String ritmoCardiaco;

    public SmartWatch() {
    }

    public SmartWatch(String marca, String modelo, String sistemaOperativo, String conexion, String red, String pantalla, String ritmoCardiaco) {
        super(marca, modelo, sistemaOperativo, conexion, red, pantalla);
        this.ritmoCardiaco = ritmoCardiaco;

    }

    public void datosSmartWatch(){
        System.out.println("Marca: "+ marca);
        System.out.println("Modelo: "+ modelo);
        System.out.println("Sistema operativo: "+sistemaOperativo);
        System.out.println("Conexion: "+conexion);
        System.out.println("Red: "+red);
        System.out.println("Pantalla: "+pantalla);
        System.out.println("Ritmo cardiaco: "+ritmoCardiaco);
    }


}
