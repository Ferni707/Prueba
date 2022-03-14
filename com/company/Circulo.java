package com.company;

public class Circulo {
    private int x;
    private int y;
    private double radio;

    /*
     * Constructor para la clase Circulo que asigna los valores de las
     * coordenadas x, y y el valor del radio
     */

    /**
     * Constructor de la clase circulo
     * @param valorX Asigna el valor de X
     * @param valorY Asigna el valor de Y
     * @param valorRadio Asigna el valor del radio
     */
    public Circulo(int valorX, int valorY, double valorRadio) {
        establecerX(valorX);
        establecerY(valorY);
        establecerRadio(valorRadio);
    }

    /**
     * Establece el valor de la variable X
     * @param valorX
     */
    public void establecerX(int valorX) {
        x=valorX;
    }

    /**
     * Retorna el valor de la variable X
     * @return
     */
    public int obtenerX() {
        return x;
    }

    /**
     * Establece el valor de la variable Y
     * @param valorY
     */
    public void establecerY(int valorY) {
        y=valorY;
    }

    /**
     * Retorna el valor de la variable Y
     * @return
     */
    public int obtenerY() {
        return y;
    }

    /**
     * Establece el valor del radio
     * Sera un 0 o un entero positivo
     * @param valorRadio
     */
    public void establecerRadio(double valorRadio) {

        radio=(valorRadio < 0.0 ? 0.0 : valorRadio);
    }

    /**
     * Retorna el valor del radio
     * @return
     */
    public double obtenerRadio() {
        return radio;
    }

    /**
     * Retorna el valor del diametro
     * Es el doble del radio
     * @return
     */
    public double obtenerDiametro() {
        return radio * 2;
    }

    /**
     * Calcula la longitud de la circunferencia
     * @return
     */
    public double obtenerCircunferencia() {
        return Math.PI * obtenerDiametro();
    }

    /**
     * Retorna el valor del area de la circunferencia
     * @return
     */
    public double obtenerArea() {
        return Math.PI * radio * radio;
    }

    /**
     * Devuelve un string con los datos obtenidos
     * @return
     */
    @Override
    public String toString() {
        return "Centro = [" + x + "," + y + "]; Radio = " + radio;
    }
}
