package com.company;

public class Main {

    public static void main(String[] args) {
        File file = new File(“../data/myfile.txt”);
        try(BufferedReader br = new BufferedReader(new FileReader(file))) {
            for(String line; (line = br.readLine()) != null; ) {
                // process the line.
            }
            // line is not visible here.
        }
    }
}

