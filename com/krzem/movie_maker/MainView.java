package com.krzem.movie_maker;



import java.awt.Graphics2D;



public class MainView extends Constants{
	public Main cls;
	public TrackList tl;
	public Preview pr;



	public MainView(Main cls){
		this.cls=cls;
		this.tl=new TrackList(this.cls,this);
		this.pr=new Preview(this.cls,this);
	}



	public void update(){
		this.tl.update();
		this.pr.update();
	}



	public void draw(Graphics2D g){
		g.setColor(BG_COLOR);
		g.fillRect(0,0,WINDOW_SIZE.width,WINDOW_SIZE.height);
		this.tl.draw(g);
		this.pr.draw(g);
	}
}