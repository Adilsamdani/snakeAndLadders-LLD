public class Driver {
    public static void main(String args[]){
        Board b = new Board(100);
        //Ladder positions(start,end)
        b.setLadderPositions(3,38);
        b.setLadderPositions(14,26);
        b.setLadderPositions(35,63);
        b.setLadderPositions(52,72);
      
        //snakepositions(start,end)
        b.setSnakePositions(36,6);
        b.setSnakePositions(76,60);

       
        Player p1 = new Player(1,"Lohit");
        Player p2 = new Player(2,"Tarun");
        Player p3 = new Player(3,"Adil");
        Player p3 = new Player(4,"Pranneth");

        Queue<Player> allPlayers = new LinkedList<>();
        allPlayers.offer(p1);
        allPlayers.offer(p2);
        allPlayers.offer(p3);
        allPlayers.offer(p4);

        HashMap<String,Integer>currPositions = new HashMap<>();
        currPositions.put(p1.getName(),0);
        currPositions.put(p2.getName(),0);
        currPositions.put(p3.getName(),0);
        currPositions.put(p4.getName(),0);

        Game g = new Game(b,allPlayers,currPositions);
        Dice.setNoOfDIce(1);
        g.start();
