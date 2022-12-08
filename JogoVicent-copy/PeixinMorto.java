import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PeixinVerde here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PeixinMorto extends Actor
{
    public PeixinMorto(int largura, int altura){
        getImage().scale(largura,altura);
    }
    
    public void act()
    {   
       matarTubarao();
    }
    
    public void matarTubarao(){
        Tubarao tubarao = new Tubarao(1,1);
        if(isTouching(Tubarao.class)){
            World myWorld = getWorld();
            myWorld.removeObject(this);
            Greenfoot.stop();
        }
    }
}
