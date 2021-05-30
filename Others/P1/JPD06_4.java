
...

class JPD06_4 {
    public static void main(String args[]){
        Order ord = new Order();
        ord.in(new MiniNote());
        ord.in(new Note15());
        ord.in(new PC());
        System.out.println(ord.revenue());
    }
}