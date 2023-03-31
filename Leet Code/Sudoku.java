class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0 ; i<board.length;i++)
        {
            boolean columnsNums[]=new boolean[board.length];
            boolean rowsNums[]=new boolean[board.length];
            for(int j=0 ; j<board[i].length;j++)
            {
                if(board[i][j]!='.')
                {
                    if(columnsNums[(int)(board[i][j]-'1')])
                        return false;
                    columnsNums[(int)board[i][j]-'1']=true;
                } 
                if(board[j][i]!='.' )
                {
                    if(rowsNums[(int)(board[j][i]-'1')])
                        return false;
                    rowsNums[(int)board[j][i]-'1']=true;
                }  
            }
        }
        for(int i=0;i<board.length;i++)
        {
            boolean boxNums[]=new boolean[board.length];
            for(int j=i/3*3;j<=i/3*3+2;j++)
            {
                for(int k=i%3*3;k<=i%3*3+2;k++)
                {
                    if(board[j][k]!='.')
                    {
                        if(boxNums[(int)(board[j][k]-'1')])
                            return false;
                        boxNums[(int)board[j][k]-'1']=true;
                    }
                }    
            }
        }
        return true;
    }
}