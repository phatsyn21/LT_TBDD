package trantienphat.appdocbao;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ListView lvdsBaoMoi = (ListView) findViewById(R.id.lvdsBaoMoi);
        ArrayList<BaoMoi> dsBaoMoi  = new ArrayList<BaoMoi>();
        dsBaoMoi.add(new BaoMoi("Vợ chồng Diệu Nhi - Anh Tú đúng chuẩn trai tài gái sắc", "5 phut truoc", R.drawable.anh1));
        dsBaoMoi.add(new BaoMoi("1 thời điểm vàng phụ nữ nên uống vitamin C ", "10 phut truoc", R.drawable.anh2));
        dsBaoMoi.add(new BaoMoi("Thế khó của Đông Nhi khi Diệu Nhi tiếp tục tổ chức lễ cưới ở Hà Nội ", "15 phut truoc", R.drawable.anh3));
        dsBaoMoi.add(new BaoMoi("Yêu nhau 7 năm nhưng từ 8 năm trước Anh Tú đã tuyên bố.. ", "5 phut truoc", R.drawable.anh4));
        dsBaoMoi.add(new BaoMoi("Sao Việt ứng xử khi đám cưới Diệu Nhi - Liêu Hà Trinh trùng ngày, vợ chồng Trường Giang tinh tế", "5 phut truoc", R.drawable.anh5));
        dsBaoMoi.add(new BaoMoi("Dàn sao Việt xô nhau xuống hồ bơi ở đám cưới Diệu Nhi ", "7 phut truoc", R.drawable.anh6));

        BaoMoiAdapter adapter = new  BaoMoiAdapter(this, dsBaoMoi);
        lvdsBaoMoi.setAdapter(adapter);

        lvdsBaoMoi.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                BaoMoi BaoMoichon = dsBaoMoi.get(i);
                Toast.makeText(MainActivity.this, BaoMoichon.getTieuDe(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}