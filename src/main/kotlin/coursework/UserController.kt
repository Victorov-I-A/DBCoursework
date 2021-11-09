package coursework

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/user")
class UserController {

    @Autowired
    var foodDelService: FoodDelService? = null

    @GetMapping("/get_clients")
    fun getClients(): List<Clients>? {
        val startTime = System.currentTimeMillis()
        val list = foodDelService!!.getClients()
        val endTime = System.currentTimeMillis()
        println(endTime - startTime)
        return list
    }

    @GetMapping("/get_couriers")
    fun getCouriers(): List<Couriers>? {
        val startTime = System.currentTimeMillis()
        val list = foodDelService!!.getCouriers()
        val endTime = System.currentTimeMillis()
        println(endTime - startTime)
        return list
    }

    @GetMapping("/get_dishes")
    fun getDishes(): List<Dishes>? {
        val startTime = System.currentTimeMillis()
        val list = foodDelService!!.getDishes()
        val endTime = System.currentTimeMillis()
        println(endTime - startTime)
        return list
    }

    @GetMapping("/get_order")
    fun getOrder(): List<Order>? {
        val startTime = System.currentTimeMillis()
        val list = foodDelService!!.getOrder()
        val endTime = System.currentTimeMillis()
        println(endTime - startTime)
        return list
    }

    @GetMapping("/get_order_content")
    fun getOrderContent(): List<OrderContent>? {
        val startTime = System.currentTimeMillis()
        val list = foodDelService!!.getOrderContent()
        val endTime = System.currentTimeMillis()
        println(endTime - startTime)
        return list
    }

    @GetMapping("/get_restaurants")
    fun getRestaurants(): List<Restaurants>? {
        val startTime = System.currentTimeMillis()
        val list = foodDelService!!.getRestaurants()
        val endTime = System.currentTimeMillis()
        println(endTime - startTime)
        return list
    }

    @GetMapping("/get_review")
    fun getReview(): List<Review>? {
        val startTime = System.currentTimeMillis()
        val list = foodDelService!!.getReview()
        val endTime = System.currentTimeMillis()
        println(endTime - startTime)
        return list
    }

    @GetMapping("/get_vehicles")
    fun getVehicles(): List<Vehicles>? {
        val startTime = System.currentTimeMillis()
        val list = foodDelService!!.getVehicles()
        val endTime = System.currentTimeMillis()
        println(endTime - startTime)
        return list
    }

    @GetMapping("/get_order_status")
    fun getOrderStatus(status: String): List<Order>? {
        val startTime = System.currentTimeMillis()
        val list = foodDelService!!.getOrderStatus(status)
        val endTime = System.currentTimeMillis()
        println(endTime - startTime)
        return list
    }

    @GetMapping("/get_restaurants_rating")
    fun getRestaurantsRating(rating: Int): List<Restaurants>? {
        val startTime = System.currentTimeMillis()
        val list = foodDelService!!.getRestaurantsRating(rating)
        val endTime = System.currentTimeMillis()
        println(endTime - startTime)
        return list
    }

    @GetMapping("/get_vehicles_type")
    fun getVehiclesType(vehicle_type: String): List<Vehicles>? {
        val startTime = System.currentTimeMillis()
        val list = foodDelService!!.getVehiclesType(vehicle_type)
        val endTime = System.currentTimeMillis()
        println(endTime - startTime)
        return list
    }

    @GetMapping("/get_dishes_price")
    fun getDishesPrice(price: Double): List<Dishes>? {
        val startTime = System.currentTimeMillis()
        val list = foodDelService!!.getDishesPrice(price)
        val endTime = System.currentTimeMillis()
        println(endTime - startTime)
        return list
    }

    @GetMapping("/get_order_clientId")
    fun getOrderClientId(client_id: Int): List<Order>? {
        val startTime = System.currentTimeMillis()
        val list = foodDelService!!.getOrderClientId(client_id)
        val endTime = System.currentTimeMillis()
        println(endTime - startTime)
        return list
    }

    @GetMapping("/get_order_restaurantId")
    fun getOrderRestaurantId(restaurant_id: Int): List<Order>? {
        val startTime = System.currentTimeMillis()
        val list = foodDelService!!.getOrderRestaurantId(restaurant_id)
        val endTime = System.currentTimeMillis()
        println(endTime - startTime)
        return list
    }

    @GetMapping("/get_order_courierId")
    fun getOrderCourierId(courier_id: Int): List<Order>? {
        val startTime = System.currentTimeMillis()
        val list = foodDelService!!.getOrderCourierId(courier_id)
        val endTime = System.currentTimeMillis()
        println(endTime - startTime)
        return list
    }
}