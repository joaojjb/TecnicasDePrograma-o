import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PeixinVerde here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PeixinVerde extends Actor
{
    /**
     * Act - do whatever the PeixinVerde wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {   
        Tubarao tubarao = new Tubarao();
        if(isTouching(Tubarao.class)){
            World myWorld = getWorld();
            myWorld.removeObject(this); 
            Greenfoot.stop();
        }
    }
}
