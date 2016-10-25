package com.baoluoge.exam.util.page;

import java.util.List;

/**
 * Created by PaulZhang on 2015/10/13.
 */
public class Page<E> {
    private boolean hasPre;
    private boolean hasNext;
    private List<E> items;
    private int index;
    private PageContext<E> context;

    public boolean isHasPre() {
        return hasPre;
    }

    public void setHasPre(boolean hasPre) {
        this.hasPre = hasPre;
    }

    public boolean isHasNext() {
        return hasNext;
    }

    public void setHasNext(boolean hasNext) {
        this.hasNext = hasNext;
    }

    public List<E> getItems() {
        return items;
    }

    public void setItems(List<E> items) {
        this.items = items;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public PageContext<E> getContext() {
        return context;
    }

    public void setContext(PageContext<E> context) {
        this.context = context;
    }
}
