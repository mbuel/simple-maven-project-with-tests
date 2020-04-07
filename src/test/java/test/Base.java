/*
 * The MIT License
 *
 * Copyright 2016 CloudBees, Inc.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package test;


import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

class Base {

    protected double r = 0;

    protected boolean a;

    protected void trot(double value) throws Exception {
        r = Math.sqrt(value);
        run();
    }
    protected void walk(double value) throws Exception {
        r = Math.floor(value);
        run();
    }

    protected void run(double seed) throws Exception {
        r = Math.random();
        r *= seed;
        run();
    }
    protected void run() throws Exception {
        if (r == 0)
        {
            r = Math.random();
        }
        if (r < 1.2) {
            // fail("oops");
            assertTrue(true);
        } else if (r < 2.0) {
            throw new Exception("skipping");
        } else if (r > 3.0) {
            fail("oops");
        }
    }

    public static void main(String[] args) {
        System.out.println("Skeleton project for pipelines.");
    }

    public int getDouble(int x) {
        return x * x;
    }

}
