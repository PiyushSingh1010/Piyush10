class mythread411 implements Runnable{
    public void run() {
        Thread t1=Thread.currentThread();
        t1.setPriority(10);
        for(int i=0;i<6;i++){
            System.out.println("Singh");
        }
        System.out.println(t1.getPriority());
    }
}
class mainclass2 {
    public static void main(String[] args){
        mythread411 t2=new mythread411();
        Thread t3=new Thread(t2);

        t3.start();
        for(int i=0;i<12;i=i+2){
            System.out.println("Piyush");
        }
    }
}
