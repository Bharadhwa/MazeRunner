import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MazeWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MazeWorld extends World
{

    /**
     * Constructor for objects of class MazeWorld.
     * 
     */
    public MazeWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 576, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Block block = new Block();
        addObject(block,0*50,10*50);
        Block block2 = new Block();
        addObject(block2,1*50,10*50);
        Block block3 = new Block();
        addObject(block3,1*50,9*50);
        Block block4 = new Block();
        addObject(block4,3*50,11*50);
        Block block5 = new Block();
        addObject(block5,3*50,10*50);
        Block block6 = new Block();
        addObject(block6,1*50,8*50);
        Block block7 = new Block();
        addObject(block7,2*50,8*50);
        Block block8 = new Block();
        addObject(block8,3*50,8*50);
        Block block9 = new Block();
        addObject(block9,6*50,0*50);
        Block block10 = new Block();
        addObject(block10,6*50,1*50);
        Block block11 = new Block();
        addObject(block11,6*50,2*50);
        Block block12 = new Block();
        addObject(block12,6*50,3*50);
        Block block13 = new Block();
        addObject(block13,6*50,4*50);
        Block block14 = new Block();
        addObject(block14,6*50,6*50);
        Block block15 = new Block();
        addObject(block15,6*50,7*50);
        Block block16 = new Block();
        addObject(block16,6*50,8*50);
        Block block17 = new Block();
        addObject(block17,6*50,9*50);
        Block block18 = new Block();
        addObject(block18,6*50,10*50);
        Block block19 = new Block();
        addObject(block19,7*50,10*50);
        Block block20 = new Block();
        addObject(block20,8*50,10*50);
        Block block21 = new Block();
        addObject(block21,5*50,9*50);
        Block block22 = new Block();
        addObject(block22,6*50,11*50);
        Block block23 = new Block();
        addObject(block23,5*50,6*50);
        Block block24 = new Block();
        addObject(block24,4*50,6*50);
        Block block25 = new Block();
        addObject(block25,0*50,6*50);
        Block block26 = new Block();
        addObject(block26,1*50,6*50);
        Block block27 = new Block();
        addObject(block27,5*50,2*50);
        Block block28 = new Block();
        addObject(block28,4*50,2*50);
        Block block30 = new Block();
        addObject(block30,1*50,2*50);
        Block block31 = new Block();
        addObject(block31,2*50,2*50);
        Block block29 = new Block();
        addObject(block29,1*50,0*50);
        Block block32 = new Block();
        addObject(block32,1*50,3*50);
        Block block33 = new Block();
        addObject(block33,1*50,4*50);
        Block block34 = new Block();
        addObject(block34,4*50,5*50);
        Block block35 = new Block();
        addObject(block35,2*50,4*50);
        Block block36 = new Block();
        addObject(block36,3*50,4*50);
        Block block37 = new Block();
        addObject(block37,7*50,4*50);
        Block block38 = new Block();
        addObject(block38,8*50,3*50);
        Block block39 = new Block();
        addObject(block39,8*50,2*50);
        Block block40 = new Block();
        addObject(block40,8*50,1*50);
        Block block41 = new Block();
        addObject(block41,8*50,6*50);
        Block block42 = new Block();
        addObject(block42,8*50,7*50);
        Block block43 = new Block();
        addObject(block43,9*50,1*50);
        Block block44 = new Block();
        addObject(block44,8*50,8*50);
        Block block45 = new Block();
        addObject(block45,9*50,5*50);
        Block block46 = new Block();
        addObject(block46,10*50,10*50);
        Block block47 = new Block();
        addObject(block47,10*50,11*50);
        Block block48 = new Block();
        addObject(block48,9*50,8*50);
        Block block49 = new Block();
        addObject(block49,10*50,8*50);
        Block block50 = new Block();
        addObject(block50,11*50,8*50);
        Block block51 = new Block();
        addObject(block51,10*50,4*50);
        Block block52 = new Block();
        addObject(block52,10*50,6*50);
        Block block53 = new Block();
        addObject(block53,10*50,3*50);
        FlyerEnemy flyerEnemy = new FlyerEnemy();
        addObject(flyerEnemy,20,344);
        FlyerEnemy flyerEnemy2 = new FlyerEnemy();
        addObject(flyerEnemy2,20,44);
    }
}
