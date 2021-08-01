import java.lang.reflect.Array;
import java.util.Arrays;

public class Grid {

    int[][] grid;

    public Grid() {
        grid = new int[4][4];
    }


    public void setGrid(int[][] numbers) {
        for(int i = 0; i<numbers.length; i++)
        {
            for(int j = 0; j<numbers[i].length; j++)
            {
                grid[i][j]= numbers[i][j];

            }



        }


    }

    public int[][] getGrid() {
        return grid;
    }

    public int getOneNumber(int x, int y)
    {
        return this.grid[x][y];


    }


   public void showGrid()
   {

       for(int i = 0; i<grid.length; i++) {
           for (int j = 0; j < grid[i].length; j++) {
               grid[i][j] = grid[i][j];


               System.out.println("    1  2  3  4");
               System.out.println("    ____________");
               System.out.println("  1 |           ");
               System.out.println("  2 |           ");
               System.out.println("  3 |           ");
               System.out.println("  4 |           ");


           }

       }}



}
