/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.dtstack.jlogstash.outputs;

import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * company: www.dtstack.com
 * author: toutian
 * create: 2019/5/29
 */
public interface IBaseOutput extends Cloneable {

    void prepare();

    void process(Map event);

    void release();


    AtomicInteger getAto();

    boolean isConsistency();

    boolean dealFailedMsg();

    void addFailedMsg(Object msg);

    void sendFailedMsg(Object msg);

}
