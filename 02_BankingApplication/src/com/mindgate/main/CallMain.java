package com.mindgate.main;

import com.mindgate.thread.Call;
import com.mindgate.thread.CallerThread;

public class CallMain {
	public static void main(String[] args) {
		Call call = new Call();
		CallerThread callerThread1 = new CallerThread("Hey",call);
		CallerThread callerThread2 = new CallerThread("Wassup",call);
		CallerThread callerThread3 = new CallerThread("Bye",call);

	}
}
