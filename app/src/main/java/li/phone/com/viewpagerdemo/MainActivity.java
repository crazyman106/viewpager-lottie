package li.phone.com.viewpagerdemo;

import android.support.v4.app.Fragment;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.airbnb.lottie.LottieAnimationView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import li.phone.com.viewpagerdemo.fragment.FragmentA;
import li.phone.com.viewpagerdemo.fragment.FragmentB;
import li.phone.com.viewpagerdemo.fragment.FragmentC;

/**
 * http://blog.csdn.net/qwe490139301/article/details/52021571
 */
public class MainActivity extends AppCompatActivity {

    @BindView(R.id.viewPager)
    ViewPager viewPager;
    private List<Fragment> fragments;
    private FragmentPagerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        fragments = new ArrayList<>();
        initFragment();
    }

    FragmentA fragmentA;
    FragmentB fragmentB;
    FragmentC fragmentC;

    private void initFragment() {
        fragmentA = new FragmentA();
        fragmentB = new FragmentB();
        fragmentC = new FragmentC();
        fragments.add(fragmentA);
        fragments.add(fragmentB);
        fragments.add(fragmentC);
        adapter = new FragmentPagerAdapter(getSupportFragmentManager(), fragments);
        viewPager.setOffscreenPageLimit(0);
        viewPager.setAdapter(adapter);
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

}
