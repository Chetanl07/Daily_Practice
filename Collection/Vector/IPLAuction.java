// java program using vector class to create a ipl Auction player retain or release
import java.util.Iterator;
import java.util.Vector;

public class IPLAuction {
    private String iplTeam;
    private Vector<Player> listofPlayers;

    public IPLAuction(String iplTeam)
    {
        this.iplTeam=iplTeam;
        listofPlayers= new Vector<>(15);  // Composition
    }

    public void add(Player player)
    {
        listofPlayers.add(player);
    }

    public void retainORRelease()
    {
        Iterator<Player> iterator= listofPlayers.iterator();

        while(iterator.hasNext())
        {
            Player player = iterator.next();
            if(player.BasedPrice()>5000)
            {
                iterator.remove();
            }
        }
    }


    public void displayAllPlayer()
    {
        for(Player player: listofPlayers)
        {
            System.out.println(player);

        }
    }

    public static void main(String[] args) {
        IPLAuction ipl = new IPLAuction("CSK");
        ipl.add(new Player(33, "Hardik p ", 4000D));
        ipl.add(new Player(07, "MSD ", 4500D));
        ipl.add(new Player(18, "Virat K ", 6000D));
        ipl.add(new Player(45, "Rohit S", 3000D));
        ipl.add(new Player(99, "Bumrah", 5500D));   
        
        ipl.retainORRelease();
        ipl.displayAllPlayer();
        
    }
    
}
record  Player(Integer id, String name,Double BasedPrice)
{

}
