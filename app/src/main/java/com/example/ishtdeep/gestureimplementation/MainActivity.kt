package com.example.ishtdeep.gestureimplementation

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.view.GestureDetectorCompat
import android.view.GestureDetector
import android.view.MotionEvent
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener {
    override fun onDoubleTapEvent(p0: MotionEvent?): Boolean {
        gestureViewer.text = "On Double tap event"
        return true
    }

    override fun onSingleTapConfirmed(p0: MotionEvent?): Boolean {
        gestureViewer.text = "On Single tap confirmed"
        return true
    }

    override fun onDoubleTap(p0: MotionEvent?): Boolean {
        gestureViewer.text = "On Double tap"
        return true
    }

    override fun onShowPress(p0: MotionEvent?) {
        gestureViewer.text = "On Show press"
    }

    override fun onSingleTapUp(p0: MotionEvent?): Boolean {
        gestureViewer.text = "on single tap"
        return true
    }

    override fun onDown(p0: MotionEvent?): Boolean {
        gestureViewer.text = "on down"
        return true
    }

    override fun onFling(p0: MotionEvent?, p1: MotionEvent?, p2: Float, p3: Float): Boolean {
        gestureViewer.text = "On fling left/right or right/left"
        return true
    }

    override fun onScroll(p0: MotionEvent?, p1: MotionEvent?, p2: Float, p3: Float): Boolean {
        gestureViewer.text = "scroll try"
        return true
    }

    override fun onLongPress(p0: MotionEvent?) {
        gestureViewer.text = "Long press"
    }

    private var gDetector: GestureDetectorCompat? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.gDetector = GestureDetectorCompat(this, this)
        gDetector?.setOnDoubleTapListener(this)
    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        this.gDetector?.onTouchEvent(event)
        return super.onTouchEvent(event)
    }


}


