package come.wordpress.share2study.gridviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    GridView gridView;
    List<Images> listOfImage;
    ImageAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        anhXa();
        adapter = new ImageAdapter(this, R.layout.images_line, listOfImage);
        gridView.setAdapter(adapter);


        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, ""+listOfImage.get(position).getName(), Toast.LENGTH_SHORT).show();
            }
        });
    }
    public void anhXa() {
        gridView = (GridView) findViewById(R.id.gvImages);
        listOfImage = new ArrayList<>();
        listOfImage.add(new Images("1",R.drawable.apple));
        listOfImage.add(new Images("2",R.drawable.cam));
        listOfImage.add(new Images("3",R.drawable.dau));
        listOfImage.add(new Images("4",R.drawable.dieu));
        listOfImage.add(new Images("5",R.drawable.dua));
        listOfImage.add(new Images("6",R.drawable.duahau));
        listOfImage.add(new Images("7",R.drawable.dudu));
        listOfImage.add(new Images("8",R.drawable.nho));
        listOfImage.add(new Images("9",R.drawable.tao));
    }
}
