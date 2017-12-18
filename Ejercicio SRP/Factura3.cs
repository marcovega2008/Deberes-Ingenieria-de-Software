public class Factura
{
public string _codigo;
public DateTime _fechaEmision;
public decimal _importeFactura;
public decimal _importeIVA;
public decimal _importeDeduccion;
public decimal _importeTotal;
public ushort _porcentajeDeduccion;
// Método que calcula el total de la factura
public void CalcularTotal()
{
// Calculamos la deducción
Deduccion deduccion = 
        new Deduccion (_porcentajeDeduccion);
_importeDeduccion = 
        deduccion.CalcularDeduccion(
                    _importeFactura);
// Calculamos el IVA
IVA iva = new IVA ();
_importeIVA = iva.CalcularIVA(
                  _importeFactura);
// Calculamos el total
_importeTotal = (_importeFactura ‐ _importeDeduccion) + _importeIVA;
}
}