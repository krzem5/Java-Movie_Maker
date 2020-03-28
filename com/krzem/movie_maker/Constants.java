package com.krzem.movie_maker;



import java.awt.Color;
import java.awt.Font;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Rectangle;



public class Constants{
	public static final int DISPLAY_ID=0;
	public static final GraphicsDevice SCREEN=GraphicsEnvironment.getLocalGraphicsEnvironment().getScreenDevices()[DISPLAY_ID];
	public static final Rectangle WINDOW_SIZE=SCREEN.getDefaultConfiguration().getBounds();
	public static final int MAX_FPS=60;

	public static final Color BG_COLOR=new Color(45,45,45);

	public static final Color TRACK_LIST_BG_COLOR=new Color(35,35,35);
	public static final int TRACK_LIST_HEIGHT=500;

	public static final Color PREVIEW_BG_COLOR=new Color(0,0,0);
	public static final int PREVIEW_WIDTH=1080;
}