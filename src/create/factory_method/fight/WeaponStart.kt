package create.factory_method.fight

fun main(args: Array<String>) {
    val weapon=QLYYDFactory().createWeapon()
    weapon.fight()
}