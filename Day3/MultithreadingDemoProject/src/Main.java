//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class MyThread extends Thread{
    @Override
    public void run(){

        for(int i=1;i<=5;i++){
            System.out.println(Thread.currentThread().getName()+" i "+i);
        }
        System.out.println("Good Bye from "+Thread.currentThread().getName());
    }
}
public class Main {
    public static void main(String[] args) {

        //1st child
        MyThread thread1=new MyThread(); //new born
        //2nd Child
        MyThread thread2=new MyThread();

        thread1.start();//make thread1 fight for CPU time
        thread2.start();//make thread1 fight for CPU time
        for(int i=1;i<=5;i++){
            System.out.println(Thread.currentThread().getName()+" i "+i);
        }
        System.out.println("Good Bye from "+Thread.currentThread().getName());

    }
}