package utils;

import java.util.List;

import static java.nio.file.DirectoryStream.Filter;


public class FilterPosition implements Filter {
    int start;
    int end;
    List<String> list;

    public FilterPosition(List<String> list) {
        this.list = list;
    }

    @Override
    public boolean accept(Object entry) {
        String str = (String) entry;
        return list.indexOf(str) >= start && list.indexOf(str) <= end;
    }

    public FilterPosition setPosition(int start, int end) {
        this.start = start;
        this.end = end;
        return this;
    }
}
