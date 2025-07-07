import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MazePuzzle {

public static class MazeGame extends JFrame implements KeyListener {
    
    // Maze representation
    private final char[][] maze = {

        {'S', '.', '.', '#', '.', '.', '.', '.', '.', '.'},
        {'#', '#', '.', '#', '.', '#', '.', '#', '.', '.'},
        {'.', '.', '.', '.', '.', '.', '.', '#', '.', '.'},
        {'.', '#', '#', '#', '#', '.', '#', '#', '.', '#'},
        {'.', '.', '.', '.', '#', '.', '.', '.', '.', '.'},
        {'#', '.', '#', '.', '#', '#', '#', '#', '.', '.'},
        {'.', '.', '#', '.', '.', '.', '.', '#', '.', '#'},
        {'#', '.', '#', '#', '#', '#', '.', '#', '.', '#'},
        {'.', '.', '.', '.', '.', '.', '.', '#', '.', '#'},
        {'#', '#', '#', '#', '#', '#', '.', '#', '.', 'E'}
    };

    private int playerRow = 0;
    private int playerCol = 0;
    private final int CELL_SIZE = 60;
    private boolean visited[][];
    private int movecount=0;
    public MazeGame() {
        setTitle("Maze Puzzle Game");
        setSize(maze[0].length * CELL_SIZE + 20, maze.length * CELL_SIZE + 40); //Sets the width and height of the window in pixels
                 //cols                           rows

        setDefaultCloseOperation(EXIT_ON_CLOSE);//for closing the window
        setLocationRelativeTo(null);//Centers the window
        addKeyListener(this);// keyboard input
        setFocusable(true);
        setVisible(true);//shows the window on screen
        

        visited=new boolean [maze.length][maze[0].length];
        visited[playerRow][playerCol]=true; //starting cell as visited
        
    }

    // Painting the maze grid
    public void paint(Graphics g) {
        super.paint(g);
         g.setColor(Color.BLACK);
         g.setFont(new Font("Arial",Font.BOLD,16) );
         g.drawString("MOVES="+ movecount,10,20 );

        for (int row = 0; row < maze.length; row++) {
            for (int col = 0; col < maze[0].length; col++) {
                int x = col * CELL_SIZE + 10; //+10 and +30 are offsets so the grid doesn't touch the edges of the window
                int y = row * CELL_SIZE + 30;

                if (maze[row][col] == '#') {
                     g.setColor(new Color(139, 69, 19));//Brown
                   
                } else if (maze[row][col] == 'S') {
                    g.setColor(Color.WHITE);
                } else if (maze[row][col] == 'E') {
                    g.setColor(Color.WHITE);
                } else {

                    g.setColor(Color.GREEN);
                }

                g.fillRect(x, y, CELL_SIZE, CELL_SIZE);
                g.setColor(Color.LIGHT_GRAY);
                g.drawRect(x, y, CELL_SIZE, CELL_SIZE);
            }
        }

        // Draw the player
        g.setColor(Color.black);
        int px = playerCol * CELL_SIZE + 10;
        int py = playerRow * CELL_SIZE + 30;
        g.fillOval(px + 10, py + 10, CELL_SIZE - 20, CELL_SIZE - 20);
    }

    // Movement logic
    private void movePlayer(int newRow, int newCol) {
        if (newRow < 0 || newRow >= maze.length || newCol < 0 || newCol >= maze[0].length) {
            return;
        }
        if (maze[newRow][newCol] == '#') {
            return;
        }
        if(visited[newRow][newCol]){
            return;
        }
        playerRow=newRow;
        playerCol=newCol;
        visited[playerRow][playerCol]=true;
        repaint();

        if (maze[playerRow][playerCol] == 'E') {
            JOptionPane.showMessageDialog(this, "🎉 You escaped the maze!");
        }
        movecount++;
    }

    // Key press handling
    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_UP) {
            movePlayer(playerRow - 1, playerCol);
        } else if (key == KeyEvent.VK_DOWN) {
            movePlayer(playerRow + 1, playerCol);
        } else if (key == KeyEvent.VK_LEFT) {
            movePlayer(playerRow, playerCol - 1);
        } else if (key == KeyEvent.VK_RIGHT) {
            movePlayer(playerRow, playerCol + 1);
        }
    }

    public void keyReleased(KeyEvent e) {}
    public void keyTyped(KeyEvent e) {}

    // Main method
    public static void main(String[] args) {
        new MazeGame();
    }
}
    
}
