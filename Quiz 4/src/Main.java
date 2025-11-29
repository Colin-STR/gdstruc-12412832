import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Player donk = new Player(145, "TS donk", 900);
        Player s1mple = new Player(490, "s1s1", 850);
        Player m0nesy = new Player(308, "FL m0nesy", 890);
        Player NiKo = new Player(763, "FL NiKo", 800);
        Player Zywoo = new Player(881, "ZyWoo", 890);

        SimpleHashtable hashtable = new SimpleHashtable();
        hashtable.put(donk.getUserName(), donk);
        hashtable.put(s1mple.getUserName(), s1mple);
        hashtable.put(m0nesy.getUserName(), m0nesy);
        hashtable.put(NiKo.getUserName(), NiKo);
        hashtable.put(Zywoo.getUserName(), Zywoo);

//       hashtable.printHashtable();
//       System.out.println(hashtable.get("FL NiKo"));
        System.out.println("Removing FL NiKo...");
        hashtable.remove("FL NiKo");

        hashtable.printHashtable();
    }
}