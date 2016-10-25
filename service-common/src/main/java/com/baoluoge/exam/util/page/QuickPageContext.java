package com.baoluoge.exam.util.page;

import java.util.List;

/**
 * Created by PaulZhang on 2015/10/13.
 */
public class QuickPageContext<E> implements PageContext {
    private List<E> items;
    private long totalCount;
    private int pageSize;

    public QuickPageContext(List<E> items, long totalCount, int pageSize) {
        if (items != null) {
            this.items = items;
        }
        this.totalCount = totalCount;
        this.pageSize = pageSize == 0 ? DEFAULT_PAGE_SIZE : pageSize;
    }

    @Override
    public long getPageCount() {
        long div = totalCount / pageSize;
        return (totalCount % pageSize == 0) ? div : div + 1;
    }

    @Override
    public Page<E> getPage(int index) {
        Page<E> page = new Page<>();
        page.setContext(this);
        int index2 = index > getPageCount() ? 1 : index;
        page.setHasNext(index2 < getPageCount());
        page.setHasPre(index2 > 1);
        page.setIndex(index2);
        page.setItems(items);
        return page;
    }

    @Override
    public int getPageSize() {
        return pageSize;
    }

    @Override
    public long getTotal() {
        return totalCount;
    }
}
