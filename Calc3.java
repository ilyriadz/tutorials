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

// Calc3.java
// simple program of overloading

/**
 *
 * @author ilyriadz
 */
public class Calc3 
{
    public static int square(int x)
    {
        System.out.println("square of int");
        return x * x;
    }
    
    public static float square(float x)
    {
        System.out.println("square of float");
        return x * x;
    }
    
    public static double square(double x)
    {
        System.out.println("square of double");
        return x * x;
    }
    
    public static void main(String[] args) 
    {
        System.out.printf("\tcall square(2) value is %d%n", square(2));
        System.out.printf("\tcall square(2.0f) value is %.2f%n", square(2.0f));
        System.out.printf("\tcall square(2.0) value is %.2f%n", square(2.0));
    }
}
