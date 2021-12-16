import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class PersonajeRunner extends Actor
{
    private int vidas=3;
    private int tesoro;
    public static final int DESACELERACION = 2;
    private int velocidadVertical;
    private int fuerzaDeSalto=30;
    private int indiceImagenes;
    public static final int CANTIDAD_IMAGENES = 4;
    GifImage myGif = new GifImage("Runer.gif");
    GreenfootSound saltar = new GreenfootSound("Saltar.mp3");
    GreenfootSound agachar = new GreenfootSound("Agachar.mp3");
    
    public PersonajeRunner(){
    
    
       
    
    
    }
    
   
    
    public void chocar(){
      Actor EnemigoUno;
      EnemigoUno =getOneObjectAtOffset(0,0, EnemigoUno.class);
    
      
      if (EnemigoUno!= null){
        NivelUno nivelUno= (NivelUno) getWorld();
        getWorld().removeObject(EnemigoUno);
        Vida conta= nivelUno.getVidas();
        conta.contar(1);
        }
    }
 
    public void chocar2(){
      Actor EnemigoDos;
      EnemigoDos =getOneObjectAtOffset(0,0, EnemigoDos.class);
    
      
      if (EnemigoDos!= null){
        NivelUno nivelUno= (NivelUno) getWorld();
        getWorld().removeObject(EnemigoDos);
        Vida conta= nivelUno.getVidas();
        conta.contar(1);
        }
    }
  
      public void chocar3(){
      Actor EnemigoTres;
      EnemigoTres =getOneObjectAtOffset(0,0, EnemigoTres.class);
    
      
      if (EnemigoTres!= null){
        NivelUno nivelUno= (NivelUno) getWorld();
        getWorld().removeObject(EnemigoTres);
        Vida conta= nivelUno.getVidas();
        conta.contar(1);
        }
    }
   
  
   
    
    // REQUISITO NÚMERO 2
   
   
    //REQUISITO NÚMERO 3
   public boolean hayOrdenDeSaltar(){
       return Greenfoot.isKeyDown("up");
   }
   
   
   
   public boolean estaSobrePlataforma() {
        Bloque p = null;
        int dx = getImage().getWidth()/2;
        int dy = getImage().getHeight()/2;
        
        if( (p = (Bloque)getOneObjectAtOffset(0, dy, Bloque.class)) != null ) {

            return true;
        }else if( (p = (Bloque)getOneObjectAtOffset(dx, dy, Bloque.class)) != null ) {
           
            return true;
        } else if( (p = (Bloque)getOneObjectAtOffset(-dx, dy, Bloque.class)) != null ) {
         
            return true;
        }        
        return false;
    }
    
    public void saltar(){
        if( hayOrdenDeSaltar() && estaSobrePlataforma() ) {
            saltar.play();
            velocidadVertical = -fuerzaDeSalto;
            setLocation(getX(), getY() + velocidadVertical);
        }
        caer();
        
        //Generar sonido
    }
    
    public void caer(){
    // este metodo le permite a runner generar un movimiento de decrecimiento despues de saltar
       if( !estaSobrePlataforma() ) {
            velocidadVertical += DESACELERACION;
            setLocation(getX(), getY() + velocidadVertical);
        }
        
        }
  
    
    //REQUISITO NÚMERO 1
    public boolean hayOrdenDeAgacharse(){
        if(Greenfoot.isKeyDown("down")){
            setImage("run_7.png");
            agachar.play();
        }else {
            setImage(myGif.getCurrentImage());
        }
        return true;
    }
    
 
  
   
    
    
    public void act() 
    {
        chocar();
        chocar2();
        hayOrdenDeAgacharse();
        hayOrdenDeSaltar();
        saltar();
        chocar3();
    }    
}
