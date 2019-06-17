/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carro;
import javafx.animation.*;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;
/**
 *
 * @author Estudiante
 */
public class Animación extends AnimationTimer{
    private Carro carro;
    private GraphicsContext lapiz;
    private Image fondo;
    private Image ufo0;
    private Image ufo1;
    private Image ufo2;
    private Image ufo3;
    private Image ufo4;
    private Image ufo5;
    
    public Animación(GraphicsContext lapiz){
        this.lapiz = lapiz;
        this.carro = new Carro(20,350);
        this.fondo = new Image("Imagenes/fondo.png");
        this.ufo0 = new Image("Imagenes/ufo_0.png");
        this.ufo1 = new Image("Imagenes/ufo_1.png");
        this.ufo2 = new Image("Imagenes/ufo_2.png");
        this.ufo3 = new Image("Imagenes/ufo_3.png");
        this.ufo4 = new Image("Imagenes/ufo_4.png");
        this.ufo5 = new Image("Imagenes/ufo_5.png");
        
    }
    
    int i = 0;
    
    @Override
    public void handle(long now) {
        lapiz.clearRect(0, 0, 1024, 512);
        lapiz.drawImage(fondo,0,0);
        if (i == 0||i == 1) {
            lapiz.drawImage(ufo0,this.carro.getX(),this.carro.getY()-150);
        }else if(i == 2||i == 3){
            lapiz.drawImage(ufo1,this.carro.getX(),this.carro.getY()-150);
        }else if(i == 4||i == 5){
            lapiz.drawImage(ufo2,this.carro.getX(),this.carro.getY()-150);
        }else if(i == 6||i == 7){
            lapiz.drawImage(ufo3,this.carro.getX(),this.carro.getY()-150);
        }else if(i == 8||i == 9){
            lapiz.drawImage(ufo4,this.carro.getX(),this.carro.getY()-150);
        }else if(i == 10||i == 11){
            lapiz.drawImage(ufo5,this.carro.getX(),this.carro.getY()-150);
            if (i==11) {
                i = 0;
            }
        }
        i++;
        
        lapiz.setFill(Color.RED);
        lapiz.fillRect(800, 30, 150, 30);;
        lapiz.setFill(Color.BLUE);
        lapiz.fillRect(this.carro.getX(), this.carro.getY(), 70, 20);
        lapiz.setFill(Color.GREEN);
        lapiz.fillRect(this.carro.getX()-20, this.carro.getY()+20, 110, 20);
        lapiz.setFill(Color.BLACK);
        lapiz.fillOval(this.carro.getX(),this.carro.getY()+40, 20, 20);
        lapiz.fillOval(this.carro.getX()+50,this.carro.getY()+40, 20, 20);
        lapiz.setFill(Color.GRAY);
        lapiz.fillRect(400, 370, 40, 40);
        this.carro.mover();
        Shape carro = new Rectangle(this.carro.getX()-20, this.carro.getY(),110,60);
        Shape obs = new Rectangle(400, 370, 40, 40);
        Shape inter = SVGPath.intersect(carro, obs);
        if (inter.getLayoutBounds().getWidth()== -1) {
            System.out.println("No hay colison");
        }else{
            System.out.println("Hay colison");
        }
        
    }
    
    
}
