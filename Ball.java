import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;

public class Ball extends Actor
{
    int offsetX = 5;
    int offsetY = 5;
    
    private Random random = new Random();
    private static int nextOffset = 5;
    
    public Ball(){
        offsetX = random.nextInt(5) + 3;
        offsetY = random.nextInt(5) + 3;
        
        nextOffset +=3;
    }
    public void act()
    {
        int x = getX();
        int y = getY();
        int cont=0;
        
        setLocation(x+offsetX,y+offsetY);
        
        if(getY() >= 380 || getY() <= 0){
            offsetY *= -1;
        }
        if(getX() >= 575 || getX() <= 0){
            offsetX *= -1;
        }
        
        Car car = (Car)getOneIntersectingObject(Car.class);
        if(car != null ){
            cont++;
            if(cont == 1){
                World world = getWorld();
                Bomb bomb = new Bomb();
                world.addObject(bomb,getX(),getY());
            }
        }
    }
}
