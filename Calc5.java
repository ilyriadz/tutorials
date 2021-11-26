/*
 * Copyright 2021 ilyriadz.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package ilyriadz.tutorials;

// Calc5.java

import java.util.Scanner;

// method with unspecified number of arguments

/**
 *
 * @author ilyriadz
 */
public class Calc5
{
    public static int sum(int... args)
    {
        int sum = 0;
        
        for (int i = 0; i < args.length; i++) 
        {
            sum += args[i];
        } // end for
        
        return sum;
    }
    public static void main(String[] args)
    {
        System.out.printf("sum() return %d%n", sum());
        System.out.printf("sum(%d) return %d%n", 5, sum(5));
        System.out.printf("sum(%d, %d) return %d%n", 6, 13, sum(6, 13));
        System.out.printf(
            "sum(%d, %d, %d, %d) return %d%n", 1, 3, 5, 7, sum(1, 3, 5, 7));
        System.out.printf(
            "sum(%d, %d, %d, %d, %d) return %d%n", 
                2, 4, 6, 8, 10, sum(2, 4, 6, 8, 10));
        
        int arrayOfInts[] = {1, 11, 22, 33, 44, 55, 66, 77, 88, 99};
        System.out.printf("sum(arrayOfInts) return %d%n", sum(arrayOfInts));
    }
}
