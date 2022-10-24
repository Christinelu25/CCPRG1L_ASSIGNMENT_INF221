public class App {

    public static void main(String[] args) throws Exception {

         char [][] mdArray = {{'1','1','1'},{'1','1','1'},{'1','1','1'}, {'1', '1', '1'}};

        // PATTERN 1
        System.out.println("1. PATTERN 1");
        for (int rows = 0; rows <4; rows++) {
            System.out.println("");
            for (int column = 0; column < 3; column++) {
                if (rows %2 == 0)
                {
                    System.out.print("");
                }
                else if(rows % 2 !=0)
                {          
                    System.out.print(mdArray[rows][column]);
                }
            }
        }
    

        System.out.println("");
        
        // PATTERN 2
        System.out.println("2. PATTERN 2");
        for (int rows = 0; rows <4; rows++) {
            System.out.println("");
            for (int column = 0; column < 3; column++) {
                if (rows %2 == 0)
                {
                    System.out.print(mdArray[rows][column]);
                }
                else if(rows % 2 !=0)
                {          
                    System.out.print("");
                }
            }
        }

        // PATTERN 3
        System.out.println("");
        System.out.println("3. PATTERN 3");
        // outer loop
        for (int row = 0; row < mdArray.length; row++) {
            System.out.println("");
    
            // inner loop
            for (int column = 0; column < 3; column++) {
                if (row == 0 || row == 3){
                    System.out.print(mdArray[row][column]);
                }
                    if (row == 1 || row == 2){
                        if (column == 0 || column == 2){
                            System.out.print(" ");
                        } else {
                            System.out.print(mdArray[row][column]);
                        }
                    }
            }
        }

        // PATTERN 4
        System.out.println("");
        System.out.println("4. PATTERN 4");

        // outer loop
        for (int row = 0; row < mdArray.length; row++) {
            System.out.println("");
            
            // inner loop
            for (int column = 0; column < 3; column++) {
                if (row == 1 || row == 3){
                    System.out.print(mdArray[row][column]);
                }
                    if (row == 0 || row == 2){
                        if (column == 0 || column == 2){
                            System.out.print(" ");
                        } else {
                            System.out.print(mdArray[row][column]);
                        }
                    }
            }
        }

        // PATTERN 5
        System.out.println("");
        System.out.println("5. SUM");
        int i, j, row_sum = 0, column_sum;  
        int[][] SumOfRowCols_arr = {{1, 1, 1}, {1, 1, 1}, {1, 1, 1}, {1, 1, 1}};
        for(i = 0; i < SumOfRowCols_arr.length; i++)
        {
            column_sum = 0;
            for(j = 0; j < SumOfRowCols_arr[0].length; j++)
            {
                row_sum = row_sum + SumOfRowCols_arr[i][j];
              
            }

        }

            System.out.println ("Sum of" + row_sum);

    }

}
    
