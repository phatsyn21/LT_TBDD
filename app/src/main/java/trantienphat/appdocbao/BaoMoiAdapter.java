package trantienphat.appdocbao;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class BaoMoiAdapter extends BaseAdapter {
    private ArrayList<BaoMoi> dsBaoMoi;
    private LayoutInflater layoutInflater;
    private Context context;

    public BaoMoiAdapter(Context _context, ArrayList<BaoMoi> dsBaoMoi){
        this.dsBaoMoi = dsBaoMoi;
        this.context =context;
        this.layoutInflater = LayoutInflater.from(_context);

    }

    @Override
    public int getCount() {
        return dsBaoMoi.size();
    }

    @Override
    public Object getItem(int i) {
        return dsBaoMoi.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View viewHienHanh = view;
        if (viewHienHanh == null)
            viewHienHanh = layoutInflater.inflate(R.layout.item_baomoi,null);
        BaoMoi baonoihientai = dsBaoMoi.get(i);
        TextView textView_TieuDe =(TextView) viewHienHanh.findViewById(R.id.tvBaoMoi);
        TextView textView_time = (TextView)  viewHienHanh.findViewById(R.id.tvmota);
        ImageView imageView_anh =(ImageView) viewHienHanh.findViewById(R.id.idAnhMinhHoa);

        textView_TieuDe.setText(baonoihientai.getTieuDe());
        textView_time.setText(baonoihientai.getTime());
        imageView_anh.setImageResource(baonoihientai.getIdAnhMinhHoa());
        return viewHienHanh;
    }
}
