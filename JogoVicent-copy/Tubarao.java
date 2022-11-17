import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tubarao here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tubarao extends Actor
{
    public void act()
    {
        move(1);
        
        if(Greenfoot.isKeyDown("right"))
        {
            move(2);    
            turn(2);
        }
        
        if(Greenfoot.isKeyDown("left")){
            move(2);
            turn(-2);
        }
        
         if(Greenfoot.isKeyDown("up")){
            move(2);
            turn(-2);
        }
    }
}
