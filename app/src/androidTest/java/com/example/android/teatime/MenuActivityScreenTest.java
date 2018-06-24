/*
* Copyright (C) 2017 The Android Open Source Project
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*  	http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/

package com.example.android.teatime;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import com.example.android.teatime.model.Tea;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onData;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.core.deps.guava.base.Predicates.instanceOf;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.anything;
import static org.hamcrest.Matchers.instanceOf;
import static org.hamcrest.Matchers.is;


/**
 * This test demos a user clicking on a GridView item in MenuActivity which opens up the
 * corresponding OrderActivity.
 *
 * This test does not utilize Idling Resources yet. If idling is set in the MenuActivity,
 * then this test will fail. See the IdlingResourcesTest for an identical test that
 * takes into account Idling Resources.
 */

// TODO (1) Add annotation to specify AndroidJUnitRunner class as the default test runner
@RunWith(AndroidJUnit4.class)
public class MenuActivityScreenTest {
// adapted from https://medium.com/google-developers/adapterviews-and-espresso-f4172aa853cf
    public static Matcher withName(final Matcher nameMatcher) {
        return new TypeSafeMatcher<Tea>() {
            @Override
            public boolean matchesSafely(Tea tea) {
                return nameMatcher.matches(tea.getTeaName());
            }

            @Override
            public void describeTo(Description description) {
            }
        };
    }

    // TODO (2) Add the rule that provides functional testing of a single activity
    @Rule
    public ActivityTestRule<MenuActivity> menuActivityMenuTestRule= new ActivityTestRule<>(MenuActivity.class);

    // TODO (3) Finish writing this test which will click on a gridView Tea item and verify that
    // the OrderActivity opens up with the correct tea name displayed.
    @Test
    public void clickGridViewItem_OpensOrderActivity() {
       // onView(withId(R.id.tea_grid_view)).perform(click());
      //  onData(allOf(is(instanceOf(String.class),("Black Tea")))).perform(click());
     //   onData(withId(R.id.tea_grid_view)).inAdapterView(withName(is("Black Tea"))).perform(click());
        // onData(is(instanceOf(MenuActivity.class))).inAdapterView(withId(R.id.grid_item_layout)).atPosition(0).perform(click());
       // onData(is(instanceOf(String.class))).inAdapterView(withId(R.id.grid_item_layout)).atPosition(0).perform(click());
        onData(anything()).inAdapterView(withId(R.id.tea_grid_view)).atPosition(0).perform(click());



        onView(withId(R.id.tea_name_text_view)).check(matches(withText("Black Tea")));


    }

}