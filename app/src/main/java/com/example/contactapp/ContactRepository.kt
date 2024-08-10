package com.example.contactapp

import android.provider.ContactsContract.Contacts
import kotlinx.coroutines.flow.Flow

class ContactRepository(private val contactDAO: contactDAO) {
    val AllContacts: Flow<List<ContactEntity>> = contactDAO.getAllContacts()

    suspend fun insert(contact: ContactEntity){
        contactDAO.insert(contact)
    }
    suspend fun update(contact: ContactEntity){
        contactDAO.update(contact)
    }
    suspend fun delete(contact: ContactEntity){
        contactDAO.delete(contact)
    }
}