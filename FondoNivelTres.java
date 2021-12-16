import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FondoNivelTres here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FondoNivelTres extends Actor
{
     private int velocidad;
    
    public FondoNivelTres() {
        velocidad = 1;
    }
    
    public void mover() {
        setLocation(getX() - velocidad, getY());
    }
    
    public void act() {
        if( getX() <= -960 ) {
            setLocation(2880, 200);
        }
        mover();
    }  
    }    

