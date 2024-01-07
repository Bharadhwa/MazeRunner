import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Runner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Runner extends Movers
{
    /**
     * Act - do whatever the Runner wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Runner()
    {
        getImage().scale(getImage().getWidth()/3, getImage().getHeight()/3);
    }
    
    public void act()
    {
        slideAround();
        collectBoost();
        maxSpeed();
    }
    //Maze runners moments
    
}

