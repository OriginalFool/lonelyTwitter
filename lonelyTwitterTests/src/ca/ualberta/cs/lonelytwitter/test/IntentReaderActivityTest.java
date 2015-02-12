package ca.ualberta.cs.lonelytwitter.test;

import android.content.Intent;
import android.test.ActivityInstrumentationTestCase2;
import android.view.View;
import android.widget.TextView;
import ca.ualberta.cs.lonelytwitter.IntentReaderActivity;
import ca.ualberta.cs.lonelytwitter.R;
import android.test.ViewAsserts;

public class IntentReaderActivityTest extends
		ActivityInstrumentationTestCase2<IntentReaderActivity> {

	public IntentReaderActivityTest() {
		super(IntentReaderActivity.class);
	}

	protected void setUp() throws Exception {
		super.setUp();
	}
	
	public void testSendText(){
		String text = "Hello World!";
		IntentReaderActivity activity = startWithText(text, IntentReaderActivity.NORMAL);
		assertEquals("got the text?", text, activity.getText());
	}
	
	public void testDoubleText(){
		String text ="Hello";
		IntentReaderActivity activity = startWithText(text, IntentReaderActivity.DOUBLE);
		assertEquals("double text?", text+text, activity.getText());
	}
	
	public void testReverseText(){
		String text ="Hello";
		IntentReaderActivity activity = startWithText(text, IntentReaderActivity.REVERSE);
		assertEquals("reverse text?", "olleH", activity.getText());
	}
	
	public void testDisplayText(){
		String text = "Hello!";
		IntentReaderActivity activity = startWithText(text, IntentReaderActivity.NORMAL);
		
		TextView view = (TextView) activity.findViewById(R.id.intentText);
		assertEquals("correct text?", text, view.getText());
	}
	
	public void testNoText(){
		IntentReaderActivity activity = startWithText(null, IntentReaderActivity.NORMAL);
		
		TextView view = (TextView) activity.findViewById(R.id.intentText);
		assertEquals("Correct?", "Nothing Entered", view.getText());
	}
	
	public void testVisible(){
		String text = "Hello!";
		IntentReaderActivity activity = startWithText(text, IntentReaderActivity.NORMAL);
		//http://stackoverflow.com/questions/4922764/in-an-android-test-how-to-check-that-a-view-is-shown Feb12, 2015
		final View origin = activity.getWindow().getDecorView();
		View view = (TextView) activity.findViewById(R.id.intentText);
		ViewAsserts.assertOnScreen(origin, view);
	}
	
	private IntentReaderActivity startWithText(String text, int mode){
		Intent intent = new Intent();
		intent.putExtra(IntentReaderActivity.TEXT_KEY, text);
		intent.putExtra(IntentReaderActivity.TRANSFORM_KEY, mode);
		setActivityIntent(intent);
		return (IntentReaderActivity) getActivity();
	}

}
