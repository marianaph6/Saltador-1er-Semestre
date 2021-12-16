import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class EnemigoUno extends Actor
{
     private int velocidad= 3;
     GifImage myGif = new GifImage("Enemigo1.gif");
    
      
    
    public void generarAnimacion(){
       setImage(myGif.getCurrentImage());
    }
   
    public EnemigoUno(int vel) {
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
