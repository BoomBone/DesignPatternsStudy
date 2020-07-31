package abstract_factory.button.button

/**
 * @author Ting
 * @date 2020/7/31
 * @description Button 具体产品
 */
class WindowButton:Button {
    override fun paint() {
        println("给你整一个微软按钮")
    }
}