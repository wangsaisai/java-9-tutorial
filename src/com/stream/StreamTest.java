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

package com.stream;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest {

  public static void main(String[] args) {

    Stream<Integer> stream = Stream.of(1,2,3,4,5,6,7,8,9);

    System.out.println("takewhile:");
    stream.takeWhile(x -> x < 5).forEach(x -> System.out.println(x));

    stream = Stream.of(1,2,3,4,5,6,7,8,9);
    System.out.println("\ndropWhile:");
    stream.dropWhile(x -> x < 5).forEach(x -> System.out.println(x));

    System.out.println("\nIntStream:");
    IntStream.iterate(2, x -> x < 100, x -> 2*x).forEach(System.out::println);

    Stream<Integer> integerStream = Stream.ofNullable(1);
    integerStream.forEach(System.out::println);

    Stream<Integer> integerStream2 = Stream.ofNullable(null);
    integerStream2.forEach(System.out::println);
  }

}
