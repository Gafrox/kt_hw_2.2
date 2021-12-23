class WikiPage(id: Long, group_id: Long, title: String) : Attachment {
    override val type: String = "page"
}