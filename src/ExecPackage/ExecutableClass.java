package ExecPackage;

import Flowers.*;

/*
 * Виконавчий клас для реалізації логіки програми
 */

public class ExecutableClass {
    
    /*
     * Метод у якому створється букет
     * Виводиться букет на екран
     * Сповіщення користувача про сортування букету
     * Виведення відсортованого набору даних
     */
    public void run()
    {
        Bouqette bouqette = this.generateBouqette();
        System.out.println(bouqette);
        this.sortingMessage();
        bouqette.sortByFreshness();;
        System.out.println(bouqette);
    }

    /*
     * Генерація букету для прикладу
     */
    private Bouqette generateBouqette() {
        Bouqette bouqette = new Bouqette();
    
        bouqette.addFlower(new TemporaryFlower("Flower 1", 15.0, "Red", 25, 5, 3));
        bouqette.addFlower(new TemporaryFlower("Flower 2", 12.0, "Yellow", 30, 4, 5));
        bouqette.addFlower(new TemporaryFlower("Flower 3", 10.5, "White", 20, 6, 4));
        bouqette.addFlower(new TemporaryFlower("Flower 4", 13.7, "Purple", 28, 7, 6));
        bouqette.addFlower(new TemporaryFlower("Flower 5", 11.0, "Blue", 26, 8, 3));
    
        bouqette.addFlower(new LocationFlower("Flower 6", 17.0, "Pink", 32, 3, "Holland"));
        bouqette.addFlower(new LocationFlower("Flower 7", 16.5, "Orange", 22, 2, "Colombia"));
        bouqette.addFlower(new LocationFlower("Flower 8", 18.2, "Green", 18, 4, "Ecuador"));
        bouqette.addFlower(new LocationFlower("Flower 9", 19.0, "Lavender", 24, 5, "Kenya"));
        bouqette.addFlower(new LocationFlower("Flower 10", 14.0, "Violet", 27, 6, "Africa"));
    
        bouqette.addFlower(new SeasonFlower("Flower 11", 12.3, "White", 21, 7, "Spring"));
        bouqette.addFlower(new SeasonFlower("Flower 12", 10.8, "Yellow", 25, 6, "Summer"));
        bouqette.addFlower(new SeasonFlower("Flower 13", 11.5, "Red", 29, 8, "Fall"));
        bouqette.addFlower(new SeasonFlower("Flower 14", 13.2, "Blue", 23, 9, "Winter"));
        bouqette.addFlower(new SeasonFlower("Flower 15", 14.5, "Orange", 28, 7, "Spring"));
    
        return bouqette;
    }

    /*
     * Повідомлення користувача про сортування букету
     */
    private void sortingMessage()
    {
        System.out.println("o==========o============o");
        System.out.println("SORTING DATASET BY FRESHNESS");
        System.out.println("o==========o============o");
    }
    

}
