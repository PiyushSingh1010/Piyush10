class Mythread2 extends Thread{
    public void run(){
        Thread t1=Thread.currentThread();
        t1.setPriority(5);
        for(int i=0;i<10;i++){
            System.out.println("Singh");
        }
    }
}
class setpriority {
    public static void main(String[] args) {
        Mythread2 t2=new Mythread2();
        t2.start();
        for(int i=0;i<10;i=i+2){
            System.out.println("Piyush");
            System.out.println(t2.getPriority());
        }
    }
}
