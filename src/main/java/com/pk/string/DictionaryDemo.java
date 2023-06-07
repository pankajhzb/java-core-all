package com.pk.string;

public class DictionaryDemo {

    //to do for the word of type
    //goood,googd,
    //hypothetical matching in case gi - go or give
    //i/o- gove/give , check if match length
    //awt,console

    //Dictionary
    public static void main(String[] args) {
        String[] d = {"good", "god", "go", "got", "google", "give", "gase"};
        String s = "googs";
        int c = 0;
        String[] tempstr = new String[d.length];
        for (int i = 0; i < d.length; i++) {
            if (d[i] != null && d[i].contains(s)) {
                tempstr[c] = d[i];
                //System.out.println("sequence found in the word::"+tempstr[c]);
                c++;
            } else if (d[i] != null && d[i].contains(s.subSequence(0, s.length() - 1))) {
                tempstr[c] = d[i];
                //System.out.println("sequence found in the word::"+tempstr[c]);
                c++;
            }
        }
        //System.out.println("tempstr :"+tempstr.length);
        String str = getMinSizeWord(tempstr);
        System.out.println("correct word is:" + str);

    }

    public static String getMinSizeWord(String[] tempstr) {
        String minSizeWord = tempstr[0];
        for (int i = 0; i < tempstr.length; i++) {
            if (tempstr[i] != null)
                for (int j = i + 1; j < tempstr.length; j++) {
                    if (tempstr[j] != null)
                        if (minSizeWord.length() <= tempstr[j].length()) {
                            //System.out.println("min size word found is"+minSizeWord);
                            break;
                        } else
                            minSizeWord = tempstr[j];
                    //System.out.println("else min size word found is"+minSizeWord);
                }
            //
        }
        //System.out.println("min size word is:"+minSizeWord);
        return minSizeWord;

    }

}
