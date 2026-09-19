public class Gen<T> {
    T Obj;
    Gen(T o) {Obj = o;}

    void getA(Gen<? extends A> a){}

    void getB(Gen<? super B> b){}
}
