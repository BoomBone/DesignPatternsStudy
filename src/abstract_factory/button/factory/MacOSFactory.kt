package abstract_factory.button.factory

import abstract_factory.button.button.Button
import abstract_factory.button.button.MacOSButton
import abstract_factory.button.checkbox.CheckBox
import abstract_factory.button.checkbox.MacOSCheckbox

/**
 * @author Ting
 * @date 2020/7/31
 * @description
 */
class MacOSFactory:GUIFactory {
    override fun createButton(): Button {
        return MacOSButton()
    }

    override fun createCheckbox(): CheckBox {
        return MacOSCheckbox()
    }

}