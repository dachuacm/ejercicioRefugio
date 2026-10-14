package app_refugio.modelo;

public interface Evaluable<T>{
    boolean evaluarse();
    boolean evaluar(T o);
}
