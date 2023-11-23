import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class fifa here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class fifa extends Pikachu
{
    /**
     * Act - do whatever the fifa wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
           MoveAtaque();// Add your action code here.
           acertarAlvo();
    }
    public void MoveAtaque()
    {
        double angle = Math.toRadians(getRotation() );
        int x = (int) Math.round(getX() - Math.cos(angle));
        int y = (int) Math.round(getY() + Math.sin(angle));
        
        setLocation(x, y);
    }
    public void acertarAlvo(){
    Actor a = getOneIntersectingObject(CR7.class);
        
        if (a != null){
            
            Counter2 counter = (Counter2) getWorld().getObjects(Counter2.class).get(0);
            counter.add(1);
            
            getWorld().removeObject(a);
            getWorld().removeObject(this);
        }
    }
}
