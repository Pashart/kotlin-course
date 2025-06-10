package com.apashart.lesson5

fun main() {
    val sum = 10 + 5 //оператор + складывает 2 числа
    val sumStr = "Hello" + "" + "World" // оператор + складывает 2 строки - конкатинация
    val diff = 10 - 5
    val product = 10 * 5
    val quotient = 10 / 5
    val remainder = 14 % 5 // вычисление остатка от деления

//Операторы сравнения. Левый операнд проверяется на эквивалентность правому операнду. Результат - булево значение

    val isEqual = 5 == 5
    val isNotEqual = 5 != 5
    val isGrater = 5 > 5
    val isLesser = 5 < 5
    val isGreaterOrEqual = 5 >= 5
    val isLesserOrEqual = 5 <= 5

//Логические операторы И ИЛИ НЕ

    val andResult = true && true // И - возвращает true только если с обоих сторон true (Все)
    val orResult = false || false // ИЛИ - возвращает true если с одной их сторон true (любой из)
    val notResult = !(true > false) // нет

//операторы присваивания

    var number = 5 // = присваивает значение
    number += 3 //присваивание с добавлением
    number -3 //присваивание с вычитанием
    number *2
    number /2

//инкремент и декремент увеличивает или уменьшает переменную на 1

    number++ //результат переменной потом увеличение
    number-- //результат переменной потом уменьшение
    --number //уменьшение, потом предоставление результата
    ++number //увеличение, потом предоставление результата

//Приоритеты арифметических операций, как у математических
//Приоритеты логических операций: ! -> && -> ||

    val example = ((8 + 1) >= 9) || (6 - 2 != 4) && (2 * 3 == 6) //в начале математические, потом логические

//ПРАКТИЧЕСКАЯ РАБОТА

    var example1 = (3 + 2 < 6) && (4 * 2 == 8) //true
    var example2 = (10 - 5 >= 5) || (2 * 3 != 6) //true
    var example3 = (8 / 2 == 4) && (7 % 3 != 1) //false
    var example4 = (9 - 3 >= 6) && (8 / 2 != 4) //false
    var example5 = ((3 + 4) < 8) && (12 / 3 == 4) || (5 % 2 != 1) //true
    var example6 = ((10 - 5) >= 5) || (6 * 2 != 12) && !(9 / 3 > 2) //true
    var example7 = ((2 * 5) == 10) && !(7 - 3 < 5) || (8 / 2 == 4) //true
    var example8 = ((9 + 2) < 12) && (15 % 4 != 3) || !(4 * 2 == 8) //false

//((var a = 4; a-- == 4) || (5 * 2 != 10)) && (3 + 1 == 4)
//true                   || false          && true      = true +
//(var b = 3; b++ > 3) && (6 / 2 == 3) || (7 - 2 != 5)
//false                && true         || false        = false +
//(var c = 1; ++c < 3) || ((4 % 2 == 0) && (5 + 0 == 5))
//true                 || true          && true         = true +
//((var d = 5; d-- == 5) && (8 / 4 == 2)) || (2 * 3 != 6)
//true                   && true          || false      = true +
//(var e = 2; e++ < 3) && ((7 + 1 == 8) || (4 % 2 != 0))
//true                 && true          || false        = true +

//Оператор ЕЛВИСА

    val defoltName = "Unknown"
    var name: String? = null

//В Java если переменная == null то возникает ошибка NullPointerException не возможно вызвать переменную.
//Это можно решить таким кодом:

/*
    val resJava = if (name == null) {
        defoltName
    } else {
        name
    }

//В Котлине есть замена этому коду, оператор ?: - Оператор Елвиса

    val result = name ?: defoltName
    val result2 = name ?: throw IllegalArgumentException("Не может быть null") //остановка программы + месседж
    val result3 = name ?: throw Exception("Не может быть null") //остановка программы + месседж

//Null - возникает тогда когда объект создать не удалось по какой-то причине, и программа должна остановится.
// Чтобы программа не прервалась, мы ставим заглушку null и мы ссылаемся на "ничто"
//Если нам нужно подставить что-то вместо null, мы с помощью оператора Элвиса можем присвоить дефолтное значение или сделать исключение
 */
    printVolume(null)
    printPrice(123.4, null)
    printPrice(100.0,13)
    printLanguage("Русский")
    printLanguage(null)
    printInsideBox("Жопа")
    printInsideBox(null)
}
//Задача выводить пользовательский уровень громкости

fun printVolume (userVolume: Int?) {
    val defaultVolume = 30
    println(userVolume ?: defaultVolume)
}

//ПРАКТИЧЕСКАЯ РАБОТА

//Рассчитать стоимость товара со скидкой, если цена может быть изваестна, а скидка не установлена
// скидка может быть а может не быть, если скидки нет то она может быть null

fun printPrice (price : Double, discount: Int?) {
    var kof = (100 - (discount ?: 0))/100.0
    println(price * kof)
}

//Вернуть язык интерфейса для сайта. Если пользователь не установил язык по умолчанию, то вернуть английский

fun printLanguage (language: String?) {
//    if (language == null) {
//        println("English")
//    } else {
//        println(language)
//    }
    val defoltLanguage = "English"
    var result1 = language ?: defoltLanguage
    println(result1)
}
//Вы работаете на складе и отвечаете за инвентаризацию и если в каком-то контейнере нет товара, то нужно остановить работу программы

fun printInsideBox (staff: String?) {
    println(staff ?: throw Exception ("Box is empty"))
}