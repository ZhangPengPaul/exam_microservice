package com.baoluoge.exam.util.page;

/**
 * Created by PaulZhang on 2015/10/13.
 */
public interface PageContext<E> {
    public static final int DEFAULT_PAGE_SIZE = 20;

    public long getPageCount();

    public Page<E> getPage(int index);

    public int getPageSize();

    public long getTotal();
}
