class Photo(
    id: Long,
    album_id: Long,
    owner_id: Long,
    user_id: Long,
    text: String,
    date: Long,
    sizes: String,
    width: Long,
    height: Long
) : Attachment {
    override val type: String = "photo"
}