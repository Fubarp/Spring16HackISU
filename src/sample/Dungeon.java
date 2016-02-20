package sample;

public class Dungeon
{
    static final int DUNGEON_X = 80;
    static final int DUNGEON_Y = 21;
    static final char[][] dungeon = new char[DUNGEON_Y][DUNGEON_X];

    public String printArray()
    {
        int x;
        int y;
        String toReturn = "";

        for(y = 0; y < DUNGEON_Y; y++)
        {
            for(x = 0; x < DUNGEON_X; x++)
            {
                toReturn += "" + dungeon[y][x];
            }
            toReturn += "\n";
        }

        return toReturn;
    }

    public void initializeDungeon()
    {
        int y;
        int x;

        //Fill the dungeon with rock represented as blank space
        for(y = 0; y < 21; y++)
        {
            for(x = 0; x < 80; x++)
            {
                dungeon[y][x] = '-';
            }
        }

        //Fill outermost cells with border
        for(y = 0; y < 21; y++)
        {
            dungeon[y][0] = '|';
            dungeon[y][79] = '|';
        }

        for(x = 0; x < 80; x++)
        {
            dungeon[0][x] = '-';
            dungeon[20][x] = '-';
        }
    }

    public String returnChar(int y, int x)
    {
        return "" + dungeon[y][x];
    }
}
