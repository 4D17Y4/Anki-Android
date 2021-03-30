/*
 *  Copyright (c) 2021 Aditya Srivastav <iamaditya2009@gmail.com>
 *
 *  This program is free software; you can redistribute it and/or modify it under
 *  the terms of the GNU General Public License as published by the Free Software
 *  Foundation; either version 3 of the License, or (at your option) any later
 *  version.
 *
 *  This program is distributed in the hope that it will be useful, but WITHOUT ANY
 *  WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A
 *  PARTICULAR PURPOSE. See the GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License along with
 *  this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.ichi2.utils;

import org.hamcrest.Matchers;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;

public class CollectionUtilsTest {

    List<Integer> testList = new ArrayList<Integer>(){{
        add(1);
        add(2);
        add(3);
    }};

    @Test
    public void testGetLastListElement(){
        assertThat(CollectionUtils.getLastListElement(testList), Matchers.is(3));
    }

    @Test
    public void testAddAll(){
        List<Integer> toTest=new ArrayList<>();
        CollectionUtils.addAll(toTest,testList);
        assertThat("List should be same",toTest.equals(testList));
    }
}
