package coursework

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cache.annotation.EnableCaching

@SpringBootApplication
@EnableCaching
class CourseworkApplication

fun main(args: Array<String>) {
	runApplication<CourseworkApplication>(*args)
}
