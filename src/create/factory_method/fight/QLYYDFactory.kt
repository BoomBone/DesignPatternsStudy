package create.factory_method.fight

/**
 * 青龙偃月刀工厂 ：具体工厂
 */
class QLYYDFactory:WeaponFactory {
    override fun createWeapon(): Weapon {
        return QingLongYanYueDao()
    }
}