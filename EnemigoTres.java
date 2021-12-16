import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EnemigoTres here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EnemigoTres extends Actor
{
    GifImage myGif = new GifImage("Enemigo3.gif");
    private int velocidad= 1;
    
    public void generarAnimacion(){
       setImage(myGif.getCurrentImage());
    }
    
      public EnemigoTres(int vel) {
           velocidad=vel;
    }
  
    public void mover(){
         setLocation(getX()+velocidad, getY());            
        
     }
     
    
    public void act() 
    {
        generarAnimacion();
        mover();
    }    
}
