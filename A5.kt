package edu.mobileprogrammingclasses.kotlinquestions

/**
 * Use a loop to print non-null names of districts and streets.
 * Use null-safe operators to skip null values.
 * Expected output is:
 * District 1
 * District 2
 * Street1
 * Street2
 */
data class Street(val name: String)

data class District(val name: String, val streets: List<Street?>?)

data class City(val name: String, val districts: List<District?>)

fun main() {
    val city = City(
        "City1", listOf(
            District("Garbary", listOf(Street("2"), Street("pl"))),
            District("gdanska", listOf(Street("12"), Street("pl"))),
            District("Pomorska", listOf(null, Street("45")))
        )
    )

    city.districts?.forEach { district ->
        district?.name?.let { println(it) }
        district?.streets?.forEach { street ->
            street?.name?.let { println(it) }
        }
    }
}
