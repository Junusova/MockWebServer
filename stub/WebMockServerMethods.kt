

import hub.const.MOCKWEBSERVER
import hub.const.controller.*
import okhttp3.mockwebserver.Dispatcher
import okhttp3.mockwebserver.MockResponse
import okhttp3.mockwebserver.RecordedRequest

object WebMockServerMethods {

    fun auth() {
        val dispatcher: Dispatcher = object : Dispatcher() {
            override fun dispatch(request: RecordedRequest): MockResponse {
                val response = MockResponse()
                return when (request.path) {
                    CHECK_SUPPORT_5555950997 -> return response
                            .setResponseCode(200)
                    MY_BEELINE_NUMBER_5559500 -> return response
                            .setResponseCode(200)
                            .setBody("endpoint")
                    else -> MockResponse().setResponseCode(404)
                }
            }
        }
        MOCKWEBSERVER.setDispatcher(dispatcher)
    }
}
