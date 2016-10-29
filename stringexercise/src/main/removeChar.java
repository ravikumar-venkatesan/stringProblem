package main;
public class removeChar {
 
    public static void main(String[] args) {
    	removeChar newword= new removeChar();
    	newword.updWord("test3331",'t');
                                            }
                                                
    public StringBuffer updWord(String oldword, char removec) {
    	String replaceword =oldword ;
    	StringBuffer new_word = new StringBuffer();
    	char remove_char = removec;
        for (int i=0;i<replaceword.length();i++){

            if (replaceword.charAt(i)!= remove_char)
            {
                    new_word.append(replaceword.charAt(i));
                }
                                     }
        System.out.println("String with the removed string is:"+new_word);
    	
    	return new_word;
    }

                                }








