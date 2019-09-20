package com.sanket.androidcustomviews

/**
 * Created by Sanket on 2019-09-11.
 */
class Utils {
    companion object {
        fun getColourResourceIdBasedOnCharacters(initial: Char): String {
            val resource = StringBuilder()
            when (initial.toInt() % 8) {
                0 -> resource.append("#880E4F")
                1 -> resource.append("#1A237E")
                2 -> resource.append("#006064")
                3 -> resource.append("#33691E")
                4 -> resource.append("#3E2723")
                5 -> resource.append("#263238")
                6 -> resource.append("#05179B")
                7 -> resource.append("#F57F17")
                else -> resource.append("#880E4F")
            }
            return resource.toString()
        }
    }
}