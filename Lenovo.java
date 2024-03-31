public class Lenovo implements Laptop {

    private int volume;
    boolean is_power_on;
    final int MAX_VOL = 100; // Menambahkan konstanta untuk volume maksimum
    final int MIN_VOL = 0;

    public Lenovo(){
        this.volume = 50;
    }
    
    public void powerOn(){
        is_power_on = true;
        System.out.println("Laptop isn On");
        System.out.println("Lenovo ThinkPad");
    }

    public void powerOff(){
        is_power_on = false;
        System.out.println("Shutdown is process...");

    }

    public void volumeUp(){
        if(is_power_on){
            if(this.volume == MAX_VOL){
                System.out.println("Volume is full");
            }
            else{
                this.volume += 10;
                System.out.println("Volume is :"+ this.getVolume());
            }
        }
    }
    
public void volumeDown(){
    if(is_power_on){
        if(this.volume == MIN_VOL){
            System.out.println("Volume is 0%");
        }

        else{
            this.volume -= 10;
            System.out.println("Volume is :"+ this.getVolume());
        }
    }
}

public int getVolume(){
    return this.volume;
}
}
