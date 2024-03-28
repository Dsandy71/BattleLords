
public class PlayArea 
{
    // Height and width of area
    private int width = 0;
    private int height = 0;

    // 2D array of board
    private String[][] board;

    // x,y location of objects
    private int xLocation = 0;
    private int yLocation = 0;

    // Default area size
    public PlayArea()
    {
        width = 6;
        height = 4;

        board = new String[width][height];
    }

    // Area size w/ param
    public PlayArea(int w, int h)
    {
        width = w;
        height = h;

        board = new String[width][height];
    }

    public int getHeight()
    {
        return height;
    }

    public int getWidth()
    {
        return width;
    }

    public int getArea()
    {
        return width * height;
    }

    public String toString()
    {
        String res = "";
        for (int i = 0; i < width; i++)
        {
            for (int j = 0; j < height; j++)
            {
                res += board[i][j] + " ";
            }
            res += "\n";
        }
        return res;
    }
    
}
