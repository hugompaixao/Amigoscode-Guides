fun main() {
    val tv = SmartDevide("Samsung", 1000.0)
    //tv.brand = "Samsung"
    //tv.price = 1000.0
    println("${tv.brand} ${tv.price}")
    tv.turnOff()

    val tv2 = SmartDevide("LG", 1000.0)
    println("${tv.brand} ${tv.price}")

    println(tv == tv2)

    val phone = SmartDevide("Apple", 900.0)
    //phone.brand = "Apple"
    //phone.price = 900.0
    println("${phone.brand} ${phone.price}")
    phone.turnOff()
    phone.getDeviceState()
}

class SmartDevide constructor(
    var brand: String?,
    var price: Double?,
    var isSwitchedOn: Boolean = false) {

    constructor() : this(null, null)
    constructor(brand: String) : this(brand, 0.0)

    fun getDeviceState() {
        println("$brand is on: $isSwitchedOn")
    }
    fun turnOn() {
        isSwitchedOn = true
        println("$brand is switching on")
    }

    fun turnOff() {
        isSwitchedOn = false
        println("$brand is switching off")
    }

    override fun toString(): String {
        return "SmartDevide(brand=$brand, price=$price, isSwitchedOn=$isSwitchedOn)"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as SmartDevide

        if (brand != other.brand) return false
        if (price != other.price) return false
        if (isSwitchedOn != other.isSwitchedOn) return false

        return true
    }

    override fun hashCode(): Int {
        var result = brand?.hashCode() ?: 0
        result = 31 * result + (price?.hashCode() ?: 0)
        result = 31 * result + isSwitchedOn.hashCode()
        return result
    }


}