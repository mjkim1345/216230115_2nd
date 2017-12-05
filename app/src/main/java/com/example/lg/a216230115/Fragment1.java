package com.example.lg.a216230115;

import android.graphics.*;
import android.os.*;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.*;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import static android.R.attr.onClick;

public class Fragment1 extends Fragment {

//    private Thread mAnimationThread;
//    public Fragment1(){}
//
//
//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container,
//                             Bundle savedInstanceState) {
//
//        final View rootView = inflater.inflate(R.layout.fragment_fragment1, container, false);
//
//        mAnimationThread = new Thread() {
//
//            //some code here
//        };
//
//        return rootView;
//    }
//
//    @Override
//    public void onResume() {
//        super.onResume();
//        Log.d("anim", "in resume");
//        Toast.makeText(getActivity().getApplicationContext() , "Resumed", Toast.LENGTH_LONG).show();
//        mAnimationThread.start();
//    }   @Override
//    public void onPause() {
//        super.onPause();
//        Log.d("anim", "in pause");
//        Toast.makeText(getActivity().getApplicationContext(), "Paused",
//                Toast.LENGTH_LONG).show();
//
//        mAnimationThread.suspend();
//
//    }}


    private static final String TAG = "Fragment1";
    private Button stop;
    boolean isRunning = false;

    private int i = 0;
    private TextView one;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_fragment1, container, false);


        one = (TextView)view.findViewById(R.id.i);
        return view;
    }

    Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            updateThread();
        }
    };

    @Override
    public void onStart() {
        super.onStart();
        Toast.makeText(getActivity().getApplicationContext(), "Start", Toast.LENGTH_LONG).show();
        Thread myThread = new Thread(new Runnable() {
            public void run() {
                while (true) {
                    try {
                        handler.sendMessage(handler.obtainMessage());
                        Thread.sleep(1000);
                    } catch (Throwable t) {
                    }

                }
            }

        });


        myThread.start();
    }




    private void updateThread() {
        i++;
        one.setText(String.valueOf(i));
    }

}

//        Thread myThread = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                while(true){
//
//                    Canvas c = v.lockCanvas();
//                    if( c == null ) continue;
//
//                    c.drawColor( Color.WHITE);
//                    Paint p = new Paint();
//                    p.setStyle( Paint.Style.FILL );
//                    p.setColor( Color.BLUE);
//                    c.drawCircle( 200, i,100,p);
//                    i+=5;
//                    if( i > 200) i=0;
//                    v.unlockCanvasAndPost(c);
//                }
//            }
//        });
//        myThread.start();
//    }
//    class MyThread extends Thread{
//
//        int i = 0;
//        TextureView v;
//
//        public void run(){
//
//            while(true){
//
//                Canvas c = v.lockCanvas();
//                if( c == null ) continue;
//
//                c.drawColor( Color.WHITE);
//                Paint p = new Paint();
//                p.setStyle( Paint.Style.FILL );
//                p.setColor( Color.BLUE);
//                c.drawCircle( 200, i,100,p);
//                i+=5;
//                if( i > 200) i=0;
//                v.unlockCanvasAndPost(c);
//            }
//
//        }
//    }


