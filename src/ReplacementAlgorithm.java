import java.io.*;
public class ReplacementAlgorithm {
    public static void main(String[] args) throws IOException 
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int frameNumber;
        int referenceString;
        int var = 0, pageReplacements = 0, faults = 0;
        int array[];
        Boolean pageFill = false;
        
        PageGenerator generator = new PageGenerator();   			//implementing random page generator
        int[] randomRefString = generator.referenceString;  		//named random string randomRefString
        
        System.out.println("Enter the # of Frames:");  						//Asks for Frames input
        frameNumber = Integer.parseInt(br.readLine()); 						//Parses input of number of frames into an int
        System.out.println("Enter the length of the Reference String:");	//Asks for ref string length input
        referenceString = Integer.parseInt(br.readLine()); 					//Parses input of ref string length into an int
        
        array = new int [frameNumber];
        for(int t = 0; t < frameNumber; t++)
                array[t] = -1;
                for(int i = 0; i < referenceString; i++) 
                {
            int search = -1;
            for(int t = 0; t < frameNumber; t++)
            { if(array[t] == randomRefString[i]) {
                    search = t;
                    pageReplacements++;     } 
            }
            if(search == -1) 
            {
            if(pageFill){
                for(int t = 0; t < frameNumber; t++){
                     } }
                array[var] = randomRefString[i];
                faults++;
                var++;
                if(var == frameNumber)
                {
                var = 0;
                pageFill = true;    }     }    }
                
    System.out.println("Page Replacements: " + pageReplacements);   	//printing number of page replacements 
    System.out.println("Faults: " + faults);							//printing number of page faults
    }

}