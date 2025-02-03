package ru.job4j.oop;

public class Error {

    private boolean active;
    private int status;
    private String message;

    public Error() {

    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.println("Ошибка: " + active);
        System.out.println("Статус ошибки: " + status);
        System.out.println("Сообщение: " + message);
    }

    public static void main(String[] args) {
        Error error = new Error();
        Error error1 = new Error(true, 125, "Ошибка 125. Перезагрузите компьютер.");
        Error error2 = new Error(true, 433, "Ошибка 433. Покиньте убежище.");
        Error error3 = new Error(true, 125, "Ошибка 2000. Продолжайте работу.");
        error.printInfo();
        error1.printInfo();
        error2.printInfo();
        error3.printInfo();
    }
}
