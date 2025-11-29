import java.util.Objects;

public class Player
{
    private int PlayerID;
    private String userName;
    private int level;

    @Override
    public boolean equals(Object o)
    {
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return PlayerID == player.PlayerID && level == player.level && Objects.equals(userName, player.userName);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(PlayerID, userName, level);
    }

    @Override
    public String toString()
    {
        return "Player{" +
                "PlayerID=" + PlayerID +
                ", userName='" + userName + '\'' +
                ", level=" + level +
                '}';
    }

    public Player(int playerID, String userName, int level)
    {
        PlayerID = playerID;
        this.userName = userName;
        this.level = level;
    }

    public int getPlayerID()
    {
        return PlayerID;
    }

    public void setPlayerID(int playerID)
    {
        PlayerID = playerID;
    }

    public String getUserName()
    {
        return userName;
    }

    public void setUserName(String userName)
    {
        this.userName = userName;
    }

    public int getLevel()
    {
        return level;
    }

    public void setLevel(int level)
    {
        this.level = level;
    }
}
