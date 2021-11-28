class pro extends Thread{
    public void run(){
        System.out.println("e");
    }
}
class protttt {
    public static void main(String[] args) {
        pro obj =new pro();
        pro t2 =new pro();
        pro t3 =new pro();
        obj.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);
        obj.start();
        t2.start();
        t3.start();
        System.out.println(obj.getPriority());
        System.out.println(t2.getPriority());
        System.out.println(t3.getPriority());
    }
}
