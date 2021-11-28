class random implements Runnable{
    public void run(){
        String colours[]={"white","blue","black","green","red","yellow"};
        double a=Math.random()*6;
        int n=(int)a;
        while (colours[n].equals("red")==false){
            System.out.println(colours[n]);
            double k1=Math.random()*6;
            n=(int)k1;
        }
    }
}
class mainclass12{
    public static void main(String[] args) {
        random obj=new random();
        Thread t1=new Thread(obj);
        t1.start();
    }
}