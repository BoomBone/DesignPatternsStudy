package behavioral.chain.kt

/**
 * @author Ting
 * @date 2020/8/18
 * @description 责任链
 */
interface EventHandler {
    var next: EventHandler?
    fun handle(event: String): Boolean
}

open class View : EventHandler {

    override var next: EventHandler? = null


    override fun handle(event: String): Boolean {
        return onTouchEvent()
    }

    fun onTouchEvent(): Boolean {
        return false
    }

}

open class ViewGroup:View(){
    override fun handle(event: String): Boolean {
        return if (onInterceptTouchEvent(event)){
            onTouchEvent()
        }else{
            next?.handle(event)!!
        }
    }

    //是否拦截事件
    private fun onInterceptTouchEvent(event: String): Boolean {
        return false
    }
}
