package factory_method.fight

/**
 * 青龙偃月刀：具体产品
 */
class QingLongYanYueDao:Weapon {
    override fun fight() {
        println("青龙偃月刀 被杀闪避后可以继续出杀")
    }
}