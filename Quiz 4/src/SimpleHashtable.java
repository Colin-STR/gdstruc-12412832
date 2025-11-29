public class SimpleHashtable
{
    private StoredPlayer[] hashtable;

    public SimpleHashtable()
    {
        hashtable = new StoredPlayer[10];
    }

    private int hashKey(String key)
    {
        return key.length() % hashtable.length;
    }

    public void put(String key, Player value)
    {
        int hashedKey = hashKey(key);
        //linear probing
        if(isOccupied(hashedKey))
        {
            int stoppingIndex = hashedKey;
            if(hashedKey == hashtable.length - 1)
            {
                hashedKey = 0;
            }
            else
            {
                hashedKey++;
            }
            while(isOccupied(hashedKey) && hashedKey != stoppingIndex)
            {
                hashedKey = (hashedKey + 1) % hashtable.length;
            }
        }
        if(isOccupied(hashedKey))
        {
           System.out.println("Position " + hashedKey + " already has an element");
        }
        else
        {
            hashtable[hashedKey] = new StoredPlayer(key, value);
        }
    }

    public Player get(String key)
    {
        int hashedKey = findKey(key);
        if (hashedKey == -1)
        {
            return null;
        }
        return hashtable[hashedKey].value;
    }

    private int findKey(String key)
    {
        int hashedKey = hashKey(key);
        if(hashtable[hashedKey] != null && hashtable[hashedKey].key.equals(key))
        {
            return hashedKey;
        }
        int stoppingIndex = hashedKey;
        if (hashedKey == hashtable.length - 1)
        {
            hashedKey = 0;
        } else
        {
            hashedKey++;
        }
        while (hashedKey != stoppingIndex && hashtable[hashedKey] != null && !hashtable[hashedKey].key.equals(key))
        {
            hashedKey = (hashedKey + 1) % hashtable.length;
        }
        if (hashtable[hashedKey] != null && hashtable[hashedKey].key.equals(key))
        {
            return hashedKey;
        }
        return -1;
    }

    private boolean isOccupied(int index)
    {
        return hashtable[index] != null;
    }

    public Player remove(String key)
    {
        int hashedKey = findKey(key);
        if (hashedKey == -1)
        {
            return null;
        }
        Player removedPlayer = hashtable[hashedKey].value;
        hashtable[hashedKey] = null;
        StoredPlayer[] oldHashtable = hashtable;
        hashtable = new StoredPlayer[oldHashtable.length];

        for (int i = 0; i < oldHashtable.length; i++)
        {
            if (oldHashtable[i] != null)
            {
                put(oldHashtable[i].key, oldHashtable[i].value);
            }
        }
        return removedPlayer;
    }

    public void printHashtable()
    {
        for (int i = 0; i < hashtable.length; i++)
        {
            System.out.println("Element " + i + ": " + hashtable[i]);
        }
    }
}
