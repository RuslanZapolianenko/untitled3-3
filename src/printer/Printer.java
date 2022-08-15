package printer;

public class Printer {
    public void print(String value) {
        System.out.println(value);
    }
}

class Black extends Printer {
    @Override
    public void print(String value) {
        System.out.print(TextColor.BLACK);
        System.out.println(value);
    }
}

class Red extends Black {
    @Override
    public void print(String value) {
        System.out.print(TextColor.RED);
        System.out.println(value);
    }
}

class Green extends Red {
    @Override
    public void print(String value) {
        System.out.print(TextColor.GREEN);
        System.out.println(value);
    }
}

class Yellow extends Green {
    @Override
    public void print(String value) {
        System.out.print(TextColor.YELLOW);
        System.out.println(value);
    }
}

class Blue extends Yellow {
    @Override
    public void print(String value) {
        System.out.print(TextColor.BLUE);
        System.out.println(value);
    }
}

class Purple extends Blue {
    @Override
    public void print(String value) {
        System.out.print(TextColor.PURPLE);
        System.out.println(value);
    }
}

class Cyan extends Purple {
    @Override
    public void print(String value) {
        System.out.print(TextColor.CYAN);
        System.out.println(value);
    }
}

class Grey extends Cyan {
    @Override
    public void print(String value) {
        System.out.print(TextColor.GREY);
        System.out.println(value);
    }
}


enum TextColor {
    RESET("\u001B[0m"),
    BLACK("\u001B[30m"),
    RED("\u001B[31m"),
    GREEN("\u001B[32m"),
    YELLOW("\u001B[33m"),
    BLUE("\u001B[34m"),
    PURPLE("\u001B[35m"),
    CYAN("\u001B[36m"),
    GREY("\u001B[37m");
    private String ansiCode;

    private TextColor(String ansiCode) {
        this.ansiCode = ansiCode;
    }

    public void setAnsi_code(String ansiCode) {
        this.ansiCode = ansiCode;
    }

    @Override
    public String toString() {
        return this.ansiCode;
    }
}
//Используя IntelliJ IDEA, создайте проект. Требуется: Создайте класс Printer.
// В теле класса создайте метод void print(String value), который выводит на экран значение аргумента.
// Реализуйте возможность того, чтобы в случае наследования от данного класса других классов,
// и вызове соответствующего метода их экземпляра, строки, переданные в качестве аргументов методов,
// выводились разными цветами. Обязательно используйте приведение типов.