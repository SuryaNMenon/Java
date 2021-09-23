class CR1 implements Runnable{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Print from class C1 implementing Runnable");
            try{Thread.sleep(1500);} catch (Exception e){}
        }
    }
}

class CR2 implements Runnable{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Print from class C2 implementing Runnable");
            try{Thread.sleep(1500);} catch(Exception e){}
        }
    }
}

public class threadUsingRunnable {
    public static void main(String[] args){
        Runnable obj1 = new CR1();
        CR2 obj2 = new CR2();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        try{Thread.sleep(10);} catch(Exception e){}
        t2.start();
    }
}
