import java.util.Random;

public class LightBoard {
    private boolean[][] lights;

    public LightBoard(int numRows, int numCols)
    {
        lights = new boolean[numRows][numCols];
        // To be implemented.
        for(int i=0;i<numRows;i++){
            for(int j=0;j<numCols;j++){
                Random rand = new Random();
                int rand_int1 = rand.nextInt(10);
                lights[i][j]= rand_int1<4;
            }
        }

    }

    public boolean evaluateLight(int row, int col)
    {
        int colCount = 0;
        for(int i=0;i<lights.length;i++){
            if(lights[i][col]){
                colCount++;
            }
        }
        if(lights[row][col]){
            if(colCount%2 ==0){
                return false;
            }
        }else{
            if(colCount%3 == 0){
                return true;
            }
        }
        return lights[row][col];
    }

    public boolean[][] getLights(){
        return lights;
    }

    public void setLights(boolean[][] lights){
        this.lights = lights;
    }
}
