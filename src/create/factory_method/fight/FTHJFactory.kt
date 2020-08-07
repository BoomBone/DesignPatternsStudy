package create.factory_method.fight

/**
 * 方天画戟制造工厂：具体工厂
 */
class FTHJFactory : WeaponFactory {
    override fun createWeapon(): Weapon {
        return FangTianHuaJi()
    }
}