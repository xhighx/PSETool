/*
 * Copyright 2012 Roman Nurik
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package model;

import java.util.ArrayList;

import view.WindowDimensionFragment;
import android.support.v4.app.Fragment;
import android.text.TextUtils;

/**
 * A page asking for a name and an email.
 */
public class WindowDimensionPage extends Page {
    public static final String WINDOW_WIDTH_DATA_KEY = "width";
    public static final String WINDOW_HEIGHT_DATA_KEY = "height";

    public WindowDimensionPage(ModelCallbacks callbacks, String title) {
        super(callbacks, title);
    }

    @Override
    public Fragment createFragment() {
        return WindowDimensionFragment.create(getKey());
    }

    @Override
    public void getReviewItems(ArrayList<ReviewItem> dest) {
        dest.add(new ReviewItem("Window Width", mData.getString(WINDOW_WIDTH_DATA_KEY), getKey()));
        dest.add(new ReviewItem("Window Height", mData.getString(WINDOW_HEIGHT_DATA_KEY), getKey()));
    }

    @Override
    public boolean isCompleted() {
    	if(!TextUtils.isEmpty(mData.getString(WINDOW_WIDTH_DATA_KEY)) && !TextUtils.isEmpty(mData.getString(WINDOW_HEIGHT_DATA_KEY)) ){
    		return true;
    	}else{
    		return false;
    	}
    }
}
