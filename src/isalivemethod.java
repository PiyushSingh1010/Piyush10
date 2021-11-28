class mymethod3 extends Thread{
    public void run(){
        for(int i=0;i<6;i=i+2){
            System.out.println("Singh");
        }
    }
}
class isalivemethod {
    public static void main(String[] args) {
        mymethod3 t1=new mymethod3();
        System.out.println("before isalivemethod "+t1.isAlive());
        t1.start();
        System.out.println("After isAlivemethod "+t1.isAlive());
    }
}
