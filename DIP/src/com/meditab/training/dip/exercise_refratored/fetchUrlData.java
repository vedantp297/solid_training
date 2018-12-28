package com.meditab.training.dip.exercise_refratored;

import java.io.InputStream;
import java.net.URL;

public class fetchUrlData 
{
	URL url;
    url = new URL("http", "myfirstappwith.appspot.com", "/index.html");
    InputStream in;
    in = url.openStream();
}

