import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Car here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Car extends Actor
{
    private int year;
    private String make;
    private int speed;
    private boolean crash;
    
    private String upKey;
    private String downKey;
    private String leftKey;
    private String rightKey;
    
    public Car( int year, String make, String up, String down, String left, String right )
    {
        this.year = year;
        this.make = make;
        
        upKey = up;
        downKey = down;
        leftKey = left;
        rightKey = right;
        
        speed = 0;
        crash = false;
    }
    
    public int getYear()
    {
        return year;
    }
    
    public String getMake()
    {
        return make;
    }
    
    public int getSpeed()
    {
        return speed;
    }
    
    private void accelerate()
    {
        //This increases speed by 1
        speed++;
    }
    
    private void brake()
    {
        //This decreases speed by 1
        speed--;
    }
    
    /**
     * Act - do whatever the Car wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
}
