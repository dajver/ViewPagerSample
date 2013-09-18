package com.example.viewpagersample;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class TherdFragment extends Fragment {

	private Context context;

	/** Handle the results from the voice recognition activity. */
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {

		super.onActivityCreated(savedInstanceState);
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

		// задаем разметку фрагменту
		final View view = inflater.inflate(R.layout.second, container, false);
		// ну и контекст, так как фрагменты не содержат собственного
		context = view.getContext();
		// выводим текст который хотим
		TextView wordsCount = (TextView) view.findViewById(R.id.textView1);
		wordsCount.setText("ThirdActivity");
		return view;
	}
}