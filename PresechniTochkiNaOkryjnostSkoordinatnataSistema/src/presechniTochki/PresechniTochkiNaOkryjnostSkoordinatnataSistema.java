package presechniTochki;

import java.util.Scanner;

public class PresechniTochkiNaOkryjnostSkoordinatnataSistema {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner (System.in);
		
		double x, y, x0, y0, R;
		double x1, x2, y1, y2;
		
		System.out.print("Vyvedi koordinatite na centyra na okryjnostta.\nx0 = ");
		x0 = input.nextInt();
		
		System.out.print("y0 = ");
		y0 = input.nextInt();
		
		System.out.print("Vyvedi radiusa na okryjnostta.\nR= ");
		R = input.nextInt();
		if (R<=0){
			System.out.println("Vyvedeniqt ot vas radius e nevaliden!");
			System.exit(0);
		}
		
		/*
		 * Presechni tochki s Oy
		 * (x - x0)^2 + (y - y0)^2= R^2
		 *  y=0
		 *  x^2 - 2x.x0 + x0^2 + y0^2 - R^2 = 0
		 *  x1/2 = [ 2x0 +- sqrt( (-2x)^2 - 4.1.(x0^2 + y0^2 - R^2) ) ] / 2.1
		 *  x1 = x0 + sqrt(R^2 - y0^2)
		 *  x1 = x0 - sqrt(R^2 - y0^2)
		 */		
		y=0;
		
		if((R*R - y0*y0) > 0){
			x1 = x0 + Math.sqrt(R*R - y0*y0);
			x2 = x0 - Math.sqrt(R*R - y0*y0);
			
			System.out.printf("Presechnite tochki na okryjnostta s osta Ox sa: t.A(%.2f; %.2f) i t.B(%.2f; %.2f)\n", x1,y, x2,y );
		}
		else if((R*R -  y0*y0) == 0){
			x1 = x2 = x0;
			System.out.printf("Presechnata tochka na okryjnostta s osta Ox e: t.A(%.2f; %.2f)\n", x0,y);
		}
		else {
			System.out.println("Okryjnostta nqma presechni tochki s osta Ox\n");
		}
		
		/*
		 * Presechni tochki s Oy
		 * (x - x0)^2 + (y - y0)^2= R^2
		 *  x=0
		 *  y1 = y0 + sqrt(R*R - x0*x0)
		 *  y1 = y0 - sqrt(R*R - x0*x0)
		 */
		x=0;
		
		if((R*R - x0*x0) > 0){
			double v = R*R - x0*x0;
			y1 = y0 + Math.sqrt(v);
			y2 = y0 - Math.sqrt(v);
			System.out.printf("Presechnite tochki na okryjnostta s osta Oy sa: t.C(%.2f ; %.2f) i t.D(%.2f ; %.2f)\n", x,y1, x,y2 );
		}
		else if((R*R - x0*x0) == 0){
			y1 = y2 = y0;
			System.out.printf("Presechnata tochka na okryjnostta s osta Oy e: t.C(%.2f; %.2f)\n", x,y0);
		}
		else {
			System.out.println("Okryjnostta nqma presechni tochki s osta Oy\n");
		}
		
	}

}
