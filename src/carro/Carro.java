/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carro;

/**
 *
 * @author Estudiante
 */
public class Carro extends Objeto{
    
    private Chasis chasis;
    private Llanta llanta1;
    private Llanta llanta2;

    public Carro(int x, int y) {
        super(x, y);
        this.chasis = new Chasis(x,y);
        this.llanta1 = new Llanta(x+10,y+30);
        this.llanta2 = new Llanta(x+30,y+30);
    }

    @Override
    public void mover() {
        this.x = x+1;
        

    }
    
    public void llantasychasis(){
        
    }

    public Chasis getChasis() {
        return chasis;
    }

    public void setChasis(Chasis chasis) {
        this.chasis = chasis;
    }

    public Llanta getLlanta1() {
        return llanta1;
    }

    public void setLlanta1(Llanta llanta1) {
        this.llanta1 = llanta1;
    }

    public Llanta getLlanta2() {
        return llanta2;
    }

    public void setLlanta2(Llanta llanta2) {
        this.llanta2 = llanta2;
    }
    
    
}
