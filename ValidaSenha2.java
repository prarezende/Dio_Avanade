//tela login validação de senha

import java.util.*;



public class ValidaSenha2{

  

   public static void main(String[] args)   {
  
      Scanner ler = new Scanner(System.in);
 
      String password;
 
      boolean passwordState = false;
 
 //  System.out.println("Senha: ");

      while (ler.hasNextLine()) 
      {

          
         password = ler.nextLine();
   
         passwordState = verSenha(password);

 
         if(passwordState)
            {
 System.out.println("Senha válida");
 }
         else
            {  System.out.println("Senha Inválida");
 }
 
        }

        
      ler.close();

   }

   
   static boolean verSenha(String password)
   {

       
      if (password.length() < 6 || password.length() > 32)
     { return false;
        }



      char[] passChars = password.toCharArray();


      boolean hasLower = false;

      boolean hasUpper = false;

      boolean hasNumber = false;



      for (char c : passChars) {
          
      

            if (Character.isUpperCase(c)) {
               
                     hasUpper = true;
            }
            else if (Character.isLowerCase(c)) {

                     hasLower = true;
            }
            else if (Character.isDigit(c)) {
 
                    hasNumber = true;
            }
            else {
                return false;
            }

        }



        if (hasLower && hasUpper && hasNumber) {
  
            return true;}

 

       return false;
    
     }


}


