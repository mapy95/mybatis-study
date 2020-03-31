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

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author 马鹏勇
 * @Date 2019/11/2 下午7:11
 */
@Mapper
public interface OperChannelMapper {

//    @Select("select * from operChannel where id = ?")
    List<OperChannel> selectAll(int id);

    OperChannel selectByIdAndName(OperChannel operChannel);

    String selectNameByIdAndName(String operChannelName);
}
