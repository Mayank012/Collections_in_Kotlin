fun main(args: Array<String>)    {

    // "Set" contains unique elements
    // "HashSet" also contains unique elements but order is not guaranteed in output

    //var mySet = setOf<Int>(2,4,6,8,10,12,14,16,18,20)
    //var mySet = mutableSetOf<Int>(2,4,6,8,10,12,14,16,18,20)
    var mySet = hashSetOf<Int>(2,4,6,8,10,12,14,16,18,20)
    mySet.remove(2)
    mySet.add(100)

    for (element in mySet) {
        println(element)
    }

}

