package create.factory_method.mobile

fun main(args: Array<String>) {
    val factory:MobileFactory = NokiaFactory()
    val mobile:Mobile = factory.produceMobile()
    mobile.call();
}