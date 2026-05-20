/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.org.catolicasc.poo.forma;


public class Circulo extends Forma{
    protected double raio;
    
    public Circulo(){
        super();
        this.raio = 1.0;
    }
    
    public Circulo(double raio){
        super();
        this.raio = raio;
    }
    
    public Circulo(double raio, String cor, boolean preenchido){
        super(cor, preenchido);
        this.raio = raio;
    }
    
    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
    
    @Override
    public double getArea(){
        return PI * Math.pow(raio, 2);
    }
    
    @Override
    public double getPerimetro(){
        return 2 * PI * raio;
    }
    
    @Override
    public String toString(){
        return "Círculo [raio = " + getRaio() + ", cor = " +  getCor() + ", preenchido = " + isPreenchido() + "]";
    }
}
