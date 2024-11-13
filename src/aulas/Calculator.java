package aulas;

public class Calculator {
    private int value;
    public Calculator() {
        this.value = 0;
    }
    int value(){
        return this.value;
    }
    void plus(int n){
        this.value += n;
    }
    void times(int n){
        this.value *= n;
    }
    void power(int n){
        value = (int) Math.pow(this.value, n);
    }
}
