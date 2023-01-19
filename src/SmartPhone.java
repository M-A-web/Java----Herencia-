public class SmartPhone extends SmartDevice{

    String camara;

    public SmartPhone() {
    }

    public SmartPhone(String marca, String modelo, String sistemaOperativo, String conexion, String red, String pantalla, String camara) {
        super(marca, modelo, sistemaOperativo, conexion, red, pantalla);
        this.camara = camara;
    }

    public void datosSmartPhone(){
        System.out.println("Marca: "+ marca);
        System.out.println("Modelo: "+ modelo);
        System.out.println("Sistema operativo: "+sistemaOperativo);
        System.out.println("Conexion: "+conexion);
        System.out.println("Red: "+red);
        System.out.println("Pantalla: "+pantalla);
        System.out.println("camara: "+camara);
    }
}
