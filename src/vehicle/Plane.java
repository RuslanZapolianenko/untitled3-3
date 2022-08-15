package vehicle;

public class Plane extends Vehicle {

        private int height;        // высота 11 900
        protected int passengers;  // 150

        private final String titleHeight = "\nМаксимальная высота: ";
        protected final String titlePassengers = "\nКоличество пассажиров: ";

        public Plane() {
            super("Boing 777", 90000000, 1200, 2001);
            this.height = 18500;
            this.passengers = 200;
        }

        @Override // аннотация переопределения
        public void conclusion() {
            System.out.println(titleName + name + titleCoast + Coast + titleSpeed + Speed + titleYear + Year + titleHeight + height + titlePassengers + passengers + titleSeparator);
        }
}
//Используя IntelliJ IDEA, создайте проект. Требуется: Создать класс Vehicle.
// В теле класса создайте поля: координаты и параметры средств передвижения (цена, скорость, год выпуска).
// Создайте 3 производных класса Plane, Саг и Ship. Для класса Plane должна быть
// определена высота и количество пассажиров. Для класса Ship – количество пассажиров и порт приписки.
// Написать программу, которая выводит на экран информацию о каждом средстве передвижения.