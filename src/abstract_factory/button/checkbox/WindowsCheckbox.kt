package abstract_factory.button.checkbox

/**
 * @author Ting
 * @date 2020/7/31
 * @description 第二个具体产品
 */
class WindowsCheckbox:CheckBox {
    override fun paint() {
        println("整一个微软选择框")
    }
}