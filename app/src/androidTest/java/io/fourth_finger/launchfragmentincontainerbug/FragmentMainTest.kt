package io.fourth_finger.launchfragmentincontainerbug

import androidx.fragment.app.testing.launchFragmentInContainer
import androidx.test.espresso.Espresso
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.withId
import org.junit.Test

class FragmentMainTest {

    @Test
    fun fragmentMain_hasViewWithCorrectId() {
        launchFragmentInContainer<FragmentMain>()
        Espresso.onView(withId(R.id.fragment_main))
            .check(ViewAssertions.matches(ViewMatchers.isCompletelyDisplayed()))
    }

}