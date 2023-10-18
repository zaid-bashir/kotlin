const val PI = 3.14
fun main(){
    // val : Used To Create Variable Which can be Assigned Only Once.  ==> like final in Java
    /*
     1)const : Used to Create Variables Which can be Assigned Only Once.  ==> like static final in Java
     2)const variables are Known before Code Execution.
     3)They are Initialised Outside Functions.
     4)In Kotlin, you cannot declare const variables inside functions. The const keyword is used to declare
       compile-time constants, and it can only be applied to top-level or member variables of objects or
       companion objects.
     */
    // var : Used To Create Variable Which can be Reassigned .

    val userId : String = "CR_76548_2023"
    var userName : String = "Zaid Bashir"
    println(userName)
    userName += " Wani"
    println(userId)
    println(userName)

    // const Keyword in Action

    fun getConstValue() : Double{
        return PI;
    }

    print(getConstValue())

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