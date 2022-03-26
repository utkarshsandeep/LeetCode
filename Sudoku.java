public class Sudoku {
    public static void main(String[] args) {
        Sudoku ob = new Sudoku();
        char [][] data = {{'8','3','.','.','7','.','.','.','.'},{'6','.','.','1','9','5','.','.','.'},{'.','9','8','.','.','.','.','6','.'},{'8','.','.','.','6','.','.','.','3'},{'4','.','.','8','.','3','.','.','1'},{'7','.','.','.','2','.','.','.','6'},{'.','6','.','.','.','.','2','8','.'},{'.','.','.','4','1','9','.','.','5'},{'.','.','.','.','8','.','.','7','9'}};
        System.out.println(ob.solution(data));
    }
    public boolean solution(char[][] data){
        int i,j,k;
        boolean flag=true;
        for (i=1;i<=9;i++){
            int check=0;
            for (j=0;j<data.length;j++){
                for (k=0;k<data[0].length;k++){
                    if (String.valueOf(i).charAt(0)==data[j][k]){
                        check++;
                    }
                }
            }
            if (check>1){
                flag=false;
                break;
            }
            int check1=0;
            for (j=0;j<data.length;j++){
                for (k=0;k<data[0].length;k++){
                    if (String.valueOf(i).charAt(0)==data[k][j]){
                        check1++;
                    }
                }
            }
            if (check1>1){
                flag=false;
                break;
            }
        }
        return flag;
    }
}
