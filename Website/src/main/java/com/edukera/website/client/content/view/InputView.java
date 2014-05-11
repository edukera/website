package com.edukera.website.client.content.view;

import com.edukera.website.client.content.presenter.Input;
import com.edukera.website.client.generic.view.ADivView;
import com.edukera.website.client.generic.widget.DivPanel;
import com.edukera.website.client.generic.widget.InputPanel;

public class InputView extends ADivView implements Input.Display {

	private final InputPanel mInput;
	private final DivPanel mButton;
	
	public InputView() {
		mRoot.addStyleName(STYLE.input());
		
		mInput = new InputPanel();
		mRoot.add(mInput);
		mInput.addStyleName(STYLE.inputInput());

		mButton = new DivPanel();
		mRoot.add(mButton);
		mButton.addStyleName(STYLE.inputButton());
	}
	
	public void setInputText(String iText) {
		mInput.setText(iText);
	}

	public void setButtonText(String iText) {
		mButton.setText(iText);
	}

}
