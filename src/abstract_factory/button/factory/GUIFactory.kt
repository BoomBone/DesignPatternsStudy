package abstract_factory.button.factory

import abstract_factory.button.button.Button
import abstract_factory.button.checkbox.CheckBox

/**
 * @author Ting
 * @date 2020/7/31
 * @description 抽象工厂
 */
interface GUIFactory {
    fun createButton():Button
    fun createCheckbox():CheckBox
}