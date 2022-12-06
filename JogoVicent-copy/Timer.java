import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Timerr here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Timer extends Actor
{
    private int time = 55*17;
    public void act()
    {
      time--;
      if(time % 55 == 0) updateImage();
      if(time < 1) Greenfoot.stop();
    }

    private void updateImage()
    {
        setImage(new GreenfootImage(
        "Tempo: " + + time/55, 20, Color.GREEN, Color.YELLOW));
    }

}
