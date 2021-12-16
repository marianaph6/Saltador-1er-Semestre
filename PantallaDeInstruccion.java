import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class instruccion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PantallaDeInstruccion extends World
{

    private Flecha flecha;
    
    
    public PantallaDeInstruccion()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        flecha = new Flecha();
        addObject(flecha, 20, 20);
    }
    
    public void act() {
        if( Greenfoot.mouseClicked(flecha) ) {
            PantallaDeInicio pantallainicio = new PantallaDeInicio();
            Greenfoot.setWorld(pantallainicio); 
        }
    }
}
