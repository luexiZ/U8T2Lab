import java.util.ArrayList;

public class Algorithm2DArrays
{

    public static boolean isFound(int[][] arr, int target)
    {
        for(int[] row : arr)
        {
            for(int num : row)
            {
                if(num == target)
                {
                    return true;
                }
            }
        }
        return false;
    }

    public static int countElementsWithSubstring(String[][] arr, String searchStr)
    {
        int counter = 0;
        for(String[] row: arr)
        {
            for(String str : row)
            {
                if(str.indexOf(searchStr) != -1)
                {
                    counter++;
                }
            }
        }
        return counter;
    }

    public static int replaceEvensWithZero(int[][] arr)
    {
        int counter = 0;
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < arr[i].length; j++)
            {
                if(arr[i][j] % 2 == 0)
                {
                    arr[i][j] = 0;
                    counter++;
                }
            }
        }
        return counter;
    }

    public static int sumForRow(int[][] arr, int row)
    {
        int sum = 0;
        for(int i = 0; i < arr[row].length; i++)
        {
            sum += arr[row][i];
        }
        return sum;
    }

    public static int sumForColumn(int[][] arr, int col)
    {
        int sum = 0;
        for(int i = 0; i < arr.length; i++)
        {
            sum += arr[i][col];
        }
        return sum;
    }

    public static int[][] printNumberGrid(int rows, int cols)
    {
        int[][] grid = new int[rows][cols];
        int num = 0;
        for(int i = 0; i < grid.length; i++)
        {
            for(int j = 0; j < grid[i].length; j++)
            {
                grid[i][j] = num;
                System.out.print(grid[i][j] + " ");
                num++;
            }
            System.out.println();
        }
        return grid;
    }

    public static String[][] gridOfXandO(int n)
    {
        String[][] XO = new String[n][n];
        int X = 0;
        for(int i = 0; i < XO.length; i++)
        {
            for(int j = 0; j < XO[i].length; j++)
            {
                if(X == 0)
                {
                    XO[i][j] = "X";
                    X++;
                }
                else
                {
                    X--;
                    XO[i][j] = "O";
                }
            }
        }
        return XO;
    }

    public static ArrayList<String> findStringsOfLength(String[][] wordChart, int len)
    {
        ArrayList<String> arr = new ArrayList<String>();
        for(int i = 0; i < wordChart.length; i++)
        {
            for(int j = 0; j < wordChart[i].length; j++)
            {
                if(wordChart[i][j].length() == len)
                {
                    arr.add(wordChart[i][j]);
                }
            }
        }
        return arr;
    }





}
