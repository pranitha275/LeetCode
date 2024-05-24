class Solution { 
    
    boolean findVowelOrNot(char ch)
	{
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
		{
		//System.out.println("Entered character "+ch+" is  Vowel"); 
		return true;
		}
		else
	    //System.out.println("No");
	    return false;
	}

    public String reverseVowels(String s) {

   
       Solution s1 =new Solution();
        char[] ch = s.toCharArray();
        int i=0,j=s.length()-1;
        while(i<j)
        {
            if(!s1.findVowelOrNot(ch[i]))
            {
                i++;
            }
            else if(!s1.findVowelOrNot(ch[j])){j--;}
            else
            {
                    char t;
                    t=ch[i];
                    ch[i]=ch[j];
                    ch[j]=t;
                    i++;
                    j--;
            }
                
        }
        String ans=new String(ch);
        return ans;
       
        
    }
}