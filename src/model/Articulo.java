
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.text.DecimalFormat;

/**
 *
 * @author ASUS
 */
public class Articulo {

    public String codArt;
    public String nomArt;
    public double precArt;
    public double IVA;
    double precFinalArt;
    private final DecimalFormat formato = new DecimalFormat("#.##");;
    public Articulo(String codArt, String nomArt, double precArt) {
        this.codArt = codArt;
        this.nomArt = nomArt;
        this.precArt = precArt;
        this.IVA = this.precArt*0.12;
        formato.format(this.IVA);
        this.precFinalArt=this.precArt+this.IVA;
    }

    @Override
    public String toString() {
        return this.nomArt + "     " + this.precArt + "     " + this.IVA+"     "+this.precFinalArt;
    }

    public void calculoModificado(){
        this.IVA = this.precArt*0.12;
        formato.format(this.IVA);
        this.precFinalArt=this.precArt+this.IVA;
    }

    @Override
    public boolean equals(Object ci) {
        return (this.codArt.equals(ci));
    }
}
