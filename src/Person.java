/* Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст;
* Конструктор класса должен заполнять эти поля при создании объекта;
* Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль;
* Создать массив из 5 сотрудников:
        Пример:
        Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
        persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        // потом для каждой ячейки массива задаем объект
        persArray[1] = new Person(...);
        persArray[4] = new Person(...);
* С помощью цикла вывести информацию только о сотрудниках старше 40 лет;
 */

public class Person {

    private String name;
    private String positionWork;
    private String email;
    private int number;
    private int money;
    private int age;

    public Person(String name, String positionWork, String email, int number, int money, int age) {
        this.name = name;
        this.positionWork = positionWork;
        this.email = email;
        this.number = number;
        this.money = money;
        this.age = age;
    }


    public void info() {
        System.out.printf("Имя %s, Должность %s, email %s, Номер телефона %s, Зарплата %s, Возраст %d\n", name, positionWork, email, number, money, age);
    }

    // alt + insert создали геттер для age; для дальнейшей задачи вычеслить возраст
    public int getAge() {
        return age;
    }

}
