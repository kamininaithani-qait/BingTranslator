package org.TestNG.app.BingTranslator.Keywords;

import java.io.BufferedReader;
	import java.io.FileNotFoundException;
	import java.io.FileReader;
	import java.io.IOException;

	public class CSVfileReader {
		BufferedReader br;
		static String sourceLang[] = new String[50] ;
		static String word[] = new String[50];
		static String targetLang[] = new String[50];
		static int i=0;
		int x,y,z;
		String line; 
	    
		public CSVfileReader(){
			String csvFile = "src/test/resources/testdata/SrcTargetWord.csv";
		    int flag=0;
		    try{
		    	br = new BufferedReader(new FileReader(csvFile));
		    }catch(FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		    System.out.println("source lang:");
		    i=0;
		    try{
		    	line = br.readLine();
		    
		    	String[] a = line.split("\\,");
		    	for(int j =0;j<a.length;j++){
		    		if(a[j].equals("SrcLanguage"))
		    			x=j;
		    		else if(a[j].equals("DstLanguage"))
		    			y=j;
		    		else if(a[j].equals("Word"))
		    			z=j;
		        }
		    while((line=br.readLine())!=null){
		         String[] b = line.split("\\,");
		       	 	sourceLang[i] = b[x];
		       	 	targetLang[i] = b[y];
		       	 	word[i] = b[z];
		        	flag=1;
		        	System.out.println("src ="+sourceLang[i]+" dst ="+targetLang[i]+" word="+word[i]);
		        	i++;
		    }
		    if(flag==0)
		    {
		    	System.out.println("exist");
		    }
		    
		    br.close();
		    }
		    catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				if (br != null) {
					try {
						br.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		}

}
