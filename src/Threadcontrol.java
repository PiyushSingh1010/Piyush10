class Threadcontrol extends Thread {
    public void run(){
        for(int i=1;i<21;i++){
            if(i%2==0){
                System.out.println(i);
            }
            else{
            }
        }
    }
}
class control extends Thread{
    public void run(){
        for(int i=1;i<20;i=i+2){
            System.out.println(i);
        }
    }
}
class mainmethod{
    public static void main(String[] args) {
        Threadcontrol t1=new Threadcontrol();
        control t2=new control();
        t1.start();
        try{
            Thread.sleep(1000);
            t1.join();
        }
        catch(InterruptedException e){
            System.out.println(e);
        }
        t2.start();
    }
}

