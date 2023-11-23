import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pikachu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pikachu extends Actor
{
    public int speed = 6;
    /**
     * Act - do whatever the Pikachu wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        movimento();
    }
    public void movimento(){
       
    if (Greenfoot.isKeyDown("up")){
        this.setLocation(this.getX(), this.getY() - speed); 
    }    
    if (Greenfoot.isKeyDown("down")){
        this.setLocation(this.getX(), this.getY() + speed);  
    }
    if (Greenfoot.isKeyDown("left")){
        this.setLocation(this.getX() - speed, this.getY());  
    }   
    if (Greenfoot.isKeyDown("right")){    
        this.setLocation(this.getX() + speed, this.getY()); 
    }
       else if (Greenfoot.isKeyDown("k")){
    getWorld().addObject(new fifa(),getX() - 100, getY() + 30);    
    }
}

}
