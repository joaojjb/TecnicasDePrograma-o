import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Peixe here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Peixe extends Actor
{
       
    int xPos;
    int yPos;
    int movimentacaoHorizontal = 2;
    int movimentacaoVertical = 2;
    public void act()
    {   
        xPos = getX();
        yPos = getY();
        
        if( (xPos > 955) || (xPos < 5) ){
            movimentacaoHorizontal *= -1;
        }
        
        if( (yPos > 555) || (yPos < 5) ){
            movimentacaoVertical *= -1;
        }
        
    
        setLocation(xPos + movimentacaoHorizontal, yPos + movimentacaoVertical);
        
        
        Tubarao tubarao = new Tubarao();
        if(isTouching(Tubarao.class))
        {
            World myWorld = getWorld();
            Sea sea = (Sea)myWorld;
            Counter counter = sea.getCounter();
            counter.addScore();
            myWorld.removeObject(this); 
        }
    }
    
    public void moveAround()
    {
 
    }
    
}
