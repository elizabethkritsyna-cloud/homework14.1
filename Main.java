public class Main {

    public static void main(String[] args) {

        PrinterImpl printer = new PrinterImpl();

        // Повідомлення від користувача
        PrinterImpl.Message message1 =
                new PrinterImpl.Message("Привіт усім!", "Марія");

        // Анонімне повідомлення
        PrinterImpl.Message message2 =
                new PrinterImpl.Message("Як справи?", null);

        // Порожнє повідомлення
        PrinterImpl.Message message3 =
                new PrinterImpl.Message("", null);

        // Виведення повідомлень
        printer.print(message1);
        printer.print(message2);
        printer.print(message3);
    }
}
