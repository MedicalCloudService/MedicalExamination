package com.medici.app;

import com.medici.app.model.EventMessage;
import com.medici.app.model.Global;
import com.medici.app.view.ShapButton;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.ViewGroup.LayoutParams;

public class LoginActivity extends Activity
{
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.login);
		getWindow().setLayout(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT);
		handleLogin();
	}

	private void handleLogin()
	{
		final ShapButton btnLogin = (ShapButton) this.findViewById(R.id.shapButtonLogin);
		final ShapButton btnSingleRun = (ShapButton) this.findViewById(R.id.shapButtonSingleRun);

		btnLogin.setOnButtonClickedListener(new ShapButton.OnButtonClickedListener()
		{
			@Override
			public void OnButtonClicked(boolean bSelected)
			{
				btnSingleRun.setClick(false);
			}
		});

		btnSingleRun.setOnButtonClickedListener(new ShapButton.OnButtonClickedListener()
		{
			@Override
			public void OnButtonClicked(boolean bSelected)
			{
				btnLogin.setClick(false);
				Global.showDidlog(LoginActivity.this, selfHandler, LoginActivity.this.getString(R.string.app_name),
						LoginActivity.this.getString(R.string.single_run_message));
			}
		});
	}

	private Handler	selfHandler	= new Handler()
								{

									@Override
									public void handleMessage(Message msg)
									{
										switch (msg.what)
										{
										case EventMessage.MSG_CLOSE_MESSAGE_DIALOG:
											LoginActivity.this.finish();
											break;
										}
									}

								};
}