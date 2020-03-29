package com.krzem.movie_maker;



import java.awt.Graphics2D;



public class TrackList extends Constants{
	public Main cls;
	public MainView view;
	public final Rectangle RECT=new Rectangle(0,WINDOW_SIZE.height-TRACK_LIST_HEIGHT,WINDOW_SIZE.width,WINDOW_SIZE.height);



	public TrackList(Main cls,MainView view){
		this.cls=cls;
		this.view=view;
	}



	public void update(){

	}



	public void draw(Graphics2D g){
		g.setColor(TRACK_LIST_BG_COLOR);
		g.fillRect(this.RECT.x,this.RECT.y,this.RECT.w,this.RECT.h);
	}
}