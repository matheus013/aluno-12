package br.ufal.ts.app.exercise.exe5;

import java.util.ArrayList;
import java.util.List;

public class LowercaseList {
    public List<String> get(List<String> list) {
        List<String> result = new ArrayList<>();
        ProxyLowercase proxyLowercase = new ProxyLowercase();
        list.stream().forEach((v) -> result.add((String) proxyLowercase.format(v)));
        return result;
    }
}
