package com.example.calculatorapp.domain

import com.example.calculatorapp.domain.models.ContactEvent
import com.example.calculatorapp.room.Contact

data class ContactState(
    val contacts: List<Contact> = emptyList(),
    val firstName: String = "",
    val lastName: String = "",
    val phoneNumber: String = "",
    val isAddingContact: Boolean = false,
    val sortType: SortType = SortType.FIRST_NAME
)
