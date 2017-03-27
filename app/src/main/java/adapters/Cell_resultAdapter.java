package adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

import fr.esilv.s8.td6_rouaultdecoligny.R;
import models.Cell_result;

/**
 * Created by auriane on 22/03/2017.

*/



public class Cell_resultAdapter extends BaseAdapter{

    private List<Cell_result.ItemsBean> vids;
    private Context con;
    private LayoutInflater inflater;

    public Cell_resultAdapter(Context con, List<Cell_result.ItemsBean> vids)
    {
        this.vids = vids;
        this.con = con;
    }


    @Override
    public int getCount() {
        return vids.size();
    }

    @Override
    public Object getItem(int position) {
        return vids.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) con.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View vView = inflater.inflate(R.layout.vlist, parent, false);

        Cell_result.ItemsBean vitem = (Cell_result.ItemsBean) getItem(position);
        TextView title = (TextView) vView.findViewById(R.id.titre);
        TextView description = (TextView)vView.findViewById(R.id.description);

        ImageView thumbnail = (ImageView) vView.findViewById(R.id.image);
        String url = vitem.getSnippet().getThumbnails().getMedium().getUrl();
        Picasso.with(con).load(url).into(thumbnail);



        description.setText(vitem.getSnippet().getDescription());
        title.setText(vitem.getSnippet().getTitle());

        return vView;
    }
}



