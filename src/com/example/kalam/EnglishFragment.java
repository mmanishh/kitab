package com.example.kalam;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class EnglishFragment extends Fragment {

	TextView question;
	RadioGroup radioGrp;
	RadioButton radioBtn1, radioBtn2, radioBtn3;
	RadioButton[] rb;
	Button sBtn;
	String answers[] = { "answer 1", "answer2", "China", "Nepal",
			"Bangladesh" };

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub

		final ViewGroup rootview = (ViewGroup) inflater.inflate(
				R.layout.fragment_english, container, false);

		LinearLayout mlinear = (LinearLayout) rootview
				.findViewById(R.id.linear1);
		for (int i = 0; i <= 10; i++) {
			TextView title = new TextView(getActivity());
			title.setText("question no." + i);
			mlinear.addView(title);
			rb = new RadioButton[5];
			RadioGroup rg = new RadioGroup(getActivity());
			rg.setOrientation(RadioGroup.VERTICAL);
			for (int j = 0; j<5; j++) {
				rb[j] = new RadioButton(getActivity());
				rg.addView(rb[j]);
				rb[j].setText(answers[j]);
				
				System.out.println(rb[j].getId());

			}
			mlinear.addView(rg);

		}
		

		/*
		 * question = (TextView) rootview.findViewById(R.id.question); radioGrp
		 * = (RadioGroup) rootview.findViewById(R.id.radioGrp1); sBtn = (Button)
		 * rootview.findViewById(R.id.submitBtn);
		 */

		/*
		 * sBtn.setOnClickListener(new OnClickListener() {
		 * 
		 * @Override public void onClick(View arg0) { // TODO Auto-generated
		 * method stub
		 * 
		 * int selected = radioGrp.getCheckedRadioButtonId();
		 * 
		 * switch (selected) {
		 * 
		 * case R.id.radio0: Toast.makeText(getActivity(), "True", 3000).show();
		 * break; case R.id.radio1: Toast.makeText(getActivity(), "second",
		 * 3000).show(); break; case R.id.radio2: Toast.makeText(getActivity(),
		 * "third", 3000).show(); break; }
		 * 
		 * } });
		 */

		return rootview;
	}

}
