package coursework

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.cache.annotation.CacheEvict
import org.springframework.cache.annotation.Cacheable
import org.springframework.stereotype.Service

@Service
class FoodDelService {

    @Autowired
    var foodDelRepository: FoodDelRepository? = null

    @Cacheable("clients")
    fun getClients(): List<Clients> {
        return foodDelRepository!!.getClients()
    }

    @Cacheable("couriers")
    fun getCouriers(): List<Couriers> {
        return foodDelRepository!!.getCouriers()
    }

    @Cacheable("dishes")
    fun getDishes(): List<Dishes> {
        return foodDelRepository!!.getDishes()
    }

    @Cacheable("order")
    fun getOrder(): List<Order> {
        return foodDelRepository!!.getOrder()
    }

    @Cacheable("order_content")
    fun getOrderContent(): List<OrderContent> {
        return foodDelRepository!!.getOrderContent()
    }

    @Cacheable("restaurants")
    fun getRestaurants(): List<Restaurants> {
        return foodDelRepository!!.getRestaurants()
    }

    @Cacheable("review")
    fun getReview(): List<Review> {
        return foodDelRepository!!.getReview()
    }

    @Cacheable("vehicles")
    fun getVehicles(): List<Vehicles> {
        return foodDelRepository!!.getVehicles()
    }

    @Cacheable("order")
    fun getOrderStatus(status: String): List<Order> {
        return foodDelRepository!!.getOrderStatus(status)
    }

    @Cacheable("restaurants")
    fun getRestaurantsRating(rating: Int): List<Restaurants> {
        return foodDelRepository!!.getRestaurantsRating(rating)
    }

    @Cacheable("vehicles")
    fun getVehiclesType(vehicle_type: String): List<Vehicles> {
        return foodDelRepository!!.getVehiclesType(vehicle_type)
    }

    @Cacheable("dishes")
    fun getDishesPrice(price: Double): List<Dishes> {
        return foodDelRepository!!.getDishesPrice(price)
    }

    @Cacheable("order")
    fun getOrderClientId(client_id: Int): List<Order> {
        return foodDelRepository!!.getOrderClientId(client_id)
    }

    @Cacheable("order")
    fun getOrderRestaurantId(restaurant_id: Int): List<Order> {
        return foodDelRepository!!.getOrderRestaurantId(restaurant_id)
    }

    @Cacheable("order")
    fun getOrderCourierId(courier_id: Int): List<Order> {
        return foodDelRepository!!.getOrderCourierId(courier_id)
    }




    @CacheEvict(value = ["clients"], allEntries = true)
    fun addClients(c: Clients): Int {
        return foodDelRepository!!.addClients(c)
    }

    @CacheEvict(value = ["couriers"], allEntries = true)
    fun addCouriers(c: Couriers): Int {
        return foodDelRepository!!.addCouriers(c)
    }

    @CacheEvict(value = ["dishes"], allEntries = true)
    fun addDishes(d: Dishes): Int {
        return foodDelRepository!!.addDishes(d)
    }

    @CacheEvict(value = ["order"], allEntries = true)
    fun addOrder(o: Order): Int {
        return foodDelRepository!!.addOrder(o)
    }

    @CacheEvict(value = ["order_content"], allEntries = true)
    fun addOrderContent(oc: OrderContent): Int {
        return foodDelRepository!!.addOrderContent(oc)
    }

    @CacheEvict(value = ["restaurants"], allEntries = true)
    fun addRestaurants(r: Restaurants): Int {
        return foodDelRepository!!.addRestaurants(r)
    }

    @CacheEvict(value = ["review"], allEntries = true)
    fun addReview(r: Review): Int {
        return foodDelRepository!!.addReview(r)
    }

    @CacheEvict(value = ["vehicles"], allEntries = true)
    fun addVehicles(v: Vehicles): Int {
        return foodDelRepository!!.addVehicles(v)
    }




    @CacheEvict(value = ["clients"], allEntries = true)
    fun deleteClients(id: Int): Int {
        return foodDelRepository!!.deleteClients(id)
    }

    @CacheEvict(value = ["couriers"], allEntries = true)
    fun deleteCouriers(id: Int): Int {
        return foodDelRepository!!.deleteCouriers(id)
    }

    @CacheEvict(value = ["dishes"], allEntries = true)
    fun deleteDishes(id: Int): Int {
        return foodDelRepository!!.deleteDishes(id)
    }

    @CacheEvict(value = ["order"], allEntries = true)
    fun deleteOrder(id: Int): Int {
        return foodDelRepository!!.deleteOrder(id)
    }

    @CacheEvict(value = ["order_content"], allEntries = true)
    fun deleteOrderContent(order_id: Int, dish_id: Int): Int {
        return foodDelRepository!!.deleteOrderContent(order_id, dish_id)
    }

    @CacheEvict(value = ["restaurants"], allEntries = true)
    fun deleteRestaurants(id: Int): Int {
        return foodDelRepository!!.deleteRestaurants(id)
    }

    @CacheEvict(value = ["review"], allEntries = true)
    fun deleteReview(id: Int): Int {
        return foodDelRepository!!.deleteReview(id)
    }

    @CacheEvict(value = ["vehicles"], allEntries = true)
    fun deleteVehicles(id: Int): Int {
        return foodDelRepository!!.deleteVehicles(id)
    }

    @CacheEvict(value = ["order"], allEntries = true)
    fun updateOrderStatus(id: Int, status: String): Int {
        return foodDelRepository!!.updateOrderStatus(id, status)
    }


}
