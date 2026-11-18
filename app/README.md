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