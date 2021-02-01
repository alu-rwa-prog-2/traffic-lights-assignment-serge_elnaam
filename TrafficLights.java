import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/**/
public class TrafficLights extends Applet implements ItemListener
{
String msg="";
Lights Red,Green,Yellow;
LightsGroup lightsgrp;
public void init()
{
lightsgrp=new LightsGroup();
Red=new Lights("RED",lightsgrp,false);
Green=new Lights("GREEN",lightsgrp,false);
Yellow=new Lights("YELLOW",lightsgrp,false);
add(Red);
add(Yellow);
add(Green);
Red.addItemListener(this);
Green.addItemListener(this);
Yellow.addItemListener(this);
}
public void itemStateChanged(ItemEvent ie)
{
repaint();
}
public void paint(Graphics g)
{
//g.drawOval(10,10,50,50);
if(lightsgrp.getSelectedLights().getLabel()=="RED")
{
g.setColor(Color.red);
g.fillOval(10,10,50,50);
} if(lightsgrp.getSelectedLights().getLabel()=="YELLOW")
{
g.setColor(Color.yellow);
g.fillOval(10,10,50,50);
}
if(lightsgrp.getSelectedLights().getLabel()=="GREEN")
{
g.setColor(Color.green);
g.fillOval(10,10,50,50);
}
}
}
