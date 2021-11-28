class joinmethod3 extends Thread {
    public void run(){
        for(int i=0; i<5000; i++)
        {
            System.out.println(i+"EE");
        }
    }
}
class joinmethod {
    public static void main(String[] args) {
        joinmethod3 t1 = new joinmethod3();
        t1.start();
        try
        {
            Thread.sleep(500);
           // System.out.println("Piyush");
            t1.join(5);
        }
        catch(InterruptedException e){
            System.out.println(e);
        }
        for (int i = 0; i < 5000; i++) {
            System.out.println("uu");
        }

    }
}

