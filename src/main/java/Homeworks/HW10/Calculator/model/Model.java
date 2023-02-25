package Homeworks.HW10.Calculator.model;

public interface Model<T> {
    T sum(T t1, T t2);
    T diff(T t1, T t2);
    T div(T t1, T t2);
    T mult(T t1, T t2);
}
