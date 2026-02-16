package Proyecto;

public class ObjVehiculo {

private String Marca;
private String Cilindraje;
private Double PagoAnterior;
private Double PagoActual;
private int NumeroCelda;

public ObjVehiculo() {
}

public ObjVehiculo(String marca, String cilindraje, Double pagoAnterior, Double pagoActual, int numeroCelda) {
    Marca = marca;
    Cilindraje = cilindraje;
    PagoAnterior = pagoAnterior;
    PagoActual = pagoActual;
    NumeroCelda = numeroCelda; 
}

public String getMarca() {
    return Marca;
}

public void setMarca(String marca) {
    Marca = marca;
}

public String getCilindraje() {
    return Cilindraje;
}

public void setCilindraje(String cilindraje) {
    Cilindraje = cilindraje;
}

public Double getPagoAnterior() {
    return PagoAnterior;
}

public void setPagoAnterior(Double pagoAnterior) {
    PagoAnterior = pagoAnterior;
}

public Double getPagoActual() {
    return PagoActual;
}

public void setPagoActual(Double pagoActual) {
    PagoActual = pagoActual;
}

public int getNumeroCelda() {
    return NumeroCelda;
}

public void setNumeroCelda(int numeroCelda) {
    NumeroCelda = numeroCelda;
}
    
}
