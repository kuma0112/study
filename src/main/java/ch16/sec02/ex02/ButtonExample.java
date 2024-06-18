package ch16.sec02.ex02;

public class ButtonExample {
    public static void main(String[] args) {
        Button btnOk = new Button();
        btnOk.setClieckListner( () -> System.out.println("OK Button Click!"));
        btnOk.click();

        Button btnCancel = new Button();
        btnCancel.setClieckListner( () -> System.out.println("Cancel Button Click!"));
        btnCancel.click();
    }
}
