package example

import software.amazon.awssdk.services.cloudwatchlogs.model.GetLogEventsRequest

object DottyCylicalRefError {

  GetLogEventsRequest
    .builder()
    .limit(0) // without .limit() still has 1 error. With .limit(), 121 errors
}
