class Mythread1 implements Runnable{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Singh");
        }
    }
}
class Myclass1 {
    public static void main(String[] args) {
        Mythread1 t1 = new Mythread1();
        Thread t2=new Thread(t1);
        t2.start();
        for (int i=0;i<10;i=i+2){
            System.out.println("Piyush");
        }


    }
}
