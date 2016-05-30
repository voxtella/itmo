package com.test;

import java.io.IOException;
import javax.servlet.http.*;


@SuppressWarnings("serial")
public class TaskServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("text/plain; charset=utf-8");
		
//----------------------------------Первая часть---Ближе к 10			
		if(req.getParameter("varn")!= null && req.getParameter("varm")!= null){
			
		double n = Double.parseDouble(req.getParameter("varn"));
		double m = Double.parseDouble(req.getParameter("varm"));
		double a1, a2;
		
		a1 = 10-n;
		if(a1<0)
			a1*=(-1);
		a2 = 10-m;
		if(a2<0)
			a2*=(-1);
		
		if(a1<a2)
			resp.getWriter().println("The number "+n+" is closer to 10");
		else if(a1>a2)
			resp.getWriter().println("The number "+m+" is closer to 10");
		else
			resp.getWriter().println("The numbers are equally close to 10");
		}
		
//----------------------------------Вторая часть---Уравнение		
		else if(req.getParameter("vara")!=null && req.getParameter("varb")!=null && req.getParameter("varc")!=null){ 

			int a=Integer.parseInt(req.getParameter("vara")); 
			int b=Integer.parseInt(req.getParameter("varb")); 
			int c=Integer.parseInt(req.getParameter("varc")); 
			float D; 
			D = (b*b) - (4*a*c); 
			double sqD = Math.sqrt(D);
			double	x1, x2; 
			
			
			if(D < 0) 
			resp.getWriter().println("No square roots"); 
			else if (D == 0){ 
			x1 = ((-b)+sqD)/(2*a); 
			resp.getWriter().println("Square root is: "+x1); 
			} 
			else { 
			x1 = ((-b)+sqD)/(2*a); 
			x2 = ((-b)-sqD)/(2*a); 
			resp.getWriter().println("Square roots are: "+x1+", "+x2); 
			} 
			} 
		
//----------------------------------Третья часть---Массив
		else if(req.getParameter("mass_a")!=null){
			
		int[][] mass;
		mass = new int[8][5];

		for(int u=0; u<8; u++){
			for(int v=0; v<5; v++){
				mass[u][v]=(int)(10 + Math.random()*90);
			}
		}
		for(int u=0; u < 8; u++){
			for(int v=0; v<5; v++){
				resp.getWriter().println(mass[u][v]+" ");
			}
			resp.getWriter().println("<br>");
		}
		}
		
//----------------------------------Четвёртая часть---Массив2
		else if(req.getParameter("mass_b")!=null){
			
		int[][] mass2;
		mass2 = new int[5][8];
		int max;

		
		for(int k=0; k<5; k++){
			for(int l=0; l<8; l++){
				mass2[k][l]=(int)((-99)+Math.random()*199);
			}
		}

			max = mass2[0][0];
			for(int k=0; k<5; k++){
			for(int l=0; l<8; l++){
				if(mass2[k][l] > max)
						max = mass2[k][l];
				
				resp.getWriter().println(mass2[k][l]+" ");
			}
			resp.getWriter().println("<br>");
		}
			resp.getWriter().println("Max in massive = "+max+"<br>");
		}
	
	
	}
}