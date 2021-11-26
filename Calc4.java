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

import java.util.Scanner;

// Calc4.java
// method with more than one argument

/**
 *
 * @author ilyriadz
 */
public class Calc4 
{
    public static int sum(int a, int b)
    {
        return a + b;
    }
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        
        int sum = sum(a, b);
        
        System.out.printf("%d + %d = %d%n", a, b , sum);
    }
}
