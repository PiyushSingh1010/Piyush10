class threadnames extends Thread {
    public void run(){
    }
}
class abc{
    public static void main(String[] args) {
        threadnames t1 = new threadnames();
        threadnames t2 = new threadnames();
        t1.setName("Scooby");
        t2.setName("Shaggy");
        t1.start();
        t2.start();
        System.out.println(t1.getName());
        System.out.println(t2.getName());
    }
}
