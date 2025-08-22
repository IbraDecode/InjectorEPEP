package Floating.Style.Ios;

import android.animation.*;
import android.app.*;
import android.content.*;
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
import android.view.View;
import android.view.View.*;
import android.view.animation.*;
import android.webkit.*;
import android.widget.*;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
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

public class DiscordActivity extends AppCompatActivity {
	
	private RelativeLayout linear7;
	private LinearLayout linear8;
	private LinearLayout linear1;
	private LinearLayout linear6;
	private ImageView imageview1;
	private LinearLayout principal_login;
	private LinearLayout linear5;
	private LinearLayout linear12;
	private LinearLayout l1;
	private LinearLayout login;
	private LinearLayout linear13;
	private TextView textview5;
	private ImageView imageview2;
	private TextView textview7;
	private TextView textview8;
	
	private Intent tela = new Intent();
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.discord);
		initialize(_savedInstanceState);
		FirebaseApp.initializeApp(this);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		linear7 = findViewById(R.id.linear7);
		linear8 = findViewById(R.id.linear8);
		linear1 = findViewById(R.id.linear1);
		linear6 = findViewById(R.id.linear6);
		imageview1 = findViewById(R.id.imageview1);
		principal_login = findViewById(R.id.principal_login);
		linear5 = findViewById(R.id.linear5);
		linear12 = findViewById(R.id.linear12);
		l1 = findViewById(R.id.l1);
		login = findViewById(R.id.login);
		linear13 = findViewById(R.id.linear13);
		textview5 = findViewById(R.id.textview5);
		imageview2 = findViewById(R.id.imageview2);
		textview7 = findViewById(R.id.textview7);
		textview8 = findViewById(R.id.textview8);
		
		login.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				tela.setData(Uri.parse("https://discord.gg/NFcSD2nV"));
				startActivity(tela);
			}
		});
		
		linear13.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				tela.setAction(Intent.ACTION_MAIN);
				tela.setClass(getApplicationContext(), MainActivity.class);
				startActivity(tela);
			}
		});
		
		imageview2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
	}
	
	private void initializeLogic() {
		AnimatedParticleView particleView = new AnimatedParticleView(DiscordActivity.this);
		particleView.setParticleColor(0xFFAA00FF);
		particleView.setLineColor(Color.TRANSPARENT);
		particleView.setBackgroundColor(0xFF101010);
		particleView.setparticleCount(80);
		
		// layout এর মধ্যে যোগ করুন
		//import androidX.Master12.AnimatedParticleView;
		linear8.addView(particleView);
		principal_login.setBackground(new android.graphics.drawable.GradientDrawable() { public android.graphics.drawable.GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)20, 0xFF050505));
		login.setBackground(new android.graphics.drawable.GradientDrawable() { public android.graphics.drawable.GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)20, 0xFFAA00FF));
		linear13.setBackground(new android.graphics.drawable.GradientDrawable() { public android.graphics.drawable.GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)20, 0xFFAA00FF));
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