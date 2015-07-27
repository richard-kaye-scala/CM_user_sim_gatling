package tutorial

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class RecordedSimulation extends Simulation {

	val httpProtocol = http
		.baseURL("http://computer-database.herokuapp.com")
		.inferHtmlResources()

	val headers_1 = Map("Accept" -> "image/png,image/*;q=0.8,*/*;q=0.5")

    val uri1 = "http://computer-database.herokuapp.com"
    val uri2 = "http://googleads.g.doubleclick.net/pagead/gen_204"
    val uri3 = "mpc.mxptint.net"

	val scn = scenario("RecordedSimulation")
		.exec(http("request_0")
			.get("/")
			.resources(http("request_1")
			.get(uri1 + "/favicon.ico")
			.headers(headers_1)
			.check(status.is(404))
			.check(bodyString.is(RawFileBody("RecordedSimulation_0001_response.txt"))),
            http("request_2")
			.get(uri1 + "/favicon.ico")
			.check(status.is(404))
			.check(bodyString.is(RawFileBody("RecordedSimulation_0002_response.txt")))))
		.pause(7)
		.exec(http("request_3")
			.get("/computers?f=macbook")
			.check(bodyString.is(RawFileBody("RecordedSimulation_0003_response.txt"))))
		.pause(27)
		.exec(http("request_4")
			.get(uri2 + "?id=wfocus&gqid=jlO2VbiXJsGFMauJjaAH&qqid=CPXO7KPV-8YCFVcIDAodnVkMKQ&fg=1")
			.headers(headers_1)
			.resources(http("request_5")
			.get(uri2 + "?id=wfocus&gqid=jlO2VZGWJpSXMNyyl9AB&qqid=COrF7KPV-8YCFctADAodrlAASQ&fg=1")
			.headers(headers_1)))
		.pause(2)
		.exec(http("request_6")
			.get("http://" + uri3 + "/1S24SD92495ES2A93S1131CS12CSFASB3SB35C33_6FFF88F9_13BBE68SDE_6FFF8902_606D19S3%3fhttp://noredir.mxptint.net/misc=v:1.2.0,rand:39906,iv:100,tm:10470")
			.headers(headers_1))
		.pause(12)
		.exec(http("request_7")
			.get("/computers/6")
			.check(bodyString.is(RawFileBody("RecordedSimulation_0007_response.txt"))))
		.pause(16)
		.exec(http("request_8")
			.get("/computers")
			.check(bodyString.is(RawFileBody("RecordedSimulation_0008_response.txt"))))
		.pause(7)
		.exec(http("request_9")
			.get("/computers?p=1")
			.resources(http("request_10")
			.get(uri1 + "/computers?p=2")
			.check(bodyString.is(RawFileBody("RecordedSimulation_0010_response.txt"))),
            http("request_11")
			.get(uri1 + "/computers?p=3")
			.check(bodyString.is(RawFileBody("RecordedSimulation_0011_response.txt"))))
			.check(bodyString.is(RawFileBody("RecordedSimulation_0009_response.txt"))))
		.pause(8)
		.exec(http("request_12")
			.get("/computers/new")
			.check(bodyString.is(RawFileBody("RecordedSimulation_0012_response.txt"))))
		.pause(26)
		.exec(http("request_13")
			.post("/computers")
			.formParam("name", "boba")
			.formParam("introduced", "2991-1-1")
			.formParam("discontinued", "2992-1-1")
			.formParam("company", "3"))

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}