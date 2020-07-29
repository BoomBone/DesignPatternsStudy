package factory_method.mobile

class NokiaFactory: MobileFactory {
    override fun produceMobile(): Mobile {
        return Nokia()
    }
}