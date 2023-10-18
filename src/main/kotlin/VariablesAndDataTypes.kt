fun main(){
    // val : Used To Create Variable Which can be Assigned Only Once.
    // var : Used To Create Variable Which can be Reassigned .

    val userId : String = "CR_76548_2023"
    var userName : String = "Zaid Bashir"
    println(userName)
    userName += " Wani"
    println(userId)
    println(userName)

    // DataTypes in Kotlin
    // ===================
    //Integer Vale
    val intNumber : Int = 10
    //Long Integer Vale
    val intLongNumber : Long = 1065656L
    //Double Vale
    val doubleNumber : Double = 10.98
    //Float Vale
    val floatNumber : Float = 1065F
    //Boolean Vale
    val boolValue : Boolean = true
    //String Vale
    val stringValue : String = "Google"
    //Char Vale
    val charValue : Char = 'Z'

    //Results
    //=======

    println(intLongNumber)

    // To get the Type of Variable Use : " :: class.java.typeName"
    println(intLongNumber::class.java.typeName)


    // "Any": It is the root of the Kotlin class hierarchy. It is equivalent to Object in Java.
    // It can Store any Variable as it is the Root of all Classes in Kotlin
    val progLanguages : Any = "Hello"
    println(progLanguages)
    println(progLanguages :: class.java.typeName)





}