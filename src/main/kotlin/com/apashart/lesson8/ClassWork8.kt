package com.apashart.lesson8

fun main() {
    val simpleString = "Это просто строка"
//Конкотинация
    val firstName = "Иван"
    val lastName = "Иванов"
    val fullName = firstName + " " + lastName

//шаблон / template - более оптимально
    val age = 30
    val greeting = "Привет! Меня зовут $firstName, и мне $age лет."

    //шаблон и обращение к классу
    val person = Person("Artem", 25)
    val introduction = "Меня зовут ${person.name}, и мне ${person.age}" //фигурные скобки если что-то большее чем просто обращение к переменной

    //шаблон и обращение к функции
    val getDeteils = "It is ${getDetails()}"

    //выполнение кода в шаблоне
    val x = 10
    val y = 20
    val resultString = "Result = ${x + y}" //в скобках можно выполнять любой код

//Substring - позволяет выводить часть строки
    val originalString = "Kotlin is fun"
    val subString = originalString.substring(7) //в аргументе передается индекс с которого передаются данные
    val subString2 = originalString.substring(3, 6) // начальная и конечная индексы передачи строки, при этом 3 входит, а 6 не входит
    //конечный индекс просто можно посчитать прибавив к нему длину строки
    val replacedString = originalString.replace("fun", "awesome") //заменяет фрагмент оригинальной строки и заменить его на новое значение
    val words = originalString.split(" ") //разделяет на список из элементов.
    // в аргументе передается признак, по которому будет выполняться разделение, при этом само значение по которому происходит разделение не выводится

    val length = "Hello".length // подсчет кол-ва символом
    val upper = "hello".uppercase() //перевести все буквы в верхний регистр
    val lower = "HELLO".lowercase() //переводит символы в нижний регистр
    val trimmed = "  hello  ".trim() //удаляет крайние пробелы (в начале и в конце)
    val trimmed2 = "  hello  ".trim( 'h', '.') //может удалять конкретные символы в строке
    val starts = "Kotlin".startsWith("Kot") //начинается ли строка с определенного значение - булево
    val ends = "Kotlin".endsWith("lin")//Заканчивается ли строка определенным значением - булево
    val contains = "Hello".contains("ell") //входит ли строка в строку - булево
    val empty = "".isNullOrEmpty() //Проверяет строка null или не содержит данных - булево. Благодаря ему можем отсекать null строки. Пробел считает за значение
    val blank = "  ".isNullOrBlank() //Проверят как и isNullOrEmpty, но, в том числе отсекает пробелы
    val repeat = "ab".repeat(3) //Повторить строку N раз
    val letter = originalString[5] //[] - означает взять по индексу
    val indexOfChar = "Kotlin".indexOf('t') //вернет индекс первого вхождения символа 't' в строку
    val indexOfWord = "Kotlin is the best language".indexOf("best") // может искать на каком индексе строка входит
    val backReverse = "niltoK".reversed() // поменяет буквы в обратном направлении
    val multiLineString = """ 
    Первая строка
    Вторая строка
    Третья строка
""".trimIndent() // """ - запись многострочного кода. trimIndent - позволяет очистить от пробелов перед строками

    val name = "Алексей"
    val city = "Москва"
    val age2 = 32
    val friendsCount = 1052
    val rating = 4.948
    val balance = 2534.75856
    val text = """
   Имя: %s 
   Город: %s
   Возраст: %d
   Количество друзей: %,d
   Рейтинг пользователя: %.1f
   Баланс счета: $%,.2f
""".trimIndent() //% - символ форматирования, на этом месте потом будут данные
    /*
    %s - строка
    %s - строка
    %d
    %,d - числовое значение разбитое на тысячи, иногда вместо этого точка
    %.1f - количество знаков после запятой
    $%,.2f - в начале разделяем на тысячи, а потом 1 символ после запятой
     */
    println(text.format(name, city, age2, friendsCount, rating, balance)) // подставляет значения вместо символов форматирования, должно быть равно кол-ву заглушек

    //вызовы переменных для функций из практической работы

    convert("Ошибка в системе вызвала панику.")

    var text1 = "Kotlin: The Fun Way to Learn Programming"
    println(text1.substring(8, 19))
    var text2 = "contact@example.com"
    var indexOfAt = text2.indexOf('@')
    println(text2.substring(indexOfAt + 1))

    val numberPhone = "123-456-7890"
    println("XXX-XXX-${numberPhone.substring(8)}")
    val split = numberPhone.split('-') //тоже самое только через Split
    println("XXX-XXX-${split[2]}")

}

class Person(val name: String, val age: Int)

fun getDetails(): String {
    return "very interesting do"
}



//ПРАКТИЧЕСКАЯ РАБОТА
//Функция преобразования, которая будет форматировать строки в зависимости от содержания
/*
Правила Проверки и Преобразования:
Если фраза начинается с "ошибка":
Преобразование: Замените "ошибка" на "небольшое недоразумение".
Если фраза заканчивается на "важно":
Преобразование: Добавьте в конец фразы "…но не критично".

Если фраза содержит слово "проблема":
Преобразование: Замените "проблема" на "неожиданность".
Если индекс слова "срочно" находится в промежутке от 0 до 10:
Преобразование: Верните "Кажется, кто-то забыл что-то сказать".

Примеры Тестовых Фраз:
"Ошибка в системе вызвала панику."
"Для завершения проекта важно."
"Обнаружена проблема с сетью."
"Срочно нужно обновить данные!"
""
*/

fun convert(string: String): String {
    return when {
        string.startsWith("ошибка", true) -> string.replace("ошибка", "небольшое недоразумение", ignoreCase = true)
        string.endsWith("важно", true) -> "$string ...но не критично"
        else -> ""
    }
}
