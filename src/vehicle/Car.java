package vehicle;

public class Car extends Vehicle {
    Car (){
        name="Mersedes E class";
        Coast = 25000;
        Speed = 240;
        Year = 2018;
    }

    @Override // аннотация переопределения
    public void conclusion() {
        System.out.println(titleName + name + titleCoast + Coast + titleSpeed + Speed + titleYear + Year + titleSeparator);
    }
}



//Используя IntelliJ IDEA, создайте проект. Требуется: Создать класс Vehicle.
// В теле класса создайте поля: координаты и параметры средств передвижения (цена, скорость, год выпуска).
// Создайте 3 производных класса Plane, Саг и Ship. Для класса Plane должна быть
// определена высота и количество пассажиров. Для класса Ship – количество пассажиров и порт приписки.
// Написать программу, которая выводит на экран информацию о каждом средстве передвижения.