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
                    System.out.println("regresar al menu 1. si 2. no");
                    opc=leer.nextInt();
               
                    break;
                case 2:
                    //Método String compareTo ()
                    String str1 = "hola somos del M2A";
                    String str2 = new String("hola somos del M2A");
                    String str3 = new String("hola no somos del M2A");
                    System.out.println("Método String compareTo()");
                    System.out.println("hola somos del M2A");
                    System.out.println("hola somos del M2A");
                    System.out.println("hola no somos del M2A");
                    int result1 = str1.compareTo( str2 );
                    System.out.println(result1);
                    result1 = str2.compareTo( str3 );
                    System.out.println(result1);
                    System.out.println("regresar al menu 1. si 2. no");
                    opc=leer.nextInt();
                    break;
                case 3:
                    //String compareTo (String anotherString)
                    String str4 = "Hola somos del M2A";
                    String str5 = "hola somos del M2A";
                    String str6 = "Hola no Somos del M2A";
                    System.out.println("String compareTo(String anotherString)");
                    System.out.println("Hola somos del M2A");
                    System.out.println("hola somos del M2A");
                    System.out.println("Hola no somos del M2A");
                    int result2 = str4.compareTo( str5 );
                    System.out.println(result2);
                    result2 = str5.compareTo( str6 );
                    System.out.println(result2);
                    result2 = str6.compareTo( str4 );
                    System.out.println(result2);
                    System.out.println("regresar al menu 1. si 2. no");
                    opc=leer.nextInt();
                    break;
                case 4:
                    //String compareToIgnoreCase()
                    String str7 = "Hola somos del M2A";
                    String str8 = "hola somos del M2A";
                    String str9 = "Hola no somos del m2a";
                    System.out.println("String compareToIgnoreCase()");
                    System.out.println("Hola somos del M2A");
                    System.out.println("hola somos del M2A");
                    System.out.println("Hola no somos del m2a");
                    int result3 = str7.compareToIgnoreCase( str8 );
                    System.out.println(result3);
                    result3 = str8.compareToIgnoreCase( str9 );
                    System.out.println(result3);
                    result3 = str9.compareToIgnoreCase( str7 );
                    System.out.println(result3);
                    System.out.println("regresar al menu 1. si 2. no");
                    opc=leer.nextInt();
                    break;
                case 5:
                    //Método String concat()
                    System.out.println("Método String concat()");
                    System.out.println("Hola");
                    System.out.println("somos del M2A");
                    String cadena = "hola";
                    cadena = cadena.concat(" somos del M2A");
                    System.out.println(cadena);
                    System.out.println("regresar al menu 1. si 2. no");
                    opc=leer.nextInt();
                    break;
                case 6:
                    //Método String contentEquals ()
                    String cadena1 = "hola somos del M2A";
                    String cadena2 = "buenas no somos del M2A";
                    StringBuffer cadena3 = new StringBuffer( "hola somos del M2A");
                    System.out.println("Método String contentEquals()");
                    System.out.println("hola somos del M2A");
                    System.out.println("buenas no somos del M2A");
                    System.out.println("new StringBuffer(hola somos del M2A)");
                    boolean  result4 = cadena1.contentEquals( cadena3 );
                    System.out.println(result4);
                    result4 = cadena2.contentEquals( cadena3 );
                    System.out.println(result4);
                    System.out.println("regresar al menu 1. si 2. no");
                    opc=leer.nextInt();
                    break;
                case 7:
                    //Metodo String copyValueOf() 
                    System.out.println("String copyValueOf()");
                    char[] cadena5 = {'h', 'o', 'l', 'a',' ', 'M', '2', 'A'};
                    String cadena6 = " ";
                    cadena6 = cadena6.copyValueOf( cadena5 );
                    System.out.println(cadena5);
                    System.out.println("regresar al menu 1. si 2. no");
                    opc=leer.nextInt();
                    break;
                case 8:
                    System.out.println("String copyValueOf(data, offset, count)");
                    System.out.println("char[] cadena7 = {'h', 'o', 'l', 'a',' ', 'M', '2', 'A'};");
                    System.out.println("String cadena8 = " );
                    char[] cadena7 = {'h', 'o', 'l', 'a',' ', 'M', '2', 'A'};
                    String cadena8 = " ";
                    System.out.println("cadena8 = cadena8.copyValueOf( cadena7, 2, 6 );");
                    System.out.println("System.out.println(cadena8);");
                    cadena8 = cadena8.copyValueOf( cadena7, 2, 6 );
                    System.out.println(cadena8);
                    System.out.println("regresar al menu 1. si 2. no");
                    opc=leer.nextInt();
                    break;
                case 9:
                    System.out.println("String endsWith ()");
                    System.out.println("String Str = new String(\"hola somos del M2A\");");
                    System.out.println("boolean retVal;");
                    System.out.println("retVal = Str.endsWith( \"M2A\" );");
                    System.out.println("System.out.println(retVal );");
                    
                    System.out.println("retVal = Str.endsWith( \"M\" );");
                    String Str = new String("hola somos del M2A");
                    System.out.println(" System.out.println(retVa );");
                    boolean retVal;
                        retVal = Str.endsWith( "M2A" );
                    System.out.println(retVal );
                    retVal = Str.endsWith( "M" );
                    System.out.println(retVal );
                    System.out.println("regresar al menu 1. si 2. no");
                    opc=leer.nextInt();
                    break;
                case 10:
                    System.out.println("Método String equals ()");
                    System.out.println("String cadena9 = new String(\"hola somos el M2A\");");
                    System.out.println("String cadena10 = cadena9;");
                    System.out.println("String cadena11 = new String(\"hola somos el M2B\");");
                    System.out.println("boolean valor;");
                    System.out.println("valor = cadena9.equals( cadena10 );");
                    System.out.println("valor = cadena9.equals( cadena11 );");
                    String cadena9 = new String("hola somos el M2A");
                    String cadena10 = cadena9;
                    String cadena11 = new String("hola somos el M2b");
                    boolean valor;

                    valor = cadena9.equals( cadena10 );
                    System.out.println(valor);

                    valor = cadena9.equals( cadena11 );
                    System.out.println(valor);
                    
                    System.out.println("regresar al menu 1. si 2. no");
                    opc=leer.nextInt();
                    break;
                case 11:
                    System.out.println("equalsIgnoreCase(String otraCadena)");
                    System.out.println("                String cadena12 = new String(\"hola somos del M2A\");\n" +
"                   String cadena13 = cadena12;\n" +
"                   String cadena14 = new String(\"hola somos del M2A!!\");\n" +
"                   String cadena15 = new String(\"hola somos del M2A\");\n" +
"                   boolean valorl;\n" +
"                   valorl = cadena12.equals( cadena13 );\n" +
"                   System.out.println(valorl );\n" +
"                   valorl = cadena12.equals( cadena14 );\n" +
"                   System.out.println(valorl );\n" +
"                   valorl = cadena12.equalsIgnoreCase( cadena15 );\n" +
"                   System.out.println(valorl);");
                     String cadena12 = new String("hola somos del M2A");
                        String cadena13 = cadena12;
                        String cadena14 = new String("hola somos del M2A!!");
                        String cadena15 = new String("hola somos del M2A");
                        boolean valorl;
                        valorl = cadena12.equals( cadena13 );
                        System.out.println(valorl );
                        valorl = cadena12.equals( cadena14 );
                        System.out.println(valorl );
                        valorl = cadena12.equalsIgnoreCase( cadena15 );
                        System.out.println(valorl);
                    System.out.println("regresar al menu 1. si 2. no");
                    opc=leer.nextInt();
                    break;
                case 12:
                    System.out.println("String getBytes()");
                    System.out.println("            String cadena16 = new String(\"hola somos del M2A\");\n" +
"      \n" +
"                    try {\n" +
"                       String cadena17 = new String( cadena16.getBytes( \"UTF-8\" ));\n" +
"                       System.out.println(cadena17 );\n" +
"                       cadena17 = new String (cadena16.getBytes( \"ISO-8859-1\" ));\n" +
"                       System.out.println(cadena17 );\n" +
"                    } catch ( UnsupportedEncodingException e) {\n" +
"                       System.out.println(\"Unsupported character set\");\n" +
"                    }");
                    String cadena16 = new String("hola somos del M2A");
      
                    try {
                       String cadena17 = new String( cadena16.getBytes( "UTF-8" ));
                       System.out.println(cadena17 );
                       cadena17 = new String (cadena16.getBytes( "ISO-8859-1" ));
                       System.out.println(cadena17 );
                    } catch ( UnsupportedEncodingException e) {
                       System.out.println("Unsupported character set");
                    }
                    
                    System.out.println("regresar al menu 1. si 2. no");
                    opc=leer.nextInt();
                    break;
                case 13:
                    System.out.println("String getBytes (String charsetName)");
                    System.out.println("String cadena18 = new String(\"hola somos del m2a\");\n" +
"                        try {\n" +
"                           String cadena19 = new String(cadena18.getBytes( \"UTF-8\" ));\n" +
"                           System.out.println(\"Returned Value \" + cadena19 );\n" +
"                           cadena19 = new String (cadena18.getBytes( \"ISO-8859-1\" ));\n" +
"                           System.out.println(\"Returned Value \" + cadena19 );\n" +
"                        } catch ( UnsupportedEncodingException e) {\n" +
"                           System.out.println(\"Unsupported character set\");\n" +
"                        }");
                      String cadena18 = new String("hola somos del m2a");
                        try {
                           String cadena19 = new String(cadena18.getBytes( "UTF-8" ));
                           System.out.println(cadena19 );
                           cadena19 = new String (cadena18.getBytes( "ISO-8859-1" ));
                           System.out.println(cadena19 );
                        } catch ( UnsupportedEncodingException e) {
                           System.out.println("Unsupported character set");
                        }
                    System.out.println("regresar al menu 1. si 2. no");
                    opc=leer.nextInt();
                    break;
                case 14:
                    
                    System.out.println("String getChars()");
                    System.out.println("String cadena20 = new String(\"hola somos del M2A\");\n" +
"                    char[] cadena21 = new char[5];\n" +
"                    try {\n" +
"                       cadena20.getChars(1, 7, cadena21, 0);\n" +
"                       System.out.println(cadena21 );\n" +
"                    } catch ( Exception ex) {\n" +
"                       System.out.println(\"Raised exception...\");\n" +
"                    }");
                    String cadena20 = new String("hola somos del M2A");
                    char[] cadena21 = new char[7];
                    try {
                       cadena20.getChars(1, 7, cadena21, 0);
                       System.out.print("Copied Value = " );
                       System.out.println(cadena21 );
                    } catch ( Exception ex) {
                       System.out.println("Raised exception...");
                    }
                    System.out.println("regresar al menu 1. si 2. no");
                    opc=leer.nextInt();
                    break;
                case 15:
                    System.out.println("hashCode()");
                    System.out.println("String cadena22 = new String(\"Welcome to Tutorialspoint.com\");\n" +
"                    System.out.println(\"Hashcode for Str :\" + cadena22.hashCode() );");
                    String cadena22 = new String("hola somos del M2A");
                    System.out.println("Hashcode for Str :" + cadena22.hashCode() );
                            
                    System.out.println("regresar al menu 1. si 2. no");
                    opc=leer.nextInt();
                    break;
                case 16:
                    System.out.println(" String indexOf ()");
                    System.out.println("String cadena23 = new String(\"hola somos del M2A\");\n" +

                            "                    System.out.println(cadena23.indexOf( 'a' ));\n" +
"                    System.out.println(cadena23.indexOf( 'P' ));");
                    String cadena23 = new String("hola somos del M2A");
                    System.out.println(cadena23.indexOf( 'a' ));
                    System.out.println(cadena23.indexOf( 'P' ));
                    System.out.println("regresar al menu 1. si 2. no");
                    opc=leer.nextInt();
                    break;
                case 17:
                    System.out.println("String indexOf (int ch, int fromIndex)");
                    System.out.println("System.out.println(\"indexOf(int ch, int fromIndex)\");\n" +
"                    String cadena24 = new String(\"hola somos del M2A\");\n" +
"                    System.out.println(cadena24.indexOf( 'o', 4 ));");
                    System.out.println("indexOf(int ch, int fromIndex)");
                    String cadena24 = new String("hola somos del M2A");
                    System.out.println(cadena24.indexOf( 'o', 4 ));
                    
                    System.out.println("regresar al menu 1. si 2. no");
                    opc=leer.nextInt();
                    break;
                case 18:
                    System.out.println("String indexOf(String str) ");
                    System.out.println("String cadena25 = new String(\"hola somos del M2A\");\n" +
"                    String SubStr1 = new String(\"somos\");\n" +
"                    System.out.println(cadena25.indexOf( SubStr1 ));");
                    String cadena25 = new String("hola somos del M2A");
                    String SubStr1 = new String("somos");
                    System.out.println(cadena25.indexOf( SubStr1 ));
                    
                    System.out.println("regresar al menu 1. si 2. no");
                    opc=leer.nextInt();
                    break;
                case 19:
                    System.out.println("String indexOf(String str, int fromIndex)");
                    System.out.println("String cadena26 = new String(\"hola somos del M2A\");\n" +
"                    String SubStr2 = new String(\"somos\" );\n" +
"                    System.out.println( cadena26.indexOf( SubStr2, 7 ));");
                    String cadena26 = new String("hola somos del M2A");
                    String SubStr2 = new String("somos" );
                    System.out.println( cadena26.indexOf( SubStr2, 7 ));
                    System.out.println("regresar al menu 1. si 2. no");
                    opc=leer.nextInt();
                    break;          
                case 20:
                    //Método intern()
                    String s1 = new String("hola");
                    String s2 = "hola";
                    String s3 = s1.intern();// regresa la cadena del espacio de memoria y lo asigna a s3
                    System.out.println(s1 == s2);// false because reference variables are pointing to different instance
                    System.out.println(s2 == s3);// true because reference variables are pointing to same instance
                    break;
                case 21:
                    //Método lastIndexOf ()
                    String myStr = "Hello planet earth, you are a great planet.";
                    System.out.println(myStr.lastIndexOf("planet"));
                    break;
                case 22:
                    // lastIndexOf (int ch, int fromIndex)
                    String Str22 = new String("Welcome to Tutorialspoint.com");
                    System.out.print("Found Last Index :");
                    System.out.println(Str22.lastIndexOf('o', 5));
                    break;
                case 23:
                    //lastIndexOf (String str)
                    String Str2 = new String("Welcome to Tutorialspoint.com");
                    System.out.print("Found Last Index :");
                    System.out.println(Str2.lastIndexOf('o', 5));
                    System.out.println(Str2.lastIndexOf("o"));
                    break;
                case 24:
                    // lastIndexOf () fromIndex
                    String Str3 = new String("Welcome to Tutorialspoint.com");
                    System.out.print("Found Last Index :");
                    System.out.println(Str3.lastIndexOf('o', 5));
                    System.out.println(Str3.lastIndexOf("o", 5));
                    break;
                case 25:
                    // length ()
                    String cadenal= "Es una cadena";
                    System.out.println("El tamaño de la cadena es: "+cadenal.length());
                    break;
                case 26:
                    // Matches(String regex)
                    cadena= "Estamos estudiando POO";
                    System.out.println(cadena.matches("Estamos"));//retorna falso porque en cadena no esta solo esa frase
                    System.out.println(cadena.matches("Estamos(.*)"));//retorna verdadero porque hay mas despues de la frase
                    break;
                case 27:
                    cadena = "Welcome to Tutorialspoint.com";
                    cadena2 = "Tutorials";
                    String cadena4 = "TUTORIALS";
                    System.out.println(cadena.regionMatches(11, cadena2, 0, 9));
                    System.out.println(cadena.regionMatches(11, cadena4, 0, 9));
                    break;
                case 28:
                    cadena = "Welcome to Tutorialspoint.com";
                    cadena2 = "Tutorials";
                    cadena4 = "TUTORIALS";
                    System.out.println(cadena.regionMatches(11, cadena2, 0, 9));
                    System.out.println(cadena.regionMatches(11, cadena4, 0, 9));
                    break;
                case 29:
                    String S1 = new String("the quick fox jumped");
                    System.out.println("El texto original es': " + S1);
                    System.out.println("Texto despues de reemplazar 'fox' con 'dog': " + S1.replace("fox", "dog"));
                    System.out.println("Texto despues de remplazar las 't' with 'a': " + S1.replace('t', 'a'));
                    break;
                case 30:
                    cadena = "Esta es una cadena de caracteres";
                    cadena2 = cadena.replaceAll("a", "o");// replaces all occurrences of "a" to "o"
                    System.out.println(cadena2);
                    break;
                case 31:
                    cadena= "This website providing free tutorials";
                    cadena2= cadena.replaceFirst("s", "9");
                    System.out.println(cadena2);
                    break;
                case 32:
                    cadena = "123-654321";
                    String[] partes = cadena.split("-");
                    System.out.println("La cadena Original es: "+cadena);
                    System.out.println(partes[0]);
                    System.out.println(partes[1]);
                    break;
                case 33:
                    cadena = "123-654321-66351-55";
                    String[] partes2 = cadena.split("-", 2);
                    System.out.println("La cadena Original es: " + cadena);
                    System.out.println(partes2[0]);
                    System.out.println(partes2[1]);
                    break;
                case 34:
                    cadena="Hola";
                    System.out.println(cadena.startsWith("H"));//true
                    System.out.println(cadena.startsWith("F"));//false
                    break;
                case 35:
                    cadena = "Hola";
                    System.out.println(cadena.startsWith("H", 2));// false
                    System.out.println(cadena.startsWith("l", 2));// true
                    break;
                case 36:
                    cadena = "Welcome to geeksforgeeks";

                    // prints the subsequence from 0-7, exclusive 7th index
                    System.out.print("Retorna: ");
                    System.out.println(cadena.subSequence(0, 7));

                    System.out.print("Retorna: ");
                    System.out.println(cadena.subSequence(10, 24));
                    break;
                case 37:

                    String Str37 = new String("Welcome to Tutorialspoint.com");

                    System.out.print("Return Value :");
                    System.out.println(Str37.substring(10));
                    break;
                case 38:

                    String Str38 = new String("Welcome to Tutorialspoint.com");

                    System.out.print("Retorna :");
                    System.out.println(Str38.substring(10, 15));

                    break;
                case 39:

                    String Str39 = new String("Welcome to Tutorialspoint.com");

                    System.out.print("Retorna :");
                    System.out.println(Str39.toCharArray());
                    break;
                case 40:

                    String Str40 = new String("Welcome to Tutorialspoint.com");

                    System.out.print("Retorna :");
                    System.out.println(Str40.toLowerCase());
                    break;
                case 41:
                    String Str41 = new String("Welcome to Tutorialspoint.com");

                    System.out.print("Retorna :");
                    System.out.println(Str41.toString());

                    break;

                case 42:
                    String Str42 = new String("Welcome to Tutorialspoint.com");

                    System.out.print("Retorna :");
                    System.out.println(Str42.toUpperCase());

                    break;
                case 43:

                    String Str43 = new String("Welcome to Tutorialspoint.com");

                    System.out.print("Return Value :");
                    System.out.println(Str43.toUpperCase());
                    break;
                case 44:

                    String Str44 = new String("   Welcome to Tutorialspoint.com   ");

                    System.out.print("Retorna :");
                    System.out.println(Str44.trim());

                    break;
                case 45:
                    double d = 102939939.939;
                    boolean b = true;
                    long l = 1232874;
                    char[] arr = { 'a', 'b', 'c', 'd', 'e', 'f', 'g' };

                    System.out.println("Retorna el valor : " + String.valueOf(d));
                    System.out.println("Retorna el valor : " + String.valueOf(b));
                    System.out.println("Retorna el valor : " + String.valueOf(l));
                    System.out.println("Retorna el valor : " + String.valueOf(arr));

                    break;
            }
            
            
            
            
            
        }while(opc>=1 && opc<=46);
       
//        
//        
//        
//        
//  
//        
//        
//        
    }
}
