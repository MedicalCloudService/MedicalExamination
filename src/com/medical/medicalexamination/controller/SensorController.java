package com.medical.medicalexamination.controller;

import com.medical.medicalexamination.R;

import android.app.Activity;
import android.os.Handler;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;

public class SensorController extends TestAreaController
{

	private int[]	listImgViewResId	= { R.id.imageViewSensorStart };

	public SensorController(Activity activity, Handler handler)
	{
		super(activity, handler);
		initView(activity, handler);
	}

	private void initView(Activity activity, Handler handler)
	{
		ViewGroup parent = (ViewGroup) activity.findViewById(R.id.RelativeLayoutSensorMain);
		initHeader(parent);
		addImageViewResId(parent, listImgViewResId, handler);
	}

	@Override
	protected boolean onClose()
	{
		return false;
	}

}
