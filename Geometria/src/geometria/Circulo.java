/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometria;

/**
 *
 * @author ElenaBerdugo
 */
public class Circulo implements FiguraGeometrica 
{
    private double radio;
    private double areaRadio;
    static final double pi = 3.1415;

    public Circulo(double radio) 
    {
        this.radio = radio;
    }

    public double getRadio() 
    {
        //Consultores
        return radio;
    }

    public void setRadio(double radio) 
    {
        //Modificadores
        this.radio = radio;
    }

    public double getAreaRadio() 
    {
        //Consultores
        return areaRadio;
    }

    @Override
    public void area() 
    {
        areaRadio = pi * radio * radio;
    }    
}
