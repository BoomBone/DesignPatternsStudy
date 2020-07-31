package abstract_factory.button.button

/**
 * @author Ting
 * @date 2020/7/31
 * @description 具体产品一
 */
class MacOSButton:Button {
    override fun paint() {
        println("给你整一个苹果按钮")
    }
}