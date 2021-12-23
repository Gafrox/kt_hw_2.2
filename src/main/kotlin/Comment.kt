class Comment(
    val postId: Long,
    val id: Long,
    val from_id: Long,
    val date: Long,
    val text: String,
    val donut: String,
    val reply_to_user: Long,
    val reply_to_comment: Long,
    val attachments: Attachment,
    val parents_stack: String,
    val thread: Boolean
) {
}