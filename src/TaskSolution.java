/*
    1. Объявить и инициализировать связанный список в 10000 элементов случайным числом от -1024 до 1024
    2. Пройти по списку и удалить все отрицательные элементы
    3. Скопировать в переменные и удалить из списка первый и второй элементы, сложить переменные, результат сохранить в начало списка.
    4. Реализовать пункт №3 для всего списка.
    5. Измерить время исполнения пунктов №2 и №3.
    6. *Реализовать пункты с первого по пятый, но с ArrayList. Сравнить время исполнения.
    7. **Оптимизировать реализацию заданий так, чтобы время выполнения LinkedList и ArrayList были наименьшим.
*/

import java.util.LinkedList;
import java.util.Random;

public class TaskSolution {
    public static void main(String[] args) {
// 1. Объявить и инициализировать связанный список в 10000 элементов случайным числом от -1024 до 1024
        LinkedList<Integer> numbers = new LinkedList<>();

        Random random = new Random();
        for (int i = 0; i < 10000; i++) numbers.add(random.nextInt(-1024,1024));
        System.out.println("1. " + numbers + ".");

// 2. Пройти по списку и удалить все отрицательные элементы
        long start2 = System.currentTimeMillis();

        numbers.removeIf(s -> s < 0);
        System.out.println("2. " + numbers + ".");

        long end2 = System.currentTimeMillis();

// 3. Скопировать в переменные и удалить из списка первый и второй элементы, сложить переменные, результат сохранить в начало списка.
        long start3 = System.currentTimeMillis();

        System.out.println("3. " + sum(numbers)+ ".");

        long end3 = System.currentTimeMillis();

// 4. Реализовать пункт №3 для всего списка.
        while(numbers.size() > 1) sum(numbers);
        System.out.println("4. " + numbers + ".");

// 5. Измерить время исполнения пунктов №2 и №3.
        System.out.printf("5. Время исполнения пункта 2: %s мс.\n", (end2 - start2));
        System.out.printf("   Время исполнения пункта 3: %s мс.\n", (end3 - start3));
    }

    public static LinkedList<Integer> sum(LinkedList<Integer> list) {
        int numb = list.getFirst();  list.remove(0);
        numb += list.getFirst();  list.remove(0);
        list.add(0, numb);
        return list;
    }
}
