package default

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class RecordedSimulation extends Simulation {

	val httpProtocol = http
		.baseURL("http://marabunta.scala.com:8080")
		.inferHtmlResources()

	val headers_0 = Map("Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8")

	val headers_9 = Map("Accept" -> "text/css,*/*;q=0.1")

	val headers_22 = Map("Accept" -> "image/png,image/*;q=0.8,*/*;q=0.5")

	val headers_25 = Map(
		"Accept" -> "application/font-woff2;q=1.0,application/font-woff;q=0.9,*/*;q=0.8",
		"Accept-Encoding" -> "identity")

	val headers_27 = Map(
		"Accept" -> "text/plain, */*; q=0.01",
		"X-Requested-With" -> "XMLHttpRequest")

	val headers_30 = Map(
		"Accept" -> "application/json, text/javascript, */*; q=0.01",
		"X-Requested-With" -> "XMLHttpRequest")

	val headers_38 = Map(
		"Accept" -> "application/json, text/javascript, */*; q=0.01",
		"Content-Type" -> "application/json; charset=UTF-8",
		"Pragma" -> "no-cache",
		"X-Requested-With" -> "XMLHttpRequest")

	val headers_40 = Map(
		"Accept" -> "text/plain, */*; q=0.01",
		"X-Requested-With" -> "XMLHttpRequest",
		"apiToken" -> "DCE797D8F0C514D3F8B1A8B052329046138A986280EBCC179D6052B5E7AE3BD4FC345D83")

	val headers_47 = Map(
		"Accept" -> "application/json, text/javascript, */*; q=0.01",
		"X-Requested-With" -> "XMLHttpRequest",
		"apiToken" -> "DCE797D8F0C514D3F8B1A8B052329046138A986280EBCC179D6052B5E7AE3BD4FC345D83")

    val uri1 = "http://marabunta.scala.com:8080/ContentManager"

	val scn = scenario("RecordedSimulation")
		.exec(http("request_0")
			.get("/ContentManager")
			.headers(headers_0)
			.resources(http("request_1")
			.get(uri1 + "/favicon.ico")
			.headers(headers_0)
			.check(bodyString.is(RawFileBody("RecordedSimulation_0001_response.txt"))),
            http("request_2")
			.get(uri1 + "/js/lib/crypto/sha256-min.js")
			.check(bodyString.is(RawFileBody("RecordedSimulation_0002_response.txt"))),
            http("request_3")
			.get(uri1 + "/js/lib/crypto/core-min.js")
			.check(bodyString.is(RawFileBody("RecordedSimulation_0003_response.txt"))),
            http("request_4")
			.get(uri1 + "/js/lib/hogan.min.js")
			.check(bodyString.is(RawFileBody("RecordedSimulation_0004_response.txt"))),
            http("request_5")
			.get(uri1 + "/js/lib/jquery/jquery.fileapi.min.js")
			.check(bodyString.is(RawFileBody("RecordedSimulation_0005_response.txt"))),
            http("request_6")
			.get(uri1 + "/js/lib/jquery/jcrop/jquery.Jcrop.min.js")
			.check(bodyString.is(RawFileBody("RecordedSimulation_0006_response.txt"))),
            http("request_7")
			.get(uri1 + "/js/lib/jquery/FileAPI/FileAPI.exif.js")
			.check(bodyString.is(RawFileBody("RecordedSimulation_0007_response.txt"))),
            http("request_8")
			.get(uri1 + "/js/lib/crypto/enc-base64-min.js")
			.check(bodyString.is(RawFileBody("RecordedSimulation_0008_response.txt"))),
            http("request_9")
			.get(uri1 + "/images/profiles/?css=true")
			.headers(headers_9),
            http("request_10")
			.get(uri1 + "/js/lib/bootstrap/bootstrap.js")
			.check(bodyString.is(RawFileBody("RecordedSimulation_0010_response.txt"))),
            http("request_11")
			.get(uri1 + "/js/lib/json2.js")
			.check(bodyString.is(RawFileBody("RecordedSimulation_0011_response.txt"))),
            http("request_12")
			.get(uri1 + "/js/lib/jquery/jquery.modal.js")
			.check(bodyString.is(RawFileBody("RecordedSimulation_0012_response.txt"))),
            http("request_13")
			.get(uri1 + "/js/lib/require/require2.1.9.js")
			.check(bodyString.is(RawFileBody("RecordedSimulation_0013_response.txt"))),
            http("request_14")
			.get(uri1 + "/js/lib/jquery/jcrop/jquery.Jcrop.min.css")
			.headers(headers_9)
			.check(bodyString.is(RawFileBody("RecordedSimulation_0014_response.txt"))),
            http("request_15")
			.get(uri1 + "/js/lib/jquery/jquery.i18n.properties.js")
			.check(bodyString.is(RawFileBody("RecordedSimulation_0015_response.txt"))),
            http("request_16")
			.get(uri1 + "/js/lib/BigInt.js")
			.check(bodyString.is(RawFileBody("RecordedSimulation_0016_response.txt"))),
            http("request_17")
			.get(uri1 + "/js/lib/jquery/FileAPI/FileAPI.min.js")
			.check(bodyString.is(RawFileBody("RecordedSimulation_0017_response.txt"))),
            http("request_18")
			.get(uri1 + "/js/lib/blowfish.js")
			.check(bodyString.is(RawFileBody("RecordedSimulation_0018_response.txt"))),
            http("request_19")
			.get(uri1 + "/js/lib/underscore/underscore.js")
			.check(bodyString.is(RawFileBody("RecordedSimulation_0019_response.txt"))),
            http("request_20")
			.get(uri1 + "/css/scala.css")
			.headers(headers_9)
			.check(bodyString.is(RawFileBody("RecordedSimulation_0020_response.txt"))),
            http("request_21")
			.get(uri1 + "/js/lib/jquery/jquery.js")
			.check(bodyString.is(RawFileBody("RecordedSimulation_0021_response.txt"))),
            http("request_22")
			.get(uri1 + "/images/loading_browser.gif")
			.headers(headers_22)
			.check(bodyString.is(RawFileBody("RecordedSimulation_0022_response.txt"))),
            http("request_23")
			.get(uri1 + "/images/profiles?logo=splash.png")
			.headers(headers_22)
			.check(bodyString.is(RawFileBody("RecordedSimulation_0023_response.txt"))),
            http("request_24")
			.get(uri1 + "/images/backgrounds/background.png")
			.headers(headers_22)
			.check(bodyString.is(RawFileBody("RecordedSimulation_0024_response.txt"))),
            http("request_25")
			.get(uri1 + "/css/fonts/OpenSans/OpenSans-Regular-webfont.woff")
			.headers(headers_25)
			.check(bodyString.is(RawFileBody("RecordedSimulation_0025_response.txt"))),
            http("request_26")
			.get(uri1 + "/js/main.js")
			.check(bodyString.is(RawFileBody("RecordedSimulation_0026_response.txt"))),
            http("request_27")
			.get(uri1 + "/language/messages.properties?_=1438013054126")
			.headers(headers_27)
			.check(bodyString.is(RawFileBody("RecordedSimulation_0027_response.txt"))),
            http("request_28")
			.get(uri1 + "/language/messages_en.properties?_=1438013054127")
			.headers(headers_27)
			.check(bodyString.is(RawFileBody("RecordedSimulation_0028_response.txt"))),
            http("request_29")
			.get(uri1 + "/language/messages_en-US.properties?_=1438013054128")
			.headers(headers_27)
			.check(bodyString.is(RawFileBody("RecordedSimulation_0029_response.txt"))),
            http("request_30")
			.get(uri1 + "/api/rest/misc/productinfo")
			.headers(headers_30)
			.check(bodyString.is(RawFileBody("RecordedSimulation_0030_response.txt"))),
            http("request_31")
			.get(uri1 + "/api/rest/auth/get")
			.headers(headers_30)
			.check(status.is(401))
			.check(bodyString.is(RawFileBody("RecordedSimulation_0031_response.txt"))),
            http("request_32")
			.get(uri1 + "/images/view_loading.gif")
			.headers(headers_22)
			.check(bodyString.is(RawFileBody("RecordedSimulation_0032_response.txt"))),
            http("request_33")
			.get(uri1 + "/webapp/images/profiles/?logo=chicklet.png&dt=1438013054701")
			.headers(headers_22)
			.check(bodyString.is(RawFileBody("RecordedSimulation_0033_response.txt"))),
            http("request_34")
			.get(uri1 + "/images/profiles/?css=true&dt=1438013054709")
			.headers(headers_9),
            http("request_35")
			.get(uri1 + "/webapp/images/profiles/?dt=1438013054701")
			.headers(headers_22)
			.check(bodyString.is(RawFileBody("RecordedSimulation_0035_response.txt"))),
            http("request_36")
			.get(uri1 + "/css/fonts/OpenSans/OpenSans-Italic-webfont.woff")
			.headers(headers_25)
			.check(bodyString.is(RawFileBody("RecordedSimulation_0036_response.txt"))),
            http("request_37")
			.get(uri1 + "/images/profiles/?logo=true&dt=1438013054711")
			.headers(headers_22)
			.check(bodyString.is(RawFileBody("RecordedSimulation_0037_response.txt")))))
		.pause(6)
		.exec(http("request_38")
			.post("/ContentManager/api/rest/auth/login")
			.headers(headers_38)
			.body(RawFileBody("RecordedSimulation_0038_request.txt"))
			.check(status.is(401))
			.check(bodyString.is(RawFileBody("RecordedSimulation_0038_response.txt"))))
		.pause(8)
		.exec(http("request_39")
			.post("/ContentManager/api/rest/auth/login")
			.headers(headers_38)
			.body(RawFileBody("RecordedSimulation_0039_request.txt"))
			.resources(http("request_40")
			.get(uri1 + "/language/messages.properties?_=1438013054129")
			.headers(headers_40)
			.check(bodyString.is(RawFileBody("RecordedSimulation_0040_response.txt"))),
            http("request_41")
			.get(uri1 + "/language/messages_en.properties?_=1438013054130")
			.headers(headers_40)
			.check(bodyString.is(RawFileBody("RecordedSimulation_0041_response.txt"))),
            http("request_42")
			.get(uri1 + "/images/profiles/?css=true&dt=1438013069805")
			.headers(headers_9),
            http("request_43")
			.get(uri1 + "/webapp/images/profiles/?logo=chicklet.png&dt=1438013069829")
			.headers(headers_22)
			.check(bodyString.is(RawFileBody("RecordedSimulation_0043_response.txt"))),
            http("request_44")
			.get(uri1 + "/images/working_grey.gif")
			.headers(headers_22)
			.check(bodyString.is(RawFileBody("RecordedSimulation_0044_response.txt"))),
            http("request_45")
			.get(uri1 + "/webapp/images/profiles/?dt=1438013069829")
			.headers(headers_22)
			.check(bodyString.is(RawFileBody("RecordedSimulation_0045_response.txt"))),
            http("request_46")
			.get(uri1 + "/css/fonts/OpenSans/OpenSans-Semibold-webfont.woff")
			.headers(headers_25)
			.check(bodyString.is(RawFileBody("RecordedSimulation_0046_response.txt"))),
            http("request_47")
			.get(uri1 + "/api/rest/dashboard")
			.headers(headers_47)
			.check(bodyString.is(RawFileBody("RecordedSimulation_0047_response.txt"))),
            http("request_48")
			.get(uri1 + "/api/rest/playerhealth?offset=0&limit=999999&search=&sort=&count=0&filters=%7B%22playerHealthState%22%3A%7B%22values%22%3A%5B%22UNCLEARED%22%5D%7D%7D&fields=id")
			.headers(headers_47)
			.check(bodyString.is(RawFileBody("RecordedSimulation_0048_response.txt"))),
            http("request_49")
			.get(uri1 + "/api/rest/hostednetworks?offset=0&limit=999999&search=&sort=&count=0&filters=%7B%7D&fields=id")
			.headers(headers_47)
			.check(bodyString.is(RawFileBody("RecordedSimulation_0049_response.txt"))))
			.check(bodyString.is(RawFileBody("RecordedSimulation_0039_response.txt"))))
		.pause(6)
		.exec(http("request_50")
			.get("/ContentManager/api/rest/auth/logout?token=625520DA9EEC0CF5684EC9C6F56D0C4A7E3AF6CBE24B0A6BD98908CCA1B136E9D9F64154")
			.headers(headers_30)
			.resources(http("request_51")
			.get(uri1 + "/language/messages.properties?_=1438013054131")
			.headers(headers_27)
			.check(bodyString.is(RawFileBody("RecordedSimulation_0051_response.txt"))),
            http("request_52")
			.get(uri1 + "/language/messages_en.properties?_=1438013054132")
			.headers(headers_27)
			.check(bodyString.is(RawFileBody("RecordedSimulation_0052_response.txt"))),
            http("request_53")
			.get(uri1 + "/language/messages_en-US.properties?_=1438013054133")
			.headers(headers_27)
			.check(bodyString.is(RawFileBody("RecordedSimulation_0053_response.txt"))),
            http("request_54")
			.get(uri1 + "/images/profiles/?css=true&dt=1438013077306")
			.headers(headers_9),
            http("request_55")
			.get(uri1 + "/images/profiles/?logo=true&dt=1438013077308")
			.headers(headers_22)
			.check(bodyString.is(RawFileBody("RecordedSimulation_0055_response.txt"))))
			.check(bodyString.is(RawFileBody("RecordedSimulation_0050_response.txt"))))

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}