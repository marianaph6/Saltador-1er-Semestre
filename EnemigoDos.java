import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class EnemigoDos extends Actor
{
     private int velocidad= 2;
     GifImage myGif = new GifImage("Enemigo2.gif");
    
   
 
  
    public void generarAnimacion(){
       setImage(myGif.getCurrentImage());
    }
    
    public EnemigoDos(int vel) {
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
