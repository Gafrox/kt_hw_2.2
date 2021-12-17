class Sticker(
    product_id: Long,
    sticker_id: Long,
    images: Long,
    images_with_background: Long,
    animation_url: String,
    is_allowed: Boolean
) : Attachment {
    override val type: String = "sticker"
}