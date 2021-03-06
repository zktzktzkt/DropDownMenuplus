package com.demo.filter.typeview.grid_holder;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.demo.R;
import com.demo.filter.util.DpUtils;
import com.demo.filter.view.FilterCheckedTextView;

/**
 *
 */
public class MultiItemHolder extends RecyclerView.ViewHolder {

    public FilterCheckedTextView textView;

    public MultiItemHolder(Context mContext, ViewGroup parent) {
        super(DpUtils.infalte(mContext, R.layout.holder_item, parent));
    }

    /**
     * tag标记的字段规则：eg:"obj_s"
     *
     * @param s
     * @param tag
     */
    public void bind(String s, Object tag) {
        textView = (FilterCheckedTextView) itemView.findViewById(R.id.tv_item);
        ((FilterCheckedTextView) textView).setText(s);
        ((FilterCheckedTextView) textView).setTag(tag);
    }
}
