package br.ufal.ts.app.exercise.exe5;

import java.util.ArrayList;
import java.util.List;

public class LowercaseList {
    public List<String> get(List<String> list) {
        List<String> result = new ArrayList<>();
        ProxyLowercase proxyLowercase = new ProxyLowercase();
        for (String str : list) {
            result.add((String) proxyLowercase.format(str));
        }
        return result;
    }
}
