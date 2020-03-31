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

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @Author 马鹏勇
 * @Date 2020/1/15 上午8:56
 */
public class TestMybatis {
    public static void main(String[] args) throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
//        List<OperChannel> list = sqlSession.selectList("com.springsource.study.mybatis.OperChannelMapper.selectAll");
//        OperChannel operChannel = sqlSession.selectOne("com.springsource.study.mybatis.OperChannelMapper.selectAll",1);
//        System.out.println(operChannel.toString());

        System.out.println("+++++++++++++++++");
        OperChannelMapper operChannelMapper = sqlSession.getMapper(OperChannelMapper.class);
        System.out.println(operChannelMapper.selectAll(1));
        sqlSession.commit();
        System.out.println(operChannelMapper.selectAll(1));

        System.out.println("=======================");
        OperChannel operChannel = new OperChannel();
//        operChannel.setOperChannelId("123");
        operChannel.setOperChannelName("sdasdas");
        OperChannel result = operChannelMapper.selectByIdAndName(operChannel);
        System.out.println(result);


        System.out.println(operChannelMapper.selectNameByIdAndName("河南qq22"));
    }
}
