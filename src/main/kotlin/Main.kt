fun main(args: Array<String>) {
    println("Hello World!")

    //Object Of car
    val c1 = Car()
    var c2 = Car()
    var c3: Car? = null
    val c4: Car by lazy { Car() } //imp


    // iF()
    // loop()
    // arrays()


    //Calling  function
    c1.getO1(2, "ahmed")
    c1.getO1(x2 = "ahmed", x1 = 1)
    c1.getO2(x1 = 1)
    c1.unitFun({ c1.print() })




}

fun iF() {
    var x = 2
    var y = 1
    var i: Int? = null

    i = if (x == y) {
        x + y
    } else {
        0
    }
    println(i)
    ///////////////////////////////////////////////////


    //when == Switch in Java

    when (x) {
        1 -> {}
        2 -> {}
        3 -> {}
        else -> {

        }
    }
}

fun loop() {
    //FOR

    var l = 2

    //print from 1 to 5
    println("print from 1 to 5")
    for (res in 1..5) {
        print("$res ")
    }
    println()

    for (res in 1..5 step 2) {
        print("$res ")
    }
    println()

    //print from 5 to 1
    println("print from 5 to 1")
    for (res in 5 downTo 1) {
        print("$res ")
    }
    println()

    //print from 1 to 4
    println("print from 1 to 4")
    for (res in 1 until 5) {
        print("$res ")
    }
    println()
    //Such for each in java
    println("For each.....")
    var arr = arrayOf(1, 2, 5, 9, 10, 5)
    for (i in arr) {
        print("$i ")
    }
    println()

}

fun arrays() {
    //Any == object in java
    var any: Any
    any = 1
    any = "ahmed"
    any = true


    //Static Array
    var ar1 = arrayOf(1, 2, 3, "ahmed", true) //Array of Any

    //initialize empty array
    var arInt: IntArray = IntArray(5) // Empty integer array
    var arDouble: DoubleArray = DoubleArray(5) // Empty double array
    var arBoolean: BooleanArray = BooleanArray(5) // Empty boolean array
    var arString = Array(5, { "" }) // Empty string array
    var arCar = Array(5, { Car() }) // Empty car array


    var arrInt = Array(5, { 60 }) //default value arrInt[0]=60
    var arrBoolean = Array(5, { true }) //default value arrInt[0]=60
    var arrString = Array(5, { "ahmed" }) //default value arrInt[0]=ahmed
    var arrCar = Array(5, { Car() }) //default value arrInt[0]= new object of car

    println(arrInt[0])
    println(arrBoolean[0])
    println(arrString[0])
    println(arrCar[0].getData())


    //Dynamic Array (ArrayLis, HashMAp,...,...,...)

    val arrayList = ArrayList<Int>() //arrayList = ArrayList <Type of List> ()
    val hashMap = HashMap<String, Int>() //hashMap = HashMap <Key ,Type of Map> ()


    //2D Array
    var ar2D = arrayOf(arrayOf(1, 2), 4, "asd")

    //Empty 2D Array
    var _1arr2D = Array(5, { IntArray(5) })
    var _2arr2D = Array(5, { Array(5, { "" }) })
    var _3arr2D = Array(5, { Array(5, { Car() }) })

}

// In kotlin Final keyword is Ok but Static Keyword is No








//Keyword open to make the class inheritable
open class Car :I{


    //Functions
    fun getData() {
        print("Data Car ")
    }


    fun getV() {} //void function

    fun getR(): Int {
        return 0
    } //function return int value , we can shorten this function such fun { getR(): Int =0 }


    //function with parameters
    fun getP(x1: Int, x2: String): Int {
        // we can't reinitialize parameters of functions , x1 , x2 deals as val
        // to change value of parameters
        var temp = x1
        temp = 6
        return temp
    }


    fun getO1(x1: Int, x2: String) {} // == fun getO(x2: String, x1: Int) {}
    fun getO2(x2: String? = null, x1: Int) {}


    //Unit function {pass another function}
    fun unitFun(x1: () -> Unit) {
        x1.invoke()
    }

    fun print() {
        println("Unit Function.......")
    }


    /// Constructors (Kotlin has 3 constructors) ///

    // 1
    init {
        //called when created object , Not take parameters
    }

    //2 (secondary constructor) , one class has one or more  secondary constructor
    constructor() {
        // such as in java (take parameters , overloading , ..)
    }

    // 3 (primary constructor) , hasn't block of code , one class has one primary constructor
    class c(x: Int) : Car() {
    }

    // It can't be the secondary constructor and the primary constructor in same class

    override fun inter2() {
        TODO("Not yet implemented")
    }

    //Static members in kotlin
    companion object{
        var s=1
    }

}

//Interface
interface I {
    fun inter1() {
        println("Interface with block of code")
    }

    fun inter2()
}

//Static class in kotlin
object cat{
    // Anything here will be static and singleton
    var c=Car()
    var x=5

}