package de.rki.coronawarnapp.contactdiary.storage.entity

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation
import de.rki.coronawarnapp.contactdiary.model.ContactDiaryElement
import org.joda.time.LocalDate

data class ContactDiaryElementEntity(
    @Embedded val contactDiaryDate: ContactDiaryDate,
    @Relation(
        parentColumn = "date",
        entity = ContactDiaryDate::class,
        entityColumn = "personId",
        associateBy = Junction(
            value = ContactDiaryElementPersonXRef::class,
            parentColumn = "date",
            entityColumn = "personId"
        )
    )
    override val people: MutableList<PersonEntity> = mutableListOf(),
    @Relation(
        parentColumn = "date",
        entity = ContactDiaryDate::class,
        entityColumn = "locationId",
        associateBy = Junction(
            value = ContactDiaryElementLocationXRef::class,
            parentColumn = "date",
            entityColumn = "locationId"
        )
    )
    override val locations: MutableList<LocationEntity> = mutableListOf()
) : ContactDiaryElement {
    override val date: LocalDate
        get() = contactDiaryDate.date
}
