import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PeixinVermei here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PeixeVermelho extends Actor
{
    int xPos;
    int yPos;
    int movimentacaoHorizontal = 2;
    int movimentacaoVertical = 2;
    
    public PeixeVermelho(int largura, int altura){
        getImage().scale(largura,altura);
    }
    
    public void act()
    {   
       
        moveAround();
        virouComidaIndigesta();
       
    }
    
    public void virouComidaIndigesta(){
        Tubarao tubarao = new Tubarao(1,1);
        if(isTouching(Tubarao.class))
        {
            World myWorld = getWorld();
            Sea sea = (Sea)myWorld;
            Counter counter = sea.getCounter();
            counter.removeScore();
            myWorld.removeObject(this); 
        }
    }
    
    public void moveAround(){
         xPos = getX();
        yPos = getY();
        
        if( (xPos > 955) || (xPos < 5) ){
            movimentacaoHorizontal *= -1;
        }
        
        if( (yPos > 555) || (yPos < 5) ){
            movimentacaoVertical *= -1;
        }
        setLocation(xPos + movimentacaoHorizontal, yPos + movimentacaoVertical);
    }
}
