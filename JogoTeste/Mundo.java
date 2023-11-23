import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mundo here.
 * 
 * @author phedro066
 * @version 0.1 Alpha
 */
public class Mundo extends World
{
    private GreenfootSound bgMusic = new GreenfootSound("som.mp3");
    
    public void started()
{
    bgMusic.playLoop();
}

public void stopped()
{
    bgMusic.pause();
}
    
    /**
     * Constructor for objects of class Mundo.
     * 
     */
    public Mundo()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
    }
    
    /**
     * Prepara o mundo para o início do programa.
     * Ou seja: criar os objetos iniciais e adicioná-los ao mundo.
     */
    private void prepare()
    {
        Pikachu pikachu = new Pikachu();
        addObject(pikachu,668,440);
        CR7 cR7 = new CR7();
        addObject(cR7,139,435);
        sol sol = new sol();
        addObject(sol,593,192);
        Counter counter = new Counter();
        addObject(counter,112,66);
        Counter2 counter2 = new Counter2();
        addObject(counter2,645,79);
    }
}
