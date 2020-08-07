package create.clone.kt

/**
 * @author Ting
 * @date 2020/8/7
 * @description
 */
data class Dog(val name:String,val age:Int,val gender:String?)

fun main() {
    val dog = Dog("旺旺",1,"MM")
    val copyDog = dog.copy(name = "拷贝小狗")
    println("dog=$dog,copyDog=$copyDog")
}