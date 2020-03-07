class BlankCount {
    // Initializing counters
    public static int i;
           static int blanks=0;
           //static int tabs=0;
           //static int newline=0;

        static int blankcount (String s){

         for (i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == ' ')
                blanks++;
            //if (ch == '\t')
            //    tabs++;
            //if (ch == '\n')
            //    newline++;
        }
          return blanks++;
        }


    public static void main (String args[])
    {
        int blanks;
        blanks=BlankCount.blankcount("discussion : 01/01/2020\n" +
                "* what is serialization and deserialization ? \n" +
                "***** stash changes for fetch activity by title. *****\n" +
                "----------------------------- ----\n" +
                "discussion : 03/01/2020\n" +
                "\n" +
                "* Get latest by dateTime field. done\n" +
                "* search by title and item Type\n" +
                "* add contributed by field in activity entity. ");
        //string is always passed in double quotes

        System.out.println("The number of Blanks :  "+blanks);
        //System.out.println("The number of Tabs :  "+tabs);
        //System.out.println("The number of Newline :  "+newline);
    }
}
