/*
Kartika Okta Rachmawati
A11.2019.12197
4418
 */
package gameenvironment;

public class GameEnemy {
    private double width;
    private double height;
    private int positionX;
    private int positionY;    
    
    public GameEnemy(){
        
    }
    public GameEnemy(double Width, double Height){
        width = Width;
        height = Height;
    }
    public GameEnemy(double Width, double Height, int PositionX, int PositionY){
        width = Width;
        height = Height;
        positionX = PositionX;
        positionY = PositionY;        
    }
    public void setDimension(double Width, double Height){
        width = Width;
        height = Height;
    }
    public void setPosition(int PositionX, int PositionY){
        positionX = PositionX;
        positionY = PositionY;
    } 
    public double getWidth(){
        return width;
    }   
    public double getHeight(){
        return height;
    }
    public int getX(){
        return positionX;
    }   
    public int getY(){
        return positionY;
    }  
    public void Run(){
        System.out.println("Player is running");
    }
}

