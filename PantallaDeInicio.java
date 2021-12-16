import greenfoot.*;  


public class PantallaDeInicio extends World
{
    private Jugar jugar;
    private Instrucciones instrucciones;
    GreenfootSound inicio= new GreenfootSound("Inicio.mp3");
    //GreenfootSound instruccion= new GreenfootSound("Instrucciones.mp3");
    
    public PantallaDeInicio()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        jugar = new Jugar();
        addObject(jugar, 300, 200);
        instrucciones= new Instrucciones();
        addObject(instrucciones,300,300);
   }
   
   public void inicio(){
       
        if( Greenfoot.mouseClicked(jugar) ) {
            //inicio.play();
            NivelUno niveluno = new NivelUno();
            Greenfoot.setWorld(niveluno);
            
            
        }
        
        if( Greenfoot.mouseClicked(instrucciones) ) {
            //instruccion.play();
            PantallaDeInstruccion instruccion = new PantallaDeInstruccion();
            Greenfoot.setWorld(instruccion);
        }
    
    }
    
    public void act() {
        inicio();
    }
    
   /* public boolean identificarOpcionInstrucciones(){
   return lo envie a la pantalla de instrucciones
    }  */
    
   /* public boolean identificarOpcionJuego(){
   return lo envie al primer nivel
    }  */
}
