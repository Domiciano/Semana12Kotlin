package co.domi.clase10.model

data class ChatRelationship(
    var chatID: String,
    //Metadata
    var contactID: String,
    var contactName: String
){
    constructor() : this("NO_ID","NO_ID","NO_CONTACT_NAME")
}
