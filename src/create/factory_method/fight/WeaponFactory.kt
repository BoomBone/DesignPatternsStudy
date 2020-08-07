package create.factory_method.fight

/**
 * 武器制造：抽象工厂
 */
interface WeaponFactory {
    fun createWeapon(): Weapon
}