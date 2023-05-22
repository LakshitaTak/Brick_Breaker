/*
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.BasicStroke; // to create border between two bricks-->black borders

public class MapGenerator {
    public int[][] map;
    public int bricksWidth;
    public int bricksHeight;
    public MapGenerator(int row, int col){ //consider bricks as 2d array -->
        map = new int[row][col];
        for(int i=0; i< map.length; i++){
            for(int j=0; j< map[0].length; j++){
                map[i][j] = 1; // as we have initialized with red filled color in the bricks therefore 1-->they are not empty therefore not 0
            }
        }
        bricksWidth = 540/col; //total length/total bricks
        bricksHeight = 150/row; //total height/total bricks
    }
    public void draw(Graphics2D g){ // for filling red color
        for(int i=0; i< map.length; i++){
            for(int j=0; j< map[0].length; j++){
                if(map[i][j] > 0){
                    g.setColor(Color.ORANGE); // selection of color
                    g.fillRect(j*bricksWidth+80,i*bricksHeight+50,bricksWidth,bricksHeight); // fill will completely fill color inside blocks

                    g.setStroke(new BasicStroke(3)); //3 pixel width
                    g.setColor(Color.black);
                    g.drawRect(j*bricksWidth+80,i*bricksHeight+50,bricksWidth,bricksHeight); // draw will draw outlines of the blocks

                }
            }
        }
    }
    public void setBricksValue(int value, int row, int col){ //To change value from 1 to 0-->from brick to no brick
        map[row][col] = value;
    }
}
*/

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;


public class MapGenerator {
    public int[][] map;
    public int bricksWidth;
    public int bricksHeight;
    public MapGenerator(int row , int col){
        map = new int[row][col];
        for (int i=0; i< map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                map[i][j] = 1;
            }
        }
        bricksWidth = 540/col;
        bricksHeight = 150/row;
    }
    public void draw(Graphics2D g) {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                if (map[i][j] > 0) {
                    g.setColor(Color.blue);
                    g.fillRect(j * bricksWidth + 80, i * bricksHeight + 50, bricksWidth, bricksHeight);

                    g.setStroke(new BasicStroke(3));
                    g.setColor(Color.black);
                    g.drawRect(j * bricksWidth + 80, i * bricksHeight + 50, bricksWidth, bricksHeight);

                }
            }

        }
    }
    public void setBricksValue(int value,int row,int col)
    {
        map[row][col] = value;

    }
}


