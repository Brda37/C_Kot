package com.example.c_kotlink


import android.view.View
import android.view.ViewGroup
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.*
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import org.hamcrest.Description
import org.hamcrest.Matcher
import org.hamcrest.Matchers.allOf
import org.hamcrest.TypeSafeMatcher
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@LargeTest
@RunWith(AndroidJUnit4::class)
class Espresso {

    @Rule
    @JvmField
    var mActivityScenarioRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun espressp() {
        val materialButton = onView(
            allOf(
                withId(R.id.bt8), withText("8"),
                childAtPosition(
                    childAtPosition(
                        withId(android.R.id.content),
                        0
                    ),
                    5
                ),
                isDisplayed()
            )
        )
        materialButton.perform(click())

        val materialButton2 = onView(
            allOf(
                withId(R.id.btProduct), withText("x"),
                childAtPosition(
                    childAtPosition(
                        withId(android.R.id.content),
                        0
                    ),
                    14
                ),
                isDisplayed()
            )
        )
        materialButton2.perform(click())

        val materialButton3 = onView(
            allOf(
                withId(R.id.bt2), withText("2"),
                childAtPosition(
                    childAtPosition(
                        withId(android.R.id.content),
                        0
                    ),
                    12
                ),
                isDisplayed()
            )
        )
        materialButton3.perform(click())

        val materialButton4 = onView(
            allOf(
                withId(R.id.btEqual), withText("="),
                childAtPosition(
                    childAtPosition(
                        withId(android.R.id.content),
                        0
                    ),
                    15
                ),
                isDisplayed()
            )
        )
        materialButton4.perform(click())

        val materialButton5 = onView(
            allOf(
                withId(R.id.btDivition), withText("/"),
                childAtPosition(
                    childAtPosition(
                        withId(android.R.id.content),
                        0
                    ),
                    18
                ),
                isDisplayed()
            )
        )
        materialButton5.perform(click())

        val materialButton6 = onView(
            allOf(
                withId(R.id.bt3), withText("3"),
                childAtPosition(
                    childAtPosition(
                        withId(android.R.id.content),
                        0
                    ),
                    11
                ),
                isDisplayed()
            )
        )
        materialButton6.perform(click())

        val materialButton7 = onView(
            allOf(
                withId(R.id.btSum), withText("+"),
                childAtPosition(
                    childAtPosition(
                        withId(android.R.id.content),
                        0
                    ),
                    2
                ),
                isDisplayed()
            )
        )
        materialButton7.perform(click())

        val materialButton8 = onView(
            allOf(
                withId(R.id.bt8), withText("8"),
                childAtPosition(
                    childAtPosition(
                        withId(android.R.id.content),
                        0
                    ),
                    5
                ),
                isDisplayed()
            )
        )
        materialButton8.perform(click())

        val materialButton9 = onView(
            allOf(
                withId(R.id.btEqual), withText("="),
                childAtPosition(
                    childAtPosition(
                        withId(android.R.id.content),
                        0
                    ),
                    15
                ),
                isDisplayed()
            )
        )
        materialButton9.perform(click())

        val materialButton10 = onView(
            allOf(
                withId(R.id.btRest), withText("-"),
                childAtPosition(
                    childAtPosition(
                        withId(android.R.id.content),
                        0
                    ),
                    10
                ),
                isDisplayed()
            )
        )
        materialButton10.perform(click())

        val materialButton11 = onView(
            allOf(
                withId(R.id.bt1), withText("1"),
                childAtPosition(
                    childAtPosition(
                        withId(android.R.id.content),
                        0
                    ),
                    13
                ),
                isDisplayed()
            )
        )
        materialButton11.perform(click())

        val materialButton12 = onView(
            allOf(
                withId(R.id.btEqual), withText("="),
                childAtPosition(
                    childAtPosition(
                        withId(android.R.id.content),
                        0
                    ),
                    15
                ),
                isDisplayed()
            )
        )
        materialButton12.perform(click())

        val materialButton13 = onView(
            allOf(
                withId(R.id.btDivition), withText("/"),
                childAtPosition(
                    childAtPosition(
                        withId(android.R.id.content),
                        0
                    ),
                    18
                ),
                isDisplayed()
            )
        )
        materialButton13.perform(click())

        val materialButton14 = onView(
            allOf(
                withId(R.id.bt7), withText("7"),
                childAtPosition(
                    childAtPosition(
                        withId(android.R.id.content),
                        0
                    ),
                    6
                ),
                isDisplayed()
            )
        )
        materialButton14.perform(click())

        val materialButton15 = onView(
            allOf(
                withId(R.id.btEqual), withText("="),
                childAtPosition(
                    childAtPosition(
                        withId(android.R.id.content),
                        0
                    ),
                    15
                ),
                isDisplayed()
            )
        )
        materialButton15.perform(click())

        val materialButton16 = onView(
            allOf(
                withId(R.id.btClean), withText("C"),
                childAtPosition(
                    childAtPosition(
                        withId(android.R.id.content),
                        0
                    ),
                    3
                ),
                isDisplayed()
            )
        )
        materialButton16.perform(click())

        val materialButton17 = onView(
            allOf(
                withId(R.id.btPoint), withText("."),
                childAtPosition(
                    childAtPosition(
                        withId(android.R.id.content),
                        0
                    ),
                    16
                ),
                isDisplayed()
            )
        )
        materialButton17.perform(click())

        val materialButton18 = onView(
            allOf(
                withId(R.id.bt3), withText("3"),
                childAtPosition(
                    childAtPosition(
                        withId(android.R.id.content),
                        0
                    ),
                    11
                ),
                isDisplayed()
            )
        )
        materialButton18.perform(click())

        val materialButton19 = onView(
            allOf(
                withId(R.id.btSum), withText("+"),
                childAtPosition(
                    childAtPosition(
                        withId(android.R.id.content),
                        0
                    ),
                    2
                ),
                isDisplayed()
            )
        )
        materialButton19.perform(click())

        val materialButton20 = onView(
            allOf(
                withId(R.id.bt4), withText("4"),
                childAtPosition(
                    childAtPosition(
                        withId(android.R.id.content),
                        0
                    ),
                    7
                ),
                isDisplayed()
            )
        )
        materialButton20.perform(click())

        val materialButton21 = onView(
            allOf(
                withId(R.id.btEqual), withText("="),
                childAtPosition(
                    childAtPosition(
                        withId(android.R.id.content),
                        0
                    ),
                    15
                ),
                isDisplayed()
            )
        )
        materialButton21.perform(click())
    }

    private fun childAtPosition(
        parentMatcher: Matcher<View>, position: Int
    ): Matcher<View> {

        return object : TypeSafeMatcher<View>() {
            override fun describeTo(description: Description) {
                description.appendText("Child at position $position in parent ")
                parentMatcher.describeTo(description)
            }

            public override fun matchesSafely(view: View): Boolean {
                val parent = view.parent
                return parent is ViewGroup && parentMatcher.matches(parent)
                        && view == parent.getChildAt(position)
            }
        }
    }
}
