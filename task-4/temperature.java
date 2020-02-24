class conversion{
    public int conv(int f, int c) {
        for(f=20; f < 300; f=f+20)
        {
            c = ((f-32)*5)/9;
            System.out.println(f+" "+"  "+c);
        }
      return c;  
    }
} 

