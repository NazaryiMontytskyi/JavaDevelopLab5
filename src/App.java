
import ExecPackage.ExecutableClass;


/*
 * Головний клас, що створює екземпляр виконавчого класу
 * та викликає його метод run()
 */

public class App {
    public static void main(String[] args) throws Exception {
        ExecutableClass execClass = new ExecutableClass();
        execClass.run();
    }
}
