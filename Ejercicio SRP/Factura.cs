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
_importeDeduccion = (_importeFactura * _porcentajeDeduccion) / 100;
// Calculamos el IVA
_importeIVA = _importeFactura * 0.16m;
// Calculamos el total
_importeTotal = (_importeFactura ‐ _importeDeduccion) + _importeIVA;
}
}