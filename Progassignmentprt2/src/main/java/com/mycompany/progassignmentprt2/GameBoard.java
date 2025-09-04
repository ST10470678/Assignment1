
package com.mycompany.progassignmentprt2;


public class GameBoard {
   private char[][] board;
    
    
    //making board with spaces
    public GameBoard(){
    board=new char[3][3];
    
      for (int i=0; i<3; i++){
       for (int j=0;j<3;j++){
         board[i][j]= ' ';
       
       
       }
      }
    }
    
    //show the board
    public void showBoard(){
        System.out.println("--------------");
        for(int i=0; i<3; i++){
            System.out.print("| ");
          for(int j=0; j<3; j++){
              System.out.print(board[i][j] + " | ");
          }  
            System.out.println();
            System.out.println("--------------");
        }
    }
    
    
    //allows for moves to be done--> made use of chatGpt to understand this
    public boolean move(int row,int col,char player){
    if(row>=0&& row<3&& col>=0&& col<3&& board[row][col]==' '){
    board[row][col]=player;
    return true;
    }
    return false;
    
    }

    
    //checks to see who has won--> made use of chatGpt to understand this
public boolean checkTheWinner(char player) {
    for (int i = 0; i < 3; i++) {
        //checks straight lines
        if ((board[i][0] == player && board[i][1] == player && board[i][2] == player) ||
            (board[0][i] == player && board[1][i] == player && board[2][i] == player)) {
            return true;
        }
    }
    // Check diagonals--> made use of chatGPT to understand diagonal wins
    if ((board[0][0] == player && board[1][1] == player && board[2][2] == player) ||
        (board[0][2] == player && board[1][1] == player && board[2][0] == player)) {
        return true;
    }
    return false;
}


//checking to see if the board is full
public boolean fullBoard(){
for(int i=0;i<3;i++){
  for(int j=0;j<3;j++){
     if (board[i][j]==' '){
     return false;
    }
  }
}
return true;
} 

    

}
