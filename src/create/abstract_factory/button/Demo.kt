package create.abstract_factory.button

import create.abstract_factory.button.factory.MacOSFactory

/**
 * @author Ting
 * @date 2020/7/31
 * @description
 */
fun main() {
    val factory = MacOSFactory()
    val application = Application(factory)
    application.paint()
}