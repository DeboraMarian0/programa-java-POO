/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.org.catolicasc.poo.forma;

/**
 *
 * @author LuizAlves
 */
public abstract class Forma { //A classe será abstrata se tiver pelo menos 1 método abstrato
    protected String cor;
    protected boolean preenchido;
    final double PI = 3.14;
    
    public Forma(){
        this.cor = "Vermelho";
        this.preenchido = true;
    }
    
    public Forma(String cor, boolean preenchido){
        this.cor = cor;
        this.preenchido = preenchido;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean isPreenchido() {
        return preenchido;
    }

    public void setPreenchido(boolean preenchido) {
        this.preenchido = preenchido;
    }
    
    public abstract double getArea(); //método abstrato não tem implementação (código)
    
    public abstract double getPerimetro(); //método abstrato não tem implementação (código)
    
    @Override
    public String toString(){
        return "cor = " + getCor() + ", preenchido = " + isPreenchido();
    }
    
}
