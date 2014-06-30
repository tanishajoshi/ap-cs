/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.redbasin.lesson2;

/**
 * String in Java is immutable. Meaning, we cannot change it's contents.
 * The String s points to a location in memory called "Hello", when it is initialized to
 * "World", it points to a new location in memory called "Wprld".
 * The in-place modification of a String is not possible.
 *
 * @author redbasin
 */
public class StringImmutability {
    public static void main(String[] args) {
        String s = "Hello";
        s = "World";
    }
}
