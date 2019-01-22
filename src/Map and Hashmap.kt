fun main(args: Array<String>)    {

    // Map tutorial: Key-Value Pair

    //var myMap = mapOf<Int, String>(4 to "Mayank", 6 to "David", 8 to "Luffy")
    var myMap = HashMap<Int, String>()
    myMap.put(5, "Luffy")
    myMap.put(10, "Sanji")
    myMap.put(15, "Zoro")
    myMap.put(20, "Nami")
    myMap.put(25, "Robin")

    
    for (key in myMap.keys) {
        println("Element at key: $key = ${myMap[key]}")
    }

}

