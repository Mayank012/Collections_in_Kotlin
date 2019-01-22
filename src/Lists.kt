fun main(args: Array<String>)    {

    // Elements:
    // Index:        0   1  2  3   4  5

    //var myArray = Array<Int>(5) { 0 }   // Array. Mutable. Fixed Size.

    //var list = mutableListOf<String>("David", "Anya", "Priboi", "Harrison")
    //var list = arrayListOf<String>("David", "Anya", "Priboi", "Harrison")
    var list = ArrayList<String>()
    list.add("David")
    list.add("Anya")
    list.add("Priboi")
    list.add("Harrison")


    for (element in list) {
        println(element)
    }

    println()

    for (index in 0..list.size - 1) {
        println(list[index])
    }
}

