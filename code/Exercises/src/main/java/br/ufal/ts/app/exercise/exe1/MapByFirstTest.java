package br.ufal.ts.app.exercise.exe1;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;


public class MapByFirstTest {

    @Test
    public void get() {
        MapByFirst map = new MapByFirst(Arrays.asList("alpha", "bravo", "charlie", "delta", "echo", "foxtrot"));

        assertEquals("alpha", map.get('a'));
        assertEquals("bravo", map.get('b'));
    }

    @Test
    public void size() {
        MapByFirst map = new MapByFirst(Arrays.asList("alpha", "bravo", "charlie", "delta", "echo", "foxtrot"));

        assertEquals(6, map.size());
    }

    @Test
    public void getAll() {
        List<String> list = Arrays.asList("alpha", "bravo", "charlie", "delta", "echo", "foxtrot");
        MapByFirst map = new MapByFirst(list);

        assertEquals(list, map.getAll());
    }
}
