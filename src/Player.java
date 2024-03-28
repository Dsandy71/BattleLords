
public class Player 
{
    private String name;
    private String rank;
    private int armySize = 0;
    private static int playerCount = 0;

    public Player()
    {
        name = "Player" + playerCount;
        rank = "unranked";
        armySize = 5;
        playerCount++;
    }

    public Player(String n, String r, int s)
    {
        name = n;
        rank = r;
        armySize = s;
        playerCount++;
    }

    public int getArmySize()
    {
        return armySize;
    }

    public String getName()
    {
        return name;
    }

    public String getRank()
    {
        return rank;
    }

    public int getPlayerCount()
    {
        return playerCount;
    }

    public void setRank(String r)
    {
        rank = r;
    }

    public void setArmySize(int armySize)
    {
        this.armySize = armySize;
    }

    public String toString()
    {
        return "Username: " + name + "\nRank: " + rank + "\nTroops: " + armySize;
    }
}
