package pilou.youtubepl;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

//import com.android.volley.Response;

/**
 * Created by Xkebre on 26/02/2016.
 */

public class ItemAdapterList extends ArrayAdapter<YouTubeItem[]>
{

    public ItemAdapterList(Context context, ArrayList<YouTubeItem[]> contrat)
    {
        super(context, 0, (List<YouTubeItem[]>) contrat);
    }

    static class ViewHolder
    {
        public TextView TitleName;
        public TextView DescriptionName;
    }

    @Override
    public View getView(int position, View view , ViewGroup parent)
    {
        YouTubeItem[] youtubeItems = getItem(position);

        ViewHolder viewHolder;

        if(view == null)
        {
            view = LayoutInflater.from(getContext()).inflate(R.layout.youtube_layout, parent, false);

            viewHolder = new ViewHolder();
            viewHolder.TitleName = (TextView) view.findViewById(R.id.YouTubeItem);
            viewHolder.DescriptionName = (TextView) view.findViewById(R.id.DescriptionItem);
            view.setTag(viewHolder); //get position
        }
        else
        {
            viewHolder = (ViewHolder) view.getTag(); //No needed
        }


        viewHolder.TitleName.setText(youtubeItems[position].getTitle());
        viewHolder.DescriptionName.setText(youtubeItems[position].getDescription());

        return view;
    }
}
