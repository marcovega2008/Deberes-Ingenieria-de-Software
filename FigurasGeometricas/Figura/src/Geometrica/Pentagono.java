package Geometrica;

public class Pentagono extends FiguraG{
    double lado;
    
    public Pentagono() {
        tipoFigura = "Cuadrado";
    }

    @Override
    int Orden() {
        return 4;
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
