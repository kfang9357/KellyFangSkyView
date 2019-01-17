package com.company;

public class SkyView {

    private double [] [] view;

    public SkyView (int numRows, int numCols, double[] scanned)
    {
        view = new double[numRows][numCols];

        int k = 0;
            for (int j = 0; j< numRows; j++)
            {
                for (int i = 0; i<numCols; i++)
                {
                    if (j%2==1){
                        view[j][i] = scanned[k];
                    }
                    else
                    {
                        view[j][i] = scanned[k];
                    }
                }
                k++;
            }

    }

    public double getAverage (int startRow, int endRow, int startCol, int endCol) {
        double sum = 0;
        int k = 0;
        for (int row = startRow; row <= endRow; row++) {
            for (int col = startCol; col <= endCol; col++) {
                sum += view[row][col];
                k++;
            }
        }
        return sum / k;
    }

}
