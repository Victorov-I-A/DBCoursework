package coursework

import java.sql.Date

class Clients(var id: Int, var login: String, var password: String, var address: String, var phone: String?)

class Couriers(var id: Int, var address: String?, var salary: Double?)

class Dishes(var id: Int, var name: String, var restaurant_id: Int, var price: Double, var rating: Int)

class Order(var id: Int, var client_id: Int, var restaurant_id: Int, var courier_id: Int?, var price: Double, var time: Date, var status: String, var delivery_time: Date?, var pay_method: String?)

class OrderContent(var order_id: Int, var dish_id: Int, var number: Int)

class Restaurants(var id: Int, var address: String, var rating: Int)

class Review(var id: Int, var restaurant_id: Int, var client_id: Int, var text: String?, var review_time: Date, var rating: Int)

class Vehicles(var id: Int, var courier_id: Int?, var vehicle_type: String?, var status: String?)
