public class TimeFormat {
    public static void main(String[] args) {
        
        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
        int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));

        if ( hours > 12 ){
            if (minutes < 10) { 
                String newMinutes = "0" + minutes;
                System.out.println(hours- 12 + ":" + newMinutes + " PM");
    
            } else {
            System.out.println(hours -12 + ":" + minutes + " PM");
            }
            
        } else if ( hours == 12 ){
            if (minutes < 10) { 
                String newMinutes = "0" + minutes;
                System.out.println(hours + ":" + newMinutes + " PM");
    
            } else {
            System.out.println(hours + ":" + minutes + " PM");
            }
            
        }
        else if ( hours < 10 ) { 
            if (minutes < 10) { 
                String newMinutes = "0" + minutes;
                System.out.println(args[0].charAt(1) + ":" + newMinutes + " AM");
            } else {
            System.out.println(args[0].charAt(1) + ":" + minutes + " AM");
            }
        } 
        else if ( hours >= 10 && hours < 12 ){ 
            if (minutes < 10) { 
                String newMinutes = "0" + minutes; 
                System.out.println(hours + ":" + newMinutes + " AM");
            } else {
          
            System.out.println(hours + ":" + minutes + " AM");
        }
        }
    }
    
}
