import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tubarao here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tubarao extends Actor
{   
    private int velocidade;
    
    public Tubarao(int largura, int altura){
        getImage().scale(largura,altura);
        this.velocidade = 2;
    }

    public void act()
    {
       
        
        move(velocidade);
        
        if(isTouching(Peixe.class)){
           this.velocidade = this.velocidade + velocidade/4;
        }
        
        if(Greenfoot.isKeyDown("right"))
        {
            move(velocidade + 1);    
            turn(2);
        }
        
        if(Greenfoot.isKeyDown("left")){
            move(velocidade + 1);
            turn(-2);
        }
        
         if(Greenfoot.isKeyDown("up")){
            move(velocidade + 1);
            turn(-2);
        }
        
        
    }
}
