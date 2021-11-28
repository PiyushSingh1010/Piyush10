class A extends Thread{
    public void run(){
        String name = Thread.currentThread().getName();
        for(int i=1;i<=3;i++){
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
        A t1 = new A();
        A t2 = new A();
        A t3 = new A();
        t1.setName("Piyush");
        t2.setName("Ujjwal");
        t3.setName("Singh");
        t1.start();
        t1.suspend();
        t2.start();
        t3.start();
    }
}
