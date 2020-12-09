package de.rki.coronawarnapp.contactdiary.model

import de.rki.coronawarnapp.util.lists.HasStableId

interface Location : HasStableId {
    var locationName: String
}
