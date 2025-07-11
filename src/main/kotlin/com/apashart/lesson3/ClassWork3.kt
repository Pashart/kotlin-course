package com.apashart.lesson3
/*
val name: String ="Artem" //не изменяемая переменная

var age: Int = 0 //Изменяемая переменная. Int - целочисленные

//в котлине нет примитивов в отличии от Java, в котлине только классы

const val PI = 3.14 //нельзя предствить какой-то объект, постоянная величина которую мы знаем на момент компиляции, потом она передаётся в компилятор

lateinit var userInfo: String //поздняя иницилизация, можем ниже в коде задать ей какое-то значение и проинициализировать её. Если зададим инициализацию раньше, то не взлетит. только var. На стороне вычислил, в нужный момент записал

val layzyValue: String by lazy {
    "Hello, this is a lazy string!"
} //инициализируется только после вызова переменной. После инициализации привязывается. Лучше использовать только тогда когда надо использовать большой объект и тп. Но не факт что мы им будем пользоваться чтобы не потратить просто так ресурсы приложения.

//runtime - время исполнения кода

var speed: Double? = null //? показывает что переменная может быть NULL

var count: Int = 0
    get() = field //геттер // field - фактическое хранилище переменной
    set(value) { //сеттер
        if (value >= 0) field = value
    } //get и set -- регуляторы для переменной. Если дальше я задам перееменную count set может проверить и положить или не положить переменную. Get может отдать/не отдать/изменить и отдать

// Less 3 Practic 1 задать переменный (лучше с ними разговаривать)
// уникальный номер шасси автомобиля генерируется и не изменяется
val numberFrame: String = "123456LD"
//цвет автомобиля
var carColour: String = "RED"
//пробег
var mileage: Double = 0.0
//имя владельца. Отложенная, так как пока что Автомобиль никому не принадлежит, так как только что сошел с конвеера.
lateinit var ownerCar: String
//Количество колес. Оно не меняется
const val COUNT_WHEELS: Int = 4
//детальный отчет перед сдачей в утиль. Сейчас пока автомобиль ток сходит с конвеера, мы закладываем этот код который вызовется однажды в будущем при утилизации
/*
var totalReport: String by lazy {
    "Text report"
}
 */
//запас топлива. Добавляем геттеры и сеттеры, так как запас топлива ограничен объемом топливного бака. Написали всякие штуки
var fuel: Double = 0.0
    get() = field
    set(value) {
        if (value > 0) field += value
    }

/*
1. Не изменяемая переменная
2. Изменяемая переменная
3. Не изменяемая константа
4. Изменяемая переменная с поздней инициализацией
5. Ленивая переменная
6. Переменная Null
7. Переменная с условиями Геттеры и Сеттеры
 */


 */


