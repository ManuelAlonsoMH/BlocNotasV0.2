package models;

/**
 *
 * @author alons
 */
public class ModelBloc {
    
    String texto;
    String path = "C:\\Users\\alons\\Documents\\Escuela\\LeerEscribir.txt";

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
    
}
