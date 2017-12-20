/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Geometrica;

/**
 *
 * @author David
 */
public class Hexagono extends FiguraG {
    double lado;
    
    public Hexagono() {
        tipoFigura = "Cuadrado";
    }

    @Override
    int Orden() {
        return 5;
    }

    @Override
    public String toString() {
        return "Soy un: "+tipoFigura+" mis lados son de: "+lado+" y mis coordenados son:"+PuntoInicial(5, 5);
    }
    
}
