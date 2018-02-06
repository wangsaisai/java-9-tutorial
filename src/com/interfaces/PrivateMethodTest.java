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

package com.interfaces;

public class PrivateMethodTest implements PrivateMethod {
  @Override
  public void abstraceMethod() {
    System.out.println("override the abstract method");
  }

  public static void main(String[] args) {
    PrivateMethodTest test = new PrivateMethodTest();
    System.out.println(value);
    System.out.println(PrivateMethod.value);
    System.out.println(PrivateMethodTest.value);
    System.out.println(test.value);

    test.abstraceMethod();
    test.defaultMethod();

    PrivateMethod.staticMethod();

//    Following is not allowed
//    test.privateMethod();
//    test.privateStaticMethod();
//    test.staticMethod();
//    PrivateMethodTest.staticMethod();
  }
}
