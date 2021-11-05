package ralphcollett.week3.taxipark

data class TaxiPark(
    val allDrivers: Set<Driver>,
    val allPassengers: Set<Passenger>,
    val trips: List<Trip>)

data class Driver(val name: String)
data class Passenger(val name: String)

data class Trip(
    val driver: Driver,
    val passengers: Set<Passenger>,
    // the trip duration in minutes
    val duration: Int,
    // the trip distance in km
    val distance: Double,
    // the percentage of discount (in 0.0..1.0 if not null)
    val discount: Double? = null
) {
    // the total cost of the trip
    val cost: Double
        get() = (1 - (discount ?: 0.0)) * (duration + distance)
}

fun driver(i: Int) = Driver("D-$i")
fun passenger(i: Int) = Passenger("P-$i")

fun drivers(indices: List<Int>) = indices.map(::driver).toSet()
fun drivers(range: IntRange) = drivers(range.toList())

fun passengers(indices: List<Int>) = indices.map(::passenger).toSet()
fun passengers(range: IntRange) = passengers(range.toList())
fun passengers(vararg indices: Int) = passengers(indices.toList())

fun taxiPark(driverIndexes: IntRange, passengerIndexes: IntRange, vararg trips: Trip) =
    TaxiPark(drivers(driverIndexes), passengers(passengerIndexes), trips.toList())

fun trip(driverIndex: Int, passenger: Int, duration: Int = 10, distance: Double = 3.0, discount: Double? = null) =
    Trip(driver(driverIndex), passengers(passenger), duration, distance, discount)
