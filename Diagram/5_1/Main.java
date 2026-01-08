public class Main {
    public static void main(String[] args) {
        FootballPlayer p1 = new FootballPlayer();
        p1.setName("Messi");
        p1.setTeam("Inter Miami");
        p1.setPlayerNumber(10);
        p1.setPosition("Forward");
        
        FootballPlayer p2 = new FootballPlayer();
        p2.setName("Suarez");
        p2.setTeam("Inter Miami");
        p2.setPosition("Forward");
        
        FootballPlayer p3 = new FootballPlayer();
        p3.setName("Busquets");
        p3.setTeam("Inter Miami");
        p3.setPosition("Midfielder");
        
        System.out.println("P1 vs P3 Same Team? : " + p1.isSameTeam(p3));

        System.out.println("P1 vs P2 Same Position? : " + p1.isSamePosition(p2));
        System.out.println("P1 vs P3 Same Position? : " + p1.isSamePosition(p3));
    }
}
