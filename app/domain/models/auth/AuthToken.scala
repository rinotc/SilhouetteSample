package domain.models.auth

import java.time.ZonedDateTime
import java.util.UUID

case class AuthToken(
    id: UUID,
    userID: UUID,
    expiry: ZonedDateTime
)
