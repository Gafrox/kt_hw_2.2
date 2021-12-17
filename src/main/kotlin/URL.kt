class URL(
    url: String,
    title: String,
    caption: String,
    description: String,
    photo: String,
    product: String,
    button: String,
    preview_page: String,
    preview_url: String
) : Attachment {
    override val type: String = "link"
}