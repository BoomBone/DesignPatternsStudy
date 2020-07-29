package factory_method.mobile

class MotorolaFactory: MobileFactory {
    override fun produceMobile(): Mobile {
        return Motorola()
    }
}