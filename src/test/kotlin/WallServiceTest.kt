import org.junit.Test

import org.junit.Assert.*

class WallServiceTest {

    val arrayAttachment = emptyArray<Attachment>()

    @Test
    fun add() {
        val result = WallService.add(
            Post(
                0,
                0,
                0,
                0,
                0,
                "text",
                0,
                0,
                false,
                null,
                null,
                null,
                null,
                null,
                "test",
                "test",
                "test",
                0,
                "test",
                false,
                false,
                false,
                false,
                false,
                false,
                false,
                0,
                arrayAttachment
            )
        )
        assertTrue(result.id != 0L)
    }

    @Test
    fun update_True() {
        val service = WallService

        service.add(
            Post(
                1,
                1,
                1,
                1,
                3,
                "text",
                0,
                0,
                false,
                null,
                null,
                null,
                null,
                null,
                "test",
                "test",
                "test",
                0,
                "test",
                false,
                false,
                false,
                false,
                false,
                false,
                false,
                0,
                arrayAttachment
            )
        )
        service.add(
            Post(
                2,
                2,
                2,
                2,
                2,
                "text",
                0,
                0,
                false,
                null,
                null,
                null,
                null,
                null,
                "test",
                "test",
                "test",
                0,
                "test",
                false,
                false,
                false,
                false,
                false,
                false,
                false,
                0,
                arrayAttachment
            )
        )
        service.add(
            Post(
                3,
                3,
                3,
                3,
                3,
                "text",
                0,
                0,
                false,
                null,
                null,
                null,
                null,
                null,
                "test",
                "test",
                "test",
                0,
                "test",
                false,
                false,
                false,
                false,
                false,
                false,
                false,
                0,
                arrayAttachment
            )
        )

        val update = Post(
            1,
            4,
            4,
            4,
            4,
            "text",
            0,
            0,
            false,
            null,
            null,
            null,
            null,
            null,
            "test",
            "test",
            "test",
            0,
            "test",
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            0,
            arrayAttachment
        )

        val result = service.update(update)

        assertTrue(result)

    }

    @Test
    fun update_False() {

        val service = WallService

        service.add(
            Post(
                1,
                5,
                5,
                5,
                5,
                "text",
                0,
                0,
                false,
                null,
                null,
                null,
                null,
                null,
                "test",
                "test",
                "test",
                0,
                "test",
                false,
                false,
                false,
                false,
                false,
                false,
                false,
                0,
                arrayAttachment
            )
        )
        service.add(
            Post(
                6,
                6,
                6,
                6,
                6,
                "text",
                0,
                0,
                false,
                null,
                null,
                null,
                null,
                null,
                "test",
                "test",
                "test",
                0,
                "test",
                false,
                false,
                false,
                false,
                false,
                false,
                false,
                0,
                arrayAttachment
            )
        )
        service.add(
            Post(
                7,
                7,
                7,
                7,
                7,
                "text",
                0,
                0,
                false,
                null,
                null,
                null,
                null,
                null,
                "test",
                "test",
                "test",
                0,
                "test",
                false,
                false,
                false,
                false,
                false,
                false,
                false,
                0,
                arrayAttachment
            )
        )

        val update = Post(
            8,
            8,
            8,
            8,
            8,
            "text",
            0,
            0,
            false,
            null,
            null,
            null,
            null,
            null,
            "test",
            "test",
            "test",
            0,
            "test",
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            0,
            arrayAttachment
        )

        val result = service.update(update)

        assertFalse(result)

    }
}