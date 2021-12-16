import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FondoNivelUno here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FondoNivelUno extends Actor
{
  private int velocidad;
    
    public FondoNivelUno() {
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
