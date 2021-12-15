import org.junit.Test

import org.junit.Assert.*

class WallServiceTest {

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
                "post",
                0,
                0,
                0,
                "post",
                0,
                false,
                false,
                false,
                false,
                false,
                false,
                false,
                0
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
                0,
                12_9_21,
                "text",
                0,
                0,
                false,
                "post",
                0,
                0,
                0,
                "post",
                0,
                false,
                false,
                false,
                false,
                false,
                false,
                false,
                0
            )
        )
        service.add(
            Post(
                2,
                2,
                2,
                0,
                0,
                "text",
                0,
                0,
                false,
                "post",
                0,
                0,
                0,
                "post",
                0,
                false,
                false,
                false,
                false,
                false,
                false,
                false,
                0
            )
        )
        service.add(
            Post(
                3,
                3,
                3,
                0,
                0,
                "text",
                0,
                0,
                false,
                "post",
                0,
                0,
                0,
                "post",
                0,
                false,
                false,
                false,
                false,
                false,
                false,
                false,
                0
            )
        )

        val update = Post(
            1,
            99,
            2445,
            0,
            6,
            "text",
            0,
            0,
            false,
            "post",
            0,
            0,
            0,
            "post",
            0,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            0
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
                1,
                1,
                0,
                12_9_21,
                "text",
                0,
                0,
                false,
                "post",
                0,
                0,
                0,
                "post",
                0,
                false,
                false,
                false,
                false,
                false,
                false,
                false,
                0
            )
        )
        service.add(
            Post(
                2,
                2,
                2,
                0,
                0,
                "text",
                0,
                0,
                false,
                "post",
                0,
                0,
                0,
                "post",
                0,
                false,
                false,
                false,
                false,
                false,
                false,
                false,
                0
            )
        )
        service.add(
            Post(
                3,
                3,
                3,
                0,
                0,
                "text",
                0,
                0,
                false,
                "post",
                0,
                0,
                0,
                "post",
                0,
                false,
                false,
                false,
                false,
                false,
                false,
                false,
                0
            )
        )

        val update = Post(
            5,
            99,
            2445,
            0,
            6,
            "text",
            0,
            0,
            false,
            "post",
            0,
            0,
            0,
            "post",
            0,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            0
        )

        val result = service.update(update)

        assertFalse(result)

    }
}