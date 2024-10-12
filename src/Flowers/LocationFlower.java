package Flowers;

/*
 * Клас квітки, що росте у певній місцевості
 * Успадковується від класу Flower та має додатковий атрибут
 * локації в якій знаходиться
 */
public class LocationFlower extends Flower {
    
    String locationOfGrowth;

    /*
     * Конструктор класу з параметрами, де викликається супер-клас,
     * а також ініціалізується додатковий параметр
     */
    public LocationFlower(final String name, final double length, final String color, final int amountOfPetals, final int levelOfFreshness, final String locationOfGrowth)
    {
        super(name, length, color, amountOfPetals, levelOfFreshness);
        this.locationOfGrowth = locationOfGrowth;
    }

    /*
     * Методи сетери і гетери для нового поля
     */
    public void setLocation(final String location)
    {
        this.locationOfGrowth = location;
    }

    public final String getLocation()
    {
        return this.locationOfGrowth;
    }

    /*
     * Успадкований перевизначений клас toString
     */
    @Override
    public String toString()
    {
        return super.toString() +
        String.format("|%10s|", this.getLocation());
    }

    

}
