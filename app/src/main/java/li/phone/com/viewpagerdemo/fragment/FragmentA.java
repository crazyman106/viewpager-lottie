package li.phone.com.viewpagerdemo.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.airbnb.lottie.LottieAnimationView;

import li.phone.com.viewpagerdemo.R;

/**
 * Created by fengzili
 * 2017/6/2
 * 291924028@qq.com
 */

public class FragmentA extends Fragment {

    View view;
    LottieAnimationView animationView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if (view == null) {
            view = inflater.inflate(R.layout.fragment_a, container, false);
            animationView = (LottieAnimationView) view.findViewById(R.id.animation_view_a);
        }
        ViewGroup parent = (ViewGroup) view.getParent();
        if (parent != null) {
            parent.removeView(view);
        }
        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
    }


    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        if (view != null) {
            if (isVisibleToUser) {
                if (animationView.isAnimating()) {
                    animationView.cancelAnimation();
                }
                animationView.setProgress(0f);
                animationView.playAnimation();
            } else {
                animationView.cancelAnimation();
            }
        }
    }

    @Override
    public void onPause() {
        super.onPause();
    }
}
