package de.rki.coronawarnapp.contactdiary.model

import java.util.UUID

data class DefaultPerson(override var fullName: String) : Person {
    override val stableId: Long
        get() = UUID.randomUUID().leastSignificantBits
}
