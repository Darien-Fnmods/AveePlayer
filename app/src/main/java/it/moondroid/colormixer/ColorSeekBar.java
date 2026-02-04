/*
 * Copyright 2026 Avee Player. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package it.moondroid.colormixer;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.SeekBar;

/**
 * Created by marco.granatiero on 05/08/2014.
 */
public abstract class ColorSeekBar extends SeekBar {

    protected HSLColor mHSL = new HSLColor(0.0f, 100.0f, 50.0f); //Default color

    public ColorSeekBar(Context context) {
        super(context);
    }

    public ColorSeekBar(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ColorSeekBar(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    public abstract float getHue();
    public abstract float getSaturation();
    public abstract float getLightness();

    public abstract void initWithColor(int color);

    public abstract void setColor(int color);

    public abstract void setColor(HSLColor color);

    public abstract int getColor();
}
