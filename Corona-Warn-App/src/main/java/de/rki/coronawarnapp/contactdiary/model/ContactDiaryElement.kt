package de.rki.coronawarnapp.contactdiary.model

import org.joda.time.Instant

interface ContactDiaryElement {

    val createdAt: Instant

    val people: List<Person>
    val locations: List<Location>

    val numberOfPersons: Int
        get() = people.size

    val numberOfLocations: Int
        get() = locations.size
}
