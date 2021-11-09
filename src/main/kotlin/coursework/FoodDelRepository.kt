package coursework

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.stereotype.Repository
import java.sql.ResultSet

@Repository
class FoodDelRepository {

    @Autowired
    var jdbcTemplate: JdbcTemplate? = null

    fun getClients(): List<Clients>{
        return jdbcTemplate!!.query("SELECT * FROM Clients"
        ) { rs: ResultSet, _: Int -> Clients(
            rs.getInt("id"),
            rs.getString("login"),
            rs.getString("password"),
            rs.getString("address"),
            rs.getString("phone"))
        }
    }

    fun getCouriers(): List<Couriers>{
        return jdbcTemplate!!.query("SELECT * FROM Couriers"
        ) { rs: ResultSet, _: Int -> Couriers(
            rs.getInt("id"),
            rs.getString("address"),
            rs.getDouble("salary"))
        }
    }

    fun getDishes(): List<Dishes>{
        return jdbcTemplate!!.query("SELECT * FROM Dishes"
        ) { rs: ResultSet, _: Int -> Dishes(
            rs.getInt("id"),
            rs.getString("name"),
            rs.getInt("restaurant_id"),
            rs.getDouble("price"),
            rs.getInt("rating"))
        }
    }

    fun getOrder(): List<Order>{
        return jdbcTemplate!!.query("SELECT * FROM \"order\" "
        ) { rs: ResultSet, _: Int -> Order(
            rs.getInt("id"),
            rs.getInt("client_id"),
            rs.getInt("restaurant_id"),
            rs.getInt("courier_id"),
            rs.getDouble("price"),
            rs.getDate("time"),
            rs.getString("status"),
            rs.getDate("delivery_time"),
            rs.getString("pay_method"))
        }
    }

    fun getOrderContent(): List<OrderContent>{
        return jdbcTemplate!!.query("SElECT * FROM order_content"
        ) { rs: ResultSet, _: Int -> OrderContent(
            rs.getInt("order_id"),
            rs.getInt("dish_id"),
            rs.getInt("number"))
        }
    }

    fun getRestaurants(): List<Restaurants>{
        return jdbcTemplate!!.query("SELECT * FROM Restaurants"
        ) { rs: ResultSet, _: Int -> Restaurants(
            rs.getInt("id"),
            rs.getString("address"),
            rs.getInt("rating"))
        }
    }

    fun getReview(): List<Review>{
        return jdbcTemplate!!.query("SELECT * FROM Review"
        ) { rs: ResultSet, _: Int -> Review(
            rs.getInt("id"),
            rs.getInt("restaurant_id"),
            rs.getInt("client_id"),
            rs.getString("text"),
            rs.getDate("review_time"),
            rs.getInt("rating"))
        }
    }

    fun getVehicles(): List<Vehicles>{
        return jdbcTemplate!!.query("SELECT * FROM Vehicles"
        ) { rs: ResultSet, _: Int -> Vehicles(
            rs.getInt("id"),
            rs.getInt("courier_id"),
            rs.getString("vehicle_type"),
            rs.getString("status"))
        }
    }

    fun getOrderStatus(status: String): List<Order>{
        return jdbcTemplate!!.query("SELECT * FROM \"order\" WHERE status = '$status'"
        ) { rs: ResultSet, _: Int -> Order(
            rs.getInt("id"),
            rs.getInt("client_id"),
            rs.getInt("restaurant_id"),
            rs.getInt("courier_id"),
            rs.getDouble("price"),
            rs.getDate("time"),
            rs.getString("status"),
            rs.getDate("delivery_time"),
            rs.getString("pay_method"))
        }
    }

    fun getRestaurantsRating(rating: Int): List<Restaurants>{
        return jdbcTemplate!!.query("SELECT * FROM Restaurants WHERE rating > $rating "
        ) { rs: ResultSet, _: Int -> Restaurants(
            rs.getInt("id"),
            rs.getString("address"),
            rs.getInt("rating"))
        }
    }

    fun getVehiclesType(vehicle_type: String): List<Vehicles>{
        return jdbcTemplate!!.query("SELECT * FROM Vehicles WHERE vehicle_type = '$vehicle_type'"
        ) { rs: ResultSet, _: Int -> Vehicles(
            rs.getInt("id"),
            rs.getInt("courier_id"),
            rs.getString("vehicle_type"),
            rs.getString("status"))
        }
    }

    fun getDishesPrice(price: Double): List<Dishes>{
        return jdbcTemplate!!.query("SELECT * FROM Dishes WHERE price < $price"
        ) { rs: ResultSet, _: Int -> Dishes(
            rs.getInt("id"),
            rs.getString("name"),
            rs.getInt("restaurant_id"),
            rs.getDouble("price"),
            rs.getInt("rating"))
        }
    }

    fun getOrderClientId(client_id: Int): List<Order>{
        return jdbcTemplate!!.query("SELECT * FROM \"order\" WHERE client_id = $client_id "
        ) { rs: ResultSet, _: Int -> Order(
            rs.getInt("id"),
            rs.getInt("client_id"),
            rs.getInt("restaurant_id"),
            rs.getInt("courier_id"),
            rs.getDouble("price"),
            rs.getDate("time"),
            rs.getString("status"),
            rs.getDate("delivery_time"),
            rs.getString("pay_method"))
        }
    }

    fun getOrderRestaurantId(restaurant_id: Int): List<Order>{
        return jdbcTemplate!!.query("SELECT * FROM \"order\" WHERE restaurant_id = $restaurant_id "
        ) { rs: ResultSet, _: Int -> Order(
            rs.getInt("id"),
            rs.getInt("client_id"),
            rs.getInt("restaurant_id"),
            rs.getInt("courier_id"),
            rs.getDouble("price"),
            rs.getDate("time"),
            rs.getString("status"),
            rs.getDate("delivery_time"),
            rs.getString("pay_method"))
        }
    }

    fun getOrderCourierId(courier_id: Int): List<Order>{
        return jdbcTemplate!!.query("SELECT * FROM \"order\" WHERE courier_id = $courier_id "
        ) { rs: ResultSet, _: Int -> Order(
            rs.getInt("id"),
            rs.getInt("client_id"),
            rs.getInt("restaurant_id"),
            rs.getInt("courier_id"),
            rs.getDouble("price"),
            rs.getDate("time"),
            rs.getString("status"),
            rs.getDate("delivery_time"),
            rs.getString("pay_method"))
        }
    }




    fun addClients(c: Clients): Int {
        return jdbcTemplate!!.update("INSERT INTO Clients (login, password, address, phone) " +
                "VALUES (?,?,?,?)",
            c.login, c.password, c.address, c.phone)
    }

    fun addCouriers(c: Couriers): Int {
        return jdbcTemplate!!.update("INSERT INTO Couriers (address, salary) " +
                "VALUES (?,?)",
            c.address, c.salary)
    }

    fun addDishes(d: Dishes): Int {
        return jdbcTemplate!!.update("INSERT INTO Dishes (name, restaurant_id, price, rating) " +
                "VALUES (?,?,?,?)",
            d.name, d.restaurant_id, d.price, d.rating)
    }

    fun addOrder(o: Order): Int {
        return jdbcTemplate!!.update("INSERT INTO \"order\" (client_id, restaurant_id, courier_id, price, time, status, delivery_time, pay_method) " +
                "VALUES (?,?,?,?,?,?,?,?)",
            o.client_id, o.restaurant_id, o.courier_id, o.price, o.time, o.status, o.delivery_time, o.pay_method)
    }

    fun addOrderContent(oc: OrderContent): Int {
        return jdbcTemplate!!.update("INSERT INTO order_content (order_id, dish_id, number) " +
                "VALUES (?,?,?)",
            oc.order_id, oc.dish_id, oc.number)
    }

    fun addRestaurants(r: Restaurants): Int {
        return jdbcTemplate!!.update("INSERT INTO Restaurants (address, rating) " +
                "VALUES (?,?)",
            r.address, r.rating)
    }

    fun addReview(r: Review): Int {
        return jdbcTemplate!!.update("INSERT INTO Review (restaurant_id, client_id, text, review_time, rating) " +
                "VALUES (?,?,?,?,?)",
            r.restaurant_id, r.client_id, r.text, r.review_time, r.rating)
    }

    fun addVehicles(v: Vehicles): Int {
        return jdbcTemplate!!.update("INSERT INTO Vehicles (courier_id, vehicle_type, status) " +
                "VALUES (?,?,?)",
            v.courier_id, v.vehicle_type, v.status)
    }

    fun deleteClients(id: Int): Int {
        return jdbcTemplate!!.update("DELETE FROM Clients WHERE id = ?", id)
    }

    fun deleteCouriers(id: Int): Int {
        return jdbcTemplate!!.update("DELETE FROM Couriers WHERE id = ?", id)
    }

    fun deleteDishes(id: Int): Int {
        return jdbcTemplate!!.update("DELETE FROM Dishes WHERE id = ?", id)
    }

    fun deleteOrder(id: Int): Int {
        return jdbcTemplate!!.update("DELETE FROM \"order\" WHERE id = ?", id)
    }

    fun deleteOrderContent(order_id: Int, dish_id: Int): Int {
        return jdbcTemplate!!.update("DELETE FROM order_content WHERE order_id = ? AND dish_id = ?", order_id, dish_id)
    }

    fun deleteRestaurants(id: Int): Int {
        return jdbcTemplate!!.update("DELETE FROM Restaurants WHERE id = ?", id)
    }

    fun deleteReview(id: Int): Int {
        return jdbcTemplate!!.update("DELETE FROM Review WHERE id = ?", id)
    }

    fun deleteVehicles(id: Int): Int {
        return jdbcTemplate!!.update("DELETE FROM Vehicles WHERE id = ?", id)
    }

    fun updateOrderStatus(id: Int, status: String): Int {
        return jdbcTemplate!!.update("UPDATE \"order\" SET status = ? WHERE id = ?", status, id)
    }
}

