import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FlyerEnemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FlyerEnemy extends Enemies
{
    /**
     * Act - do whatever the FlyerEnemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public FlyerEnemy()
    {
        getImage().scale(getImage().getWidth()/2, getImage().getHeight()/2);
    }
    public void act()
    {
        move(5);
        wrapAtEdge();
    }
}
