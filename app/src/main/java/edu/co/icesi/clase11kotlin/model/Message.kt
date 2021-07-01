package co.domi.clase10.model

data class Message(
    var id: String,
    var body: String,
    var authorID: String,
    var timestamp: Long
){
    constructor():this("NO_ID","NO_BODY","NO_AUTHOR",0L)
}
