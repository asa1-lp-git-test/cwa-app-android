package de.rki.coronawarnapp.contactdiary.model

import java.util.UUID

data class DefaultLocation(override var locationName: String) : Location {
    override val stableId: Long
        get() = UUID.randomUUID().leastSignificantBits
}
