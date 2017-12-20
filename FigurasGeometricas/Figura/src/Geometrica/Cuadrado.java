package Geometrica;

public class Cuadrado extends FiguraG
{
    double lado;
    
    public Cuadrado() {
        tipoFigura = "Cuadrado";
    }
    
    @Override
    int Orden() {
        return 2;
    }
    
    @Override
    public String toString() {
        return "Soy un: "+tipoFigura+" mis lados son de: "+lado+" y mis coordenados son:"+PuntoInicial(5, 5);
    }

    @Override
    public String PuntoInicial(int CoordenadaX, int CoordenadaY) {
        return super.PuntoInicial(CoordenadaX, CoordenadaY);
    } 
    
}
