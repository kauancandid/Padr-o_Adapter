package Classes;

public class UsbConector extends Usb<PlugPs2>{

    @Override
    public String conecta(PlugPs2 plug) {
        return plug.obtemConectividade() + this.getNomeConector();
    }

    @Override
    public String getNomeConector() {
        return "Um Gabinete com entrada Usb";
    }

}