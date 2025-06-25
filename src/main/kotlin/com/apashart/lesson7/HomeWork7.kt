package com.apashart.lesson7

fun main () {

    // Задания для Цикла for
    // Прямой Диапазон:
//Напишите цикл for, который выводит числа от 1 до 5.
    for (i in 1..5) {
        println(i)
    }
//Напишите цикл for, который выводит четные числа от 1 до 10.
    for (i in 1..10) {
        if (i % 2 == 0)
            println(i)
    }


    //Обратный Диапазон:
//Создайте цикл for, который выводит числа от 5 до 1.
    for (i in 5 downTo 1) {
        println("Обратный Диапазон: $i")
    }

//Создайте цикл for, который выводит числа от 10 до 1, уменьшая их на 2.
    for (i in 10 downTo 1) {
        println(i - 2)
    }


    //С Шагом (step):
//Используйте цикл for с шагом 2 для вывода чисел от 1 до 9.
    for (i in 1..9 step 2) {
        println("С Шагом (step): $i")
    }

//Напишите цикл for, который выводит каждое третье число в диапазоне от 1 до 20.
    for (i in 1..20 step 3) { //тут мне не нравится так как 1 не 3 число а 1
        println("Каждое 3е число: $i")
    }

    for (i in 1..20) { //так вроде правильно но без step
        if (i % 3 == 0)
            println("Каждое 3е число (): $i")
    }

    //Использование До (until):
//Используйте цикл for и until, чтобы вывести числа из диапазона 1-9 (9 не включается).
    for (i in 1 until 9) {
        println(i)
    }

//Напишите цикл for с until, чтобы вывести числа от 3 до 15, не включая 15.
    for (i in 3 until 15) {
        println(i)
    }

    //Задания для Цикла while
    //Цикл while:
//Создайте цикл while, который выводит квадраты чисел от 1 до 5.
    var square = 1
    while (square <= 5) {
        println("квадрат числа: ${square * square}")
        square++
    }

//Напишите цикл while, который уменьшает число от 10 до 5. После этого вывести результат в консоль
    var decrease = 10
    while (--decrease >= 5) {
        println(decrease)
    }

    //Цикл do...while:
//Используйте цикл do...while, чтобы вывести числа от 5 до 1.
    var number = 1
    do {
        println(number)
    } while (++number <= 5)

//Создайте цикл do...while, который повторяется, пока счетчик меньше 10, начиная с 5.
    var counter = 5
    do {
        println(counter)
    } while (++counter < 10)

    //Задания для Прерывания и Пропуска Итерации
    //Использование break:
//Напишите цикл for от 1 до 10 и используйте break, чтобы выйти из цикла при достижении 6.
    var counterBreak = 1..10
    for (i in counterBreak) {
        if (i > 6) break
        println(i)
    }

//Создайте цикл while, который бесконечно выводит числа, начиная с 1, но прерывается при достижении 10.
    var infinity = 1
    while (true) {
        println(infinity)
        if (++infinity > 10) break
    }

    //Использование continue:
//В цикле for от 1 до 10 используйте continue, чтобы пропустить четные числа.
    for (i in 1..10) {
        if (i % 2 == 0) continue
        println(i)
    }

//Напишите цикл while, который выводит числа от 1 до 10, но пропускает числа, кратные 3.
    var sickle = 1
    do {
        if (sickle % 3 == 0) continue
        println("Без кратных 3 ${sickle}")
    } while (++sickle <= 10)

//    var sickle = 1
//    while (true) {
//        if (sickle == 10) break
//        if (sickle % 3 == 0) continue
//        println("Без кратных 3 ${sickle}")
//    }

    //Задача на вложенный цикл
//Создать цикл в цикле, в каждом использовать диапазон от 1 до 10.
// В консоль вывести результат умножения переменных цикла.
// Результат умножения выводить через print() и добавлять ещё один print(“ ”) с пробелом, чтобы отделять значения в строку.
// После вложенного цикла выводить пустой println() чтобы следующий проход начинать с новой строки. Результат должен быть как на картинке.

    for (i in 1..10) {
        for (i1 in 1..10) {
            var result = i * i1
            print("$result ")
        }
        println()
    }

//Дополнительные задания
//Вывод чисел от 1 до 10: Напишите программу, которая выводит числа от 1 до 10 с использованием цикла while.
    var num = 1
    while (num <= 10) {
        println(num++)
    }

//Четные числа до 20: Используя цикл while, выведите все четные числа от 2 до 20.
    var num2 = 2
    do {
        if (num2 % 2 != 0) continue
        println("четные: $num2")
    } while (++num2 <= 20)

//Сумма чисел от 1 до 50: Напишите программу, которая суммирует числа от 1 до 50 с помощью цикла while.
    var num3 = 1
    var sum = 0 //чтобы мы смогли вывести
    while (num3 <= 50) {
        sum = sum + num3++ //после чтобы увеличение числа было в следующей итерации
    }
    println(sum)

//Вывод чисел от 10 до 1: Используя цикл do while, выведите числа от 10 до 1.
    var num4 = 10
    while (num4 >= 1) {
        println(num4--)
    }

//Факториал числа 5: Напишите программу, которая вычисляет факториал числа 5 с использованием цикла while.
    var num5 = 1
    var mult = 1
    while (num5 <= 5) {
        mult = mult * num5++
    }
    println(mult)

//Сумма четных чисел до 100: Используя цикл while, найдите сумму всех четных чисел от 2 до 100.
    var num6 = 2
    var sum2 = 0
    do {
        if (num6 % 2 != 0) continue
        sum2 = sum2 + num6
    } while (++num6 <= 100)
    println("Сумма четных чисел: $sum2")

//Таблица умножения на 3: Напишите программу, которая выводит таблицу умножения на 3.
    for (i in 1..10) {
        val tableMulti = 3
        var result = i * tableMulti
        print("$result ")
    }
    println()

//Вывод символов до точки: Используя цикл do while, выведите символы строки "Kotlin." по одному до точки.
    var myString = "Kotlin."
    var stopWhile = myString.length
    var index = 0
     do {
        println("Вывод символов до точки: ${myString[index++]}")
    } while (index != stopWhile)


//Наибольшее число из списка: Напишите программу, которая находит наибольшее число из заданного списка чисел с использованием цикла while.
//Пример списка: [5, 12, 7, 22, 9]

//    var list = intArrayOf(5, 7, 22, 12, 9)
//    while (list[1] > list[5]) {
//        list[1] > list[2]++
//    }


//Генерация чисел до 15: Используя цикл do while, напишите программу, которая генерирует и выводит числа от 1 до 15.
    var num7 = 1
    do {
        println(num7)
    } while (++num7 <= 15)

//Простые числа до 20: Напишите программу, которая выводит все простые числа до 20 с использованием цикла while.

//    Решето Эратосфена

//Обратный порядок элементов массива: Создайте массив из 10 элементов и выведите его элементы в обратном порядке с помощью цикла while.
//Количество итераций до 100: Напишите программу, которая увеличивает счетчик на 1 в цикле while до тех пор, пока значение счетчика не достигнет 100. Выведите количество итераций.
    var counter1 = 0
    while (counter1 <=100) {
        counter1++
    }
    println("Кол-во итераций: $counter1")

    //Прямоугольник из символов: Используя вложенные циклы while, выведите прямоугольник размером 5x3 из символов *.
//Числа Фибоначчи до 50: Напишите программу, которая выводит все числа Фибоначчи, не превышающие 50, с использованием цикла while.
    //Формула чисел Фибоначчи: F(n) = F(n-1) + F(n-2), где:

    println("числа фибоначи")
    var f0 = 0
    var f1 = 1
    var fR = f0 + f1
    println(fR)
    fR = fR + f1
    println(fR)
    fR = (fR-f1) + fR
    println(fR)
    fR = fR + ((fR-f1) - fR)
    println(fR)

//Счетчик шагов: Создайте программу, которая считает шаги от 0 до 30 с шагом 5, используя цикл while.
    var shag = 0
    while (++shag <= 30) {
        if (shag % 5 == 0)
        println("Шаг: $shag")
    }
//Среднее значение фиксированного списка чисел: Найдите среднее значение чисел из списка [4, 8, 15, 16, 23, 42] с помощью цикла while.

//    val listNumbers = listOf<Int>(4, 8, 15, 16, 23, 42)
//    var index = 0
//    var resultInd = 0
//    while (true) {
//        resultInd =(resultInd + listNumbers)/6
//        println("Результат среднезначения: $resultInd")
//    }


//Таблица умножения с вложенными циклами: Используя вложенные циклы do while, напишите программу для вывода таблицы умножения от 1 до 5.

    var argument1 = 1
    var argument2 = 1
    do {
        do {
            var result1 = argument1++ * argument2
            print("$result1 ")
        } while (argument1 <= 10)
        println()
        argument2++
        argument1 = 1
        do {
            var result2 = argument1++ * argument2
            print("$result2 ")
        } while (argument1 <= 10)
        println()
        argument2++
        argument1 = 1
        do {
            var result3 = argument1++ * argument2
            print("$result3 ")
        } while (argument1 <= 10)
        println()
        argument2++
        argument1 = 1
        do {
            var result4 = argument1++ * argument2
            print("$result4 ")
        } while (argument1 <= 10)
        println()
        argument2++
        argument1 = 1
        do {
            var result5 = argument1++ * argument2
            print("$result5 ")
        } while (argument1 <= 10)
        argument2++
        println()
    } while (argument2 <= 5)

//Сумма чисел в диапазоне: Напишите программу, которая находит сумму чисел от 10 до 30 с использованием цикла while.
    var numFor = 1
    var sum3 = 0
    while (++numFor <= 30) {
        if (numFor < 10) {
            continue
        } else sum3 = sum3 + numFor
    }
    println("Сумма чисел от 10 до 30: $sum3")

//Сумма четных и нечетных чисел: Используя цикл while, найдите отдельно сумму четных и сумму нечетных чисел от 1 до 20.
    var numEleven = 1
    var sumChet = 0
    var sumNoChet = 0
    do {
        if (numEleven % 2 == 0) {
            sumChet = sumChet + numEleven
        }
        if (numEleven % 2 != 0) {
            sumNoChet = sumNoChet + numEleven
        }
    } while (++numEleven <= 20)
    println("Сумма четных чисел: $sumChet")
    println("Сумма Не четных чисел: $sumNoChet")
}
