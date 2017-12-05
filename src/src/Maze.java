import java.lang.reflect.Array;
import java.util.Arrays;

public class Maze {
    String[][] block;

    public Maze(){
    }


    public void start(int y ,int x){
        block[y][x] = "s";
    }

    public void goal(int y, int x){
        block[y][x] = "g";
    }

    public void mazeSize(int x, int y){
        block = new String[y][x];
        for(int i=0; i<x ;i++){
            block[0][i] = "#";
            block[y-1][i] = "#";
        }
        for(int i=1;i<y-1;i++){
            block[i][0]= "#";
            block[i][x-1] = "#";
        }
        start(4,1);
        System.out.println(Arrays.deepToString(block));
    }
}
