public class Animal {

    private String name;

    public Animal(String name){
        this.name = name;
    }

    private void eat(){
        System.out.println("Ñom ñom");
    }

    public void pet(){
        System.out.println(name + " está feliz.");
    }

    private void walk(){
        System.out.println(name + " está caminando.");
    }

    public void makeNoise(){
        System.out.println(name + "está haciendo ruido.");
    }
}
