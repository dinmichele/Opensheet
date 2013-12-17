/*******************************************************************************
 * Copyright (c) 2012 Dmitry Tikhomirov.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Public License v3.0
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/gpl.html
 * 
 * Contributors:
 *     Dmitry Tikhomirov - initial API and implementation
 ******************************************************************************/
package org.opensheet.client.widges;

import java.util.Arrays;
import java.util.List;

import com.extjs.gxt.charts.client.model.ChartModel;
import com.extjs.gxt.charts.client.model.axis.XAxis;
import com.extjs.gxt.charts.client.model.axis.YAxis;
import com.extjs.gxt.charts.client.model.charts.FilledBarChart;

public class MonthChart {
	private static final String[] months = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
	private int i = 0 ;
	
	public ChartModel getChartModel(List<Number> al) {
		
			int max = 0;
			int step = 0;
			int[] intArray;
			intArray = new int[al.size()]; 
			for(Number n: al){
				intArray[i] =  n.intValue();
				i++;
			}
			
		
			if(maxValue(intArray) != 0){
				
				max = (maxValue(intArray)*12000)/10000;
				step = (maxValue(intArray)*12000)/10000/15;

			}
		
			
			
			ChartModel cm = new ChartModel("Hours by Month",  "font-size: 16px; font-weight: bold; font-family: Verdana; color:#008800;");
			cm.setBackgroundColour("#eeffee");
			cm.setDecimalSeparatorComma(true);
			XAxis xa = new XAxis();
			xa.setLabels(getShortMonths(12));
			xa.getLabels().setColour("#009900");
			xa.setGridColour("#eeffee");
			xa.setColour("#009900");
			cm.setXAxis(xa);
			YAxis ya = new YAxis();
			ya.setRange(0, max);
			ya.setSteps(step);
			ya.setGridColour("#eeffee");
			ya.setColour("#009900");
			cm.setYAxisLabelStyle(10, "#009900");
			cm.setYAxis(ya);
			FilledBarChart bchart = new FilledBarChart("#6666ff", "#000066");
			bchart.setTooltip("#val# hours");

			
			


			bchart.addValues(al); 
			cm.addChartConfig(bchart);
			return cm;
		}

	
		

		public static int maxValue(int[] numbers){  
			  Arrays.sort(numbers);  
			  return numbers[numbers.length-1];  
			} 
		
		public static String[] getShortMonths(int n) {
		  String[] mths = new String[n];
		  for (int c = 0; c < n; c++)
		    mths[c] = months[c];
		  return mths;
		}

}
