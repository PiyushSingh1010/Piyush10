class method11 extends Thread {
    public void run() {
        Thread.yield();
        for (int i = 0; i < 5; i++) {
            System.out.println("Singh");
        }
    }
}
class yieldmethod {
    public static void main(String[] args) {
        method11 obj=new method11();
       // obj.yield();
        obj.start();
        for(int i=0;i<6;i++){
            System.out.println("Piyush");
        }
    }
}

