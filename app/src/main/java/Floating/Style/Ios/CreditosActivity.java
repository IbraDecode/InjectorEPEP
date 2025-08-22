package Floating.Style.Ios;

import android.animation.*;
import android.app.*;
import android.app.AlertDialog;
import android.content.*;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.*;
import android.graphics.*;
import android.graphics.drawable.*;
import android.media.*;
import android.net.*;
import android.net.Uri;
import android.os.*;
import android.os.Bundle;
import android.text.*;
import android.text.style.*;
import android.util.*;
import android.view.*;
import android.view.View.*;
import android.view.animation.*;
import android.webkit.*;
import android.widget.*;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.*;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.AndroidSketchwareMaster.*;
import com.cyberalpha.darkIOS.*;
import com.google.android.material.color.MaterialColors;
import com.google.firebase.FirebaseApp;
import ir.alirezabdn.wp7progress.*;
import java.io.*;
import java.io.InputStream;
import java.text.*;
import java.util.*;
import java.util.regex.*;
import org.json.*;
import rikka.shizuku.aidl.*;
import rikka.shizuku.api.*;
import rikka.shizuku.provider.*;
import androidX.Master12.AnimatedParticleView;


public class CreditosActivity extends AppCompatActivity {
	
	private RelativeLayout linear7;
	private LinearLayout linear8;
	private LinearLayout linear1;
	private LinearLayout linear6;
	private LinearLayout linear5;
	private ImageView imageview1;
	
	private AlertDialog.Builder ios;
	private Intent telas = new Intent();
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.creditos);
		initialize(_savedInstanceState);
		FirebaseApp.initializeApp(this);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		linear7 = findViewById(R.id.linear7);
		linear8 = findViewById(R.id.linear8);
		linear1 = findViewById(R.id.linear1);
		linear6 = findViewById(R.id.linear6);
		linear5 = findViewById(R.id.linear5);
		imageview1 = findViewById(R.id.imageview1);
		ios = new AlertDialog.Builder(this);
	}
	
	private void initializeLogic() {
		iOSDarkBuilder ios = new iOSDarkBuilder(CreditosActivity.this);
		ios
		.setBoldPositiveLabel(true)
		.setTitle("Proyek gratis ini dibuat oleh: Ibra Decode")
		.setSubtitle("Tidak ada aturan untuk menggunakan proyek ini, Anda dapat memposting ulang, menjual kembali, menggunakan untuk pribadi atau untuk iklan!") 	
		.setCancelable(true)
		.setPositiveListener("LANJUTKAN",new iOSDarkClickListener() 
		{ 	 @Override 	 public void onClick(iOSDark dialog) { 		
				telas.setAction(Intent.ACTION_MAIN);
				telas.setClass(getApplicationContext(), DiscordActivity.class);
				startActivity(telas);
				dialog.dismiss(); 	 
			}
		})	
		.build().show();
		AnimatedParticleView particleView = new AnimatedParticleView(CreditosActivity.this);
		particleView.setParticleColor(0xFFAA00FF);
		particleView.setLineColor(Color.TRANSPARENT);
		particleView.setBackgroundColor(0xFF101010);
		particleView.setparticleCount(80);
		
		// layout এর মধ্যে যোগ করুন
		//import androidX.Master12.AnimatedParticleView;
		linear8.addView(particleView);
	}
	
	
	@Deprecated
	public void showMessage(String _s) {
		Toast.makeText(getApplicationContext(), _s, Toast.LENGTH_SHORT).show();
	}
	
	@Deprecated
	public int getLocationX(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[0];
	}
	
	@Deprecated
	public int getLocationY(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[1];
	}
	
	@Deprecated
	public int getRandom(int _min, int _max) {
		Random random = new Random();
		return random.nextInt(_max - _min + 1) + _min;
	}
	
	@Deprecated
	public ArrayList<Double> getCheckedItemPositionsToArray(ListView _list) {
		ArrayList<Double> _result = new ArrayList<Double>();
		SparseBooleanArray _arr = _list.getCheckedItemPositions();
		for (int _iIdx = 0; _iIdx < _arr.size(); _iIdx++) {
			if (_arr.valueAt(_iIdx))
			_result.add((double)_arr.keyAt(_iIdx));
		}
		return _result;
	}
	
	@Deprecated
	public float getDip(int _input) {
		return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, _input, getResources().getDisplayMetrics());
	}
	
	@Deprecated
	public int getDisplayWidthPixels() {
		return getResources().getDisplayMetrics().widthPixels;
	}
	
	@Deprecated
	public int getDisplayHeightPixels() {
		return getResources().getDisplayMetrics().heightPixels;
	}
}
