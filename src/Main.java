public class Main {

    public static void main(String[] args) {

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

        // Информация о сотрудниках
        
        Person[] person = new Person[5];
        person[0] = new Person("Sergey", "Director", "director@mail.ru", 050505, 50000, 50);
        person[1] = new Person("Andrei", "Manager", "Manager@mail.ru", 151515, 20000, 25);
        person[2] = new Person("Victor", "Driver", "Driver@mail.ru", 252525, 25000, 39);
        person[3] = new Person("Pavel", "Maneger One", "ManegerOne@mail.ru", 353535, 40000, 41);
        person[4] = new Person("Irina", "Cleaner", "Cleaner@mail.ru", 454545, 10000, 40);

        // Проверям сотрудников старше либо равно 40 годам под созданный геттер
        for (int i = 0; i < person.length; i++) {
            if(person[i].getAge() >= 40){

                person[i].info(); // вывод информации.
            }
        }

    }
}