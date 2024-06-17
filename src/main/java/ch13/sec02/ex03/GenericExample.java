package ch13.sec02.ex03;

public class GenericExample {
    public static void main(String[] args) {
        Box<String> box1 = new Box<>();
        box1.content = "100";

        Box<String> box2 = new Box<>();
        box2.content = "100";

        System.out.println(box1.compareBox(box2));

        Box<Integer> box3 = new Box<>();
        box3.content = 100;

        Box<Integer> box4 = new Box<>();
        box4.content = 100;

        System.out.println(box3.compareBox(box4));

        Box<MyClass> myClassBox = new Box<>();
        myClassBox.content = new MyClass();
        myClassBox.content.str = "즐거운 금요일";

        Box<MyClass> myClassBox2 = new Box<>();
        myClassBox2.content = new MyClass();
        myClassBox2.content.str = "즐거운 금요일";

        // NPE 터짐. <T> 안에 MyCLass 넣어놨더니, 그 안 str까지 들어갈 수 없어서.
        System.out.println(myClassBox.compareBox(myClassBox2));

    }
}
