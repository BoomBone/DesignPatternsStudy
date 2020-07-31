package abstract_factory.button

import abstract_factory.button.button.Button
import abstract_factory.button.checkbox.CheckBox
import abstract_factory.button.factory.GUIFactory

/**
 * @author Ting
 * @date 2020/7/31
 * @description
 */
class Application(factory: GUIFactory) {
    var mButton: Button = factory.createButton()
    var mCheckBox: CheckBox = factory.createCheckbox()

    fun paint() {
        mButton.paint()
        mCheckBox.paint()
    }
}