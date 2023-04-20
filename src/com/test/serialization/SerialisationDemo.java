package com.test.serialization;

import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URISyntaxException;

public class SerialisationDemo {

    public static void main(String[] args) {
        // test here class serialised
        // and how can we desirialised the serialised object
        //during file handling or network found objects

        A aobj = new A();
        try {
            File f = new File(new URI("ABC.txt"));
            //f.
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        InputStream is;
        InputStreamReader isr = new InputStreamReader(null);
    }

}
