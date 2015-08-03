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

	val headers_2 = Map(
		"X-Requested-With" -> "XMLHttpRequest",
		"Content-Type" -> "application/json; charset=UTF-8",
		"apiToken" -> "${session_token}")

    val uri1 = "http://marabunta.scala.com:8080/ContentManager/api/rest"

	val scn = scenario("cmLogin")
		.exec(http("login_api")
			.post("/ContentManager/api/rest/auth/login")
			.headers(headers_0)
			.body(StringBody("""{ "username": "administrator", "password": "scala1234" }""")).asJSON
			.check(jsonPath("$.token").saveAs("cookie_token"))
			.check(jsonPath("$.apiToken").saveAs("session_token"))
			.check(status.is(200))
			)
		// 	.exec(addCookie(Cookie("token","${cookie_token}")))
		    .exec(http("playerhealth")
		 	.get("/ContentManager/api/rest/playerhealth?offset=0&limit=999999&search=&sort=&count=0&filters=%7B%22playerHealthState%22%3A%7B%22values%22%3A%5B%22UNCLEARED%22%5D%7D%7D&fields=id")
		 	.headers(headers_2)
		 	.check(status.is(200))
		 	)
	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}