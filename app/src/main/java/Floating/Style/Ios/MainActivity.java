package Floating.Style.Ios;

import Floating.Style.Ios.FadeActivity;
import android.Manifest;
import android.animation.*;
import android.app.*;
import android.app.Activity;
import android.content.*;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
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
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.*;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
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
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.regex.*;
import org.json.*;
import rikka.shizuku.aidl.*;
import rikka.shizuku.api.*;
import rikka.shizuku.provider.*;
import rikka.shizuku.Shizuku;
import android.content.pm.PackageManager;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;

import androidX.Master12.AnimatedParticleView;

public class MainActivity extends AppCompatActivity {
	
	private double f1 = 0;
	private double f2 = 0;
	private double f3 = 0;
	private double f4 = 0;
	private double f5 = 0;
	private double f6 = 0;
	private double f7 = 0;
	private double f8 = 0;
	private double f9 = 0;
	private double f10 = 0;
	private double f11 = 0;
	private double f12 = 0;
	private double f13 = 0;
	private double f14 = 0;
	private double f15 = 0;
	private double f16 = 0;
	private double f17 = 0;
	private double f18 = 0;
	private boolean content = false;
	private double Position = 0;
	private double dispGet = 0;
	private double dispositivos = 0;
	private HashMap<String, Object> map_log = new HashMap<>();
	private String uid = "";
	private String assetFilename = "";
	private String assetSavePath = "";
	
	private ArrayList<HashMap<String, Object>> UserMap = new ArrayList<>();
	
	private RelativeLayout linear7;
	private LinearLayout linear8;
	private LinearLayout linear1;
	private LinearLayout linear6;
	private ImageView imageview1;
	private LinearLayout principal_login;
	private LinearLayout linear5;
	private LinearLayout linear12;
	private LinearLayout linear11;
	private LinearLayout l1;
	private LinearLayout l2;
	private LinearLayout login;
	private LinearLayout linear16;
	private TextView textview5;
	private TextView textview6;
	private LinearLayout linear19;
	private EditText Usuario;
	private LinearLayout linear27;
	private EditText Senha;
	private TextView textview7;
	private TextView textview8;
	
	private SharedPreferences Time;
	private SharedPreferences Data;
	private SharedPreferences permissao_concedida;
	private Calendar time = Calendar.getInstance();
	private Intent buy = new Intent();
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.main);
		initialize(_savedInstanceState);
		FirebaseApp.initializeApp(this);
		
		if (ContextCompat.checkSelfPermission(this, Manifest.permission.READ_EXTERNAL_STORAGE) == PackageManager.PERMISSION_DENIED
		|| ContextCompat.checkSelfPermission(this, Manifest.permission.WRITE_EXTERNAL_STORAGE) == PackageManager.PERMISSION_DENIED) {
			ActivityCompat.requestPermissions(this, new String[] {Manifest.permission.READ_EXTERNAL_STORAGE, Manifest.permission.WRITE_EXTERNAL_STORAGE}, 1000);
		} else {
			initializeLogic();
		}
	}
	
	@Override
	public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
		super.onRequestPermissionsResult(requestCode, permissions, grantResults);
		if (requestCode == 1000) {
			initializeLogic();
		}
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
		linear11 = findViewById(R.id.linear11);
		l1 = findViewById(R.id.l1);
		l2 = findViewById(R.id.l2);
		login = findViewById(R.id.login);
		linear16 = findViewById(R.id.linear16);
		textview5 = findViewById(R.id.textview5);
		textview6 = findViewById(R.id.textview6);
		linear19 = findViewById(R.id.linear19);
		Usuario = findViewById(R.id.Usuario);
		linear27 = findViewById(R.id.linear27);
		Senha = findViewById(R.id.Senha);
		textview7 = findViewById(R.id.textview7);
		textview8 = findViewById(R.id.textview8);
		Time = getSharedPreferences("Time", Activity.MODE_PRIVATE);
		Data = getSharedPreferences("Data", Activity.MODE_PRIVATE);
		permissao_concedida = getSharedPreferences("permissao_concedida", Activity.MODE_PRIVATE);
		
		login.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (Usuario.getText().toString().equals("lucasv2")) {
					if (Senha.getText().toString().equals("regedit")) {
						buy.setAction(Intent.ACTION_MAIN);
						buy.setClass(getApplicationContext(), HomeActivity.class);
						startActivity(buy);
						SketchwareUtil.showMessage(getApplicationContext(), "Bem-Vindo");
					} else {
						SketchwareUtil.showMessage(getApplicationContext(), "Senha invalida");
					}
				} else {
					SketchwareUtil.showMessage(getApplicationContext(), "Usuário não existe!");
				}
			}
		});
		
		textview8.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				buy.setData(Uri.parse("https://discord.gg/NFcSD2nV"));
				startActivity(buy);
			}
		});
	}
	
	private void initializeLogic() {
		AnimatedParticleView particleView = new AnimatedParticleView(MainActivity.this);
		particleView.setParticleColor(0xFFAA00FF);
		particleView.setLineColor(Color.TRANSPARENT);
		particleView.setBackgroundColor(Color.TRANSPARENT);
		particleView.setparticleCount(80);
		
		// layout এর মধ্যে যোগ করুন
		//import androidX.Master12.AnimatedParticleView;
		linear8.addView(particleView);
		principal_login.setBackground(new android.graphics.drawable.GradientDrawable() { public android.graphics.drawable.GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)20, 0xFF050505));
		login.setBackground(new android.graphics.drawable.GradientDrawable() { public android.graphics.drawable.GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)20, 0xFFAA00FF));
		linear19.setBackground(new android.graphics.drawable.GradientDrawable() { public android.graphics.drawable.GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)20, 0xFF222324));
		linear27.setBackground(new android.graphics.drawable.GradientDrawable() { public android.graphics.drawable.GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)20, 0xFF222324));
	}
	
	public void _CopyFromAssets(final String _filen, final String _topathh, final String _sucm, final String _failm) {
		if (FileUtil.isDirectory(_topathh)) {
			FileUtil.writeFile("Dont remove", "its For storage Permission");
			assetFilename = _filen;
			assetSavePath = _topathh;
			try{
				int count;
				java.io.InputStream input= this.getAssets().open(assetFilename);
				java.io.OutputStream output = new  java.io.FileOutputStream(assetSavePath+"/"+assetFilename);
				byte data[] = new byte[1024];
				while ((count = input.read(data))>0) {
					output.write(data, 0, count);
				}
				output.flush();
				output.close();
				input.close();
				
				SketchwareUtil.showMessage(getApplicationContext(), _sucm);
			}catch(Exception e){
				
				SketchwareUtil.showMessage(getApplicationContext(), _failm);
			}
		} else {
			FileUtil.makeDir("/storage/emulated/0/");
		}
	}
	
	
	public void _permissão() {
		
		try {
			PackageManager packageManager = getPackageManager();
			PackageInfo packageInfo = packageManager.getPackageInfo("moe.shizuku.privileged.api", PackageManager.GET_ACTIVITIES);
			if (packageInfo != null) {
				
				SketchwareUtil.showMessage(getApplicationContext(), "Shizuku está instalado.");
				if (Shizuku.pingBinder()) {
					Shizuku.requestPermission(69);
				}
				else {
					SketchwareUtil.showMessage(getApplicationContext(), "Shizuku não está correndo...");
				}
			} else {
				
				SketchwareUtil.showMessage(getApplicationContext(), "Shizuku não está instalado.");
			}
		} catch (NameNotFoundException e) {
			
			SketchwareUtil.showMessage(getApplicationContext(), "Shizuku não está instalado.");
		}
		permissao_concedida.edit().putString("permissão", "salvo").commit();
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