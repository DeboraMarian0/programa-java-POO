/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.org.catolicasc.poo.forma;

/**
 *
 * @author LuizAlves
 */
public class Retangulo extends Forma{
    protected double base;
    protected double altura;
    
    public Retangulo(){
        super();
        this.base = 1.0;
        this.altura = 1.0;
    }
    
    public Retangulo(double base, double altura){
        super();
        this.base = base;
        this.altura = altura;
    }
    
    public Retangulo(double base, double altura, String cor, boolean preenchido){
        super(cor, preenchido);
        this.base = base;
        this.altura = altura;
    }
    
     public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    
    public double getAltura() {
        return altura;
    }
    
    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    @Override
    public double getArea(){
        return base * altura;
    }
    
    @Override
    public double getPerimetro(){
        return 2 * (base + altura);
    }
    
    @Override
    public String toString(){
        return "Retângulo [base = " + getBase() + ", altura = " + getAltura() + ", cor = " +  getCor() + ", preenchido = " + isPreenchido() + "]";
    }

}
