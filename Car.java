import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;

public class Car extends Actor
{
    int offsetX = 5;
    int offsetY = 5;
    
    private Random random = new Random();
    private static int nextOffset = 5;
    
    public Car(){
        offsetX = random.nextInt(5) + 3;
        offsetY = random.nextInt(5) + 3;
        
        nextOffset +=3;
    }
    public void act()
    {
        int x = getX();
        int y = getY();
        
        setLocation(x+offsetX,y+offsetY);
        
        if(getY() >= 380 || getY() <= 0){
            offsetY *= -1;
        }
        if(getX() >= 575 || getX() <= 0){
            offsetX *= -1;
        }
    }
}