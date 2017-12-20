
package Geometrica;

public class Circulo extends FiguraG{
    private double radio;
    
    public Circulo(){
        tipoFigura = "Círculo";
    }

    @Override
    int Orden() {
        return 6;    
    }

    @Override
    public String toString() {
        return "Soy un: "+tipoFigura+" mi radio es: "+radio+" y mis coordenados son:"+PuntoInicial(5, 5);//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String PuntoInicial(int CoordenadaX, int CoordenadaY) {
        return super.PuntoInicial(CoordenadaX, CoordenadaY); //To change body of generated methods, choose Tools | Templates.
    }   
    
}
