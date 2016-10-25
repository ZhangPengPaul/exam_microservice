package com.baoluoge.exam.util.page;

import java.util.List;

/**
 * Created by PaulZhang on 2015/10/13.
 */
public class PageUtil {
    private PageUtil() {

    }

    public static int getPageStart(int pn, int size) {
        return (pn - 1) * size;
    }

    public static int getPageStart(int total, int pn, int size) {
        int start = (pn - 1) * size;
        if (start >= total) {
            start = 0;
        }

        return start;
    }

    public static <E> Page<E> getPage(long total, int pn, List<E> items, int size) {
        PageContext<E> pageContext = new QuickPageContext<>(items, total, size);
        return pageContext.getPage(pn);
    }
}
