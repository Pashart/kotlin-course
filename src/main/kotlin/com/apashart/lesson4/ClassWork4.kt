package com.apashart.lesson4

//В котлине нет разделения на ссылочные и примитивные типы данных

val myInt: Int = 32 //Задаёт целочисленное значение. Есть Макс и Мин если мы вычисляем Int в рантайме и оно превышает допустимые значения, то происходит потеря данных
val myFloat: Float = 0.54F //Экономит нам данные при задании переменной с плавающей точкой
val myLong: Long = 438909393092834-92 //сильно больше чем Int. Обычно в нем хранят время в секундах/милисекундах
val myShort: Short = 4939 //Числовой формат. Экономит нам память, так как диапазон мальнький
val myByte: Byte = 127 //Числовой формат. Ещё меньше диапазон -127-128
val myDouble: Double = 4.029340234293 //после запятой может хранить больше данных чем Float, при этом использует больше памяти

val isKotlinFun: Boolean = true //Булево значние. Позволяет работать с логическими выражениями, проверка if

val letter: Char = 'A' //любой единичный символ

val text: String = "Hello World" //строка, вроде не ограничена

//коллекции, списки
val numbers: Array<Int> = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10) //не изменяемая коллекция, список
val strings: MutableList<String> = mutableListOf("Hello", "World") //изменяемя коллекция
val doubles: Set<Double> = setOf(1.1, 2.2, 3.3)

//словари
val keysToValues: Map<String, String> = mapOf( //не изменяемая коллекция
    "key 1" to "value1",
    "key 2" to "value2",
)
val keysToValuesMutable: MutableMap<String, String> = mutableMapOf( //Изменяемая коллекция
    "key 1" to "value1",
    "key 2" to "value2",
)

//Каждый из этих типов может быть null, называется Nullable. Помечается ?: Int? =...

val anything: Any = false //все что угодно можно положить. Определяется в момент рантайма

fun printMassage(massage: String): Unit { //Unit говорит о том что функция ничего не возвращает. Обычно если функция просто ничего не означает не нужно прописывать Unit, но бывают случаи когда надо это прописать явно
    println("Massage: $massage")
}

fun fail(massage: String): Nothing { //Функция не может быть исполнена. Нужно указывать для компилятора чтобы он правильно оптимизировал код
    throw IllegalArgumentException(massage)
}

