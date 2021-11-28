class one extends Thread {
    public void run(){
        System.out.println("Thread starts");
    }
    public static void main(String[] args) {
        one obj =new one();
        one obj1 = new one();
        System.out.println("Name of the first thread"+obj.getName());
        System.out.println("Name of the second thread"+obj1.getName());
        System.out.println("id of the second thread:" +obj1.getId());
        obj.start();
        obj1.start();
        obj.setName("Piyush");
        System.out.println("Name of the first thread:"+obj.getName());
    }
}
