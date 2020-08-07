package create.abstract_factory.button.factory

import create.abstract_factory.button.button.Button
import create.abstract_factory.button.button.WindowButton
import create.abstract_factory.button.checkbox.CheckBox
import create.abstract_factory.button.checkbox.WindowsCheckbox

/**
 * @author Ting
 * @date 2020/7/31
 * @description 具体工厂
 */
class WindowsFactory:GUIFactory {
    override fun createButton(): Button {
        return WindowButton()
    }

    override fun createCheckbox(): CheckBox {
        return WindowsCheckbox()
    }

}