package classroom1;

public class Pupil {
    public void study(){
        System.out.println("Some Pupil study");
    }
    public void read(){
    System.out.println("Some Pupil read");
    }
    public void write(){
        System.out.println("Some Pupil write");
    }
    public void relax( ){
        System.out.println("Some Pupil relax");
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