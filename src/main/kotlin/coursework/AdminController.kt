package coursework

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/admin")
class AdminController {

    @Autowired
    var foodDelService: FoodDelService? = null

	@PostMapping("/add_clients")
    fun addClients(@RequestBody c: Clients): Int {
        val startTime = System.currentTimeMillis()
        val list = foodDelService!!.addClients(c)
        val endTime = System.currentTimeMillis()
        println(endTime - startTime)
        return list
    }

	@PostMapping("/add_couriers")
    fun addCouriers(@RequestBody c: Couriers): Int {
        val startTime = System.currentTimeMillis()
        val list = foodDelService!!.addCouriers(c)
        val endTime = System.currentTimeMillis()
        println(endTime - startTime)
        return list
    }

	@PostMapping("/add_dishes")
    fun addDishes(@RequestBody d: Dishes): Int {
        val startTime = System.currentTimeMillis()
        val list = foodDelService!!.addDishes(d)
        val endTime = System.currentTimeMillis()
        println(endTime - startTime)
        return list
    }

	@PostMapping("/add_order")
    fun addOrder(@RequestBody o: Order): Int {
        val startTime = System.currentTimeMillis()
        val list = foodDelService!!.addOrder(o)
        val endTime = System.currentTimeMillis()
        println(endTime - startTime)
        return list
    }

	@PostMapping("/add_order_content")
    fun addOrderContent(@RequestBody oc: OrderContent): Int {
        val startTime = System.currentTimeMillis()
        val list = foodDelService!!.addOrderContent(oc)
        val endTime = System.currentTimeMillis()
        println(endTime - startTime)
        return list
    }

	@PostMapping("/add_restaurants")
    fun addRestaurants(@RequestBody r: Restaurants): Int {
        val startTime = System.currentTimeMillis()
        val list = foodDelService!!.addRestaurants(r)
        val endTime = System.currentTimeMillis()
        println(endTime - startTime)
        return list
    }

	@PostMapping("/add_review")
    fun addReview(@RequestBody r: Review): Int {
        val startTime = System.currentTimeMillis()
        val list = foodDelService!!.addReview(r)
        val endTime = System.currentTimeMillis()
        println(endTime - startTime)
        return list
    }

	@PostMapping("/add_vehicles")
    fun addVehicles(@RequestBody v: Vehicles): Int {
        val startTime = System.currentTimeMillis()
        val list = foodDelService!!.addVehicles(v)
        val endTime = System.currentTimeMillis()
        println(endTime - startTime)
        return list
    }
	
	

    @DeleteMapping("/delete_clients/{id}")
    fun deleteClients(@PathVariable id: Int): Int {
        val startTime = System.currentTimeMillis()
        val list = foodDelService!!.deleteClients(id)
        val endTime = System.currentTimeMillis()
        println(endTime - startTime)
        return list
    }

    @DeleteMapping("/delete_couriers/{id}")
    fun deleteCouriers(@PathVariable id: Int): Int {
        val startTime = System.currentTimeMillis()
        val list = foodDelService!!.deleteCouriers(id)
        val endTime = System.currentTimeMillis()
        println(endTime - startTime)
        return list
    }

    @DeleteMapping("/delete_dishes/{id}")
    fun deleteDishes(@PathVariable id: Int): Int {
        val startTime = System.currentTimeMillis()
        val list = foodDelService!!.deleteDishes(id)
        val endTime = System.currentTimeMillis()
        println(endTime - startTime)
        return list
    }

    @DeleteMapping("/delete_order/{id}")
    fun deleteOrder(@PathVariable id: Int): Int {
        val startTime = System.currentTimeMillis()
        val list = foodDelService!!.deleteOrder(id)
        val endTime = System.currentTimeMillis()
        println(endTime - startTime)
        return list
    }

    @DeleteMapping("/delete_order_content/{order_id}, {dish_id}")
    fun deleteOrderContent(@PathVariable order_id: Int, @PathVariable dish_id: Int): Int {
        val startTime = System.currentTimeMillis()
        val list = foodDelService!!.deleteOrderContent(order_id, dish_id)
        val endTime = System.currentTimeMillis()
        println(endTime - startTime)
        return list
    }

    @DeleteMapping("/delete_restaurants/{id}")
    fun deleteRestaurants(@PathVariable id: Int): Int {
        val startTime = System.currentTimeMillis()
        val list = foodDelService!!.deleteRestaurants(id)
        val endTime = System.currentTimeMillis()
        println(endTime - startTime)
        return list
    }

    @DeleteMapping("/delete_review/{id}")
    fun deleteReview(@PathVariable id: Int): Int {
        val startTime = System.currentTimeMillis()
        val list = foodDelService!!.deleteReview(id)
        val endTime = System.currentTimeMillis()
        println(endTime - startTime)
        return list
    }

    @DeleteMapping("/delete_vehicles/{id}")
    fun deleteVehicles(@PathVariable id: Int): Int {
        val startTime = System.currentTimeMillis()
        val list = foodDelService!!.deleteVehicles(id)
        val endTime = System.currentTimeMillis()
        println(endTime - startTime)
        return list
    }

    @PutMapping("/update_order_status")
    fun updateOrderStatus(id: Int, status: String): Int {
        val startTime = System.currentTimeMillis()
        val list = foodDelService!!.updateOrderStatus(id, status)
        val endTime = System.currentTimeMillis()
        println(endTime - startTime)
        return list
    }
}