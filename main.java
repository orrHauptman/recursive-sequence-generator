public static int sequencesOfMax(int m, int max)
    {
        if(m == 1)
        {
            return max;
        }
            
        if (max == 0)
        {
            return 0;
        }
            
        return sequencesOfMax(m - 1 , max) + sequencesOfMax(m , max - 1);
    }
