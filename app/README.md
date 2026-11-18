# Игры разума (Java)

## Стек

- Java

## Установка

```bash
git clone https://github.com/mxmrbkv/qa-auto-engineer-java-project-61.git
cd qa-auto-engineer-java-project-61/app
./gradlew installDist
```

## Использование

Для запуска приложения нужно выполнить команду в терминале:

```bash
make run-dist
```

### Игра: Проверка на чётность (Even)
Показывается случайное число. Нужно ответить `yes`, если число чётное, или `no` — если нечётное.

Пример правильного поведения игры:
```text
Please enter the game number and press Enter.
1 - Greet
2 - Even
0 - Exit
Your choice: 2
Welcome to the Brain Games!
May I have your name? Sam
Hello, Sam!
Answer 'yes' if the number is even, otherwise answer 'no'.
Question: 53
Your answer: no
Correct!
Question: 46
Your answer: yes
Correct!
Question: 96
Your answer: yes
Correct!
Congratulations, Sam!
```

Пример ошибки в поведении игры:
```text
Please enter the game number and press Enter.
1 - Greet
2 - Even
0 - Exit
Your choice: 2
Welcome to the Brain Games!
May I have your name? Bill
Hello, Bill!
Answer 'yes' if the number is even, otherwise answer 'no'.
Question: 50
Your answer: no
'no' is wrong answer ;(. Correct answer was 'yes'.
Let's try again, Bill!
```

### Игра: Калькулятор (Calc)
Показывается случайное арифметическое выражение (`+`, `-`, `*`), которое необходимо вычислить.

Пример правильного поведения игры:
```text
Please enter the game number and press Enter.
1 - Greet
2 - Even
3 - Calc
0 - Exit
Your choice: 3
Welcome to the Brain Games!
May I have your name? Sam
Hello, Sam!
What is the result of the expression?
Question: 12 * 9
Your answer: 108
Correct!
Question: 17 + 10
Your answer: 27
Correct!
Question: 9 - 11
Your answer: -2
Correct!
Congratulations, Sam!
```

Пример ошибки в поведении игры:
```text
Please enter the game number and press Enter.
1 - Greet
2 - Even
3 - Calc
0 - Exit
Your choice: 3
Welcome to the Brain Games!
May I have your name? Sam
Hello, Sam!
What is the result of the expression?
Question: 25 * 7
Your answer: 145
'145' is wrong answer ;(. Correct answer was '175'.
Let's try again, Sam!
```

### Игра: НОД (Brain GCD)
Показываются два случайных числа. Необходимо вычислить и ввести их наибольший общий делитель.

Пример правильного поведения игры:
```text
Please enter the game number and press Enter.
1 - Greet
2 - Even
3 - Calc
4 - GCD
0 - Exit
Your choice: 4
Welcome to the Brain Games!
May I have your name? Sam
Hello, Sam!
Find the greatest common divisor of given numbers.
Question: 25 50
Your answer: 25
Correct!
Question: 100 52
Your answer: 4
Correct!
Question: 3 9
Your answer: 3
Correct!
Congratulations, Sam!
```

Пример ошибки в поведении игры:
```text
Please enter the game number and press Enter.
1 - Greet
2 - Even
3 - Calc
4 - GCD
0 - Exit
Your choice: 4
Welcome to the Brain Games!
May I have your name? Sam
Hello, Sam!
Find the greatest common divisor of given numbers.
Question: 25 50
Your answer: 1
'1' is wrong answer ;(. Correct answer was '25'.
Let's try again, Sam!
```

### Игра: Арифметическая прогрессия (Progression)
Показывается ряд чисел, образующий арифметическую прогрессию, в которой одно из чисел скрыто двумя точками (`..`). Необходимо определить пропущенное число.

Пример правильного поведения игры:
```text
Please enter the game number and press Enter.
1 - Greet
2 - Even
3 - Calc
4 - GCD
5 - Progression
0 - Exit
Your choice: 5
Welcome to the Brain Games!
May I have your name? Sam
Hello, Sam!
What number is missing in the progression?
Question: 5 7 9 11 13 .. 17 19 21 23
Your answer: 15
Correct!
Question: 2 5 8 .. 14 17 20 23 26 29
Your answer: 11
Correct!
Question: 14 19 24 29 34 39 44 49 54 ..
Your answer: 59
Correct!
Congratulations, Sam!
```

Пример ошибки в поведении игры:
```text
Please enter the game number and press Enter.
1 - Greet
2 - Even
3 - Calc
4 - GCD
5 - Progression
0 - Exit
Your choice: 5
Welcome to the Brain Games!
May I have your name? Sam
Hello, Sam!
What number is missing in the progression?
Question: 5 7 9 11 13 .. 17 19 21 23
Your answer: 1
'1' is wrong answer ;(. Correct answer was '15'.
Let's try again, Sam!
```
