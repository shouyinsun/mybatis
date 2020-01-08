/*
 *    Copyright 2009-2012 the original author or authors.
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
package org.apache.ibatis.mapping;

import java.sql.ResultSet;

/**
 * @author Clinton Begin
 */

//结果集 类型
public enum ResultSetType {
  //1003 游标只能向下
  FORWARD_ONLY(ResultSet.TYPE_FORWARD_ONLY),
  //1004 游标可滚动,数据修改不敏感
  SCROLL_INSENSITIVE(ResultSet.TYPE_SCROLL_INSENSITIVE),
  //1005 游标可滚动,数据修改敏感
  SCROLL_SENSITIVE(ResultSet.TYPE_SCROLL_SENSITIVE);

  private int value;

  ResultSetType(int value) {
    this.value = value;
  }

  public int getValue() {
    return value;
  }
}
