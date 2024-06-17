package ch13.sec02.ex01;

public class Product<K, M> {
    private K kind;
    private M model;

    // 세터 게터
    public K getKind() {
        return this.kind;
    }

    public M getModel() {
        return this.model;
    }

    public K setKind(K kind) {
        this.kind = kind;
        return kind;
    }

    public M setModel(M model) {
        this.model = model;
        return model;
    }
}
