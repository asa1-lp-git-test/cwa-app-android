package de.rki.coronawarnapp.contactdiary.model

import org.joda.time.Instant

data class DefaultContactDiaryElement(
    override val createdAt: Instant,
    override val people: List<Person>,
    override val locations: List<Location>
) : ContactDiaryElement
