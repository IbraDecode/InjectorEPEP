package Floating.Style.Ios;

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
import java.util.*;
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


public class HomeActivity extends AppCompatActivity {
	
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
	private String assetFilename = "";
	private String assetSavePath = "";
	
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
	private LinearLayout op2;
	private TextView textview5;
	private TextView textview6;
	private LinearLayout op1;
	private TextView textview9;
	private TextView textview7;
	
	private SharedPreferences permissao_concedida;
	private Intent game = new Intent();
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.home);
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
		op2 = findViewById(R.id.op2);
		textview5 = findViewById(R.id.textview5);
		textview6 = findViewById(R.id.textview6);
		op1 = findViewById(R.id.op1);
		textview9 = findViewById(R.id.textview9);
		textview7 = findViewById(R.id.textview7);
		permissao_concedida = getSharedPreferences("permissao_concedida", Activity.MODE_PRIVATE);
		
		op2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_floating();
				_permissão();
				ScaleAnimation fade_in = new ScaleAnimation(0.9f, 1f, 0.9f, 1f, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.7f);
				fade_in.setDuration(300);
				fade_in.setFillAfter(true);
				op2.startAnimation(fade_in);
			}
		});
		
		op1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				game.setData(Uri.parse("com.dts.freefireth"));
				startActivity(game);
				ScaleAnimation fade_in = new ScaleAnimation(0.9f, 1f, 0.9f, 1f, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.7f);
				fade_in.setDuration(300);
				fade_in.setFillAfter(true);
				op1.startAnimation(fade_in);
			}
		});
	}
	
	private void initializeLogic() {
		AnimatedParticleView particleView = new AnimatedParticleView(HomeActivity.this);
		particleView.setParticleColor(0xFFAA00FF);
		particleView.setLineColor(Color.TRANSPARENT);
		particleView.setBackgroundColor(0xFF101010);
		particleView.setparticleCount(80);
		
		// layout এর মধ্যে যোগ করুন
		//import androidX.Master12.AnimatedParticleView;
		linear8.addView(particleView);
		principal_login.setBackground(new android.graphics.drawable.GradientDrawable() { public android.graphics.drawable.GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)20, 0xFF050505));
		op1.setBackground(new android.graphics.drawable.GradientDrawable() { public android.graphics.drawable.GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)20, 0xFFAA00FF));
		op2.setBackground(new android.graphics.drawable.GradientDrawable() { public android.graphics.drawable.GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)20, 0xFFAA00FF));
	}
	
	public void _floating() {
		if (!android.provider.Settings.canDrawOverlays(HomeActivity.this)){
			Intent intent = new Intent(android.provider.Settings.ACTION_MANAGE_OVERLAY_PERMISSION, Uri.parse("package:" + getPackageName()));
			startActivity(intent);
		}
		else{
			Intent startMain = new Intent(Intent.ACTION_MAIN); ///ByMTDS startMain.addCategory(Intent.CATEGORY_HOME); 
			
			int LAYOUT_FLAG;
			if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
				LAYOUT_FLAG = WindowManager.LayoutParams.TYPE_APPLICATION_OVERLAY;
			} else {
				//byMTDS 
				LAYOUT_FLAG = WindowManager.LayoutParams.TYPE_PHONE;
			}
			
			final WindowManager.LayoutParams params = new WindowManager.LayoutParams(
			WindowManager.LayoutParams.WRAP_CONTENT,
			WindowManager.LayoutParams.WRAP_CONTENT,
			LAYOUT_FLAG,
			
			WindowManager.LayoutParams.FLAG_NOT_TOUCH_MODAL | WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE
			, 
			
			PixelFormat.TRANSPARENT);
			
			final  WindowManager wm = (WindowManager) getSystemService(WINDOW_SERVICE);
			LayoutInflater inflater = (LayoutInflater) getSystemService(LAYOUT_INFLATER_SERVICE);
			//View myView = inflater.inflate(R.layout.floating, null);
			
			final View myView = (View) getLayoutInflater().inflate(R.layout.llucas7e7, null); 
			
			
			LinearLayout hold = (LinearLayout) myView.findViewById(R.id.menu);
			hold.setBackground(new android.graphics.drawable.GradientDrawable() { public android.graphics.drawable.GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)360, Color.TRANSPARENT));
			
			hold.setOnTouchListener(new OnTouchListener() {
				private int x;
				private int y;
				@Override
				public boolean onTouch(View v, MotionEvent event) {
					
					switch (event.getAction()) { 
						case MotionEvent.ACTION_DOWN: 
						x = (int) event.getRawX(); 
						y = (int) event.getRawY(); 
						break;
						
						case MotionEvent.ACTION_MOVE: int nowX = (int) event.getRawX(); 
						int nowY = (int) event.getRawY(); 
						int movedX = nowX - x; 
						int movedY = nowY - y; 
						x = nowX; y = nowY; 
						params.x = params.x + movedX; 
						params.y = params.y + movedY; wm.updateViewLayout(myView, params); 
						break; 
						default: 
						break; 
					}
					return false;
				}
			});
			
			//Specify the view position
			params.gravity = Gravity.TOP | Gravity.LEFT;        //Initially view will be added to top-left corner
			params.x = 0;
			params.y = 0;
			
			//todas as views aqui
			
			final LinearLayout icone = (LinearLayout) myView.findViewById(R.id.icone);
			final LinearLayout principal = (LinearLayout) myView.findViewById(R.id.principal);
			
			final LinearLayout select_aim = (LinearLayout) myView.findViewById(R.id.select_aim);
			
			final LinearLayout select_visuals = (LinearLayout) myView.findViewById(R.id.select_visuals);
			
			final LinearLayout select_misc = (LinearLayout) myView.findViewById(R.id.select_misc);
			
			final LinearLayout select_settings = (LinearLayout) myView.findViewById(R.id.select_settings);
			
			final LinearLayout aim = (LinearLayout) myView.findViewById(R.id.aim);
			
			final LinearLayout visuals = (LinearLayout) myView.findViewById(R.id.visuals);
			
			final LinearLayout misc = (LinearLayout) myView.findViewById(R.id.misc);
			
			final LinearLayout settings = (LinearLayout) myView.findViewById(R.id.settings);
			
			final LinearLayout cor1 = (LinearLayout) myView.findViewById(R.id.cor1);
			
			final LinearLayout cor2 = (LinearLayout) myView.findViewById(R.id.cor2);
			
			final LinearLayout cor3 = (LinearLayout) myView.findViewById(R.id.cor3);
			
			final LinearLayout cor4 = (LinearLayout) myView.findViewById(R.id.cor4);
			
			final LinearLayout desing_aim = (LinearLayout) myView.findViewById(R.id.desing_aim);
			
			final LinearLayout desing_visuals = (LinearLayout) myView.findViewById(R.id.desing_visuals);
			
			final LinearLayout desing_misc = (LinearLayout) myView.findViewById(R.id.desing_misc);
			
			final LinearLayout desing_settings = (LinearLayout) myView.findViewById(R.id.desing_settings);
			
			final LinearLayout target1 = (LinearLayout) myView.findViewById(R.id.target1);
			
			final LinearLayout target2 = (LinearLayout) myView.findViewById(R.id.target2);
			
			final LinearLayout ss1 = (LinearLayout) myView.findViewById(R.id.ss1);
			
			final LinearLayout ss2 = (LinearLayout) myView.findViewById(R.id.ss2);
			
			final LinearLayout ss3 = (LinearLayout) myView.findViewById(R.id.ss3);
			
			final LinearLayout ss4 = (LinearLayout) myView.findViewById(R.id.ss4);
			
			final ScrollView scroll_aim = (ScrollView) myView.findViewById(R.id.scroll_aim);
			
			final ScrollView scroll_visuals = (ScrollView) myView.findViewById(R.id.scroll_visuals);
			
			final LinearLayout t1 = (LinearLayout) myView.findViewById(R.id.t1);
			
			final LinearLayout t2 = (LinearLayout) myView.findViewById(R.id.t2);
			
			final LinearLayout t3 = (LinearLayout) myView.findViewById(R.id.t3);
			
			final LinearLayout t4 = (LinearLayout) myView.findViewById(R.id.t4);
			
			final LinearLayout t5 = (LinearLayout) myView.findViewById(R.id.t5);
			
			final SeekBar s1 = (SeekBar) myView.findViewById(R.id.s1);
			
			final SeekBar s2 = (SeekBar) myView.findViewById(R.id.s2);
			
			final SeekBar s3 = (SeekBar) myView.findViewById(R.id.s3);
			
			final SeekBar s4 = (SeekBar) myView.findViewById(R.id.s4);
			
			final TextView a1 = (TextView) myView.findViewById(R.id.a1);
			
			final TextView a2 = (TextView) myView.findViewById(R.id.a2);
			
			final TextView a3 = (TextView) myView.findViewById(R.id.a3);
			
			final TextView a4 = (TextView) myView.findViewById(R.id.a4);
			
			final ImageView op1 = (ImageView) myView.findViewById(R.id.op1);
			
			final ImageView op2 = (ImageView) myView.findViewById(R.id.op2);
			
			final ImageView op3 = (ImageView) myView.findViewById(R.id.op3);
			
			final ImageView op4 = (ImageView) myView.findViewById(R.id.op4);
			
			final ImageView op5 = (ImageView) myView.findViewById(R.id.op5);
			
			final ImageView op6 = (ImageView) myView.findViewById(R.id.op6);
			
			final ImageView op7 = (ImageView) myView.findViewById(R.id.op7);
			
			final ImageView op8 = (ImageView) myView.findViewById(R.id.op8);
			
			final ImageView op9 = (ImageView) myView.findViewById(R.id.op9);
			
			final ImageView op10 = (ImageView) myView.findViewById(R.id.op10);
			
			final ImageView op11 = (ImageView) myView.findViewById(R.id.op11);
			
			final ImageView op12 = (ImageView) myView.findViewById(R.id.op12);
			
			final ImageView op13 = (ImageView) myView.findViewById(R.id.op13);
			
			final ImageView op14 = (ImageView) myView.findViewById(R.id.op14);
			
			final ImageView op15 = (ImageView) myView.findViewById(R.id.op15);
			
			final ImageView op16 = (ImageView) myView.findViewById(R.id.op16);
			
			final ImageView op17 = (ImageView) myView.findViewById(R.id.op17);
			
			final ImageView op18 = (ImageView) myView.findViewById(R.id.op18);
			s1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
				@Override
				public void onProgressChanged (SeekBar _param1, int _param2, boolean _param3) {
					final int _progressValue = _param2;
					a1.setText(String.valueOf((long)(s1.getProgress())));
				}
				
				@Override
				public void onStartTrackingTouch(SeekBar SeekBar) {
					
				}
				
				@Override
				public void onStopTrackingTouch(SeekBar SeekBar) {
					
				}
			});
			s2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
				@Override
				public void onProgressChanged (SeekBar _param1, int _param2, boolean _param3) {
					final int _progressValue = _param2;
					a2.setText(String.valueOf((long)(s2.getProgress())));
				}
				
				@Override
				public void onStartTrackingTouch(SeekBar SeekBar) {
					
				}
				
				@Override
				public void onStopTrackingTouch(SeekBar SeekBar) {
					
				}
			});
			s3.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
				@Override
				public void onProgressChanged (SeekBar _param1, int _param2, boolean _param3) {
					final int _progressValue = _param2;
					a3.setText(String.valueOf((long)(s3.getProgress())));
				}
				
				@Override
				public void onStartTrackingTouch(SeekBar SeekBar) {
					
				}
				
				@Override
				public void onStopTrackingTouch(SeekBar SeekBar) {
					
				}
			});
			s4.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
				@Override
				public void onProgressChanged (SeekBar _param1, int _param2, boolean _param3) {
					final int _progressValue = _param2;
					a4.setText(String.valueOf((long)(s4.getProgress())));
				}
				
				@Override
				public void onStartTrackingTouch(SeekBar SeekBar) {
					
				}
				
				@Override
				public void onStopTrackingTouch(SeekBar SeekBar) {
					
				}
			});
			scroll_aim.setVerticalScrollBarEnabled(false);
			scroll_visuals.setVerticalScrollBarEnabled(false);
			LinearLayout menu = (LinearLayout) myView.findViewById(R.id.menu);
			menu.setOnClickListener(new OnClickListener() { 
				@Override 
				public void onClick(View v) {
					principal.setVisibility(View.VISIBLE);         
					icone.setVisibility(View.GONE);         
				} });
			Bitmap hideIcon = BitmapFactory.decodeResource(getResources(),R.drawable.icon_remove_red_eye_);
			Bitmap closeIcon = BitmapFactory.decodeResource(getResources(),R.drawable.icon_close_round);         
			t1.setBackground(new android.graphics.drawable.GradientDrawable() { public android.graphics.drawable.GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)10, 0xFFFF2D00));
			t2.setBackground(new android.graphics.drawable.GradientDrawable() { public android.graphics.drawable.GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)10, 0xFFFF2D00));
			t3.setBackground(new android.graphics.drawable.GradientDrawable() { public android.graphics.drawable.GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)10, 0xFFFF2D00));
			t4.setBackground(new android.graphics.drawable.GradientDrawable() { public android.graphics.drawable.GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)10, 0xFFFFFFFF));
			t5.setBackground(new android.graphics.drawable.GradientDrawable() { public android.graphics.drawable.GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)10, 0xFFFF2D00));
			icone.setBackground(new android.graphics.drawable.GradientDrawable() { public android.graphics.drawable.GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)20, 0xFF0A0E15));
			ss1.setBackground(new android.graphics.drawable.GradientDrawable() { public android.graphics.drawable.GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)20, 0xFFFF2D00));
			ss2.setBackground(new android.graphics.drawable.GradientDrawable() { public android.graphics.drawable.GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)20, 0xFFFF2D00));
			ss3.setBackground(new android.graphics.drawable.GradientDrawable() { public android.graphics.drawable.GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)20, 0xFFFF2D00));
			ss4.setBackground(new android.graphics.drawable.GradientDrawable() { public android.graphics.drawable.GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)20, 0xFFFF2D00));
			target1.setBackground(new android.graphics.drawable.GradientDrawable() { public android.graphics.drawable.GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)20, 0xFF1A2028));
			target2.setBackground(new android.graphics.drawable.GradientDrawable() { public android.graphics.drawable.GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)20, 0xFF1A2028));
			desing_aim.setBackground(new android.graphics.drawable.GradientDrawable() { public android.graphics.drawable.GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)20, 0xFF07090E));
			desing_visuals.setBackground(new android.graphics.drawable.GradientDrawable() { public android.graphics.drawable.GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)20, 0xFF07090E));
			desing_misc.setBackground(new android.graphics.drawable.GradientDrawable() { public android.graphics.drawable.GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)20, 0xFF07090E));
			desing_settings.setBackground(new android.graphics.drawable.GradientDrawable() { public android.graphics.drawable.GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)20, 0xFF07090E));
			cor1.setBackground(new android.graphics.drawable.GradientDrawable() { public android.graphics.drawable.GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)20, 0xFFFF2D00));
			cor2.setBackground(new android.graphics.drawable.GradientDrawable() { public android.graphics.drawable.GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)20, 0xFFFF2D00));
			cor3.setBackground(new android.graphics.drawable.GradientDrawable() { public android.graphics.drawable.GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)20, 0xFFFF2D00));
			cor4.setBackground(new android.graphics.drawable.GradientDrawable() { public android.graphics.drawable.GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)20, 0xFFFF2D00));
			cor2.setVisibility(View.GONE);         
			cor3.setVisibility(View.GONE);         
			cor4.setVisibility(View.GONE);         
			select_aim.setBackground(new android.graphics.drawable.GradientDrawable() { public android.graphics.drawable.GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)20, 0xFF000B11));
			select_visuals.setBackground(new android.graphics.drawable.GradientDrawable() { public android.graphics.drawable.GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)20, Color.TRANSPARENT));
			select_misc.setBackground(new android.graphics.drawable.GradientDrawable() { public android.graphics.drawable.GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)20, Color.TRANSPARENT));
			select_settings.setBackground(new android.graphics.drawable.GradientDrawable() { public android.graphics.drawable.GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)20, Color.TRANSPARENT));
			select_aim.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View _view) {
					select_aim.setBackground(new android.graphics.drawable.GradientDrawable() { public android.graphics.drawable.GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)20, 0xFF07090E));
					select_visuals.setBackground(new android.graphics.drawable.GradientDrawable() { public android.graphics.drawable.GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)20, Color.TRANSPARENT));
					select_misc.setBackground(new android.graphics.drawable.GradientDrawable() { public android.graphics.drawable.GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)20, Color.TRANSPARENT));
					select_settings.setBackground(new android.graphics.drawable.GradientDrawable() { public android.graphics.drawable.GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)20, Color.TRANSPARENT));
					aim.setVisibility(View.VISIBLE);         
					cor1.setVisibility(View.VISIBLE);         
					cor2.setVisibility(View.GONE);         
					cor3.setVisibility(View.GONE);         
					cor4.setVisibility(View.GONE);         
					visuals.setVisibility(View.GONE);         
					misc.setVisibility(View.GONE);         
					settings.setVisibility(View.GONE);         
					ScaleAnimation fade_in = new ScaleAnimation(0.9f, 1f, 0.9f, 1f, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.7f);
					fade_in.setDuration(300);
					fade_in.setFillAfter(true);
					select_aim.startAnimation(fade_in);
				}
			});
			select_visuals.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View _view) {
					select_aim.setBackground(new android.graphics.drawable.GradientDrawable() { public android.graphics.drawable.GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)20, Color.TRANSPARENT));
					select_visuals.setBackground(new android.graphics.drawable.GradientDrawable() { public android.graphics.drawable.GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)20, 0xFF07090E));
					select_misc.setBackground(new android.graphics.drawable.GradientDrawable() { public android.graphics.drawable.GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)20, Color.TRANSPARENT));
					select_settings.setBackground(new android.graphics.drawable.GradientDrawable() { public android.graphics.drawable.GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)20, Color.TRANSPARENT));
					visuals.setVisibility(View.VISIBLE);         
					cor2.setVisibility(View.VISIBLE);         
					cor1.setVisibility(View.GONE);         
					cor3.setVisibility(View.GONE);         
					cor4.setVisibility(View.GONE);         
					aim.setVisibility(View.GONE);         
					misc.setVisibility(View.GONE);         
					settings.setVisibility(View.GONE);         
					ScaleAnimation fade_in = new ScaleAnimation(0.9f, 1f, 0.9f, 1f, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.7f);
					fade_in.setDuration(300);
					fade_in.setFillAfter(true);
					select_visuals.startAnimation(fade_in);
				}
			});
			select_misc.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View _view) {
					select_aim.setBackground(new android.graphics.drawable.GradientDrawable() { public android.graphics.drawable.GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)20, Color.TRANSPARENT));
					select_visuals.setBackground(new android.graphics.drawable.GradientDrawable() { public android.graphics.drawable.GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)20, Color.TRANSPARENT));
					select_misc.setBackground(new android.graphics.drawable.GradientDrawable() { public android.graphics.drawable.GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)20, 0xFF07090E));
					select_settings.setBackground(new android.graphics.drawable.GradientDrawable() { public android.graphics.drawable.GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)20, Color.TRANSPARENT));
					misc.setVisibility(View.VISIBLE);         
					cor3.setVisibility(View.VISIBLE);         
					cor1.setVisibility(View.GONE);         
					cor2.setVisibility(View.GONE);         
					cor4.setVisibility(View.GONE);         
					aim.setVisibility(View.GONE);         
					visuals.setVisibility(View.GONE);         
					settings.setVisibility(View.GONE);         
					ScaleAnimation fade_in = new ScaleAnimation(0.9f, 1f, 0.9f, 1f, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.7f);
					fade_in.setDuration(300);
					fade_in.setFillAfter(true);
					select_misc.startAnimation(fade_in);
				}
			});
			select_settings.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View _view) {
					select_aim.setBackground(new android.graphics.drawable.GradientDrawable() { public android.graphics.drawable.GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)20, Color.TRANSPARENT));
					select_visuals.setBackground(new android.graphics.drawable.GradientDrawable() { public android.graphics.drawable.GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)20, Color.TRANSPARENT));
					select_misc.setBackground(new android.graphics.drawable.GradientDrawable() { public android.graphics.drawable.GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)20, Color.TRANSPARENT));
					select_settings.setBackground(new android.graphics.drawable.GradientDrawable() { public android.graphics.drawable.GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)20, 0xFF07090E));
					settings.setVisibility(View.VISIBLE);         
					cor4.setVisibility(View.VISIBLE);         
					cor2.setVisibility(View.GONE);         
					cor3.setVisibility(View.GONE);         
					cor1.setVisibility(View.GONE);         
					visuals.setVisibility(View.GONE);         
					misc.setVisibility(View.GONE);         
					aim.setVisibility(View.GONE);         
					ScaleAnimation fade_in = new ScaleAnimation(0.9f, 1f, 0.9f, 1f, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.7f);
					fade_in.setDuration(300);
					fade_in.setFillAfter(true);
					select_settings.startAnimation(fade_in);
				}
			});
			op1.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View _view) {
					if (f1 == 0) {
						f1++;
						op1.setImageResource(R.drawable.box2);
					} else {
						f1--;
						op1.setImageResource(R.drawable.box1);
					}
				}
			});
			op2.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View _view) {
					if (f2 == 0) {
						f2++;
						op2.setImageResource(R.drawable.box2);
					} else {
						f2--;
						op2.setImageResource(R.drawable.box1);
					}
				}
			});
			op3.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View _view) {
					if (f3 == 0) {
						f3++;
						op3.setImageResource(R.drawable.box2);
					} else {
						f3--;
						op3.setImageResource(R.drawable.box1);
					}
				}
			});
			op4.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View _view) {
					if (f4 == 0) {
						f4++;
						op4.setImageResource(R.drawable.box2);
					} else {
						f4--;
						op4.setImageResource(R.drawable.box1);
					}
				}
			});
			op5.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View _view) {
					if (f5 == 0) {
						f5++;
						op5.setImageResource(R.drawable.box2);
					} else {
						f5--;
						op5.setImageResource(R.drawable.box1);
					}
				}
			});
			op6.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View _view) {
					if (f6 == 0) {
						f6++;
						op6.setImageResource(R.drawable.box2);
					} else {
						f6--;
						op6.setImageResource(R.drawable.box1);
					}
				}
			});
			op7.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View _view) {
					if (f7 == 0) {
						f7++;
						op7.setImageResource(R.drawable.box2);
					} else {
						f7--;
						op7.setImageResource(R.drawable.box1);
					}
				}
			});
			op8.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View _view) {
					if (f8 == 0) {
						f8++;
						op8.setImageResource(R.drawable.box2);
					} else {
						f8--;
						op8.setImageResource(R.drawable.box1);
					}
				}
			});
			op9.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View _view) {
					if (f9 == 0) {
						f9++;
						op9.setImageResource(R.drawable.box2);
					} else {
						f9--;
						op9.setImageResource(R.drawable.box1);
					}
				}
			});
			op10.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View _view) {
					if (f10 == 0) {
						f10++;
						op10.setImageResource(R.drawable.box2);
					} else {
						f10--;
						op10.setImageResource(R.drawable.box1);
					}
				}
			});
			op11.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View _view) {
					if (f11 == 0) {
						f11++;
						op11.setImageResource(R.drawable.box2);
					} else {
						f11--;
						op11.setImageResource(R.drawable.box1);
					}
				}
			});
			op12.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View _view) {
					if (f12 == 0) {
						f12++;
						op12.setImageResource(R.drawable.box2);
					} else {
						f12--;
						op12.setImageResource(R.drawable.box1);
					}
				}
			});
			op13.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View _view) {
					if (f13 == 0) {
						f13++;
						op13.setImageResource(R.drawable.box2);
					} else {
						f13--;
						op13.setImageResource(R.drawable.box1);
					}
				}
			});
			op14.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View _view) {
					if (f14 == 0) {
						f14++;
						op14.setImageResource(R.drawable.box2);
					} else {
						f14--;
						op14.setImageResource(R.drawable.box1);
					}
				}
			});
			op15.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View _view) {
					if (f15 == 0) {
						f15++;
						op15.setImageResource(R.drawable.box2);
					} else {
						f15--;
						op15.setImageResource(R.drawable.box1);
					}
				}
			});
			op16.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View _view) {
					if (f16 == 0) {
						f16++;
						op16.setImageResource(R.drawable.box2);
					} else {
						f16--;
						op16.setImageResource(R.drawable.box1);
					}
				}
			});
			op17.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View _view) {
					if (f17 == 0) {
						f17++;
						op17.setImageResource(R.drawable.box2);
					} else {
						f17--;
						op17.setImageResource(R.drawable.box1);
					}
				}
			});
			op18.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View _view) {
					if (f18 == 0) {
						f18++;
						op18.setImageResource(R.drawable.box2);
					} else {
						f18--;
						op18.setImageResource(R.drawable.box1);
					}
				}
			});
			
			wm.addView(myView, params);
			
		}
		
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
