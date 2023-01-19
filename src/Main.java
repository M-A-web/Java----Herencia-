public class Main {
    public static void main(String[] args) {

        SmartWatch smartWatch = new SmartWatch("apple","Apple Watch SE","apple",
                "Bluetooth BT 5.0","WiFi","oled","si");

        System.out.println("*****SmartWatch*****");

        smartWatch.datosSmartWatch();

        System.out.println("----------------------");

        System.out.println("*****SmartPhone*****");

        SmartPhone smartPhone = new SmartPhone("Samsung","Galaxy S20","Android 10.0",
                "Wireless, Bluetooth","WiFi","6.5 Pulgadas","Pro-grado, zoom espacial 30X, modo nocturno");

        smartPhone.datosSmartPhone();

    }
}