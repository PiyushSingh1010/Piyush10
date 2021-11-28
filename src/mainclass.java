class Mythread extends Thread{
    public void run(){
        for(int i=0;i<5;i++)
        {
            System.out.println("Singh");
        }
    }
}
class mainclass {
    public static void main(String[] args) {
        Mythread t1 = new Mythread();
        t1.start();
        for(int i=0;i<10;i++){
            System.out.println("Piyush");
        }
    }

}
