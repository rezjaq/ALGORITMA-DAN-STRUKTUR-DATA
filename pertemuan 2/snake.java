import java.util.*;
public class snake {
    Scanner input = new Scanner (System.in);
    int x,y,width,height;
    
    snake(int x,int y,int width,int height){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
    void moveLeft(){
        if(x>0){
            x--;
        }
        else{
            detectCollision(x, y);
        }
    }
    void moveRight(){
        if(x<width){
            x--;
        }
        else{
            detectCollision(x, y);
        }
    }
    void moveUp(){
        if(y>0){
            y--;
        }
        else{
            detectCollision(x, y);
        }
    }
    void moveDown(){
        if(y<height){
            y++;
        }
        else{
            detectCollision(x, y);
        }
    }
    void printPosition(){
        System.out.println("snake position : "+x+","+y+")");
    }
    void detectCollision(int x, int y){
        System.out.println("GAME OVER");
    }
}
