package info.innovation_startup.traffic;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by tossaporn on 4/24/16 AD.
 */
public class Adapter extends BaseAdapter{

    //Explicit
    private Context context;
    private int[] iconInts;
    private String[] titleStrins, detailStrings;

    public Adapter(Context context, int[] iconInts, String[] titleStrins, String[] detailStrings) {
        this.context = context;
        this.iconInts = iconInts;
        this.titleStrins = titleStrins;
        this.detailStrings = detailStrings;
    }

    @Override
    public int getCount() {
        return iconInts.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup parent) {

        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.my_listview, parent, false);

        //Show text
        TextView titleTextView = (TextView) view.findViewById(R.id.textView);
        titleTextView.setText(titleStrins[i]);

        TextView detailTextView = (TextView) view.findViewById(R.id.textView2);
        detailTextView.setText(detailStrings[i]);

        //Show Image
        ImageView iconimageView = (ImageView) view.findViewById(R.id.imageView);
        iconimageView.setImageResource(iconInts[i]);



        return view;
    }
} //Main
