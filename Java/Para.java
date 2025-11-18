class Name {
    int n;
    Name (int num){
        n=num;
    }
    void find(){
        if(n%2==0)
        System.out.println("name even is"+n);
        else
        System.out.println("odd"+n);
    }
    }
    public class Para {
        public static void main(String args[]){
            Name  a =new Name(8);
            a.find();
        }
    
}
