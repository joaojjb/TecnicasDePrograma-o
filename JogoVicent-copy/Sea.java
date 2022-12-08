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
    Timer timer = new Timer();
    PeixinMorto peixeMorto = new PeixinMorto(60,60);
    PeixinMorto peixeMorto2 = new PeixinMorto(60,60);
    ImagemCounter imagemCounter = new ImagemCounter();
    ImagemTimer imagemTimer = new ImagemTimer();
    public Sea()
    {    
        super(1000, 600, 1); 
        prepare();
    }
    
    public Counter getCounter()
    {
        return counter;
    }
    
    public Timer timer()
    {
        return timer;
    }
    
    private void prepare()
    {   
        adicionaPeixes();
        adicionaTubarao();
        adicionaPeixesMortos();
        adicionaPeixesVermelhos();    
        
        adicionaTimer();
        adicionaCounter();
        
        

    }
    
    
    
    public void adicionaPeixes(){
        Peixe[] peixes = new Peixe[20];
        for(int i=0; i < peixes.length;i++)
        {
            peixes[i] = new Peixe();
            int peixeX = Greenfoot.getRandomNumber(getWidth());
            int peixeY = Greenfoot.getRandomNumber(getHeight());
            addObject(peixes[i], peixeX, peixeY);

        }
    }
    
    public void adicionaTubarao(){
        Tubarao tubarao = new Tubarao(100,110);
        addObject(tubarao,393,204);
    }
    
    public void adicionaTimer(){
        addObject(imagemTimer, 75, 75);
        addObject(timer, 140, 75);
    }
    
     public void adicionaCounter(){
        addObject(imagemCounter,100, 40);
        addObject(counter, 160, 40);
    }
    
    public void adicionaPeixesMortos(){
        addObject(peixeMorto,200,455);
        addObject(peixeMorto2,800,455);
    }
    
    public void adicionaPeixesVermelhos(){
        PeixeVermelho[] peixesVermelhos = new PeixeVermelho[5];
        for(int i=0; i < peixesVermelhos.length;i++)
        {
            peixesVermelhos[i] = new PeixeVermelho(50,50);
            int peixinX = Greenfoot.getRandomNumber(getWidth());
            int peixinY = Greenfoot.getRandomNumber(getHeight());
            addObject(peixesVermelhos[i], peixinX, peixinY);
        }
    }
}
