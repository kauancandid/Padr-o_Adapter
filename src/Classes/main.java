
package Classes;

public class main {

    public static void main(String[]args){

        PlugPs2 ps2 = new PlugPs2();
        UsbConector usb = new UsbConector();
        Adaptador adaptador = new Adaptador();

        System.out.println(adaptador.conecta(ps2));

    }
}
