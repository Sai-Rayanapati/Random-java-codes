package com.company;

public class Main {

    public static void merge(int[] a, int[] aux, int lo, int mid, int hi )
    {
        int i=lo, j=mid+1;
        for(int k=lo;k<=hi; k++)
        {
            if(i>mid)
                aux[k]=a[j++];
            else if (j>i)
                aux[k]=a[i++];
            else if (a[j] < a[i])
                aux[k]=a[j++];
            else
                aux[k]=a[i++];
        }
    }
    private static void sort (int[] a, int[] aux, int lo, int hi )
    {
        if(hi<=lo)
        {
            return;
        }
        int mid=lo+(hi-lo)/2;
        sort(aux,a,lo,mid);
        sort(aux,a,mid+1,hi);
        merge(a,aux,lo,mid,hi);
    }

    public static void main(String[] args) {
	// write your code here
    int[] a={2,8,3,0,7};
    int[] aux={0,0,0,0,0};
    int lo=0;
    int hi=4;
    sort(a,aux,lo,hi);
    for(int i=0; i<5; i++)
    {
        System.out.print(aux[i]+ " " );
    }

    }
}
