package clasestringymetodos;

import java.util.Scanner;

public class ClaseStringyMetodos {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int opc=1;
        do{
            System.out.println("*******MENU CLASE STRING********");
            System.out.println("1. charAt(int index)");
            System.out.println("2. compareTo(Objeto o)");
            System.out.println("3. compareTo(String otraCadena)");
            System.out.println("4. compareToIgnoreCase(String str)");
            System.out.println("5. concat(String str)");
            System.out.println("6. contentEquals ()");
            System.out.println("7. String copyValueOf ()");
            System.out.println("8. String copyValueOf(data, offset, count)");
            System.out.println("9. String endsWith ()");
            System.out.println("10. String equals ()");
            System.out.println("11. String equalsIgnoreCase ()");
            System.out.println("12. String getBytes() Method");
            System.out.println("13. String getBytes(String charsetName)");
            System.out.println("14. String getChars ()");
            System.out.println("15. String hashCode ()");
            System.out.println("16. Metodo indexOf(int ch)");
            System.out.println("17. Método indexOf(int ch, int indice)");
            System.out.println("18. Método indexOf(String str)");
            System.out.println("19. Método indexOf(String str, int indice)");
            System.out.println("20. Método intern()");
            System.out.println("21. String lastIndexOf ()");
            System.out.println("22. Cadena lastIndexOf (int ch, int fromIndex)");
            System.out.println("23. String lastIndexOf (String str)");
            System.out.println("24. String lastIndexOf () fromIndex");
            System.out.println("25. String length ()");
            System.out.println("26. Matches(String regex)");
            System.out.println("27. RegionMatches(boolean ignoreCase, int offset, String otra, int offset, int len)");
            System.out.println("28. RegionMatches(int offset, String other, int offset, int len)");
            System.out.println("29. Replace(char viejo, char nuevo)");
            System.out.println("30. ReplaceAll(String regex, String reemplazo)");
            System.out.println("31. ReplaceFirst(String regex, String reemplazo)");
            System.out.println("32. Split(String regex)");
            System.out.println("33. Split(String regex, int limit)");
            System.out.println("34. StartsWith(String prefijo)");
            System.out.println("35. StartsWith(String prefijo, int offset)");
            System.out.println("36. SubSequence(int inicio, int final)");
            System.out.println("37. Substring(int inicio)");
            System.out.println("38. Substring(int inicio, int final)");
            System.out.println("39. ToCharArray()");
            System.out.println("40. ToLowerCase()");
            System.out.println("41. ToString()");
            System.out.println("42. ToUpperCase()");
            System.out.println("43. ToUpperCase(Locale locale)");
            System.out.println("44. Trim()");
            System.out.println("45. ValueOf(tipo de dato primitivo x)");
            System.out.println("46. SALIR");
            opc=leer.nextInt();
            switch(opc){
                case 1:
                    //Método String charAt ()
                    String s = "hola somos del M2A";
                    char result = s.charAt(5);
                    System.out.println("Método String charAt(5)");
                    System.out.println("hola somos del M2A");
                    System.out.println(result);
                    System.out.println("  ");
               
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    break;
                case 10:
                    break;
                case 11:
                    break;
            }
            
            
            
            
            
        }while(opc>=1 && opc<=46);
       
//        //Método String charAt ()
//        String s = "hola somos del M2A";
//        char result = s.charAt(5);
//        System.out.println("Método String charAt(5)");
//        System.out.println("hola somos del M2A");
//        System.out.println(result);
//        System.out.println("  ");
//        
//        //Método String compareTo ()
//        String str1 = "hola somos del M2A";
//        String str2 = new String("hola somos del M2A");
//        String str3 = new String("hola no somos del M2A");
//        System.out.println("Método String compareTo()");
//        System.out.println("hola somos del M2A");
//        System.out.println("hola somos del M2A");
//        System.out.println("hola no somos del M2A");
//        int result1 = str1.compareTo( str2 );
//        System.out.println(result1);
//        result1 = str2.compareTo( str3 );
//        System.out.println(result1);
//        System.out.println(" ");
//        
//        
//        //String compareTo (String anotherString)
//        String str4 = "Hola somos del M2A";
//        String str5 = "hola somos del M2A";
//        String str6 = "Hola no Somos del M2A";
//        System.out.println("String compareTo(String anotherString)");
//        System.out.println("Hola somos del M2A");
//        System.out.println("hola somos del M2A");
//        System.out.println("Hola no somos del M2A");
//        int result2 = str4.compareTo( str5 );
//        System.out.println(result2);
//        result2 = str5.compareTo( str6 );
//        System.out.println(result2);
//        result2 = str6.compareTo( str4 );
//        System.out.println(result2);
//        System.out.println(" ");
//        
//        //String compareToIgnoreCase()
//        String str7 = "Hola somos del M2A";
//        String str8 = "hola somos del M2A";
//        String str9 = "Hola no somos del m2a";
//        System.out.println("String compareToIgnoreCase()");
//        System.out.println("Hola somos del M2A");
//        System.out.println("hola somos del M2A");
//        System.out.println("Hola no somos del m2a");
//        int result3 = str7.compareToIgnoreCase( str8 );
//        System.out.println(result3);
//        result3 = str8.compareToIgnoreCase( str9 );
//        System.out.println(result3);
//        result3 = str9.compareToIgnoreCase( str7 );
//        System.out.println(result3);
//        System.out.println(" ");
//        
//        //Método String concat()
//        System.out.println("Método String concat()");
//        System.out.println("Hola");
//        System.out.println("somos del M2A");
//        String cadena = "hola";
//        cadena = cadena.concat(" somos del M2A");
//        System.out.println(cadena);
//        System.out.println(" ");
//  
//        //Método String contentEquals ()
//        String cadena1 = "hola somos del M2A";
//        String cadena2 = "buenas no somos del M2A";
//        StringBuffer cadena3 = new StringBuffer( "hola somos del M2A");
//        System.out.println("Método String contentEquals()");
//        System.out.println("hola somos del M2A");
//        System.out.println("buenas no somos del M2A");
//        System.out.println("new StringBuffer(hola somos del M2A)");
//        boolean  result4 = cadena1.contentEquals( cadena3 );
//        System.out.println(result4);
//        result4 = cadena2.contentEquals( cadena3 );
//        System.out.println(result4);
//        System.out.println(" ");
//        
//        //Metodo String copyValueOf() 
//        char[] cadena5 = {'h', 'o', 'l', 'a',' ', 'M', '2', 'A'};
//        String cadena6 = " ";
//        cadena6 = cadena6.copyValueOf( cadena5 );
//        System.out.println(cadena5);
    }
}
