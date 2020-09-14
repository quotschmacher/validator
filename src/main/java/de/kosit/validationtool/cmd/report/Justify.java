/*
 * Copyright 2017-present  Koordinierungsstelle für IT-Standards (KoSIT)
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

package de.kosit.validationtool.cmd.report;

import org.apache.commons.lang3.StringUtils;

/**
 * Justification modes for the text in grid columns.
 * 
 * @author Andreas Penski
 */
public enum Justify {

    LEFT {

        @java.lang.Override
        @Override
        public String apply(final String string, final int length) {
            return StringUtils.rightPad(string, length);
        }
    },
    CENTER {

        @java.lang.Override
        @Override
        public String apply(final String string, final int length) {
            return StringUtils.center(string, length);
        }
    },
    RIGHT {

        @java.lang.Override
        @Override
        public String apply(final String string, final int length) {
            return StringUtils.leftPad(string, length);
        }
    };

    public abstract String apply(String string, int length);
}
