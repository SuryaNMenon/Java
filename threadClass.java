class C1 extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Print from class C1 extending Thread class");
            try {Thread.sleep(1500);} catch (Exception e){}
    }
    }
}

class C2 extends Thread{
    public void run(){
        for(int i = 0;i<5;i++){
            System.out.println("Print from class C2 extending Thread class");
            try {Thread.sleep(1500);} catch (Exception e){}
        }
    }
}

public class threadClass {
    public static void main(String[] args){
        C1 obj1 = new C1();
        C2 obj2 = new C2();

        obj1.start();
        try {Thread.sleep(10);} catch (Exception e){}
        obj2.start();
    }
}
