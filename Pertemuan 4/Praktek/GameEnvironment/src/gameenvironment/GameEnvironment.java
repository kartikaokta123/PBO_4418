/*
Kartika Okta Rachmawati
A11.2019.12197
4418
 */
package gameenvironment;
import java.util.ArrayList;
/**
 *
 * @author ASUS PC
 */
public class GameEnvironment {
    private double height;
    private double width;
    private ArrayList<GamePlayer> arrPlayer = new ArrayList<GamePlayer>();
    private ArrayList<GameEnemy> arrEnemy = new ArrayList<GameEnemy>();
    
    public GameEnvironment(){
        
    }
    public GameEnvironment(double Width, double Height){
        width = Width;
        height = Height;
    }
    public void addPlayer(GamePlayer newPlayer){
        arrPlayer.add(newPlayer);
    }
    public void removePlayer(GamePlayer newPlayer){
        arrPlayer.remove(newPlayer);
    }
    public void getAllPlayers(){
        System.out.println("get all player : " + arrPlayer);
    }
    public void addEnemy(GameEnemy newEnemies){
        arrEnemy.add(newEnemies);
    }
    public void removeEnemy(GameEnemy newEnemies){
        arrEnemy.remove(newEnemies);
    }
    public void getAllEnemies(){
        System.out.println("get all player : " + arrEnemy);
    }
    public void intraction(){
        if (arrPlayer == null || arrEnemy == null){
            System.out.println("Player or enemy not sets");
        }
        for (int i=0; i < arrPlayer.size(); i++){
            for (int j=0; j < arrEnemy.size(); j++){
                if (arrPlayer.get(i).getY() != arrEnemy.get(j).getY()){
                    System.out.println("Player: " + arrPlayer.get(i) + " and Enemy: " + arrEnemy.get(j) + " not in the same Y position" );
                }    
                if (EuclideanDistance(arrPlayer.get(i).getX(),arrPlayer.get(i).getY(),arrEnemy.get(j).getX(),arrEnemy.get(j).getY())< 2){
                    System.out.println("Player: " + arrPlayer.get(i) + " Attacked");
                    System.out.println("Enemy: " + arrEnemy.get(j) + " loses");
                    removeEnemy(arrEnemy.get(j));
                }
                else{ 
                    System.out.println("==> Player "+arrPlayer.get(i));
                    arrPlayer.get(i).Run((int)Math.ceil(Math.random()*10));
                    System.out.println("current x position = " + arrPlayer.get(i).getX() +" <==");                    
                }
            }
        }
    }
    public static int EuclideanDistance(int x1, int y1, int x2, int y2){
        return (int)Math.sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));
    }   
}
