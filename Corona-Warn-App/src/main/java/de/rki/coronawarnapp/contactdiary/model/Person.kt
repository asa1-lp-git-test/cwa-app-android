package de.rki.coronawarnapp.contactdiary.model

import de.rki.coronawarnapp.util.lists.HasStableId

interface Person : HasStableId {
    var fullName: String
}
