class Audio(
    id: Long,
    owner_id: Long,
    artist: String,
    title: String,
    duration: Long,
    url: String,
    lyrics_id: Long,
    album_id: Long,
    genre_id: Long,
    date: Long,
    no_search: Boolean,
    is_hq: Boolean
) : Attachment {
    override val type: String = "audio"
}