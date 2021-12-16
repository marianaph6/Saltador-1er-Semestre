import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Mundo extends World
{

    public void contarTiempo(){
    //este metodo cuenta el tiempo de manera creciente
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
  
    
     
    public Mundo() {    
        super(570, 400, 1); 
        //showText("Vidas " + personajeRunner.getVidas(), 60, 10);
        //showText("Vidas " + personajeRunner.gettesoros(), 60, 10);
        
    }
   
    
   
}
