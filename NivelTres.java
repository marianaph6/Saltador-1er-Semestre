import greenfoot.*; 
public class NivelTres extends World
{

   public void contarTiempo(){
    //este metodo cuenta el tiempo de manera creciente
    }
    
     public void crearRunner (){
         //este metodo permite crear a runner y posicionarlo en el mundo
        
     
    }
    
    //REQUISITO NÚMERO 4
     public void crearTesoros (int numero){
         //este metodo permite crear los tesoros y posicionarlo en el aleatoriamente
        Tesoro tesoro= new Tesoro ();
        addObject(tesoro, 390,200);
        //Animacion de tesoro
    }
   
      public void perderVidasARunner(int vida) {
    // permite la cuenta regresiva de las vidas para desarollar las otras funciones
       
    }
  
      public void sumarTesoros(int tesoro) {
    // permite la suma total de tesoros para desarollar las otras funciones
       
    }
    
    public void crearEnemigoUno(int numero){
       
       
       
    
    
    }
   
    private void prepare(){
        PersonajeRunner runner= new PersonajeRunner ();
        addObject(runner, 285,200);
        Bloque bloque= new Bloque();
        addObject(bloque,285,280);
        
        FondoNivelTres fondo1 = new FondoNivelTres();
        addObject(fondo1, 960, 200);
        FondoNivelTres fondo2 = new FondoNivelTres();
        addObject(fondo2, 2880, 200);

        setPaintOrder(PersonajeRunner.class, Bloque.class, FondoNivelUno.class);

    }
    
     
    public NivelTres() { 
        
        super(600, 400, 1,false); 
        
        //showText("Vidas " + personajeRunner.getVidas(), 60, 10);
        //showText("Vidas " + personajeRunner.gettesoros(), 60, 10);
        //crearRunner();
        prepare();
        //crearEnemigoUno(5);
    }
    

}
