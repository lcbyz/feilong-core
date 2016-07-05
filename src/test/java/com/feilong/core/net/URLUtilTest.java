/*
 * Copyright (C) 2008 feilong
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.feilong.core.net;

import java.net.URL;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The Class URLUtilTest.
 *
 * @author <a href="http://feitianbenyue.iteye.com/">feilong</a>
 * @since 1.4.0
 */
public class URLUtilTest{

    /** The Constant LOGGER. */
    private static final Logger LOGGER = LoggerFactory.getLogger(URLUtilTest.class);

    @Test
    public void testGetUnionUrl1(){
        LOGGER.debug(URLUtil.getUnionUrl(URLUtil.toURL("E:\\test"), "sanguo"));
    }

    /**
     * Test get union url2.
     */
    @Test
    public void testGetUnionUrl2(){
        URL url = URLUtil.toURL("http://www.exiaoshuo.com/jinyiyexing/");
        LOGGER.debug(URLUtil.getUnionUrl(url, "/jinyiyexing/1173348/"));
    }

    @Test
    public void testNewURL(){
        String spec = "C:\\Users\\feilong\\feilong\\train\\新员工\\warmReminder\\20160704141057.html";
        URL url = URLUtil.toURL(spec);
        LOGGER.debug("the param url:{}", url);
    }

}
