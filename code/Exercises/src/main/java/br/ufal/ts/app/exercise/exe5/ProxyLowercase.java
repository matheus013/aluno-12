package br.ufal.ts.app.exercise.exe5;

public class ProxyLowercase implements br.ufal.ts.design.patterns.Proxy {


    @Override
    public Object format(Object object) {
        String str = (String) object;
        return str.toLowerCase();
    }
}
