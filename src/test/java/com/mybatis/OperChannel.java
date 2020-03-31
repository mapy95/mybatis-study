/**
 *    Copyright 2009-2020 the original author or authors.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package com.mybatis;

import java.io.Serializable;

/**
 * @Author 马鹏勇
 * @Date 2019/11/2 下午7:00
 */
public class OperChannel implements Serializable {
    private int id;
    private String operChannelId;
    private String operChannelName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOperChannelId() {
        return operChannelId;
    }

    public void setOperChannelId(String operChannelId) {
        this.operChannelId = operChannelId;
    }

    public String getOperChannelName() {
        return operChannelName;
    }

    public void setOperChannelName(String operChannelName) {
        this.operChannelName = operChannelName;
    }
}
