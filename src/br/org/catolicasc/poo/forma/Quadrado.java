/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.org.catolicasc.poo.forma;

/**
 *
 * @author LuizAlves
 */
public class Quadrado extends Retangulo {
    
    public Quadrado(){
        super(1.0, 1.0); //altura e base igual a 1.0!
    }
    
    public Quadrado(double lado){
        super(lado, lado);
    }
    
    public Quadrado(double lado, String cor, boolean preenchido){
        super(lado, lado, cor, preenchido);
    }
    
    public double getLado() {
        return base;
    }

    public void setLado(double lado) {
        this.base = lado;
        this.altura = lado;
    }
    
    @Override
    public String toString() {
        return "Quadrado [lado = " + getLado() + ", cor = " + getCor() + ", preenchido = " + isPreenchido() + "]";
    }
}
