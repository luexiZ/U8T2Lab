import java.util.ArrayList;

public class Array2DAlgorithmTester
{
    public static void main(String[] args)
    {
        int[][] testArr1 = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        System.out.println(Algorithm2DArrays.isFound(testArr1, 5));
        System.out.println(Algorithm2DArrays.isFound(testArr1, 12));
        System.out.println(Algorithm2DArrays.isFound(testArr1, 13));

        String[][] words = {{"hi", "bye", "howl", "goo"}, {"time", "owl", "you", "good"}, {"map", "low", "bow", "mom"}};
        System.out.println(Algorithm2DArrays.countElementsWithSubstring(words, "o"));
        System.out.println(Algorithm2DArrays.countElementsWithSubstring(words, "ow"));
        System.out.println(Algorithm2DArrays.countElementsWithSubstring(words, "goo"));
        System.out.println(Algorithm2DArrays.countElementsWithSubstring(words, "map"));
        System.out.println(Algorithm2DArrays.countElementsWithSubstring(words, "gone"));

        int[][] testArr2 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {4, 6, 8, 3, 5}};

        // method modifies original testArr2 object
        int changes = Algorithm2DArrays.replaceEvensWithZero(testArr2);
        System.out.println("Number of changes: " + changes);

        System.out.println("2D Array modified:");
        for (int[] row : testArr2)
        {
            for (int val : row)
            {
                System.out.print(val + " ");
            }
            System.out.println();
        }

        int[][] testArr3 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {4, 6, 8, 3, 5}};
        System.out.println(Algorithm2DArrays.sumForRow(testArr3, 0));
        System.out.println(Algorithm2DArrays.sumForRow(testArr3, 1));
        System.out.println(Algorithm2DArrays.sumForRow(testArr3, 2));

        int[][] testArr4 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {4, 6, 8, 3, 5}};
        System.out.println(Algorithm2DArrays.sumForColumn(testArr4, 0));
        System.out.println(Algorithm2DArrays.sumForColumn(testArr4, 1));
        System.out.println(Algorithm2DArrays.sumForColumn(testArr4, 2));
        System.out.println(Algorithm2DArrays.sumForColumn(testArr4, 3));
        System.out.println(Algorithm2DArrays.sumForColumn(testArr4, 4));


        // the method will print the 2D array, and also return the 2D array
//        int[][] returnedArr = Algorithm2DArrays.printNumberGrid(5, 6);
//
//        System.out.println("-----------");
//
//        // print the returned array (number grid), just to test that the
//        // correct 2D array got returned -- this should print the same grid
//        // that is printed by the method
//        for (int[] row : returnedArr)
//        {
//            for (int val : row)
//            {
//                System.out.print(val + " ");
//            }
//            System.out.println();
//        }

        String[][] xoGrid = Algorithm2DArrays.gridOfXandO(7);

        for (String[] row : xoGrid)
        {
            for (String val : row)
            {
                System.out.print(val + " ");
            }
            System.out.println();
        }


        String[][] words2 = {{"hi", "bye", "stuff", "goo"}, {"time", "up", "you", "good"}, {"map", "low", "bow", "mom"}};
        ArrayList<String> returnedList = Algorithm2DArrays.findStringsOfLength(words2, 3);
        System.out.println(returnedList);
        ArrayList<String> returnedList2 = Algorithm2DArrays.findStringsOfLength(words2, 4);
        System.out.println(returnedList2);
        ArrayList<String> returnedList3 = Algorithm2DArrays.findStringsOfLength(words2, 6);
        System.out.println(returnedList3);







    }
}
