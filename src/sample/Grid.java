package sample.logic;

import javafx.scene.paint.Color;

import java.util.Random;
import java.util.Scanner;

public class Grid {
    public static final int SIZE=10;
    public static final Color COLOR = new Color(0.1,0.1,0.1,1);
    public final int cols;
    public final int rows;
    private Snake snake;
    public Food food;
    public Grid(final double weight, final double height){
        rows = (int) weight/ SIZE;
        cols = (int) height/SIZE;
        snake = new Snake(this, new Point(rows / 2, cols / 2));
        food = new Food(getRandomPoint());
    }
    public Point wrap(Point point){
        int x=point.getX();
        int y = point.getY();
        if(x>=rows)x=0;
        if(y>=cols)y=0;
        if(x<0)x=rows -1;
        if(y<0)y=cols-1;
        return new Point(x,y);
    }
private Point getRandomPoint(){
        Random random = new Random();
        Point point;
        do{
            point=new Point(random.nextInt(rows), random.nextInt(cols));
        }
        while(point.equals(snake.getHead()));
        return point;
}
public void update(){
        if(food.getPoint().equals(snake.getHead())){
            snake.extends();
            food.setPoint(getRandomPoint());
        }else{
            snake.move();
        }
}

    public int getCols() {
        return cols;
    }
    public int getRows(){
        return rows;
    }
    public double getWidth(){
        return rows * SIZE;
    }
    public double getHeight(){
        return cols * SIZE;
    }
    public Snake getSnake(){
        return snake;
    }
    public Food getFood(){
        return food;
    }
}
