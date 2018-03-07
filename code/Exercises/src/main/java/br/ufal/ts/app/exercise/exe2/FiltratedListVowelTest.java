package br.ufal.ts.app.exercise.exe2;

import org.junit.Test;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;


public class FiltratedListVowelTest {


    @Test
    public void get() throws IOException {
        FiltratedListVowel filtrated = new FiltratedListVowel();
        List<String> list = Arrays.asList("alpha", "bravo", "charlie", "delta", "echo", "foxtrot");
        List<String> expected = Arrays.asList("alpha", "echo");
        assertEquals(expected, filtrated.get(list));
    }
}
