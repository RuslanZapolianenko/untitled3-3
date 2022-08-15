package vehicle;

public class Main {
    public static void main(String[] args) {
        Plane plane = new Plane();
        plane.conclusion();

        Ship ship = new Ship();
        ship.conclusion();

        Car car = new Car();
        car.conclusion();

        ship.setNewFieldAll("Новый корабль",20000,55,2022,100,"Лисабон");
        ship.conclusion();
    }
}
//Используя IntelliJ IDEA, создайте проект. Требуется: Создать класс Vehicle.
// В теле класса создайте поля: координаты и параметры средств передвижения (цена, скорость, год выпуска).
// Создайте 3 производных класса Plane, Саг и Ship. Для класса Plane должна быть
// определена высота и количество пассажиров. Для класса Ship – количество пассажиров и порт приписки.
// Написать программу, которая выводит на экран информацию о каждом средстве передвижения.