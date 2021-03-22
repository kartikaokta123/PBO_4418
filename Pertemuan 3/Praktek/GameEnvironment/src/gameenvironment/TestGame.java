/*
Kartika Okta Rachmawati
A11.2019.12197
4418
 */
package gameenvironment;

public class TestGame {
    public static void main(String[] args) {
        GameEnemy kuy = new GameEnemy();
        kuy.setPosition(75, 80);
        kuy.setDimension(5.45, 5.73);
        kuy.Run();
        
        GamePlayer play = new GamePlayer();
        play.setDimension(8.05, 4.5);
        play.setPosition(60, 0);
        play.Run(30);
        
    }
}
