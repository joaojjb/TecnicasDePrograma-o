import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Counter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Counter extends Actor
{
    int score = 0;
    public void act()
    {
        setImage(
        new GreenfootImage("Score : " + score, 24, Color.RED, Color.BLUE));
    }

    public void addScore()
    {
        score++;
    }
}
