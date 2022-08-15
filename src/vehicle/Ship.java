package vehicle;

public class Ship extends Plane {
    private String homePort; // порт приписки
    private final String titleHomePort = "\nПорт приписки: ";

    public Ship (){
        this. name = "Атлантик";
        this.Coast = 13000000;
        this.Speed = 63; // в узлах или 42 кмч
        this.Year = 1960;
        this.passengers = 1500;
        this.homePort = "Мадрид";
    }

    @Override // аннотация переопределения
    public void conclusion() {
        System.out.println(titleName + name + titleCoast + Coast + titleSpeed + Speed + titleYear + Year + titleHomePort + homePort + titlePassengers + passengers + titleSeparator);
    }

    public void setNewFieldAll(String name,int Coast, int speed, int year, int passengers, String homePort){
        this.name = name;
        this.Coast = Coast;
        this.Speed = speed; // в узлах или 42 кмч
        this.Year = year;
        this.passengers = passengers;
        this.homePort = homePort;
    }
}
//Используя IntelliJ IDEA, создайте проект. Требуется: Создать класс Vehicle.
// В теле класса создайте поля: координаты и параметры средств передвижения (цена, скорость, год выпуска).
// Создайте 3 производных класса Plane, Саг и Ship. Для класса Plane должна быть
// определена высота и количество пассажиров. Для класса Ship – количество пассажиров и порт приписки.
// Написать программу, которая выводит на экран информацию о каждом средстве передвижения.