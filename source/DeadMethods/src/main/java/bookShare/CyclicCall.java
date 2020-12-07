package bookShare;

public class CyclicCall {

    public void callB(){
        callA();
    }

    public void callA(){
        callB();
    }
}
