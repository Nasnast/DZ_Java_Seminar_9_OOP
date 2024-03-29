/* Задача 1 - Iterator

Создать класс Студент
- Создать класс УчебнаяГруппаИтератор
- Создать класс УчебнаяГруппаИтератор, заставив его реализовать интерфейс Iterator
- Реализовать его контракты

- Модифицировать класс УчебнаяГруппа, заставив его реализовать интерфейс Iterable
- Реализовать метод iterator() возвращающий экземпляр созданного нами итератора
 */

/*- Модифицировать класс Студент, заставив его реализовать интерфейс Comparable
- Реализовать контракт compareTo () со сравнением по какому-либо параметру (пример studentId) */

/*- Создать класс СтудентКомпаратор реализующий интерфейс Comparator
- Реализовать контракт compare () со сравнением по какому-либо параметру (пример: сочетание Имя+Фамилия) */

/*Домашнее задание
� Создать класс Поток содержащий в себе список УчебныхГрупп и
реализующий интерфейс Iterator
� Создать класс StreamComparator, реализующий сравнение количества групп
входящих в Поток */
package temp1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {
        List<Student> listStud = new ArrayList<Student>(List.of(
                new Student("Ivan", "Ivanov", 20),
                new Student("Anya", "Katina", 21),
                new Student("Vasya", "Zhukov", 19),
                new Student("Ira", "Zhukova", 19)));

        StudentGroupIterator iterator = new StudentGroupIterator(listStud);
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println();

        StudyGroup newIterator = new StudyGroup(null);
        newIterator.setList(listStud);
        Iterator<Student> iterStud = newIterator.iterator();

        while (iterStud.hasNext()) {
            System.out.println(iterStud.next());

        }

        // System.out.println(listStud.get(0).compareTo(listStud.get(2)));

        Collections.sort(listStud, new StudentComporator());
        System.out.println(listStud);
        System.out.println();

        ///////////////////////////
        StudyGroup group1 = new StudyGroup("Группа 1");
        StudyGroup group2 = new StudyGroup("Группа 2");
        StudyGroup group3 = new StudyGroup("Группа 3");
        StudyGroup group4 = new StudyGroup("Группа 4");
        StudyGroup group5 = new StudyGroup("Группа 5");
        StudyGroup group6 = new StudyGroup("Группа 6");
        StudyGroup group7 = new StudyGroup("Группа 7");
        StudyGroup group8 = new StudyGroup("Группа 8");
        List<StudyGroup> listGroupAll = new ArrayList<>(
                List.of(group1, group2, group3, group4, group5, group6, group7, group8));

        List<StudyGroup> listGroup = new ArrayList<StudyGroup>();

        Stream stream1 = new Stream(1, listGroup);
        stream1.addStudyGroup(group1);
        stream1.addStudyGroup(group3);
        stream1.addStudyGroup(group4);
        Stream stream2 = new Stream(2, listGroup);
        stream2.addStudyGroup(group2);
        Stream stream3 = new Stream(3, listGroup);
        stream1.addStudyGroup(group7);
        stream2.addStudyGroup(group8);
        stream2.addStudyGroup(group6);
        stream3.addStudyGroup(group5);

        Iterator<StudyGroup> iterStream = listGroupAll.iterator();
        while (iterStream.hasNext()) {
            System.out.println(iterStream.next());
        }
        System.out.println();

        List<Stream> streams = List.of(stream1, stream2, stream3);

        for (Stream stream : streams) {
            System.out.println(stream);

        }
        // System.out.println(compareTo(streams));
        List<Stream> streamList = new ArrayList<>(streams);
        Collections.sort(streamList, new StreamComporator());
        System.out.println(streamList);
    }
}
