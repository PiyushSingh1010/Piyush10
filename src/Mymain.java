class Mythread4 extends Thread{
    public void run(){
        try{
            Thread.sleep(4000);
        }
        catch(InterruptedException e){
            System.out.println(e);
        }
        System.out.println("Thread Completed");
    }
}
class mythread6 implements Runnable{
    public void run(){
        try{
            Thread.sleep(4000);
        }
        catch(InterruptedException e){
            System.out.println(e);
        }
        System.out.println("Thread completed");
    }
}
class Mymain {
    public static void main(String[] args) {
        Mythread4 t1=new Mythread4();
        mythread6 t2=new mythread6();
        Thread t3=new Thread(t2);
        t1.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t3.start();
    }
}
