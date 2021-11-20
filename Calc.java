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

// Calc.java

import java.util.Scanner;

// Simple program show how to declare and use methods

/**
 *
 * @author ilyriadz
 */
public class Calc 
{
    public int square(int x)
    {
        return x * x;
    }
    
    public static int staticSquare(int x)
    {
        return x * x;
    }
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int x = sc.nextInt();
        
        Calc calc = new Calc();
        System.out.printf("call calc.square(%d), result is %d%n", x, calc.square(x));
        System.out.printf("call Calc.staticSquare(%d), result is %d%n", x, Calc.staticSquare(x));
        System.out.printf("call staticSquare(%d), result is %d%n", x, staticSquare(x));
    }
}
