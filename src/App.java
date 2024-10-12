
import ExecPackage.ExecutableClass;


/*
 * Головний клас, що створює екземпляр виконавчого класу
 * та викликає його метод run()
 */

public class App {
    public static void main(String[] args) throws Exception {
		int myOrderNumber = 13;
		
		System.out.println("---------------------------");
		System.out.println("C13 = " + (myOrderNumber % 13));
		System.out.println("---------------------------");

		
        ExecutableClass execClass = new ExecutableClass();
        execClass.run();
    }
}
