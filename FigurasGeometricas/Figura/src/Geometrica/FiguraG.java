package Geometrica;

public abstract class FiguraG {
    String tipoFigura;    
    abstract int Orden();
    @Override
    public abstract String toString();    
    public String PuntoInicial(int CoordenadaX, int CoordenadaY){
        return "("+CoordenadaX+","+CoordenadaY+")";
    }
    
}