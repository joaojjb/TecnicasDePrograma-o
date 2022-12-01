import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sea extends World
{
    Counter counter = new Counter();

    public Sea()
    {    
        super(1000, 600, 1); 
        prepare();
    }
    
    public Counter getCounter()
    {
        return counter;
    }
    
    
    
    private void prepare()
    {
        addObject(counter, 100, 40);

        Peixe peixe = new Peixe();
        addObject(peixe,200,400);
        Peixe[] peixes = new Peixe[20];
        for(int i=0; i < peixes.length;i++)
        {
            peixes[i] = new Peixe();
            int peixeX = Greenfoot.getRandomNumber(getWidth());
            int peixeY = Greenfoot.getRandomNumber(getHeight());
            addObject(peixes[i], peixeX, peixeY);

        }

        
        Tubarao tubarao = new Tubarao();
        addObject(tubarao,340,255);
        tubarao.setLocation(393,204);

    }
}
