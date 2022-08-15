package classroom1;

public class Main {
    public static void main(String[] args) {
    ClassRoom [] classRoom=new ClassRoom[3];
    classRoom [0]= new ClassRoom(new ExcelentPupil());
    classRoom[1]= new ClassRoom(new BadPupil());
    classRoom [2]= new ClassRoom(new GoodPupil() );

    }
}
//Используя IntelliJ IDEA, создайте проект. Требуется:
//Создать класс, представляющий учебный класс ClassRoom. Создайте класс ученик Pupil.
// В теле класса создайте методы void study(), void read(), void write(), void relax().
// Создайте 3 производных класса ExcelentPupil, GoodPupil, BadPupil от класса базового класса Pupil
// и переопределите каждый из методов, в зависимости от успеваемости ученика.
// Конструктор класса ClassRoom принимает аргументы типа Pupil, класс должен состоять из 4 учеников.
// Предусмотрите возможность того, что пользователь может передать 2 или 3 аргумента.
// Выведите информацию о том, как все ученики экземпляра класса ClassRoom умеют учиться, читать, писать, отдыхать.