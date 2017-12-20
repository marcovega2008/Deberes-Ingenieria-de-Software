/*
 * Triangulo
 */
package Geometrica;

/**
 * @author www.ajpdsoft.com
 */
public class Triangulo extends FiguraG{
    private double lado;
    
    public Triangulo() {
        tipoFigura = "Triangulo";
    }
    @Override
    int Orden() {
        return 1;
    }

    @Override
    public String toString() {
        return "Soy un: "+tipoFigura+" mis lados son de: "+lado+" y mis coordenados son:"+PuntoInicial(5, 5);
    }

    @Override
    public String PuntoInicial(int CoordenadaX, int CoordenadaY) {
        return super.PuntoInicial(CoordenadaX, CoordenadaY); //To change body of generated methods, choose Tools | Templates.
    }
    
}