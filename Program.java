import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;

public class Program {

    public static class MazeGame extends JFrame implements KeyListener {

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
        private final int CELL_SIZE = 40;
        private boolean visited[][];
        private int movecount = 0;
        private List<Point> tracePath = new ArrayList<>();

        public MazeGame() {
            setTitle("Maze Puzzle Game");
            setSize(maze[0].length * CELL_SIZE + 20, maze.length * CELL_SIZE + 40);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setLocationRelativeTo(null);
            addKeyListener(this);
            setFocusable(true);
            setVisible(true);

            visited = new boolean[maze.length][maze[0].length];
            visited[playerRow][playerCol] = true;
        }

        public void paint(Graphics g) {
            super.paint(g);

            g.setColor(Color.BLACK);
            g.setFont(new Font("Arial", Font.BOLD, 16));
            g.drawString("MOVES = " + movecount, 10, 20);


            for (int row = 0; row < maze.length; row++) {
                for (int col = 0; col < maze[0].length; col++) {

                    int x = col * CELL_SIZE + 10;
                    int y = row * CELL_SIZE + 30;

                    if (maze[row][col] == '#') {
                        g.setColor(Color.BLACK);
                        g.fillRect(x, y, CELL_SIZE, CELL_SIZE);
                    } else if (maze[row][col] == 'S') {
                        g.setColor(Color.YELLOW);
                        g.fillRect(x, y, CELL_SIZE, CELL_SIZE);
                    } else if (maze[row][col] == 'E') {
                        g.setColor(Color.GREEN);
                        g.fillRect(x, y, CELL_SIZE, CELL_SIZE);
                    } else {
                        g.setColor(Color.WHITE);
                        g.fillRect(x, y, CELL_SIZE, CELL_SIZE);
                    }
                }
            }

            g.setColor(Color.BLUE);
            for (int i = 0; i < tracePath.size() - 1; i++) {
                Point p1 = tracePath.get(i);
                Point p2 = tracePath.get(i + 1);

                int x1 = p1.x * CELL_SIZE + 10 + CELL_SIZE / 2;
                int y1 = p1.y * CELL_SIZE + 30 + CELL_SIZE / 2;
                int x2 = p2.x * CELL_SIZE + 10 + CELL_SIZE / 2;
                int y2 = p2.y * CELL_SIZE + 30 + CELL_SIZE / 2;

                g.drawLine(x1, y1, x2, y2);
            }

            g.setColor(Color.RED);
            int px = playerCol * CELL_SIZE + 10;
            int py = playerRow * CELL_SIZE + 30;
            int playerSize = CELL_SIZE - 8;
            g.fillOval(px + 4, py + 4, playerSize, playerSize);
        }

        private void movePlayer(int newRow, int newCol) {
            if (newRow < 0 || newRow >= maze.length || newCol < 0 || newCol >= maze[0].length)
                return;
            if (maze[newRow][newCol] == '#')
                return;
            if (visited[newRow][newCol])
                return;

            tracePath.add(new Point(playerCol, playerRow));

            playerRow = newRow;
            playerCol = newCol;
            visited[playerRow][playerCol] = true;
            repaint();

            if (maze[playerRow][playerCol] == 'E') {
                JOptionPane.showMessageDialog(this, "\uD83C\uDF89 You escaped the maze!");
            }
            movecount++;
        }

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

        public static void main(String[] args) {
            new MazeGame();
        }
    }
}
