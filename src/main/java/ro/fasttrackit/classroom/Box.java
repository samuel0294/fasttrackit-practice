package ro.fasttrackit.classroom;

public class Box<T extends Human <T>> {
    public T getT() {
        return t;
    }

    private T t;
public Box() {
   Object T= 5;
    }
    public void set(T t) { this.t = t; }
    public T get() { return t; }
//
// (1.3) java: cannot find symbol
//  symbol:   class T
//  location: class ro.fasttrackit.classroom.Box<Human>

// (1.4) nu se schimba

}