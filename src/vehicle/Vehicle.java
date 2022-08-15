package vehicle;

public class Vehicle {
    protected int Coast;
    protected   int Speed;
    protected int Year;
    protected String name;
    protected final String titleName = "Название: ";
    protected final String titleCoast = "\nСтоимость: ";
    protected final String titleSpeed = "\nСкорость: ";
    protected final String titleYear = "\nГод выпуска: ";
    protected final String titleSeparator = "\n____________________";

    protected Vehicle(){
    }

    protected Vehicle(String name,int coast, int speed, int year){
        this.name = name;
        this.Coast = coast;
        this.Speed = speed;
        this.Year = year;
    }

    public void conclusion() {
    }


}
//Используя IntelliJ IDEA, создайте проект. Требуется: Создать класс Vehicle.
// В теле класса создайте поля: координаты и параметры средств передвижения (цена, скорость, год выпуска).
// Создайте 3 производных класса Plane, Саг и Ship. Для класса Plane должна быть
// определена высота и количество пассажиров. Для класса Ship – количество пассажиров и порт приписки.
// Написать программу, которая выводит на экран информацию о каждом средстве передвижения.