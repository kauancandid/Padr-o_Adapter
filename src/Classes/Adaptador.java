package Classes;

public class Adaptador extends UsbConector{

    public String conecta(PlugPs2 plug){
        return plug.obtemConectividade() + this.getNomeConector();

    }
}