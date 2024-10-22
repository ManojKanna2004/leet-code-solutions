class Solution {
    public double[] convertTemperature(double celsius) {
        double[] arr=new double[2];
        arr[1]=1.80*celsius+32.00;
        arr[0]=celsius+273.15;
        return arr;
                  }
}