package com.siit.strings;


import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Vector;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class StringManipulation {

    void checkAnagrams(String s1, String s2) {
        char[] s = s1.toCharArray();
        char[] s0 = new char[s.length];
        int j = 0;
        for (int i = s.length - 1; i >= 0; i--) {
            s0[j] = s[i];
            j++;
        }
        if (new String(s0).equals(s2)) {
            System.out.println("true");
        } else System.out.println("false");
    }

    void checkDigits(String s) {
        char[] c = s.toCharArray();
        int cont = 0;
        for (int i = 0; i < c.length; i++) {
            if (c[i] == '0' || c[i] == '1' || c[i] == '2' || c[i] == '3' || c[i] == '4' || c[i] == '5' || c[i] == '6' || c[i] == '7' || c[i] == '8' ||
                    c[i] == '9') {
                cont++;
            }
        }
        System.out.println(cont);
        if (cont == c.length) {
            System.out.println("String contains only digits");
        } else {
            System.out.println("String contains characters");
        }

    }

    void checkPalindrom(String s) {
        char[] s1 = s.toCharArray();
        String reverse = "";
        for (int i = 0; i < s1.length; i++) {
            reverse = s1[i] + reverse;
        }
        if (reverse.equals(s)) {
            System.out.println("Palindrom");
        } else {
            System.out.println("Nu este palindrom");
        }
    }

    int convertToInt(String s) {
        return Integer.valueOf(s);
    }

    int countOccurence(String s, char c) {
//        System.out.println("");
//        String s = scanner.next();
//        System.out.println("");
//        char c = scanner.next().toCharArray()[0];

        char[] c1 = s.toCharArray();
        int k = 0;
        for (int i = 0; i < c1.length; i++) {
            if (c1[i] == c) {
                k++;
            }
        }
        return k;
    }

    void countVowelsAndConsonants(String s) {
        char[] c = s.toCharArray();
        int vowels = 0;
        int consonants = 0;
        for (int i = 0; i < c.length; i++) {
            if (c[i] == 'a' || c[i] == 'e' || c[i] == 'i' || c[i] == 'o') {
                vowels++;
            } else if (c[i] != '0' && c[i] != '1' && c[i] != '2' && c[i] != '3' && c[i] != '4' && c[i] != '5' && c[i] != '6' && c[i] != '7' && c[i] != '8' &&
                    c[i] != '9') {
                consonants++;
            }
        }
        System.out.println("Vocale: " + vowels);
        System.out.println("Consoane: " + consonants);
    }

    Vector findLongestSubstring(String s) {
        String[] s1 = s.split("\\s");
        Arrays.sort(s1, Comparator.comparingInt(String::length).reversed());
        Vector v = new Vector();
        int cont = 0;
        for (int i = 0; i < s1.length; i++) {
            char[] c = s1[i].toCharArray();
            for (int j = 0; j < c.length; j++) {
                for (int k = j + 1; k < c.length; k++) {
                    if (c[j] == c[k]) {
                        cont++;
                        break;

                    }
                }
            }
            if (cont == 0) {
                v.add(s1[i]);
                cont = 0;
            }
        }

        return v;
    }

    String inverseWords(String s) {
        String[] s1 = s.split("\\s");
        String reverse = "";
        for (int i = 0; i < s1.length; i++) {
            if (i == s1.length - 1)
                reverse = s1[i] + reverse;
            else
                reverse = " " + s1[i] + reverse;
        }
        return reverse;
    }

    Vector printDuplicates(String s) {
        char[] s1 = s.toCharArray();
        Vector v = new Vector();
        for (int i = 0; i < s1.length - 1; i++) {
            for (int j = i + 1; j < s1.length; j++) {
                if (s1[i] == s1[j]) {
                    v.add(s1[j]);
                    break;
                }
            }
        }
        return v;
    }

    Vector printFirstNonRepeatedChar(String s) {
        char[] c = s.toCharArray();
        int[] v = new int[c.length];
        Vector v1 = new Vector();
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c.length; j++) {
                if (c[i] == c[j]) {
                    v[i] = v[i] + 1;
                }
            }
        }
        for (int i = 0; i < v.length; i++) {
            if (v[i] == 1) {
                v1.add(c[i]);
                break;
            }
        }
        return v1;

    }

    String printMostFrequentString(String s) {
        String[] s1 = s.split("\\s");
        int[] v = new int[s1.length];
        Vector v1 = new Vector();
        for (int i = 0; i < s1.length; i++) {
            for (int j = i + 1; j < s1.length; j++) {
                if (s1[i].equals(s1[j])) {
                    v[i]++;
                }
            }
        }
        for (int i = 0; i < v.length; i++) {
            v1.add(v[i]);
        }
        String frequent = "";
        Object object = Collections.max(v1);
        for (int i = 0; i < s1.length; i++) {
            if (v[i] == (int) object) {
                frequent += s1[i];
            }
        }

        return frequent;
    }

    String removeChar(String s, char c) {
        char[] s1 = s.toCharArray();
        String s2 = "";
        for (int i = 0; i < s1.length; i++) {
            if (s1[i] != c) {
                s2 += s1[i];
            }
        }
        return s2;
    }

    String reverseString(String s) {
        if (s == null) {
            return null;
        }
        char[] s1 = s.toCharArray();
        char[] s2 = new char[s1.length];
        int j = 0;
        for (int i = s1.length - 1; i >= 0; i--) {
            s2[j] = s1[i];
            j++;
        }
        return new String(s2);
    }


}
