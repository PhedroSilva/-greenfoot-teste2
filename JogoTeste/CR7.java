import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CR7 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CR7 extends Actor
{   public int speed =6;
    /**
     * Act - do whatever the CR7 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        movimento();
    }
    public void movimento(){
    
    if (Greenfoot.isKeyDown("w")){
        this.setLocation(this.getX(), this.getY() - speed); 
    }    
    if (Greenfoot.isKeyDown("s")){
        this.setLocation(this.getX(), this.getY() + speed);  
    }
    if (Greenfoot.isKeyDown("a")){
        this.setLocation(this.getX() - speed, this.getY());  
    }   
    if (Greenfoot.isKeyDown("d")){    
        this.setLocation(this.getX() + speed, this.getY());
    }
    else if (Greenfoot.isKeyDown("F")){
    getWorld().addObject(new boladeouro(),getX() - 100, getY() + 30);    
    }
    }}

