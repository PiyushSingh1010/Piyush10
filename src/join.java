class join1 extends Thread{
    public void run(){
        for(int i=1;i<11;i++){
            System.out.println(i);
            if(i==5){
                try{
                    Thread.sleep(5000);
                }
                catch(InterruptedException e){
                    System.out.println(e);
                }
            }
            else{
            }
        }
    }
}
class main{
    public static void main(String[] args) {
        join1 t1=new join1();
        t1.start();
    }
}
