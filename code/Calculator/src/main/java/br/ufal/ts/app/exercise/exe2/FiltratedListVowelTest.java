package br.ufal.ts.app.exercise.exe2;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;


public class FiltratedListVowelTest {


    @Test
    public void get() throws IOException {
        FiltratedListVowel filtrated = new FiltratedListVowel();
        List<String> list = Arrays.asList("alpha", "bravo", "charlie", "delta", "echo", "foxtrot");
        List<String> expected = Arrays.asList("alpha", "echo");
        assertEquals(expected, filtrated.get(list));
    }
}
