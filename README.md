Грамматика находится в файле test.g4
Класс посетителя - файле  TestMyTest4FileVisitor.java

реализованные команды: mov , add, sub. xchg.

Переходы по метками (jmp, je, jne..) через посетители затрудняюсь написать.
С помощью переходов  можно попасть в любую точку дерева, а посетители обходят дерево только сверху вниз.
Поэтому думаю, что необходим более сложный механизм управления потоком выполнения.

Для хранения переменных и их значений  используется хэш - таблица. Не знаю насколько верен такой подход к этой задаче, но он показался мне самым простым.
