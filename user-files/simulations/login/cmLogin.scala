package login

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class cmLogin extends Simulation {

	val httpProtocol = http
		.baseURL("http://marabunta.scala.com:8080")
		.inferHtmlResources(BlackList(""".*\.js""", """.*\.css""", """.*\.gif""", """.*\.jpeg""", """.*\.jpg""", """.*\.ico""", """.*\.woff""", """.*\.(t|o)tf""", """.*\.png"""), WhiteList(""".*/ContentManager/api/rest.*"""))

	val headers_0 = Map(
		"Content-Type" -> "application/json; charset=UTF-8",
		"Pragma" -> "no-cache",
		"X-Requested-With" -> "XMLHttpRequest")

	val headers_1 = Map(
		"X-Requested-With" -> "XMLHttpRequest",
		"apiToken" -> "5146E1B2A482A7A34112B32BB06187FD33CE5BE62BB7E267BE7823966B197CF4AC81E6C6")

    val uri1 = "http://marabunta.scala.com:8080/ContentManager/api/rest"

	val scn = scenario("cmLogin")
		.exec(http("login_api")
			.post("/ContentManager/api/rest/auth/login")
			.headers(headers_0)
			.body(RawFileBody("cmLogin_0000_request.txt"))
			.resources(http("request_1")
			.get(uri1 + "/dashboard")
			.headers(headers_1),
            http("player_health")
			.get(uri1 + "/playerhealth?offset=0&limit=999999&search=&sort=&count=0&filters=%7B%22playerHealthState%22%3A%7B%22values%22%3A%5B%22UNCLEARED%22%5D%7D%7D&fields=id")
			.headers(headers_1),
            http("hostedNetworks")
			.get(uri1 + "/hostednetworks?offset=0&limit=999999&search=&sort=&count=0&filters=%7B%7D&fields=id")
			.headers(headers_1)))

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}