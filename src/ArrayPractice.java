import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        /*
        // Row-major order
        for(int o = 0; o < letters.length; o++) {
            for(int i = 0; i < letters[o].length; i++) {
                char c = letters[o][i];
            }
        }

        // Column-major order
        for(int o = 0; o < letters[0].length; o++) {
            for(int i = 0; i < letters.length; i++) {
                char c = letters[i][o];
            }
        }
        */



        int[][] imageData={{100,90,255,80,70,255,60,50},
                {255,10,5,255,10,5,255,255},
                {255,255,255,0,255,255,255,75},
                {255,60,30,0,30,60,255,255}};

        //First, we want to crop the image down to a 4x6 image, removing the right 2 columns. Declare and initialize a new 2D array of integers with 4 rows and 6 columns called `newImage`.
        int[][] newImage = new int[4][6];



        //Now that you have your empty image, use nested **for** loops to copy over the data from the original image to the new image, make sure not to include the cropped out columns.
        for (int i = 0; i < imageData.length; i++){
            for (int j = 0; j <imageData[0].length; j++){
                if (j < 6){
                    newImage[i][j] = imageData[i][j];
                }
            }
        }

        System.out.println(Arrays.deepToString(newImage));

        //You want to decrease the brightness of the new image by 50 units. The way this works is that for every integer in the new 2D array, we will subtract the value by 50. Remember that the value range for the pixel is 0-255, so if the result tries to go below 0, just set it equal to 0.
        for (int i = 0; i < newImage.length; i++){
            for ( int j = 0; j < newImage[0].length; j++){
                if (newImage[i][j] - 50 < 0){
                    newImage[i][j] = 0;
                } else {
                    newImage[i][j] -= 50;
                }
            }
        }
        System.out.println(Arrays.deepToString(newImage));


        String[][] words = {{"championship", "QUANTITY", "month"},{"EMPLOYEE", "queen", "understanding"},{"method", "writer", "MOVIE"}};

        // We are going to flip the capitalization of the words:

        System.out.println("Before...");
        System.out.println(Arrays.deepToString(words).replace("],", "],\n") + "\n");

        for(int i=0; i<words.length; i++) {
            for(int j = 0; j<words[i].length; j++) {
                if(words[i][j]!=null) {

                    // Check the capitalization
                    boolean allCaps = true;
                    for(char c : words[i][j].toCharArray())
                        if(!Character.isUpperCase(c))
                            allCaps = false;

                    // Flip the capitalization
                    if(allCaps)
                        words[i][j] = words[i][j].toLowerCase();
                    else
                        words[i][j] = words[i][j].toUpperCase();
                }
            }
        }

        System.out.println("After...");
        System.out.println(Arrays.deepToString(words).replace("],", "],\n") + "\n");
    }
}



