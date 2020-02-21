//import android.graphics.Point;
//import android.os.Build;
//import android.os.Bundle;
//import android.os.PersistableBundle;
//import android.view.Display;
//import android.view.Surface;
//import android.view.WindowManager;
//
//import androidx.annotation.Nullable;
//import androidx.appcompat.app.AppCompatActivity;
//import androidx.fragment.app.FragmentManager;
//import androidx.fragment.app.FragmentTransaction;
//
//public class MainActivity extends AppCompatActivity {
//  @Override
//  public void onCreate(Bundle savedInstanceState) {
//    super.onCreate(savedInstanceState);
//
//    FragmentManager fm = getSupportFragmentManager();
//    FragmentTransaction ft = fm.beginTransaction();
//
//    WindowManager wm = getWindowManager();
//    Point p = new Point();
//
//    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB_MR2) {
//      wm.getDefaultDisplay().getSize(p);
//      if (p.x > p.y) {
//        // landscape
//        Fragment2 f2 = new Fragment2();
//        ft.replace(android.R.id.content, f2);
//      } else {
//        // portrait
//        Fragment1 f1 = new Fragment1();
//        ft.replace(android.R.id.content, f1);
//      }
//    } else {
//      Display d= wm.getDefaultDisplay();
//      if (d.getRotation() == Surface.ROTATION_90|| d.getRotation() == Surface.ROTATION_270) {
////        landscape
//        Fragment2 f2 = new Fragment2();
//        ft.replace(android.R.id.content, f2);
//      } else {
//        // portrait
//        Fragment1 f1 = new Fragment1();
//        ft.replace(android.R.id.content, f1);
//      }
//    }
//    .commit();
//  }
//}
