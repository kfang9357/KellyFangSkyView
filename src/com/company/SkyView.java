package com.company;

public class SkyView {


    public SkyView (int numRows, int numCols, double[] scanned)
    {
        double [][] view = new double[numRows][numCols];

        int k = 0;
        int len = scanned.length;

        while (k< len)
        {
            for (int j = 0; j< numRows; j++)
            {
                if (j%2<1)
                {
                    for (int i = 0; i< numCols; i++)
                    {
                        view[j][i] = scanned[k];
                        k++;
                    }
                }
                else
                {
                    for (int i = numCols; i>0; i--)
                    {
                        view[j][i] = scanned[k];
                    }
                }

            }
        }
    }

    public double getAverage (int startRow, int endRow, int startCol, int endCol)
    {
        double sum = 0;
        for (int i = startRow; i<endRow; startRow++)
            for (int j = startCol; j< endCol; startCol++)
            {

            }
    }



}
