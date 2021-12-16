
import greenfoot.*;  


public class NivelUno extends World
{
    private Vida vida;
    Vida conta = new Vida();
    private PersonajeRunner personaje;
    private EnemigoUno enemigouno;
    private EnemigoDos enemigodos;
    private EnemigoTres enemigotres;
    private int cont=0;
  
    public void contarTiempo(){
    //este metodo cuenta el tiempo de manera creciente
    }
    
   
     public Vida getVidas()
    {
        return conta;
    }
    
   public void añadirTablero(){
    addObject(conta,100,20);
    
    }
    
    public void act(){
           if(cont>0)cont--;
         else 
         cont=350;
      
        if(cont==1){
            int y=Greenfoot.getRandomNumber(getHeight()/2);
            addObject(new EnemigoUno(-(2+Greenfoot.getRandomNumber(1))), getWidth(),y);
           
    }
    
         if(cont>0)cont--;
         else 
         cont=550;
      
        if(cont==1){
            int y=Greenfoot.getRandomNumber(getHeight()/2);
            addObject(new EnemigoDos(-(2+Greenfoot.getRandomNumber(1))), getWidth(),y);
            addObject(new EnemigoTres(-(3+Greenfoot.getRandomNumber(2))), getWidth(),y);
    }
    
      
    }
    
      public void perderVidasARunner(int vida) {
    // permite la cuenta regresiva de las vidas para desarollar las otras funciones
       
    }
   //REQUISITO NÚMERO 4
     public void crearTesoros (int numero){
         //este metodo permite crear los tesoros y posicionarlo en el aleatoriamente
        Tesoro tesoro= new Tesoro ();
        addObject(tesoro, 390,200);
        //Animacion de tesoro
    }
    
      public void sumarTesoros(int tesoro) {
    // permite la suma total de tesoros para desarollar las otras funciones
       
    }
    
  
    
   

    private void prepare(){
        PersonajeRunner runner= new PersonajeRunner ();
        addObject(runner, 285,200);
        Bloque bloque= new Bloque();
        addObject(bloque,285,280);
        
        FondoNivelUno fondo1 = new FondoNivelUno();
        addObject(fondo1, 960, 200);
        FondoNivelUno fondo2 = new FondoNivelUno();
        addObject(fondo2, 2880, 200);
        
       
        setPaintOrder( Vida.class,EnemigoUno.class,EnemigoDos.class,EnemigoTres.class,PersonajeRunner.class, Bloque.class,FondoNivelUno.class);

    }
    

    
   
    public NivelUno() { 
        
        super(600, 400, 1,false); 
        prepare();
        añadirTablero();
         
        //showText("Vidas " + personajeRunner.gettesoros(), 60, 10);
        
    }
    
   }
    
     
   
    
   
    
    
   

