package dokument;

public class Main {
    public static void main(String[] args) {
        System.out.println("Версия default доступна без key \nВерсия pro: key_pro \nВерсия exp: key_exp ");
        System.out.print("Введите KEY |");
        java.util.Scanner input = new java.util.Scanner(System.in);
        String inputKey = input.nextLine();

        switch (inputKey) {
            case "":
                DocumentWorker def = new DocumentWorker();
                def.openDocument();
                def.editDocument();
                def.saveDocument();
                break;
            case "key_pro":
                DocumentWorker    pro = new ProDocumentWorker();

                pro.openDocument();
                pro.editDocument();
                pro.saveDocument();
                break;
            case "key_exp":
                DocumentWorker exp = new ExpertDocument();
                exp.openDocument();
                exp.editDocument();
                exp.saveDocument();
                break;

        }
    }
}
//Используя IntelliJ IDEA, создайте проект. Требуется: Создайте класс DocumentWorker.
// В теле класса создайте три метода openDocument(), editDocument(), saveDocument().
// В тело каждого из методов добавьте вывод на экран соответствующих строк:
// "Документ открыт", "Редактирование документа доступно в версии Про", "Сохранение документа доступно в версии Про".
// Создайте производный класс ProDocumentWorker. Переопределите соответствующие методы,
// при переопределении методов выводите следующие строки: "Документ отредактирован",
// "Документ сохранен в старом формате, сохранение в остальных форматах доступно в версии Эксперт".
// Создайте производный класс ExpertDocumentWorker от базового класса ProDocumentWorker.
// Переопределите соответствующий метод. При вызове данного метода необходимо выводить на экран
// "Документ сохранен в новом формате". В теле метода main() реализуйте возможность приема от пользователя номера ключа
// доступа pro и exp. Если пользователь не вводит ключ, он может пользоваться только бесплатной версией (создается
// экземпляр базового класса), если пользователь ввел номера ключа доступа pro и exp, то должен создаться экземпляр
// соответствующей версии класса, приведенный к базовому – DocumentWorker.