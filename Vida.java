import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.lang.Object;
/**
 * Write a description of class Vida here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Vida extends Actor
{
    int conta=3;
    
   public void contar(int vidas){
        conta--;
   }
    
    
     
    
     
    public void act() 
    {
     setImage(new GreenfootImage("Vidas : " + conta, 30, Color.GREEN, Color.BLACK));
    } 
}
