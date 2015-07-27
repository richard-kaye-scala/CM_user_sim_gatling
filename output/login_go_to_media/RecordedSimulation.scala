package login_go_to_media

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class RecordedSimulation extends Simulation {

	val httpProtocol = http
		.baseURL("http://marabunta.scala.com:8080")
		.inferHtmlResources()

	val headers_0 = Map("Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8")

	val headers_1 = Map("Accept" -> "text/css,*/*;q=0.1")

	val headers_3 = Map("Accept" -> "*/*")

	val headers_25 = Map(
		"Accept" -> "text/plain, */*; q=0.01",
		"X-Requested-With" -> "XMLHttpRequest")

	val headers_28 = Map(
		"Accept" -> "application/json, text/javascript, */*; q=0.01",
		"X-Requested-With" -> "XMLHttpRequest")

	val headers_35 = Map(
		"Accept" -> "application/json, text/javascript, */*; q=0.01",
		"Content-Type" -> "application/json; charset=UTF-8",
		"Pragma" -> "no-cache",
		"X-Requested-With" -> "XMLHttpRequest")

	val headers_36 = Map(
		"Accept" -> "text/plain, */*; q=0.01",
		"X-Requested-With" -> "XMLHttpRequest",
		"apiToken" -> "90802D98F42040C442F5E3193A647D591840D2D718B141EFD9F4B70773E2000AFB6279A8")

	val headers_42 = Map(
		"Accept" -> "application/json, text/javascript, */*; q=0.01",
		"X-Requested-With" -> "XMLHttpRequest",
		"apiToken" -> "90802D98F42040C442F5E3193A647D591840D2D718B141EFD9F4B70773E2000AFB6279A8")

    val uri1 = "http://marabunta.scala.com:8080/ContentManager"

	val scn = scenario("RecordedSimulation")
		.exec(http("request_0")
			.get("/ContentManager/")
			.headers(headers_0)
			.resources(http("request_1")
			.get(uri1 + "/js/lib/jquery/jcrop/jquery.Jcrop.min.css")
			.headers(headers_1)
			.check(status.is(304)),
            http("request_2")
			.get(uri1 + "/images/profiles/?css=true")
			.headers(headers_1),
            http("request_3")
			.get(uri1 + "/js/lib/jquery/jquery.js")
			.headers(headers_3)
			.check(status.is(304)),
            http("request_4")
			.get(uri1 + "/js/lib/bootstrap/bootstrap.js")
			.headers(headers_3)
			.check(status.is(304)),
            http("request_5")
			.get(uri1 + "/js/lib/crypto/sha256-min.js")
			.headers(headers_3)
			.check(status.is(304)),
            http("request_6")
			.get(uri1 + "/js/lib/jquery/FileAPI/FileAPI.min.js")
			.headers(headers_3)
			.check(status.is(304)),
            http("request_7")
			.get(uri1 + "/js/lib/jquery/jcrop/jquery.Jcrop.min.js")
			.headers(headers_3)
			.check(status.is(304)),
            http("request_8")
			.get(uri1 + "/js/lib/hogan.min.js")
			.headers(headers_3)
			.check(status.is(304)),
            http("request_9")
			.get(uri1 + "/js/lib/crypto/enc-base64-min.js")
			.headers(headers_3)
			.check(status.is(304)),
            http("request_10")
			.get(uri1 + "/js/lib/jquery/jquery.fileapi.min.js")
			.headers(headers_3)
			.check(status.is(304)),
            http("request_11")
			.get(uri1 + "/js/lib/jquery/jquery.modal.js")
			.headers(headers_3)
			.check(status.is(304)),
            http("request_12")
			.get(uri1 + "/js/lib/underscore/underscore.js")
			.headers(headers_3)
			.check(status.is(304)),
            http("request_13")
			.get(uri1 + "/css/scala.css")
			.headers(headers_1)
			.check(status.is(304)),
            http("request_14")
			.get(uri1 + "/js/lib/crypto/core-min.js")
			.headers(headers_3)
			.check(status.is(304)),
            http("request_15")
			.get(uri1 + "/js/lib/require/require2.1.9.js")
			.headers(headers_3)
			.check(status.is(304)),
            http("request_16")
			.get(uri1 + "/js/lib/BigInt.js")
			.headers(headers_3)
			.check(status.is(304)),
            http("request_17")
			.get(uri1 + "/js/lib/json2.js")
			.headers(headers_3)
			.check(status.is(304)),
            http("request_18")
			.get(uri1 + "/js/lib/blowfish.js")
			.headers(headers_3)
			.check(status.is(304)),
            http("request_19")
			.get(uri1 + "/js/lib/jquery/FileAPI/FileAPI.exif.js")
			.headers(headers_3)
			.check(status.is(304)),
            http("request_20")
			.get(uri1 + "/js/lib/jquery/jquery.i18n.properties.js")
			.headers(headers_3)
			.check(status.is(304)),
            http("request_21")
			.get(uri1 + "/images/backgrounds/background.png")
			.check(status.is(304)),
            http("request_22")
			.get(uri1 + "/js/main.js")
			.headers(headers_3)
			.check(status.is(304)),
            http("request_23")
			.get(uri1 + "/images/profiles?logo=splash.png")
			.check(bodyString.is(RawFileBody("RecordedSimulation_0023_response.txt"))),
            http("request_24")
			.get(uri1 + "/images/loading_browser.gif")
			.check(status.is(304)),
            http("request_25")
			.get(uri1 + "/language/messages.properties?_=1438022077252")
			.headers(headers_25)
			.check(bodyString.is(RawFileBody("RecordedSimulation_0025_response.txt"))),
            http("request_26")
			.get(uri1 + "/language/messages_en.properties?_=1438022077253")
			.headers(headers_25)
			.check(bodyString.is(RawFileBody("RecordedSimulation_0026_response.txt"))),
            http("request_27")
			.get(uri1 + "/language/messages_en-US.properties?_=1438022077254")
			.headers(headers_25)
			.check(bodyString.is(RawFileBody("RecordedSimulation_0027_response.txt"))),
            http("request_28")
			.get(uri1 + "/api/rest/misc/productinfo")
			.headers(headers_28)
			.check(bodyString.is(RawFileBody("RecordedSimulation_0028_response.txt"))),
            http("request_29")
			.get(uri1 + "/api/rest/auth/get")
			.headers(headers_28)
			.check(status.is(401))
			.check(bodyString.is(RawFileBody("RecordedSimulation_0029_response.txt"))),
            http("request_30")
			.get(uri1 + "/images/view_loading.gif")
			.check(status.is(304)),
            http("request_31")
			.get(uri1 + "/webapp/images/profiles/?logo=chicklet.png&dt=1438022077860")
			.check(bodyString.is(RawFileBody("RecordedSimulation_0031_response.txt"))),
            http("request_32")
			.get(uri1 + "/webapp/images/profiles/?dt=1438022077860")
			.check(bodyString.is(RawFileBody("RecordedSimulation_0032_response.txt"))),
            http("request_33")
			.get(uri1 + "/images/profiles/?css=true&dt=1438022077868")
			.headers(headers_1),
            http("request_34")
			.get(uri1 + "/images/profiles/?logo=true&dt=1438022077872")
			.check(bodyString.is(RawFileBody("RecordedSimulation_0034_response.txt"))))
			.check(status.is(304)))
		.pause(6)
		.exec(http("request_35")
			.post("/ContentManager/api/rest/auth/login")
			.headers(headers_35)
			.body(RawFileBody("RecordedSimulation_0035_request.txt"))
			.resources(http("request_36")
			.get(uri1 + "/language/messages.properties?_=1438022077255")
			.headers(headers_36)
			.check(bodyString.is(RawFileBody("RecordedSimulation_0036_response.txt"))),
            http("request_37")
			.get(uri1 + "/language/messages_en.properties?_=1438022077256")
			.headers(headers_36)
			.check(bodyString.is(RawFileBody("RecordedSimulation_0037_response.txt"))),
            http("request_38")
			.get(uri1 + "/images/profiles/?css=true&dt=1438022084944")
			.headers(headers_1),
            http("request_39")
			.get(uri1 + "/webapp/images/profiles/?dt=1438022084967")
			.check(bodyString.is(RawFileBody("RecordedSimulation_0039_response.txt"))),
            http("request_40")
			.get(uri1 + "/webapp/images/profiles/?logo=chicklet.png&dt=1438022084968")
			.check(bodyString.is(RawFileBody("RecordedSimulation_0040_response.txt"))),
            http("request_41")
			.get(uri1 + "/images/working_grey.gif")
			.check(status.is(304)),
            http("request_42")
			.get(uri1 + "/api/rest/dashboard")
			.headers(headers_42)
			.check(bodyString.is(RawFileBody("RecordedSimulation_0042_response.txt"))),
            http("request_43")
			.get(uri1 + "/api/rest/hostednetworks?offset=0&limit=999999&search=&sort=&count=0&filters=%7B%7D&fields=id")
			.headers(headers_42)
			.check(bodyString.is(RawFileBody("RecordedSimulation_0043_response.txt"))),
            http("request_44")
			.get(uri1 + "/api/rest/playerhealth?offset=0&limit=999999&search=&sort=&count=0&filters=%7B%22playerHealthState%22%3A%7B%22values%22%3A%5B%22UNCLEARED%22%5D%7D%7D&fields=id")
			.headers(headers_42)
			.check(bodyString.is(RawFileBody("RecordedSimulation_0044_response.txt"))))
			.check(bodyString.is(RawFileBody("RecordedSimulation_0035_response.txt"))))
		.pause(2)
		.exec(http("request_45")
			.get("/ContentManager/webapp/images/viewSettings.png")
			.resources(http("request_46")
			.get(uri1 + "/api/rest/media/search?offset=0&limit=50&search=&sort=-lastModified&count=0&filters=%7B%7D&facets=type%2CmediaApprovalStatus%2CmediaUploadStatus%2CpublicDate%2CexpireDate%2CneverEnd%2Ccategory%2CcategoryAssigned%2Cworkgroup%2CworkgroupAssigned%2CsharedWorkgroup%2CmediaTemplate%2Cpath&fields=id%2Cname%2Cwidth%2Cheight%2Cpages%2CreadOnly%2Cpath%2Cstatus%2CapprovalStatus%2ChasUnapprovedElements%2CvalidDateStatus%2ClastModified%2Crevision%2Curi%2CdownloadPath%2CgeneratingThumbnail%2CmediaType%2Clength%2CprettifyDuration%2CthumbnailDownloadPaths%2Ccategories%2Cworkgroups%2Ctemplate%2ChasSnapshot%2CsnapshotInQueue")
			.headers(headers_42)
			.check(bodyString.is(RawFileBody("RecordedSimulation_0046_response.txt"))),
            http("request_47")
			.get(uri1 + "/webapp/images/icon_warning.png")
			.check(bodyString.is(RawFileBody("RecordedSimulation_0047_response.txt"))),
            http("request_48")
			.get(uri1 + "/webapp/images/scala_script.png")
			.check(bodyString.is(RawFileBody("RecordedSimulation_0048_response.txt"))),
            http("request_49")
			.get(uri1 + "/resources/thumbnails/13_large.png?unique=1438022088271")
			.check(bodyString.is(RawFileBody("RecordedSimulation_0049_response.txt"))),
            http("request_50")
			.get(uri1 + "/resources/thumbnails/5_large.png?unique=1438022088265")
			.check(bodyString.is(RawFileBody("RecordedSimulation_0050_response.txt"))),
            http("request_51")
			.get(uri1 + "/resources/thumbnails/18_large.png?unique=1438022088277")
			.check(bodyString.is(RawFileBody("RecordedSimulation_0051_response.txt"))),
            http("request_52")
			.get(uri1 + "/resources/thumbnails/17_large.png?unique=1438022088284")
			.check(bodyString.is(RawFileBody("RecordedSimulation_0052_response.txt"))),
            http("request_53")
			.get(uri1 + "/resources/thumbnails/6_large.png?unique=1438022088268")
			.check(bodyString.is(RawFileBody("RecordedSimulation_0053_response.txt"))),
            http("request_54")
			.get(uri1 + "/webapp/images/error.png")
			.check(bodyString.is(RawFileBody("RecordedSimulation_0054_response.txt"))),
            http("request_55")
			.get(uri1 + "/resources/thumbnails/15_large.png?unique=1438022088295")
			.check(bodyString.is(RawFileBody("RecordedSimulation_0055_response.txt"))),
            http("request_56")
			.get(uri1 + "/resources/thumbnails/16_large.png?unique=1438022088293")
			.check(bodyString.is(RawFileBody("RecordedSimulation_0056_response.txt"))),
            http("request_57")
			.get(uri1 + "/resources/thumbnails/14_large.png?unique=1438022088274")
			.check(bodyString.is(RawFileBody("RecordedSimulation_0057_response.txt"))),
            http("request_58")
			.get(uri1 + "/resources/thumbnails/11_large.png?unique=1438022088298")
			.check(bodyString.is(RawFileBody("RecordedSimulation_0058_response.txt"))),
            http("request_59")
			.get(uri1 + "/resources/thumbnails/19_large.png?unique=1438022088279")
			.check(bodyString.is(RawFileBody("RecordedSimulation_0059_response.txt"))),
            http("request_60")
			.get(uri1 + "/resources/thumbnails/12_large.png?unique=1438022088290")
			.check(bodyString.is(RawFileBody("RecordedSimulation_0060_response.txt"))),
            http("request_61")
			.get(uri1 + "/resources/thumbnails/20_large.png?unique=1438022088281")
			.check(bodyString.is(RawFileBody("RecordedSimulation_0061_response.txt"))),
            http("request_62")
			.get(uri1 + "/resources/thumbnails/8_large.png?unique=1438022088310")
			.check(bodyString.is(RawFileBody("RecordedSimulation_0062_response.txt"))),
            http("request_63")
			.get(uri1 + "/resources/thumbnails/3_large.png?unique=1438022088316")
			.check(bodyString.is(RawFileBody("RecordedSimulation_0063_response.txt"))),
            http("request_64")
			.get(uri1 + "/resources/thumbnails/7_large.png?unique=1438022088314")
			.check(bodyString.is(RawFileBody("RecordedSimulation_0064_response.txt"))),
            http("request_65")
			.get(uri1 + "/resources/thumbnails/10_large.png?unique=1438022088301")
			.check(bodyString.is(RawFileBody("RecordedSimulation_0065_response.txt"))),
            http("request_66")
			.get(uri1 + "/resources/thumbnails/9_large.png?unique=1438022088307")
			.check(bodyString.is(RawFileBody("RecordedSimulation_0066_response.txt"))),
            http("request_67")
			.get(uri1 + "/images/sort_both.png")
			.check(bodyString.is(RawFileBody("RecordedSimulation_0067_response.txt"))),
            http("request_68")
			.get(uri1 + "/images/sort_desc.png")
			.check(bodyString.is(RawFileBody("RecordedSimulation_0068_response.txt"))),
            http("request_69")
			.get(uri1 + "/images/multiSelectDefault.png")
			.check(bodyString.is(RawFileBody("RecordedSimulation_0069_response.txt"))),
            http("request_70")
			.get(uri1 + "/webapp/images/image.png")
			.check(bodyString.is(RawFileBody("RecordedSimulation_0070_response.txt"))),
            http("request_71")
			.get(uri1 + "/images/list_working.gif")
			.check(bodyString.is(RawFileBody("RecordedSimulation_0071_response.txt"))),
            http("request_72")
			.get(uri1 + "/resources/thumbnails/4_large.png?unique=1438022088322")
			.check(bodyString.is(RawFileBody("RecordedSimulation_0072_response.txt"))),
            http("request_73")
			.get(uri1 + "/resources/thumbnails/2_large.png?unique=1438022088327")
			.check(bodyString.is(RawFileBody("RecordedSimulation_0073_response.txt"))),
            http("request_74")
			.get(uri1 + "/images/downArrow.png")
			.check(bodyString.is(RawFileBody("RecordedSimulation_0074_response.txt"))),
            http("request_75")
			.get(uri1 + "/images/filters/collapsed.png")
			.check(bodyString.is(RawFileBody("RecordedSimulation_0075_response.txt"))))
			.check(bodyString.is(RawFileBody("RecordedSimulation_0045_response.txt"))))
		.pause(1)
		.exec(http("request_76")
			.get("/ContentManager/api/rest/media/search?offset=0&limit=50&search=&sort=&count=0&filters=%7B%22id%22%3A%7B%22values%22%3A%5B%22202%22%2C%22201%22%2C%22194%22%2C%225%22%2C%226%22%2C%2213%22%2C%2214%22%2C%2218%22%2C%2219%22%2C%2220%22%2C%2217%22%2C%2212%22%2C%2216%22%2C%2215%22%2C%2211%22%2C%2210%22%2C%229%22%2C%228%22%2C%227%22%2C%223%22%2C%224%22%2C%222%22%2C%221%22%5D%2C%22comparator%22%3A%22eq%22%7D%7D&facets=&fields=id%2CusingMessagesCount%2CusingPlaylistsCount%2CusingTemplatesCount")
			.headers(headers_42)
			.check(bodyString.is(RawFileBody("RecordedSimulation_0076_response.txt"))))

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}