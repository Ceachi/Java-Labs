/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Laborator3.Exercitii_Poli;

/**
 *
 * @author Ceachi Bogdan
 */
public class Complex {
    private final double real;
    private final double imag;
    
    Complex(double real, double img) {
        this.real = real;
        this.imag = img;
    }
    Complex() {
        this.real = 0;
        this.imag = 0;
    }
    
    public Complex adunare(Complex b) {
        Complex a= this;
        double real = a.real + b.real;
        double imag = a.imag + b.imag;
        return new Complex(real, imag);
    }
    
    public Complex multiplication(Complex complexNr) {
        double a = this.real;
        double b = this.imag;
        double c = complexNr.real;
        double d = complexNr.imag;
        
        double real = a * c - b * d;
        double imaginar = b * c + a * d;

        return new Complex(real, imaginar);    
    }
    
    public Complex pow (int exponent) {
        Complex a = this;
        while(exponent != 0) {
            a = a.multiplication(this);
            exponent--;
        }
        return a;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.real) ^ (Double.doubleToLongBits(this.real) >>> 32));
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.imag) ^ (Double.doubleToLongBits(this.imag) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Complex other = (Complex) obj;
        return true;
    }

    @Override
    public String toString() {
        
        return "(" + this.real + " " + this.imag + "i)";
        
    }
    
}
