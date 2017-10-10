package come.wordpress.share2study.gridviewdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import java.util.List;

/**
 * Created by thela on 10/11/2017.
 */

public class ImageAdapter extends BaseAdapter {
    Context context;
    int layout;
    List<Images> listOfImage;

    public ImageAdapter(Context context, int layout, List<Images> listOfImage) {
        this.context = context;
        this.layout = layout;
        this.listOfImage = listOfImage;
    }

    @Override
    public int getCount() {
        return listOfImage.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    private class ViewHolder {
        ImageView imgViewImage;
    }

    @Override
    public View getView(int i, View view, ViewGroup parent) {
        ViewHolder viewHolder;
        if(view == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(layout, null);
            viewHolder = new ViewHolder();
            viewHolder.imgViewImage = view.findViewById(R.id.imgViewImage);
            view.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) view.getTag();
        }
        Images image = listOfImage.get(i);
        viewHolder.imgViewImage.setImageResource(image.getImage());
        return view;
    }
}
