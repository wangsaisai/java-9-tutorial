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

interface PrivateMethod {

  String value = "this is a public static final variable";

  void abstraceMethod();

  default void defaultMethod() {
    privateMethod();
    privateStaticMethod();
    staticMethod();
    System.out.println("this is a default method");
  }

  private void privateMethod() {
    System.out.println("this is a private method, only used in this interface");
  }

  private static void privateStaticMethod() {
    System.out.println("this is a private static method, only used in this interface");
  }

  static void staticMethod() {
    System.out.println("this is a static method");
  }

}
