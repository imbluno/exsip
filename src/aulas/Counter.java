package aulas;

public class Counter {
    private int value;
    private final int max;
    public Counter(int max) {
        this.value = 0;
        this.max = max;
    }
    int value(){
        return this.value;
    }
    boolean atStart(){
        return this.value == 0;
    }
    boolean atEnd(){
        return this.value == this.max;
    }
    void increment(){
        this.value++;
    }
    void decrement(){
        this.value--;
    }
}
