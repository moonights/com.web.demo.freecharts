package com.catsic.widgets.fusioncharts;

import java.util.ArrayList;
import java.util.List;

import com.catsic.widgets.fusioncharts.helper.ColorHelper;
import com.catsic.widgets.fusioncharts.helper.StringUtils;


/** 
 * ��˵�� 
 * @version V1.0  ����ʱ�䣺Jan 11, 2010 12:47:49 PM 
 * �������������ṩ������� xmldata ����
 */
public class ProvideCharts {	
	    private static ProvideCharts instance;
	    private String  caption;    //ͼ��ı���
	    private String  subcaption; //�ӱ���
 	    private String  xAxisName;  //X���ǩ
	    private String  yAxisName;  //y���ǩ
	    private String  showName;   //
	    private String  showValues;   //
	    private String  decimalPrecision; //ָ��С����λ�� 
	    private String  formatNumberScale;// �Զ���ʽ�� ����� formatNumberScale ��ֵ����Ϊ0����ô value=12500 �ͻ���ʾ�� 12,500 �Զ����ǧλ�ָ��� 
	    private String  decimalSeparator;//С���ָ��� .
	    private String  thousandSeparator;//ǧλ�ָ�� , һ���� ��
	    private String  numberPrefix; //ǰ׺
	    private String  numberSuffix; //��׺
	    private String  bgColor; //����ɫ
	    /***���ӵļ�������****/
	    private String  baseFont; //ͼ��������ʽ
	    private String  baseFontSize; //ͼ�������С
	    private String  baseFontColor; //ͼ��������ɫ
	    private String  chartLeftMargin; //ͼ��߾�
	    private String  chartRightMargin; //ͼ��߾�
	    private String  chartTopMargin; //ͼ��߾�
	    private String  chartBottomMargin; //ͼ��߾� 
	    private String  palette;			//
	    private String  useRoundEdges="1";	//  
	    private String  legendBorderAlpha="0";	
	    private String  imageSave="1";
	    private String  imageSaveURL="../../FusionChartsSave.jsp";

	    /**
	     * v3�µ������ԣ����ú����ʹ��V3 �µ�swfģ�壩
	     */
//	  V3�汾�µĿ�������Ϊchart,ʹ�÷����� provideCharts.setHeadString("chart");,����Ĭ���� free�汾�µ�graph
	    private String 	headString="graph";
//	  V3��ʹ��label����name,ʹ�÷����� provideCharts.setLabel("label");,����Ĭ���� free�汾�µ�name������
		private String  label;
	   
		/****
		 * Ĭ�ϵ���ʽ
		 */
		public ProvideCharts(){
			this.palette="2";
			this.useRoundEdges="1";
			this.legendBorderAlpha="0";
		}
		public String getPalette() {
			return palette;
		}

		public void setPalette(String palette) {
			this.palette = palette;
		}

		public String getBaseFont() {
			return baseFont;
		}

		public void setBaseFont(String baseFont) {
			this.baseFont = baseFont;
		}

		public String getBaseFontSize() {
			return baseFontSize;
		}

		public void setBaseFontSize(String baseFontSize) {
			this.baseFontSize = baseFontSize;
		}

		public static ProvideCharts getInstance(){
	    	   if(instance == null)
	    		   return new ProvideCharts();
	    	   return instance;
	    }

		public String getCaption() {
			return caption;
		}
	
		/**
		 * ����������
		 * @param caption
		 */
		public void setCaption(String caption) {
			this.caption = caption;
		}
	
		public String getXAxisName() {
			return xAxisName;
		}
	
		/**
		 * ����x��ı�ǩ
		 * @param axisName
		 */
		public void setXAxisName(String axisName) {
			xAxisName = axisName;
		}
	
		public String getYAxisName() {
			return yAxisName;
		}
	
		/**
		 * ����y���ǩ
		 * @param axisName
		 */
		public void setYAxisName(String axisName) {
			yAxisName = axisName;
		}
	
		public String getShowName() {
			return showName;
		}
	
		/**
		 * �Ƿ���ʾ�������� 0 ��ʾ�� 1 ��ʾ��ʾ
		 * @param showName
		 */
		public void setShowName(String showName) {
			this.showName = showName;
		}
	
		public String getDecimalPrecision() {
			return decimalPrecision;
		}
	
		/**
		 * ָ��С����λ��  ,�������Ϊ0��ô��12.432 �ͱ��12 ��
		 * �����������Ϊ5��ô�ͱ�� 12.43200
		 * @param decimalPrecision
		 */
		public void setDecimalPrecision(String decimalPrecision) {
			this.decimalPrecision = decimalPrecision;
		}
	
		public String getFormatNumberScale() {
			return formatNumberScale;
		}
		/**
		 * �����Ƿ��Զ���ʽ�� 
		 * FCF ���Զ��������������� k��ǧ����M�����򣩣�����㲻����������Ҫ�� formatNumberScale ����Ϊ0
		 * @param formatNumberScale
		 */
		public void setFormatNumberScale(String formatNumberScale) {
			this.formatNumberScale = formatNumberScale;
		}
	
		
		public String getNumberPrefix() {
			return numberPrefix;
		}
	    /**
	     * ������� numberPrefix = ��$�� ��ô�ͻ������ֵ�ǰ�����"$",��$4000����
	     * ��%A5 ��ʾ �� 
	     * @param numberPrefix
	     */
		public void setNumberPrefix(String numberPrefix) {
			this.numberPrefix = numberPrefix;
		}
	
		public String getSubcaption() {
			return subcaption;
		}

		/**
		 * ���ø�����
		 * @param subcaption
		 */
		public void setSubcaption(String subcaption) {
			this.subcaption = subcaption;
		}

		public String getNumberSuffix() {
			return numberSuffix;
		}
        /**
         * ������� numberSuffix ='25%' ��ô��õĽ�������� 43% , 66%
         * ����� 25% ���� %
         * @param numberSuffix
         */
		public void setNumberSuffix(String numberSuffix) {
			this.numberSuffix = numberSuffix;
		}

		public String getDecimalSeparator() {
			return decimalSeparator;
		}

		/**
		 * ����С���ָ���
		 * @param decimalSeparator
		 */
		public void setDecimalSeparator(String decimalSeparator) {
			this.decimalSeparator = decimalSeparator;
		}

		public String getThousandSeparator() {
			return thousandSeparator;
		}

		/**
		 * ����ǧλ�ָ��
		 * @param thousandSeparator
		 */
		public void setThousandSeparator(String thousandSeparator) {
			this.thousandSeparator = thousandSeparator;
		}

		public String getBgColor() {
			return bgColor;
		}

	    /**
	     * ���û����ı�����ɫ
	     * @param bgColor
	     */
		public void setBgColor(String bgColor) {
			this.bgColor = bgColor;
		}
	   
		
		/**
		 * 
		 */
		
		public String careateHeard(){
			
			StringBuffer stb = new StringBuffer();
			stb.append("<");			
			if(!StringUtils.isString(this.getHeadString())){
				stb.append(headString);
			}else {
				stb.append("graph");
			}
			if(!StringUtils.isString(this.palette)){
				stb.append(" palette='"+this.palette+"'");
			}
			if(!StringUtils.isString(this.caption)){
				stb.append(" caption='"+this.caption+"'");
			}
			
			if(!StringUtils.isString(this.subcaption)){
				stb.append(" subcaption='"+this.subcaption+"'");
			}

			if(!StringUtils.isString(this.xAxisName)){
				stb.append(" xAxisName='"+this.xAxisName+"'");
			}
			
			if(!StringUtils.isString(this.yAxisName)){
				stb.append(" yAxisName='"+this.yAxisName+"'");
			}
			
			if(!StringUtils.isString(this.showName)){
				stb.append(" showName='"+this.showName+"'");
			}
			
			if(!StringUtils.isString(this.decimalPrecision)){
				stb.append(" decimalPrecision='"+this.decimalPrecision+"'");
			}
			
			if(!StringUtils.isString(this.formatNumberScale)){
				stb.append(" formatNumberScale='"+this.formatNumberScale+"'");
			}
			
			if(!StringUtils.isString(this.numberPrefix)){
				stb.append(" numberPrefix='"+this.numberPrefix+"'");
			}
			
			if(!StringUtils.isString(this.numberSuffix)){
				stb.append(" numberSuffix='"+this.numberSuffix+"'");
			}
			
			if(!StringUtils.isString(this.bgColor)){
				stb.append(" bgColor='"+this.bgColor+"'");
			}
			
			if(!StringUtils.isString(this.baseFont)){
				stb.append(" baseFont='"+this.baseFont+"'");
			}
			
			if(!StringUtils.isString(this.baseFontSize)){
				stb.append(" baseFontSize='"+this.baseFontSize+"'");
			}
			
			if(!StringUtils.isString(this.baseFontColor)){
				stb.append(" baseFontColor='"+this.baseFontColor+"'");
			}
			if(!StringUtils.isString(this.chartLeftMargin)){
				stb.append(" chartLeftMargin='"+this.chartLeftMargin+"'");
			}

			if(!StringUtils.isString(this.chartRightMargin)){
				stb.append(" chartRightMargin='"+this.chartRightMargin+"'");
			}

			if(!StringUtils.isString(this.chartTopMargin)){
				stb.append(" chartTopMargin='"+this.chartTopMargin+"'");
			}

			if(!StringUtils.isString(this.chartBottomMargin)){
				stb.append(" chartBottomMargin='"+this.chartBottomMargin+"'");
			}
			if(!StringUtils.isString(this.chartBottomMargin)){
				stb.append(" chartBottomMargin='"+this.chartBottomMargin+"'");
			}
			if(!StringUtils.isString(this.useRoundEdges)){
				stb.append(" useRoundEdges='"+this.useRoundEdges+"'");
			}
			
			if(!StringUtils.isString(this.legendBorderAlpha)){
				stb.append(" legendBorderAlpha='"+this.legendBorderAlpha+"'");
			}
			
			if(!StringUtils.isString(this.imageSave)){
				stb.append(" imageSave='"+this.imageSave+"'");
			}
			if(!StringUtils.isString(this.imageSaveURL)){
				stb.append(" imageSaveURL='"+this.imageSaveURL+"'");
			}
			if(!StringUtils.isString(this.showValues)){
				stb.append(" showValues='"+this.showValues+"'");
			}
			stb.append(">");
			
			return stb.toString();
		}
		
		public String createFoot(){
			String footString="";
			if(!StringUtils.isString(this.getHeadString())){
				footString="</"+this.getHeadString()+">";
			}else {
				footString="</graph>";
			}
			return footString;
		
		}
		
		/**
		 * ���� ����ͼ�ε�xml����
		 * @return
		 */
		public String createXMLDataSingle(List<SingleChart> list){
			
			StringBuffer stb = new StringBuffer();
			stb.append(careateHeard());
			if(list!=null){
				for(SingleChart chart : list){
					stb.append("<set ");
					
					/*if(!StringUtils.isString(this.getHeadString())&&this.getHeadString().equals("chart")){
						stb.append("lable='"+chart.getName()+"' ");		
					}else{
						stb.append("name='"+chart.getName()+"' ");							
					}*/
					
					if(!StringUtils.isString(this.getLabel())&&this.getLabel().equals("label")){
						stb.append("label='"+chart.getName()+"' ");		
					}else{
						stb.append("name='"+chart.getName()+"' ");							
					}
					/*stb.append("name='"+chart.getName()+"' ");*/
					stb.append("value='"+chart.getValue()+"' " );							
					if(!StringUtils.isString(chart.getColor())){
						stb.append("color='"+chart.getColor()+"' ");
					}									
					if(!StringUtils.isString(chart.getLink())){
						stb.append(" link='"+chart.getLink()+"'");
					}
					stb.append("/>");
				}
			}
			
			stb.append(createFoot());			
			//System.out.println(stb.toString());
			return stb.toString();
		}
		
		
		/**
		 * �������
		 * @param list
		 * @return
		 */
		private List<String> categories; //������������
		
		public List<String> getCategories() {
			return categories;
		}

		public void setCategories(List<String> categories) {
			this.categories = categories;
		}

		private String createCategories(List<String> categories){
			    StringBuffer stb = new StringBuffer();
			    stb.append("<categories>");
			    
			    for(String  name : categories){
			    	  stb.append("<category  name='");
			    	  stb.append(name);
			    	  stb.append("' />");
			    }
			    
			    
			    stb.append("</categories>");
			    
			    return stb.toString();
		}
		public String createXMLDataMulti(List<String> categories , List<MultiChart> list){
			StringBuffer stb = new StringBuffer();
			stb.append(careateHeard());
			stb.append(createCategories(categories));
			
			if(list!=null){
				for(MultiChart chart : list){
					stb.append("<dataset seriesName='"+chart.getName()+"' color='"+chart.getColor()+"'>");
					List<String> values = chart.getValues();
					for(String value : values){
						  stb.append("<set value='"+value+"' />");
					}
					stb.append("</dataset>");
				}
			}
			
			stb.append(createFoot());
			
			return stb.toString();
		}
		
		
		public String createMultiXml(){
			
			List<String> categories = new ArrayList<String>();
			categories.add("product A");
			categories.add("product B");
			categories.add("product C");
			categories.add("product D");
			categories.add("product E");
			categories.add("product F");
			categories.add("product G");
			
			List<MultiChart> multicharts = new ArrayList<MultiChart>();
			for(int i=1 ;i<7 ;i++){
				MultiChart chart = new MultiChart();
				 if(i==1){
					   chart.setName("Current Year");
					   chart.setColor(ColorHelper.getColor());
					   List<String> values = new ArrayList<String>();
					   for(int count = 0;count<6;count++){
						       String s = Math.random()*10000+"";
						       values.add(s.substring(0,s.indexOf(".")));
					   }
					   chart.setValues(values);
				 }
				 if(i==2){
					 chart.setName("Previous Year");
					   chart.setColor(ColorHelper.getColor());
					   List<String> values = new ArrayList<String>();
					   for(int count = 0;count<6;count++){
						       String s = Math.random()*1000+"";
						       values.add(s.substring(0,s.indexOf(".")));
					   }
					   chart.setValues(values);
				 }
				 if(i==3){
					 chart.setName("Next Year333");
					   chart.setColor(ColorHelper.getColor());
					   List<String> values = new ArrayList<String>();
					   for(int count = 0;count<6;count++){
						       String s = Math.random()*1000+"";
						       values.add(s.substring(0,s.indexOf(".")));
					   }
					   chart.setValues(values);
				 }
				 if(i==4){
					 chart.setName("Next Year444");
					 chart.setColor(ColorHelper.getColor());
					 List<String> values = new ArrayList<String>();
					 for(int count = 0;count<6;count++){
						 String s = Math.random()*1000+"";
						 values.add(s.substring(0,s.indexOf(".")));
					 }
					 chart.setValues(values);
				 }
				 if(i==5){
					 chart.setName("Next Year555");
					 chart.setColor(ColorHelper.getColor());
					 List<String> values = new ArrayList<String>();
					 for(int count = 0;count<6;count++){
						 String s = Math.random()*1000+"";
						 values.add(s.substring(0,s.indexOf(".")));
					 }
					 chart.setValues(values);
				 }
				 if(i==6){
					 chart.setName("Next Year6666");
					 chart.setColor(ColorHelper.getColor());
					 List<String> values = new ArrayList<String>();
					 for(int count = 0;count<6;count++){
						 String s = Math.random()*1000+"";
						 values.add(s.substring(0,s.indexOf(".")));
					 }
					 chart.setValues(values);
				 }
				 
				 multicharts.add(chart);
			}
			
			
			String str = createXMLDataMulti(categories, multicharts);
			//System.out.println(str);
			return str;
		}
		
		
		public static void main(String args[]){
			   ProvideCharts pc = new ProvideCharts();
			   pc.createMultiXml();
		}

		public String getBaseFontColor() {
			return baseFontColor;
		}

		public void setBaseFontColor(String baseFontColor) {
			this.baseFontColor = baseFontColor;
		}

		public String getChartBottomMargin() {
			return chartBottomMargin;
		}

		public void setChartBottomMargin(String chartBottomMargin) {
			this.chartBottomMargin = chartBottomMargin;
		}

		public String getChartLeftMargin() {
			return chartLeftMargin;
		}

		public void setChartLeftMargin(String chartLeftMargin) {
			this.chartLeftMargin = chartLeftMargin;
		}

		public String getChartRightMargin() {
			return chartRightMargin;
		}

		public void setChartRightMargin(String chartRightMargin) {
			this.chartRightMargin = chartRightMargin;
		}

		public String getChartTopMargin() {
			return chartTopMargin;
		}

		public void setChartTopMargin(String chartTopMargin) {
			this.chartTopMargin = chartTopMargin;
		}

		public String getHeadString() {
			return headString;
		}

		public void setHeadString(String headString) {
			this.headString = headString;
		}

		public String getUseRoundEdges() {
			return useRoundEdges;
		}

		public void setUseRoundEdges(String useRoundEdges) {
			this.useRoundEdges = useRoundEdges;
		}

		public String getLabel() {
			return label;
		}

		public void setLabel(String label) {
			this.label = label;
		}

		public String getShowValues() {
			return showValues;
		}

		public void setShowValues(String showValues) {
			this.showValues = showValues;
		}

		public String getLegendBorderAlpha() {
			return legendBorderAlpha;
		}

		public void setLegendBorderAlpha(String legendBorderAlpha) {
			this.legendBorderAlpha = legendBorderAlpha;
		}	   
	   
}
