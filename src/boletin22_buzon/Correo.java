/*
 * Para representar o buzon de correo úsase un array de correos electrónicos;
estes, á súa vez, son obxectos da clase Correo e teñen como atributos un String,
co contido do correo, e un indicativo para saber se foron lidos ou non.
 */
package boletin22_buzon;

/**
 *
 * @author lvazquezdorna
 */
public class Correo {
    //atributos

    private boolean lido;
    private String contido;
    
    //constructores

    public Correo() {
    }

    public Correo(boolean lido, String contido) {
        this.lido = lido;
        this.contido = contido;
    }
    
    //

    public boolean isLido() {
        return lido;
    }

    public void setLido(boolean lido) {
        this.lido = lido;
    }

    public String getContido() {
        return contido;
    }

    public void setContido(String contido) {
        this.contido = contido;
    }

    @Override
    public String toString() {
        return "Correo{" + "lido=" + lido + ", contido=" + contido + '}';
    }
    
    
    
    

}
