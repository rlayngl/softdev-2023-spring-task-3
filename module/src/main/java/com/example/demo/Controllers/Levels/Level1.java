package com.example.demo.Controllers.Levels;

import com.example.demo.Controllers.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

public class Level1 {
    public Pane gameRoot = new Pane();
    public Pane appRoot = new Pane();
    public Pane extraGameRoot = new Pane();
    public ImageView imageViewHero = new ImageView(new Image("Images/Sprites/SpriteHero.png"));
    public ImageView imageViewHeroViewFromAbove = new ImageView(new Image("Images/Sprites/SpriteHeroViewFromAbove.png"));
    public ImageView imageViewCoin = new ImageView(new Image("Images/Sprites/SpriteCoin.png"));
    public ImageView imageViewCoinViewFromAbove = new ImageView(new Image("Images/Sprites/SpriteCoinViewFromAbove.png"));
    public List<Obstacle> listOfObstacles = new ArrayList<>();
    public List<ObstacleAbove> listOfObstaclesViewFromAbove = new ArrayList<>();
    public List<Integer> list = new ArrayList<>();
    public List<Integer> listAbove = new ArrayList<>();
    public Integer level = 1;
    public ImageView backgroundSkyImage = new ImageView(new Image("Images/Level1/Sunset.png"));
    public ImageView backgroundGroundImage = new ImageView(new Image("Images/Level1/GroundAboveForSunset.png"));
    public Level1() {}
    public void start(Stage stage) {
        LevelController levelController = new LevelController();
        Image wall = new Image("Images/Walls/Wall.jpg");
        Image highWall = new Image("Images/Walls/HighWall.jpg");
        Obstacle obstacle = new Obstacle(3000, 250, new Image("Images/Level1/GroundForSunset.png"));
        Obstacle obstacle3 = new Obstacle(70, 210, highWall);
        Obstacle obstacle4 = new Obstacle(70, 210, highWall);
        Obstacle obstacle5 = new Obstacle(70, 210, highWall);
        Obstacle obstacle6 = new Obstacle(70, 70, wall);
        Obstacle obstacle7 = new Obstacle(70, 70, wall);
        Obstacle obstacle8 = new Obstacle(70, 70, wall);
        Obstacle obstacle9 = new Obstacle(70, 70, wall);
        Obstacle obstacle10 = new Obstacle(70, 70, wall);
        Image longWall = new Image("Images/Walls/LongWall.jpg");
        ObstacleAbove obstacleViewFromAbove = new ObstacleAbove(70, 70, wall);
        ObstacleAbove obstacleViewFromAbove2 = new ObstacleAbove(70, 70, wall);
        ObstacleAbove obstacleViewFromAbove3 = new ObstacleAbove(70, 70, wall);
        ObstacleAbove obstacleViewFromAbove4 = new ObstacleAbove(70, 70, wall);
        ObstacleAbove obstacleViewFromAbove5 = new ObstacleAbove(70, 70, wall);
        ObstacleAbove obstacleViewFromAbove6 = new ObstacleAbove(70, 70, wall);
        ObstacleAbove obstacleViewFromAbove7 = new ObstacleAbove(70, 70, wall);
        ObstacleAbove obstacleViewFromAbove8 = new ObstacleAbove(70, 900,longWall);
        ObstacleAbove obstacleViewFromAbove9 = new ObstacleAbove(70, 900,longWall);
        ObstacleAbove obstacleViewFromAbove10 = new ObstacleAbove(70, 900,longWall);
        ObstacleAbove obstacleViewFromAbove11 = new ObstacleAbove(70, 900,longWall);
        obstacle.setTranslateY(630);
        obstacle3.setTranslateX(1000);
        obstacle3.setTranslateY(420);
        obstacle4.setTranslateX(1700);
        obstacle4.setTranslateY(420);
        obstacle5.setTranslateX(2400);
        obstacle5.setTranslateY(420);
        obstacle6.setTranslateY(560);
        obstacle6.setTranslateX(2700);
        obstacle7.setTranslateY(560);
        obstacle7.setTranslateX(2000);
        obstacle8.setTranslateY(560);
        obstacle8.setTranslateX(1350);
        obstacle9.setTranslateY(560);
        obstacle9.setTranslateX(1420);
        obstacle10.setTranslateY(490);
        obstacle10.setTranslateX(1420);
        obstacleViewFromAbove.setTranslateX(2400);
        obstacleViewFromAbove.setTranslateY(725);
        obstacleViewFromAbove2.setTranslateX(1000);
        obstacleViewFromAbove3.setTranslateX(1700);
        obstacleViewFromAbove3.setTranslateY(795);
        obstacleViewFromAbove4.setTranslateX(2400);
        obstacleViewFromAbove4.setTranslateY(655);
        obstacleViewFromAbove5.setTranslateX(2400);
        obstacleViewFromAbove5.setTranslateY(795);
        obstacleViewFromAbove6.setTranslateX(2400);
        obstacleViewFromAbove6.setTranslateY(655);
        obstacleViewFromAbove7.setTranslateX(2400);
        obstacleViewFromAbove7.setTranslateY(585);
        obstacleViewFromAbove8.setTranslateX(2700);
        obstacleViewFromAbove9.setTranslateX(2000);
        obstacleViewFromAbove10.setTranslateX(1350);
        obstacleViewFromAbove11.setTranslateX(1420);
        listOfObstacles.add(obstacle);
        listOfObstacles.add(obstacle3);
        listOfObstacles.add(obstacle4);
        listOfObstacles.add(obstacle5);
        listOfObstacles.add(obstacle6);
        listOfObstacles.add(obstacle7);
        listOfObstacles.add(obstacle8);
        listOfObstacles.add(obstacle9);
        listOfObstacles.add(obstacle10);
        listOfObstaclesViewFromAbove.add(obstacleViewFromAbove);
        listOfObstaclesViewFromAbove.add(obstacleViewFromAbove2);
        listOfObstaclesViewFromAbove.add(obstacleViewFromAbove3);
        listOfObstaclesViewFromAbove.add(obstacleViewFromAbove4);
        listOfObstaclesViewFromAbove.add(obstacleViewFromAbove5);
        listOfObstaclesViewFromAbove.add(obstacleViewFromAbove6);
        listOfObstaclesViewFromAbove.add(obstacleViewFromAbove7);
        listOfObstaclesViewFromAbove.add(obstacleViewFromAbove8);
        listOfObstaclesViewFromAbove.add(obstacleViewFromAbove9);
        listOfObstaclesViewFromAbove.add(obstacleViewFromAbove10);
        listOfObstaclesViewFromAbove.add(obstacleViewFromAbove11);
        listOfObstacles.forEach(e -> list.add((int) e.getTranslateX()));
        listOfObstaclesViewFromAbove.forEach(e -> listAbove.add((int) e.getTranslateX()));

        levelController.hero = new Hero(levelController, imageViewHero);
        levelController.heroAbove = new HeroAbove(levelController, imageViewHeroViewFromAbove);
        levelController.coin = new Coin(levelController, imageViewCoin);
        levelController.coinAbove = new CoinAbove(levelController, imageViewCoinViewFromAbove);
        levelController.gameRoot = gameRoot;
        levelController.appRoot = appRoot;
        levelController.extraGameRoot = extraGameRoot;
        levelController.currentLevel = level;
        levelController.backgroundGroundImage = backgroundGroundImage;
        levelController.backgroundSkyImage = backgroundSkyImage;
        levelController.list = list;
        levelController.listOfObstacles = listOfObstacles;
        levelController.listOfObstaclesAbove = listOfObstaclesViewFromAbove;
        levelController.hero.setTranslateX(10);
        levelController.hero.setTranslateY(480);
        levelController.heroAbove.setTranslateX(10);
        levelController.heroAbove.setTranslateY(700);
        levelController.start(stage);
        stage.setFullScreen(true);
    }
}
