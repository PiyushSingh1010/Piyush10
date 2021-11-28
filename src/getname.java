class Mythread11 extends Thread{
    public void run(){
        System.out.println("OK");
    }
}
class mythread12 extends Thread{
    public void run(){
        System.out.println("Si");
    }
}
class getname {
    public static void main(String[] args) {
        Mythread11 t1=new Mythread11();
        mythread12 t2=new mythread12();
        t1.setName("Piyush");
        t2.setName("Singh");
        System.out.println(t1.getName());
        System.out.println(t2.getName());
        System.out.println(t1.getId());
        System.out.println(t2.getId());
        t1.start();
        t2.start();
        t1.setName("PIYUSH");
        System.out.println(t1.getName());
    }

}
