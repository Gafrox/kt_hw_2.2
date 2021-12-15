object WallService {
    private var posts = emptyArray<Post>()
    private var idCounter: Long = 1

    fun add(post: Post): Post {
        post.id = idCounter
        posts += post
        idCounter++
        return posts.last()
    }

    fun update(post: Post): Boolean {
        for (i in posts.indices) {
            if (posts[i].id == post.id) {
                val newPost = post.copy(id = posts[i].id, date = posts[i].date)
                posts[i] = newPost
                return true
            }
        }
        return false
    }
}