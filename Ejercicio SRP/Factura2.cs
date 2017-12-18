public class IVA
{
public readonly decimal_iva = 0.16m;
public decimal CalcularIVA(decimal importe)
{
return importe * _iva;
}
}
public class Deduccion
{
private decimal _deduccion;
public Deduccion(ushort porcentaje)
{
_deduccion = porcentaje;
}
public decimal CalcularDeduccion(decimal importe)
{
return
(importe * _deduccion) / 100;
}
}
