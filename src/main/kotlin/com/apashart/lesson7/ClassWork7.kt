package com.apashart.lesson7

//ЦИКЛЫ

fun main () {
    for (i in /*collection*/ 1..10) { //оператор for перебирает коллекцию.
                                            // i (item) переменная которая назначается на элемент коллекции, можем юзать в теле цикла
        println(i)//тело цикла
    }
    for (i in  1..10 step 2) { //step - шаг диапазона
        println(i)
    }
    val range = 1..10
    for (i in range) { //коллекцию можно передавать через перменную
        println(i)
    }
    var counter = 10
    while (counter-- > 0) {  //аргумент проверяет булево значение. здесь пост декремент уменьшает значение переменной, цикл выполняется пока не будет false
        println(counter)  //выполняется бесконечно если true
    }
    do { //в начале делает тело цикла. а потом проверяет. выплоняется как минимум 1 раз
        println("+") //тело цикла
    } while (false)
    for (i in 1..10) {
        if (i == 2) continue //если оператор continue то цикл переходит на следующую итерацию
        if (i == 7) break //останавливает цикл
    }
//ПРАКТИЧЕСКАЯ РАБОТА
    for (i in 1..10) { //без фигурных скобок только 1 строчка после
        println(i)      //без ln все будет в 1 строку
    }
    for (i in 1..5) {
        println(i*i)
    }
    for (i in  10 downTo 1) {
        println(i)
    }
    for (i in  20 downTo 1 ) { //вывести четные цифры из диапазона 20 до 1
        if (i % 2 == 0) {
            println(i)
        }
    }
    for (i in  1..30 step 3) { //каждое 3 число
        println(i)
    }
    var count = 1 //сумму всех чиселле от 1 до 10
    var sum = 0
    while (count <= 10) {
        sum = sum + count++
    }
    println("Sum = $sum")

    var counter1 = 100
    while (counter1 >= 1) { //Количество цифр в числе в диапазоне от 1-100, уменьшая каждый раз
        println(counter1--.toString().length) //дикремент тут потому иначе сразу вычитается 100
    }
}







