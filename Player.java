public class Player {
    public class Player {
        private int id;
        private String name;
        public Player(int id,String name){
            this.id = id;
            this.name = name;
        }
        public int getId(){
            return id;
        }
        public String getName() {
            return name;
        }
        public String toString(){
            return "ID:"+id+" Name:"+name;
        }
}
