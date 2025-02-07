// https://www.codewars.com/kata/515bb423de843ea99400000a/train/java

package kyu_5.paginationhelper.java;

import java.util.List;

public class PaginationHelper<I> {
    private final int itemsSize;
    private final int itemsPerPage;
    private final int pagesCount;

    public PaginationHelper(final int itemsSize, final int itemsPerPage) {
        this.itemsSize = itemsSize;
        this.itemsPerPage = itemsPerPage;
        this.pagesCount = (int) Math.ceil(itemsSize / (double) itemsPerPage);
    }

    public PaginationHelper(final List<I> items, final int itemsPerPage) {
        this(items.size(), itemsPerPage);
    }


    public int itemCount() {
        return itemsSize;
    }

    public int pageCount() {
        return pagesCount;
    }

    public int pageItemCount(final int pageIndex) {
        final int lastPageIndex = pagesCount - 1;
        if (pageIndex < 0 || pageIndex > lastPageIndex) {
            return -1;
        } else if (pageIndex < lastPageIndex) {
            return itemsPerPage;
        } else {
            return itemsSize - itemsPerPage * lastPageIndex;
        }
    }

    public int pageIndex(final int itemIndex) {
        if (itemIndex < 0 || itemIndex >= itemsSize) {
            return -1;
        }
        return itemIndex / itemsPerPage;
    }
}
