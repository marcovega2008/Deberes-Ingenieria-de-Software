/*
 * Rectangulo
 */
package Geometrica;

/**
 * @author www.ajpdsoft.com
 */
public class Rectangulo extends FiguraG
{
    double base, altura;
    

    @Override
    public String PuntoInicial(int CoordenadaX, int CoordenadaY) {
        return super.PuntoInicial(CoordenadaX, CoordenadaY);
    }
    
    public Rectangulo() {
        tipoFigura = "Rectágulo";
    }

    @Override
    public String toString() {
        return "Soy un: "+tipoFigura+" mi base es: "+base+" y mi altura es: "+altura+" y mis coordenados son:"+PuntoInicial(5, 5);
    }

    @Override
    int Orden() {
        return 3;
    }

}
